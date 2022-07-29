package business.domain;

import java.io.Serializable;

public class Resultado implements Serializable {
    private int posicao;
    private double menor;

    @Override
    public String toString() {
        return posicao + "," + menor;
    }
}
