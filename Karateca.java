public class Karateca extends Lutador {
    private int chutes;

    public Karateca(String nome, int idade, String nacionalidade, String nickname, double altura, double peso, int vitorias, int chutes) {
        super(nome, idade, nacionalidade, nickname, altura, peso, vitorias);
        this.chutes = chutes;
    }

    public int getChutes(){
        return chutes;
    }
    @Override
    public String getEstilo() {
        return "Karateca";
    }

    @Override
    public String toString(){
        return "[Karateca] " + super.toString() + ", Chutes feitos: " + chutes;
    }
}