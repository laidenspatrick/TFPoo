import javax.swing.*;
import java.awt.*;

public class TelaListaPorEstilo extends JFrame {

    public TelaListaPorEstilo (CadastroLutadores cadastro) {
        setTitle("Lista de Lutadores por Estilo");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel("Selecione o Estilo:"));

        JComboBox<String> comboEstilo = new JComboBox<>(new String[]{
                "Boxeador", "Karateca", "Wrestler", "Jiu-Jitero"
        });

        panel.add(comboEstilo);
        add(panel, BorderLayout.NORTH);

        JScrollPane scroll = new JScrollPane(areaTexto);
        add(scroll, BorderLayout.CENTER);

        comboEstilo.addActionListener(e -> {
            String estilo = (String) comboEstilo.getSelectedItem();
            areaTexto.setText("");
            cadastro.filtrarPorEstilo(estilo).forEach(l -> areaTexto.append(l + "\n"));
        });

        setVisible(true);
    }
}