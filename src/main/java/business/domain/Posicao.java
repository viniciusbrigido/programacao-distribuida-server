package business.domain;

import lombok.AllArgsConstructor;
import java.io.Serializable;

@AllArgsConstructor
public class Posicao implements Serializable {
    private int posicaoInicial;
    private int posicaoFinal;
}
