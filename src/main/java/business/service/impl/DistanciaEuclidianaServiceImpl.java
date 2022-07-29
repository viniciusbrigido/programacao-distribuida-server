package business.service.impl;

import business.domain.Posicao;
import business.domain.Resultado;
import business.service.DistanciaEuclidianaService;
import util.ManipuladorArquivo;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class DistanciaEuclidianaServiceImpl implements DistanciaEuclidianaService {

    private List<Resultado> resultados = new ArrayList<>();
    private int qtdRegistros;
    private int qtdMaquinas;

    public DistanciaEuclidianaServiceImpl(int qtdRegistros, int qtdMaquinas) {
        this.qtdRegistros = qtdRegistros;
        this.qtdMaquinas = qtdMaquinas;
    }

    @Override
    public Posicao getPosicao(int numMaquina) throws RemoteException {
        int posicaoInicial = (qtdRegistros / qtdMaquinas) * (numMaquina - 1);
        int posicaoFinal = numMaquina == qtdMaquinas ? qtdRegistros : (qtdRegistros / qtdMaquinas) * numMaquina;
        return new Posicao(posicaoInicial, posicaoFinal);
    }

    @Override
    public void enviaResultados(List<Resultado> resultados) throws RemoteException {
        this.resultados.addAll(resultados);
    }

    @Override
    public void gravaResultados() throws RemoteException {
        ManipuladorArquivo.gravaResultados(resultados);
    }
}
