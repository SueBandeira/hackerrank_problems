package assessents.ifood2024;

public class Taximetro {
  public static void main(String[] args) {
    solucao(25F, 11.5F);
    solucao(10, 10);
  }

  public static void solucao(float min, float km) {
    float menor20min=0, maior20min=0, menor10km=0, maior10km=0, valorPago=0;
    if (min > 20) {
      maior20min = (min - 20)* 0.3f;
      menor20min = (20)* 0.5f;
      if (km > 10) {
        maior10km = (km - 10) *0.5f;
        menor10km = (10)* 0.7f;
      } else {
        menor10km = (km)* 0.7f;
      }
    } else {
      menor20min = (min)* 0.5f;
      if (km > 10) {
        maior10km = (km - 10) *0.5f;
        menor10km = (km)* 0.7f;
      } else {
        menor10km = (km)* 0.7f;
      }
    }
    valorPago = (float) Math.floor((maior20min + menor20min + menor10km + maior10km)*100);
    System.out.printf("\n%.0f\n", valorPago);
  }

}
