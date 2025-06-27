import javax.swing.*;
import java.awt.*;

public class TelaExcluir extends JFrame {

    public TelaExcluir(CadastroLutadores cadastro) {
        setTitle("Excluir Lutador");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JTextField txtNome = new JTextField(15);
        JButton btnExcluir = new JButton("Excluir");

        add(new JLabel("Nome do Lutador:"));
        add(txtNome);
        add(btnExcluir);

        btnExcluir.addActionListener(e -> {
            String nome = txtNome.getText();
            Lutador l = cadastro.buscaPorNome(nome);
            if (l != null) {
                cadastro.remover(l);
                JOptionPane.showMessageDialog(this, "Lutador removido!");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Lutador não encontrado.");
            }
        });

        setVisible(true);
    }
}

