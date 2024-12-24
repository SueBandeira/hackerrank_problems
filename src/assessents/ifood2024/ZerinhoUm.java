package assessents.ifood2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZerinhoUm {
    public static void main(String[] args) {
      // Lista para armazenar os mapas
      List<Map<String, Integer>> jogadores = new ArrayList<>();

      // Adicionando os jogadores como mapas
      jogadores.add(criarJogador("Herman", 1));
      jogadores.add(criarJogador("Rhodes", 0));
      jogadores.add(criarJogador("Beach", 0));
      jogadores.add(criarJogador("Laurel", 0));
      jogadores.add(criarJogador("Beatrice", 0));
      jogadores.add(criarJogador("Alison", 0));
      jogadores.add(criarJogador("Saundra", 0));
      jogadores.add(criarJogador("Klein", 0));

      // Formatando a saída para exibir no formato desejado
      //System.out.println(formatarComoJson(jogadores));
      solucao(jogadores);
    }

    // Método para criar um jogador como mapa
    private static Map<String, Integer> criarJogador(String nome, int jogada) {
      Map<String, Integer> jogador = new HashMap<>();
      jogador.put(nome, jogada); // Usando o nome como chave
      return jogador;
    }

    // Método para formatar a lista no formato JSON desejado
    private static String formatarComoJson(List<Map<String, Integer>> lista) {
      StringBuilder sb = new StringBuilder();
      sb.append("[\n");
      for (Map<String, Integer> mapa : lista) {
        sb.append("  {\n");
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
          sb.append("    \"nome\": \"").append(entrada.getKey()).append("\",\n");
          sb.append("    \"jogada\": ").append(entrada.getValue()).append("\n");
        }
        sb.append("  },\n");
      }
      if (!lista.isEmpty()) {
        sb.setLength(sb.length() - 2); // Remove a última vírgula e nova linha
      }
      sb.append("\n]");
      return sb.toString();
    }

    public static void solucao(List<Map<String, Integer>> jogadores) {
      int um=0, zero=0, indiceGanhadorUm=-1, indiceGanhadorZero=-1;
      List<String> jogadoresUm = new ArrayList<>();
      List<String> jogadoresZero = new ArrayList<>();

      for (Map<String, Integer> mapa : jogadores) {
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
          //System.out.println(entrada.getKey() + " | " + entrada.getValue() +"\n" + "_".repeat(40));
          if (entrada.getValue() == 1) {
            jogadoresUm.add(entrada.getKey());
            um++;
            indiceGanhadorUm++;
          } else {
            jogadoresZero.add(entrada.getKey());
            zero++;
            indiceGanhadorZero++;
          }
        }
      }

      if ((um > 1 && zero > 1) || (um == 0 && zero == 0))
        System.out.println("NINGUEM");
      else if (um == 1)
        System.out.println(jogadoresUm.get(indiceGanhadorUm));
      else
        System.out.println(jogadoresZero.get(indiceGanhadorZero));
    }
  }



