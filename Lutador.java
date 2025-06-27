public abstract class Lutador{
    protected String Nome;
    protected int idade;
    protected String nacionalidade;
    protected String Nickname;
    protected double altura;
    protected int vitorias;
    protected double peso;
    protected CategoriaPeso categoria;


    public Lutador(String nome, int idade, String nacionalidade, String nickname, double altura, double peso, int vitorias) {
        this.Nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.Nickname = nickname;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.categoria = definirCategoriaPeso(peso);
    }

    public String getNome() {
        return Nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public String getNickname() {
        return Nickname;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso(){
        return peso;
    }
    public int getVitorias(){
        return vitorias;
    }

    public abstract String getEstilo();

    private CategoriaPeso definirCategoriaPeso(double peso) {
        if(peso <= 57) return CategoriaPeso.MOSCA;
        else if (peso > 57 && peso <= 61) return CategoriaPeso.GALO;
        else if (peso > 61 && peso <= 66) return CategoriaPeso.PENA;
        else if (peso > 66 && peso <= 70) return CategoriaPeso.LEVE;
        else if (peso > 70 && peso <= 77) return CategoriaPeso.MEIO_MEDIO;
        else if (peso > 77 && peso <= 84) return CategoriaPeso.MEDIO;
        else if (peso > 84 && peso <= 93) return CategoriaPeso.MEIO_PESADO;
        else if (peso > 93 && peso <= 120) return CategoriaPeso.PESADO;
        
        throw new IllegalArgumentException("Peso inválido para categoria de lutador: " + peso);
    }

    public CategoriaPeso getCategoria() {
        return this.categoria;
    }
    @Override
    public String toString() {
        return "Lutador{" +
                "Nome='" + Nome + '\'' +
                ", idade=" + idade +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", Nickname='" + Nickname + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", vitorias=" + vitorias +
                ", categoria=" + categoria +
                '}';
    }
}