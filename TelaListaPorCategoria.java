import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaListaPorCategoria extends JFrame {

    public TelaListaPorCategoria(CadastroLutadores cadastro) {
        setTitle("Lista de Lutadores por Categoria");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JTextArea areaTexto = new JTextArea();
            areaTexto.setEditable(false);

        String input = JOptionPane.showInputDialog(this, "Digite a categoria: ");

        try {
            CategoriaPeso cat = CategoriaPeso.valueOf(input.toUpperCase());
            List<Lutador> lista = cadastro.filtrarPorCategoria(cat);
            if (lista.isEmpty()) {
                areaTexto.setText("Nenhum lutador encontrado na categoria " + cat + ".");
            } else {
                for (Lutador l : lista) {
                    areaTexto.append(l.toString() + "\n");
                }
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Categoria inválida. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }


        JScrollPane scroll = new JScrollPane(areaTexto);
        add(scroll, BorderLayout.CENTER);

        setVisible(true);
    }
}
