import java.awt.*;
import javax.swing.*;

public class TelaEscolha extends JFrame {

    public TelaEscolha(CadastroLutadores cadastro) {
 
        setTitle("Listas Disponiveis");
        setSize(250, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);

        JButton botaoAd = new JButton("Lista normal");
        botaoAd.setBounds(500,350,150,30);
        JButton botaoS = new JButton("Lista ordenada por Peso");
        botaoS.setBounds(500,400,300,30);
        JButton botaoS2 = new JButton("Lista ordenada por Vitorias");
        botaoS2.setBounds(500,450,300,30);
        JButton botaoS3 = new JButton("Lista ordenada por Idade");
        botaoS3.setBounds(500,500,300,30);
        JButton botaoS4 = new JButton("Lista por Categoria");
        botaoS4.setBounds(500,550,150,30);
        JButton botaoS5 = new JButton("Lista por Nacionalidade");
        botaoS5.setBounds(500,600,190,30);
        JButton botaoLis = new JButton("Listar por Estilo");
        botaoLis.setBounds(500,650,170,30);

        add(botaoAd);
        add(botaoS);
        add(botaoS2);
        add(botaoS3);
        add(botaoS4);
        add(botaoS5);
        add(botaoLis);

        botaoAd.addActionListener(e -> new TelaListagem(cadastro));
        botaoLis.addActionListener(e -> new TelaListaPorEstilo(cadastro));
        botaoS.addActionListener(e -> new TelaListaOrdenadaPorPeso(cadastro));
        botaoS2.addActionListener(e -> new TelaListaOrdenadaPorVitorias(cadastro));
        botaoS3.addActionListener(e -> new TelaListaOrdenadaPorIdade(cadastro));
        botaoS4.addActionListener(e -> new TelaListaPorCategoria(cadastro));
        botaoS5.addActionListener(e -> new TelaListaPorNacionalidade(cadastro));

    }
}