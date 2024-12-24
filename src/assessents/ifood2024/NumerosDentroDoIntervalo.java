package assessents.ifood2024;

public class NumerosDentroDoIntervalo {
  public static void main(String[] args) {
    intervalo(10, 5, 20);
  }
  public static void intervalo(int numero, int limiteIferior, int limiteSuperior) {
    if (numero > limiteIferior && numero < limiteSuperior) {
      System.out.println("PERTENCE");
    } else {
      System.out.println("NAO PERTENCE");
    }
  }
}
