public class Jiu_Jitero extends Lutador {
    private int finalizacoes;

    public Jiu_Jitero (String nome, int idade, String nacionalidade, String nickname, double altura, double peso, int vitorias, int finalizacoes) {
        super(nome, idade, nacionalidade, nickname, altura, peso, vitorias);
        this.finalizacoes = finalizacoes;
    }

    public int getFinalizacoes(){
        return finalizacoes;
    }
    @Override
    public String getEstilo() {
        return "Jiu-Jitero";
    }

    @Override
    public String toString(){
        return "[Jiu-Jitero] " + super.toString() + ", Finalizacoes: " + finalizacoes;
    }
}