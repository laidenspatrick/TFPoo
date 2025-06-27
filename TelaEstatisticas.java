import javax.swing.*;
import java.awt.*;

public class TelaEstatisticas extends JFrame {

    public TelaEstatisticas(CadastroLutadores cadastro) {
        setTitle("Tela de Estatísticas");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);

        areaTexto.setText(
            "\nQuantidade de lutadores na lista:\n\n" + cadastro.quantidadeLutadores() +
            "\nQuantidade de boxers na lista:\n\n" + cadastro.quantidadeBoxeadores() +
            "\nQuantidade de Jiu_Jiteros na lista:\n\n" + cadastro.quantidadeJiu_Jiteros() +
            "\nQuantidade de Wrestler na lista:\n\n" + cadastro.quantidadeWrestlers() +
            "\nQuantidade de Karatecas na lista:\n\n" + cadastro.quantidadeKaratecas() +
            "\nMedia de idade dos lutadores:\n\n" + cadastro.mediaIdade() +
            "\nMedia de vitorias dos lutadores:\n\n" + cadastro.mediaVitorias() +
            "\nMedia de peso dos lutadores:\n\n" + cadastro.mediaPeso() +
            "\nSoma Vitorias dos lutadores:\n\n" + cadastro.somaVitorias() +
            "\nSoma Vitorias dos boxeadores:\n\n" + cadastro.somaVitoriasPorEstilo("Boxeador") +
            "\nSoma Vitorias dos Jiu_Jiteros:\n\n" + cadastro.somaVitoriasPorEstilo("Jiu-Jitero") +
            "\nSoma Vitorias dos Wrestler:\n\n" + cadastro.somaVitoriasPorEstilo("Wrestler") +
            "\nSoma Vitorias dos Karatecas:\n\n" + cadastro.somaVitoriasPorEstilo("Karateca") +
            "\nSoma Vitoria dos Pesos Moscas\n\n" + cadastro.somaVitoriasPorCategoria(CategoriaPeso.MOSCA) +
            "\nSoma Vitoria dos Pesos Galos\n\n" + cadastro.somaVitoriasPorCategoria(CategoriaPeso.GALO) +
            "\nSoma Vitoria dos Pesos Pena\n\n" + cadastro.somaVitoriasPorCategoria(CategoriaPeso.PENA) +
            "\nSoma Vitoria dos Pesos Leves\n\n" + cadastro.somaVitoriasPorCategoria(CategoriaPeso.LEVE) +
            "\nSoma Vitoria dos Pesos Meio-Medios\n\n" + cadastro.somaVitoriasPorCategoria(CategoriaPeso.MEIO_MEDIO) +
            "\nSoma Vitoria dos Pesos Medios\n\n" + cadastro.somaVitoriasPorCategoria(CategoriaPeso.MEDIO) +
            "\nSoma Vitoria dos Pesos Meio-Pesados\n\n" + cadastro.somaVitoriasPorCategoria(CategoriaPeso.MEIO_PESADO) +
            "\nSoma Vitoria dos Pesos Pesados\n\n" + cadastro.somaVitoriasPorCategoria(CategoriaPeso.PESADO)
        );
        JScrollPane scroll = new JScrollPane(areaTexto);
        add(scroll, BorderLayout.CENTER);

        setVisible(true);
    }
}