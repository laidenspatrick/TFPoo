import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaPrincipal extends JFrame {

    private CadastroLutadores cadastro;

    public TelaPrincipal() {
        cadastro = new CadastroLutadores();
        Boxeador b1 = new Boxeador ("Dustin", 33, "USA", "The Diamond", 1.80, 70,28, 150);
        Boxeador b2 = new Boxeador ("Conor", 35, "Ireland", "The Notorious", 1.75, 70, 22, 170);
        Jiu_Jitero j1 = new Jiu_Jitero ("Charles", 33, "Brazil", "Do Bronx", 1.80, 70, 20, 18);
        Jiu_Jitero j2 = new Jiu_Jitero ("Gilbert", 38, "Brazil", "Durinho", 1.75, 77, 20, 12);
        Karateca k1 = new Karateca ("Lyoto", 45, "Brazil", "The Dragon", 1.80, 84, 20, 10);
        Karateca k2 = new Karateca ("Anderson", 48, "Brazil", "Spider", 1.85, 84, 34, 10);
        Wrestler w1 = new Wrestler ("Brock", 46, "USA", "The Beast", 1.90, 120, 20, 10);
        Wrestler w2 = new Wrestler ("Randy", 60, "USA", "The Natural", 1.85, 120, 20, 10);
        Boxeador b3 = new Boxeador ("Alex", 37, "Brazil", "Poatan", 1.85, 93, 10, 160);
        Jiu_Jitero j3 = new Jiu_Jitero ("Alexandre", 30, "Brazil", "Pequeno", 1.70, 57, 20, 10);
        Karateca k3 = new Karateca ("Rafael", 30, "Brazil", "The Dragon", 1.80, 61, 20, 10);
        Wrestler w3 = new Wrestler ("Jon", 36, "USA", "Bones", 1.60, 66, 30, 10);

        cadastro.adicionar(b1);
        cadastro.adicionar(b2);
        cadastro.adicionar(j1);
        cadastro.adicionar(j2);
        cadastro.adicionar(k1);
        cadastro.adicionar(k2);
        cadastro.adicionar(w1);
        cadastro.adicionar(w2);
        cadastro.adicionar(b3);
        cadastro.adicionar(j3);
        cadastro.adicionar(k3);
        cadastro.adicionar(w3);


        setTitle("Menu");
        setSize(250, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton botaoAd = new JButton("Cadastrar Lutador");
        botaoAd.setBounds(500,400,150,30);
        JButton botaoEx = new JButton("Excluir Lutador");
        botaoEx.setBounds(500,450,150,30);
        JButton botaoLi = new JButton("Listar Lutadores");
        botaoLi.setBounds(500,500,150,30);
        JButton botaoS = new JButton("Estatistica da Lista de Lutadores");
        botaoS.setBounds(500,550,250,30);

        add(botaoAd);
        add(botaoEx);
        add(botaoLi);
        add(botaoS);

        botaoAd.addActionListener(e -> new TelaCadastro(cadastro));
        botaoEx.addActionListener(e -> new TelaExcluir(cadastro));
        botaoLi.addActionListener(e -> new TelaEscolha(cadastro).setVisible(true));
        botaoS.addActionListener(e -> new TelaEstatisticas(cadastro));

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }
}
