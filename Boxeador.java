public class Boxeador extends Lutador {
    private int socosConectados;

    public Boxeador(String nome, int idade, String nacionalidade, String nickname, double altura, double peso, int vitorias, int socosConectados) {
        super(nome, idade, nacionalidade, nickname, altura, peso, vitorias);
        this.socosConectados = socosConectados;
    }

    public int getSocosConectados(){
        return socosConectados;
    }

    @Override
    public String getEstilo() {
        return "Boxeador";
    }
    
    @Override
    public String toString(){
        return "[Boxeador] " + super.toString() + ", Socos Conectados: " + socosConectados;
    }
}