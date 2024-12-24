package assessents.ifood2024;

public class ContadorDePalavras {
  public static void main(String[] args) {
    //Já passou no teste da plataforma

    solucao("             Um texto qualquer");
    solucao("Cuidado, pois usuarios as vezes deixam espacos vazios no fim do texto sem querer");
    solucao("Olá    mundo      tudo   bem");
    solucao(", trim");
    solucao(",");
  }
  public static void solucao(String texto) {
    int palavras=0;
    if (texto.isEmpty()) {
      System.out.println(palavras);
    } else {
      palavras = 1;
      texto = texto.trim();
      char[] s;
      s = texto.toCharArray();



      for (int i = 0; i < s.length; i++) {
        if (s[i] == ' ' && s[i - 1] != ' ') {
          palavras++;
        }
      }
      System.out.println(texto + "\n" + palavras + "\n" + "_".repeat(35));
    }
  }
}
