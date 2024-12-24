package assessents.ifood2024;

import java.util.Arrays;

public class CofreBugadao {
  public static void main(String[] args) {
    String[][] s1 = {
        {"cubos"},
        {"cuggbyos"}
    };

    String[][] s2 = {
        {"cubos"},
        {"ewvelrabsocaeln"}
    };

    processData(s1);
    processData(s2);
  }

  public static void processData(String[][] input) {
    char[] c1 = Arrays.toString(input[0]).toCharArray();
    char[] c2 = Arrays.toString(input[1]).toCharArray();

    int tam = 0;

    for (int i = 0; i < c2.length; i++)
      if (c1[tam] == c2[i]) tam++;

    if (tam == c1.length)
      System.out.println("SIM");
    else
      System.out.println("NAO");
  }
}
