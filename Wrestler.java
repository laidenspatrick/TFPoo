public class Wrestler extends Lutador {
    private int quedasAplicadas;

    public Wrestler(String nome, int idade, String nacionalidade, String nickname, double altura, double peso, int vitorias, int quedasAplicadas) {
        super(nome, idade, nacionalidade, nickname, altura, peso, vitorias);
        this.quedasAplicadas = quedasAplicadas;
    }

    public int getQuedasApliadas(){
        return quedasAplicadas;
    }

    @Override
    public String getEstilo() {
        return "Wrestler";
    }

    @Override
    public String toString(){
        return "[Wrestler] " + super.toString() + ", Quedas Aplicadas: " + quedasAplicadas;
    }
}