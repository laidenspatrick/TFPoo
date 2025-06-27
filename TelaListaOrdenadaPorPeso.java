import javax.swing.*;
import java.awt.*;

public class TelaListaOrdenadaPorPeso extends JFrame {

    public TelaListaOrdenadaPorPeso (CadastroLutadores cadastro) {
        setTitle("Lista de Lutadores ordenada por peso");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);

        areaTexto.setText("Lista de Lutadores ordenada por Peso:\n\n");
      for (Lutador l : cadastro.ordenarPorPeso()) {
        areaTexto.append(l.toString() + "\n");
     }


        JScrollPane scroll = new JScrollPane(areaTexto);
        add(scroll, BorderLayout.CENTER);

        setVisible(true);
    }
}
