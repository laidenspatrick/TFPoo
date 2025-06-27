import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaListaPorNacionalidade extends JFrame {

    public TelaListaPorNacionalidade (CadastroLutadores cadastro) {
        setTitle("Lista de Lutadores por País");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JTextArea areaTexto = new JTextArea();
            areaTexto.setEditable(false);

        String pais = JOptionPane.showInputDialog(this, "Digite o país");

        try {
            List<Lutador> lista = cadastro.filtrarPorPais(pais);
            if (lista.isEmpty()) {
                areaTexto.setText("Nenhum lutador encontrado na pais " + pais + ".");
            } else {
                for (Lutador l : lista) {
                    areaTexto.append(l.toString() + "\n");
                }
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Pais inválido. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }


        JScrollPane scroll = new JScrollPane(areaTexto);
        add(scroll, BorderLayout.CENTER);

        setVisible(true);
    }
}
