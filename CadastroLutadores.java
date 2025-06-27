import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CadastroLutadores{
    private List<Lutador> lutadores;

    public CadastroLutadores(){
        lutadores = new LinkedList<>();
    }

    public List<Lutador> getLutadores() { 
		return Collections.unmodifiableList(lutadores);
	}

	@Override
	public String toString() {
		return "Cadastro de Lutadores [lutadores=" + lutadores + "]";
	}

    public boolean adicionar (Lutador lutador) { 
        if (lutador == null || lutadores.contains(lutador)) {
            return false;
        }
        return lutadores.add(lutador);
    }

    public boolean remover (Lutador lutador) { 
        if (lutador == null || !lutadores.contains(lutador)) {
            return false;
        }
        return lutadores.remove(lutador);
    }

    public Lutador buscaPorNome (String nome) { 
        return lutadores.stream()
        .filter(l -> l.getNome().equalsIgnoreCase(nome))
        .findFirst()
        .orElse(null);
    }

    public long quantidadeBoxeadores(){ 
        return lutadores.stream()
        .filter(l -> l instanceof Boxeador)
        .count();
    }

    public long quantidadeJiu_Jiteros(){ 
        return lutadores.stream()
        .filter(l -> l instanceof Jiu_Jitero)
        .count();
    }

    public long quantidadeWrestlers (){ 
        return lutadores.stream()
        .filter(l -> l instanceof Wrestler)
        .count();
    }

    public long quantidadeKaratecas() { 
        return lutadores.stream()
        .filter(l -> l instanceof Karateca)
        .count();
    }

    public long quantidadeLutadores() { 
        return lutadores.size();
    }

    public double mediaVitorias(){ 
     double MediaVitorias = lutadores.stream()
    .mapToInt( l->l.getVitorias())
    .average()
    .getAsDouble();
    return MediaVitorias;
    }

    public double mediaPeso(){ 
        double MediaPeso = lutadores.stream()
       .mapToDouble( l->l.getPeso())
       .average()
       .getAsDouble();
       return MediaPeso;
       }
    
    public double mediaIdade(){ 
        double MediaIdade = lutadores.stream()
       .mapToInt( l->l.getIdade())
       .average()
       .getAsDouble();
       return MediaIdade;
       }

    public double somaVitorias() { 
        double soma = lutadores.stream()
        .mapToInt(l -> l.getVitorias())
        .sum();
        return soma;
    }

    public double somaVitoriasPorPais(String nacionalidade) {
        double soma = lutadores.stream()
        .filter(l -> l.getNacionalidade().equalsIgnoreCase(nacionalidade))
        .mapToInt(l -> l.getVitorias())
        .sum();
        return soma;
    }

    public double somaVitoriasPorCategoria(CategoriaPeso categoria) { 
        double soma = lutadores.stream()
        .filter(l -> l.getCategoria().equals(categoria))
        .mapToInt(l -> l.getVitorias())
        .sum();
        return soma;
    }

    public double somaVitoriasPorEstilo(String estilo) { 
        double soma = lutadores.stream()
        .filter(l -> l.getEstilo().equalsIgnoreCase(estilo))
        .mapToInt(l -> l.getVitorias())
        .sum();
        return soma;
    }

    public List<Lutador> filtrarPorPais(String nacionalidade) { 
        List<Lutador> lutadoresFiltrados = new ArrayList<>();
        lutadores.stream()
        .filter(l -> l.getNacionalidade().equalsIgnoreCase(nacionalidade))
        .forEach(l -> lutadoresFiltrados.add(l));
        return lutadoresFiltrados;
    }

    public List<Lutador> filtrarPorEstilo (String estilo) {
        List<Lutador> lutadoresFiltrados = new ArrayList<>();
        lutadores.stream()
        .filter(l -> l.getEstilo().equalsIgnoreCase(estilo))
        .forEach(l -> lutadoresFiltrados.add(l));
        return lutadoresFiltrados;
    }

    public List<Lutador> filtrarPorCategoria(CategoriaPeso categoria) { 
        List<Lutador> lutadoresFiltrados = new ArrayList<>();
        lutadores.stream()
        .filter(l -> l.getCategoria().equals(categoria))
        .forEach(l -> lutadoresFiltrados.add(l));
        return lutadoresFiltrados;
    }

    public List<Lutador> ordenarPorVitorias(){ 
        List<Lutador> lutadoresOrdenados = new ArrayList<>();
        lutadoresOrdenados.addAll(lutadores);
        lutadoresOrdenados.sort((l1, l2) -> Integer.compare(l2.getVitorias(), l1.getVitorias()));
        return lutadoresOrdenados;
    }

    public List<Lutador> ordenarPorIdade(){ 
        List<Lutador> lutadoresOrdenados = new ArrayList<>();
        lutadoresOrdenados.addAll(lutadores);
        lutadoresOrdenados.sort((l1, l2) -> Integer.compare(l1.getIdade(), l2.getIdade()));
        return lutadoresOrdenados;
    }

    public List<Lutador> ordenarPorPeso(){ 
        List<Lutador> lutadoresOrdenados = new ArrayList<>();
        lutadoresOrdenados.addAll(lutadores);
        lutadoresOrdenados.sort((l1, l2) -> Double.compare(l1.getPeso(), l2.getPeso()));
        return lutadoresOrdenados;
    }

}