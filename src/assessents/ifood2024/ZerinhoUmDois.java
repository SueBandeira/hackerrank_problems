package assessents.ifood2024;

import java.util.ArrayList;
import java.util.List;

public class ZerinhoUmDois {
  static class Jogador {
    String nome;
    int jogada;

    Jogador(String nome, int jogada) {
      this.nome = nome;
      this.jogada = jogada;
    }
  }

  public static void main(String[] args) {
    List<Jogador> jogadores = new ArrayList<>();

    jogadores.add(new Jogador("Herman", 1));
    jogadores.add(new Jogador("Rhodes", 0));
    jogadores.add(new Jogador("Beach", 0));
    jogadores.add(new Jogador("Laurel", 0));
    jogadores.add(new Jogador("Beatrice", 0));
    jogadores.add(new Jogador("Alison", 0));
    jogadores.add(new Jogador("Saundra", 0));
    jogadores.add(new Jogador("Klein", 0));

    solucao(jogadores);
  }

  public static void solucao(List<Jogador> jogadores) {
    int um=0, zero=0;
    List<String> jogadoresUm = new ArrayList<>();
    List<String> jogadoresZero = new ArrayList<>();

    for (Jogador player : jogadores) {
        //System.out.println(entrada.getKey() + " | " + entrada.getValue() +"\n" + "_".repeat(40));
        if (player.jogada == 1) {
          jogadoresUm.add(player.nome);
          um++;
        } else {
          jogadoresZero.add(player.nome);
          zero++;
        }
    }

    if ((um > 1 && zero > 1) || (um == 0 && zero == 0))
      System.out.println("NINGUEM");
    else if (um == 1)
      System.out.println(jogadoresUm.getFirst());
    else
      System.out.println(jogadoresZero.getFirst());
  }
}
