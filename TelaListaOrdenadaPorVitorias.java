import javax.swing.*;
import java.awt.*;

public class TelaListaOrdenadaPorVitorias extends JFrame {

    public TelaListaOrdenadaPorVitorias (CadastroLutadores cadastro) {
        setTitle("Lista de Lutadores ordenada por vitorias");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);

        areaTexto.setText("Lista de Lutadores ordenada por vitorias:\n\n");
        for (Lutador l : cadastro.ordenarPorVitorias()) {
            areaTexto.append(l.toString() + "\n");
        }

        JScrollPane scroll = new JScrollPane(areaTexto);
        add(scroll, BorderLayout.CENTER);

        setVisible(true);
    }
}