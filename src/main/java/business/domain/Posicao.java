package business.domain;

import lombok.AllArgsConstructor;
import java.io.Serializable;

@AllArgsConstructor
public class Posicao implements Serializable {
    private static final long serialVersionUID = 1L;

    private int posicaoInicial;
    private int posicaoFinal;
}
