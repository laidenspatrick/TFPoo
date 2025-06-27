import javax.swing.*;

public class TelaEscolhaLista extends JFrame {

    public TelaEscolhaLista(CadastroLutadores cadastro) {
 
        setTitle("Listas Disponiveis");
        setSize(250, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton botaoAd = new JButton("Lista normal");
        botaoAd.setBounds(45,50,150,30);
        JButton botaoLis = new JButton("Listar por Estilo");
        botaoLis.setBounds(45,150,150,30);
        JButton botaoS = new JButton("lista ordenada por Peso");
        botaoS.setBounds(45,200,150,30);
        JButton botaoS2 = new JButton("Lista ordenada por Vitorias");
        botaoS2.setBounds(45,250,150,30);
        JButton botaoS3 = new JButton("Lista ordenada por Idade");
        botaoS3.setBounds(45,300,150,30);
        JButton botaoS4 = new JButton("Lista por Categoria");
        botaoS4.setBounds(45,350,150,30);
        JButton botaoS5 = new JButton("Lista por Nacionalidade");
        botaoS5.setBounds(45,400,150,30);

        add(botaoAd);
        add(botaoLis);
        add(botaoS);
        add(botaoS2);
        add(botaoS3);
        add(botaoS4);
        add(botaoS5);

        botaoAd.addActionListener(e -> new TelaListagem(cadastro));
        botaoLis.addActionListener(e -> new TelaListaPorEstilo(cadastro));
        botaoS.addActionListener(e -> new TelaListaOrdenadaPorPeso(cadastro));
        botaoS2.addActionListener(e -> new TelaListaOrdenadaPorVitorias(cadastro));
        botaoS3.addActionListener(e -> new TelaListaOrdenadaPorIdade(cadastro));
        botaoS4.addActionListener(e -> new TelaListaPorCategoria(cadastro));
        botaoS5.addActionListener(e -> new TelaListaPorNacionalidade(cadastro));
    }
}