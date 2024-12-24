package assessents.ifood2024;

import java.util.LinkedList;
import java.util.List;

public class MediaAritimetica {
  public static void main(String[] args) {
    List<Integer> valores = new LinkedList<>();
    valores.add(2);
    valores.add(3);
    valores.add(4);

    mediaAritmetica(valores);
  }
  public static void mediaAritmetica(List<Integer> valores) {
    int soma=0;
    for (Integer num : valores) {
      soma += (num);
    }
    System.out.println(soma/valores.size());
  }
}
