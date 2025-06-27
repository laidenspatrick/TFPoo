import javax.swing.*;
import java.awt.*;

public class TelaCadastro extends JFrame {

    public TelaCadastro(CadastroLutadores cadastro) {
        setTitle("Cadastro de Lutador");
        setSize(400, 450);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(11, 2));

        JTextField txtNome = new JTextField();
        txtNome.setBounds(30,30,150,45);
        JTextField txtIdade = new JTextField();
        JTextField txtNacionalidade = new JTextField();
        JTextField txtNickname = new JTextField();
        JTextField txtAltura = new JTextField();
        JTextField txtPeso = new JTextField();
        JTextField txtVitorias = new JTextField();

        JComboBox<String> comboEstilo = new JComboBox<>(new String[]{
                "Boxeador", "Karateca", "Wrestler", "Jiu-Jitero"
        });

        JLabel lblEspecifico = new JLabel("Socos conectados:");
        JTextField txtEspecifico = new JTextField();

        JButton btnSalvar = new JButton("Salvar");

        add(new JLabel("Estilo:")); add(comboEstilo);
        add(new JLabel("Nome:")); add(txtNome);
        add(new JLabel("Idade:")); add(txtIdade);
        add(new JLabel("Nacionalidade:")); add(txtNacionalidade);
        add(new JLabel("Apelido:")); add(txtNickname);
        add(new JLabel("Altura:")); add(txtAltura);
        add(new JLabel("Peso:")); add(txtPeso);
        add(new JLabel("Vitórias:")); add(txtVitorias);
        add(lblEspecifico);
        add(txtEspecifico);
        add(btnSalvar);

        comboEstilo.addActionListener(e -> {
            String estilo = (String) comboEstilo.getSelectedItem();
            switch (estilo) {
                case "Boxeador":
                    lblEspecifico.setText("Socos conectados:");
                    break;
                case "Karateca":
                    lblEspecifico.setText("Chutes:");
                    break;
                case "Wrestler":
                    lblEspecifico.setText("Quedas aplicadas:");
                    break;
                case "Jiu-Jitero":
                    lblEspecifico.setText("Finalizações:");
                    break;
            }
        });

        btnSalvar.addActionListener(e -> {
            try {
                String estilo = (String) comboEstilo.getSelectedItem();
                String nome = txtNome.getText();
                int idade = Integer.parseInt(txtIdade.getText());
                String nacionalidade = txtNacionalidade.getText();
                String nickname = txtNickname.getText();
                double altura = Double.parseDouble(txtAltura.getText());
                double peso = Double.parseDouble(txtPeso.getText());
                int vitorias = Integer.parseInt(txtVitorias.getText());
                int valorEspecifico = Integer.parseInt(txtEspecifico.getText());

                Lutador novo = null;
                switch (estilo) {
                    case "Boxeador":
                        novo = new Boxeador(nome, idade, nacionalidade, nickname, altura, peso, vitorias, valorEspecifico);
                        break;
                    case "Karateca":
                        novo = new Karateca(nome, idade, nacionalidade, nickname, altura, peso, vitorias, valorEspecifico);
                        break;
                    case "Wrestler":
                        novo = new Wrestler(nome, idade, nacionalidade, nickname, altura, peso, vitorias, valorEspecifico);
                        break;
                    case "Jiu-Jitero":
                        novo = new Jiu_Jitero(nome, idade, nacionalidade, nickname, altura, peso, vitorias, valorEspecifico);
                        break;
                }

                if (cadastro.adicionar(novo)) {
                    JOptionPane.showMessageDialog(this, "Lutador cadastrado com sucesso!");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Lutador já existe ou inválido!");
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar: " + ex.getMessage());
            }
        });

        setVisible(true);
    }
}
