package assessents.ifood2024;

import java.util.ArrayList;
import java.util.List;

public class Promocao {
  public static void main(String[] args) {
    List<Integer> precos =List.of(100, 100, 100);
    solucao(precos);
    precos = List.of(150, 50);
    solucao(precos);
    precos = List.of(200, 150, 50, 100);
    solucao(precos);
  }
  public static void solucao(List<Integer> precos) {
    int itemMaisBarato = precos.get(0);
    int soma = itemMaisBarato;
    for (int i = 1; i < precos.size(); i++) {
      if (precos.get(i) < itemMaisBarato)
        itemMaisBarato = precos.get(i);
      soma += precos.get(i);
    }
    int desconto = precos.size() > 2 ? itemMaisBarato/2 : 0;
    System.out.println(soma-desconto);
  }
}
