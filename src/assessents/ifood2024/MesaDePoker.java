package assessents.ifood2024;

import java.util.ArrayList;
import java.util.List;

public class MesaDePoker {
  public static void main(String[] args) {
    List<Integer> s = new ArrayList<>();
    s.add(0);
    s.add(5);
    s.add(6);
    s.add(10);
    s.add(11);

    int min = 2, max = 10;

    solucao(min, max, s);

    s.clear();

    min = 1;
    max = 1;

    for(int i = 1; i < 10; i++) s.add(i);
    //System.out.println(s);
    solucao(min, max, s);
    s.clear();
    solucao(min, max, s);
  }
  public static void solucao(int min, int max, List<Integer> valores) {
    int tam = valores.size()-1;
//    while (tam >= 0) {
//      if (valores.get(tam) < min || valores.get(tam) > max) {
//        valores.remove(tam);
//      }
//      tam--;
//    }

    for (int i =valores.size()-1; i >= 0; i--) {
      if (valores.get(i) < min || valores.get(i) > max) {
        valores.remove(i);
      }
    }

    System.out.println(valores);
  }
}
