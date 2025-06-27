import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaListagem extends JFrame {

    public TelaListagem(CadastroLutadores cadastro) {
        setTitle("Lista de Lutadores");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);

        List<Lutador> lista = cadastro.getLutadores();
        for (Lutador l : lista) {
            areaTexto.append(l.toString() + "\n");
        }

        JScrollPane scroll = new JScrollPane(areaTexto);
        add(scroll, BorderLayout.CENTER);

        setVisible(true);
    }
}
