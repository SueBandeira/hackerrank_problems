package assessents.ifood2024;

import java.util.ArrayList;
import java.util.List;

public class Americano {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    nums.add(1);
    nums.add(3);
    nums.add(2);
    nums.add(1);
    solucao(nums);
    nums.clear();

    nums.add(1);
    nums.add(1);
    nums.add(1);
    solucao(nums);
  }
  public static void solucao(List<Integer> numeros) {
    int sum=0;
    for (int i = 0; i < numeros.size(); i++) {
      sum += numeros.get(i);
    }

    int tam = 0;

    // 7 1   6 2   5 3   4 4    3 1    2 2    1 3

    while (sum != 0) {
      tam++;
      if (tam > numeros.size()) {
        tam=1;
      }
      sum--;
    }
    
    int goleiro = tam;

    System.out.println(goleiro);
  }
}
