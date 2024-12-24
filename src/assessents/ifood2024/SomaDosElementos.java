package assessents.ifood2024;

import java.util.LinkedList;
import java.util.List;

public class SomaDosElementos {
  public static void main(String[] args) {
    List<Integer> nums = new LinkedList<>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);

    soma(nums);
  }

  public static void soma(List<Integer> nums) {
    int soma=0;
    for (int i = 0; i < nums.size(); i++) {
      soma+= nums.get(i);
    }
    System.out.println(soma);
  }
}
