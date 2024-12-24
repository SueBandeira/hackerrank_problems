package assessents.ifood2024;

import java.util.Arrays;

public class DistanciaMaxima {
  public static void main(String[] args) {
    String[][] input = new String[][]{
        {"3"},
        {"0 0"},
        {"0 3"},
        {"4 0"}
    };
    processData(input);

    /*
     5
    3.56 17
    -5.1 36.3
    0.0002 -2
    5 5
    -9.01 -17.7

    54.141371427033505*/

    input = new String[][]{
        {"5"},
        {"3.56 17"},
        {"-5.1 36.3"},
        {"0.0002 -2"},
        {"5 5"},
        {"-9.01 -17.7"}
    };
    processData(input);
  }

  public static void processData(String[][] input) {
    double[][] mat = new double[input.length - 1][2];

    double distancia = 0;
    for (int i = 1; i < input.length; i++) {
      var x = input[i][0].split(" ");

      mat[i - 1][0] = Double.parseDouble(x[0]);
      mat[i - 1][1] = Double.parseDouble(x[1]);
      System.out.println(Arrays.toString(mat[i - 1]));
    }

    for (int y = 0; y < mat.length - 1; y++) {
      if (y + 1 == mat.length - 1) {
        distancia = Math.max(Math.max(
                Math.sqrt(
                    Math.pow(mat[0][0] - mat[y][0], 2) + Math.pow(mat[0][1] - mat[y][1], 2)),
                distancia),
            Math.max(
                Math.sqrt(
                    Math.pow(mat[y + 1][0] - mat[y][0], 2) + Math.pow(mat[y + 1][1] - mat[y][1], 2)),
                distancia
            ));
      } else {
        distancia = Math.max(
            Math.sqrt(
                Math.pow(mat[y + 1][0] - mat[y][0], 2) + Math.pow(mat[y + 1][1] - mat[y][1], 2)),
            distancia
        );
      }
    }
    int y = 0, x = 1, cont = 1;
    double maior = -999999999, distancia2 = 0;
    double[][] vetorAux = new double[1][2];
    double[][] vetorAjuda = new double[1][2];
    double[][] vetorInicial = new double[1][2];

    while (x < mat.length) {
      while (y < mat.length) {
        cont++;
        if (y <= mat.length - 1)
          distancia2 = Math.max((Math.pow((mat[y][0] - mat[x][0]), 2)) + (Math.pow((mat[y][1] - mat[x][1]), 2))
              , distancia2);
        distancia2 = Math.sqrt(distancia2);
        y++;
      }
      x++;
    }

    System.out.println(distancia2 + "\nMaior: " + maior + "\nTamanho Matriz: " + x + "\nContador de loop: " + cont);
  }
}
