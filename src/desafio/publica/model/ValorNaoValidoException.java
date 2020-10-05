package desafio.publica.model;

public class ValorNaoValidoException extends Exception {

    private int pontos;

    public ValorNaoValidoException(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public String getMessage() {
        return "O valor " + pontos + " não é válido, adicione um valor inteiro entre 0-999.";
    }

}
