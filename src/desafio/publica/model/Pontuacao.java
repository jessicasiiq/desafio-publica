package desafio.publica.model;

public class Pontuacao {

    private int jogo;
    private static int contador = 1;
    private int maximo;
    private int minimo;
    private static int maximo_;
    private static int minimo_;
    private int recordeMinimo;
    private int recordeMaximo;
    private static int recordeMinimo_;
    private static int recordeMaximo_;
    private int pontos;

    /*'this.jogo' (não estático, fará a impressão correta para cada linha da tabela conforme o obj) é inicializado por 
    'this.contador' (estático). Se utilizássemos 'contador' para atribuir à tabela, teríamos o valor atualizado, no entanto,
    a cada atualização, todas as linhas teriam o mesmo valor na coluna 0/Jogo, e se fosse 'jogo' com incrementação no
    construtor, nunca sairíamos do valor 1. Funcionamento - 
    
    1ª Passagem de dados (instanciação):
        jogo = 0
        contador = 1 --> jogo(0)= contador(1)
    2ª Passagem de dados:
        jogo = 0
        contador = 2 --> jogo(0) = contador(2)
    3ª Passagem de dados: 
        jogo = 0;
        contador = 3 --> jogo(0) = contador(3)
    ...Nx
     */
    public Pontuacao() {
        this.jogo = this.contador;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pontuacao.contador = contador;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getJogo() {
        return jogo;
    }

    public void setJogo(int jogo) {
        this.jogo = jogo;
    }

    public int getRecordeMinimo() {
        return recordeMinimo;
    }

    public int getRecordeMaximo() {
        return recordeMaximo;
    }

    public void setRecordeMinimo(int recordeMinimo) {
        this.recordeMinimo = recordeMinimo;
    }

    public void setRecordeMaximo(int recordeMaximo) {
        this.recordeMaximo = recordeMaximo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public static int getMaximo_() {
        return maximo_;
    }

    public static void setMaximo_(int maximo_) {
        Pontuacao.maximo_ = maximo_;
    }

    public static int getMinimo_() {
        return minimo_;
    }

    public static void setMinimo_(int minimo_) {
        Pontuacao.minimo_ = minimo_;
    }


    /*
    o método seguinte lê as entradas de pontuação e, por meio de atributos estáticos (usados para comparar as mudanças
    conforme a passagem de novos "pontos") e não-estáticos (visando a impressão da informação para um objeto específico), 
    verifica a entrada de novos "mínimo temporada"'s e "máximo temporada"'s, bem como a contagem de quebra de recorde
    min/máx
     */
    public void ordenarContarRecorde(int pontos) {
        if ((this.contador - 1) == 1) {//todos startam recebendo a primeira passagem de "pontos"
            maximo = pontos;
            minimo = pontos;
            maximo = pontos;
            minimo_ = pontos;

        } else {
            /*se não for a primeira passagem de "pontos" (utilizando como base a variável estática 'contador')
        verificar se o número entra na lógica de menor placar ou maior placar. Se 'pontos' não for o novo
            'minimo' ou 'maximo', o 'minimo_' e 'maximo_' (versões estáticas) devem ser atribuídas novamente à 
            'minimo' e ' máximo' (versões não-estáticas), uma vez que a cada nova chamada os não-estáticos zeram
            seus valores (relacionamento com cada obj)*/
            if (pontos < this.minimo_) {
                minimo = pontos;
                minimo_ = pontos;
                recordeMinimo_++;
                recordeMinimo = recordeMinimo_;
            } else {
                minimo = minimo_;
                recordeMinimo = recordeMinimo_;
            }

            if (pontos > this.maximo_) {
                maximo = pontos;
                maximo_ = pontos;
                recordeMaximo_++;
                recordeMaximo = recordeMaximo_;
            } else {
                maximo = maximo_;
                recordeMaximo = recordeMaximo_;
            }

        }

    }

}
