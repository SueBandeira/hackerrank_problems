package assessents.ifood2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Truco {
  public static void main(String[] args) {
    String cartaParaCima;
    List<String> cartasBaralho = new ArrayList<String>();
    cartasBaralho.add("Q");
    cartasBaralho.add("J");
    cartasBaralho.add("K");
    cartasBaralho.add("A");
    cartasBaralho.add("2");
    cartasBaralho.add("3");

    for (int i = 0; i < cartasBaralho.size(); i++) {
      int index = (int)(Math.random() * cartasBaralho.size());
      System.out.println(cartasBaralho.get(index));
      cartaParaCima = (String) cartasBaralho.get(index);
      solucao(cartaParaCima);
    }
  }
  public static void solucao(String carta) {
    switch (carta) {
      case "Q" -> System.out.println("J");
      case "J" -> System.out.println("K");
      case "K" -> System.out.println("A");
      case "A" -> System.out.println("2");
      case "2" -> System.out.println("3");
      case "3" -> System.out.println("Q");
    }
    System.out.println("_".repeat(30));
  }
}
