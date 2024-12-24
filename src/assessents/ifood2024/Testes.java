package assessents.ifood2024;

public class Testes {
  public static void main(String[] args) {
    int[][] m = new int[3][2];
    m = new int[][]{
        {1, 2},
        {3, 4},
        {5, 6},
    };
    System.out.println("\n1ª troca:");
    teste(m);
    System.out.println("\n2ª troca:");
    teste(m);
    System.out.println("\n3ª troca:");
    teste(m);
  }
  public static int[][] teste(int[][] m){
    int[][] vetorAjuda = new int[1][2];
    int[][] vetorAux = new int[1][2];
    int[][] vetorInicial = new int[1][2];

    System.out.println("======================================");
    for (int linha = 0; linha < m.length; linha++) {

      if (linha == 0) {
        vetorInicial[0][0] = m[0][0];
        vetorInicial[0][1] = m[0][1];
      }

      if (linha == m.length-1) {
        vetorAux[0][0] = vetorInicial[0][0];
        vetorAux[0][1] = vetorInicial[0][1];
      } else if (linha < m.length-1) {
        vetorAux[0][0] = m[linha+1][0];
        vetorAux[0][1] = m[linha+1][1];
      }

      for (int coluna = 0; coluna < 2; coluna++) {

        vetorAjuda[0][coluna] = m[linha][coluna];
        m[linha][coluna] = vetorAux[0][coluna];
        vetorAux[0][coluna] = vetorAjuda[0][coluna];

        System.out.print(m[linha][coluna] + "  ");
      }
      System.out.println();
    }
    return m;
  }
}
