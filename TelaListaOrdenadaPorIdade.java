import javax.swing.*;
import java.awt.*;

public class TelaListaOrdenadaPorIdade extends JFrame {

    public TelaListaOrdenadaPorIdade (CadastroLutadores cadastro) {
        setTitle("Lista de Lutadores ordenada por idade");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);

        areaTexto.setText("Lista de Lutadores ordenada por idade:\n\n");
        for (Lutador l : cadastro.ordenarPorIdade()) {
            areaTexto.append(l.toString() + "\n");
        }

        JScrollPane scroll = new JScrollPane(areaTexto);
        add(scroll, BorderLayout.CENTER);

        setVisible(true);
    }
}
