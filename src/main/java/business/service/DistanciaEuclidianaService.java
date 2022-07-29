package business.service;

import business.domain.Posicao;
import business.domain.Resultado;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface DistanciaEuclidianaService extends Remote {
    Posicao getPosicao(int numMaquina) throws RemoteException;
    void enviaResultados(List<Resultado> resultados) throws RemoteException;
    void gravaResultados() throws RemoteException;
}
