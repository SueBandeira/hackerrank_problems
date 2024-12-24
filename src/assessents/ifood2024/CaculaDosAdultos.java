package assessents.ifood2024;

import java.util.ArrayList;
import java.util.List;

public class CaculaDosAdultos {
  public static void main(String[] args) {
    List<Integer> idades = new ArrayList<>();
    idades.add(12);
    idades.add(18);
    idades.add(27);
    solucao(idades);

    idades.clear();

    idades.add(13);
    idades.add(15);
    solucao(idades);
  }
  public static void solucao(List<Integer> lista) {
    int menorIdadeLegal = 999;
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) >= 18 && lista.get(i) < menorIdadeLegal) {
        menorIdadeLegal = lista.get(i);
      }
    }
    System.out.println((menorIdadeLegal != 999 ? menorIdadeLegal : "CRESCA E APARECA") + "\n" + "_".repeat(30));

  }
}
