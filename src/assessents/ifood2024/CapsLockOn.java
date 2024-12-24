package assessents.ifood2024;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class CapsLockOn {
  public static void main(String[] args) {
    System.out.println(solucao("cAPS"));
    System.out.println(solucao("lock"));
    System.out.println(solucao("CAPS"));
    System.out.println(solucao("loCk"));
    System.out.println(solucao("Caps"));//verificar depois
    System.out.println(solucao("locK"));
  }
  public static String solucao(String texto) {
    String palavraCorrigida;

    if (texto.equals(texto.toLowerCase())) {
      return texto;
    } else if (texto.equals(texto.toUpperCase())) {
      return texto.toLowerCase();
    } else {
      char[] palavraAnalisar = texto.toCharArray();
      String letraAnalizada = String.valueOf(palavraAnalisar[0]).toUpperCase();
      if (palavraAnalisar[0] != letraAnalizada.charAt(0)) {
        palavraAnalisar[0] = letraAnalizada.charAt(0);
      }
      String stringsMinusculas;
      if (texto.substring(1).equals(texto.substring(1).toUpperCase())) {
        stringsMinusculas =texto.substring(1).toLowerCase();
        return palavraAnalisar[0] + stringsMinusculas;
      } else {
        palavraCorrigida = texto;
      }
    }
    return palavraCorrigida;
  }
}
class CapsLockOnTest {
  @Test
  void testSolution() {
    LinkedHashMap<String, String> tests = new LinkedHashMap<>();
    tests.put("Caps", "Caps");
    tests.put("CAPS", "caps");
    tests.put("cAPS", "Caps");
    tests.put("caps", "caps");
    tests.put("", "");
    tests.put("TipfihZiNwNsGGzKitGtGGOnEvgFZlCYhTPotpKhYvHdmFSlwZrRbRqnuorgTEZElUoeZfCSzPQFtVGnXpUXZXdfdCEDYDszrRgz", "TipfihZiNwNsGGzKitGtGGOnEvgFZlCYhTPotpKhYvHdmFSlwZrRbRqnuorgTEZElUoeZfCSzPQFtVGnXpUXZXdfdCEDYDszrRgz");
    tests.put("cjTfjLyXPOkmVKlLiQfASqGaEKajRLvLXELgCTDkkHokMGvSkBorJXJUKFynSCqlhmHTLhblEZvHrKsVkGlmodvuUwbyDOcnJlAX", "cjTfjLyXPOkmVKlLiQfASqGaEKajRLvLXELgCTDkkHokMGvSkBorJXJUKFynSCqlhmHTLhblEZvHrKsVkGlmodvuUwbyDOcnJlAX");
    tests.put("LHHoeYOtPwHCksjEpxSxUBxZqLWBXJuNjlsfglzwotQwKrYssKblQBufrFFLIcJpIpeyPZeqTFOcqetxKLuHqAzfzBxgKqVvYuHi", "LHHoeYOtPwHCksjEpxSxUBxZqLWBXJuNjlsfglzwotQwKrYssKblQBufrFFLIcJpIpeyPZeqTFOcqetxKLuHqAzfzBxgKqVvYuHi");
    tests.put("vCdEDbPsusGgGMMHTYPUEtCCNXcxBSFjBllObOkDQFRRZXGduBzcSjRiulfvupCTQogikiWJsJbEwVBPqhKyAdxWRPttNlVHXZfr", "vCdEDbPsusGgGMMHTYPUEtCCNXcxBSFjBllObOkDQFRRZXGduBzcSjRiulfvupCTQogikiWJsJbEwVBPqhKyAdxWRPttNlVHXZfr");
    tests.put("WPHwrQRIzHdctEOTGjlhkWNgIipKPjtrBmHwqnXSFrtEciPkMuvjLSoJTvGQBXQfCplSpabqSQSnrncismcpBExoHLtVPoBiYfzH", "WPHwrQRIzHdctEOTGjlhkWNgIipKPjtrBmHwqnXSFrtEciPkMuvjLSoJTvGQBXQfCplSpabqSQSnrncismcpBExoHLtVPoBiYfzH");
    tests.put("pBIYQkFnNLcQbmXjJsNuOpzhQIzUeOMjrTJltTSUfdPTRywTckBXtyIquixZfsemdWRrLScVPnNxYWVOGNTSmWPOWSxsFaJghQrn", "pBIYQkFnNLcQbmXjJsNuOpzhQIzUeOMjrTJltTSUfdPTRywTckBXtyIquixZfsemdWRrLScVPnNxYWVOGNTSmWPOWSxsFaJghQrn");
    tests.put("TXpELJfpTrnnKpWZtbogCRfGGkVheIcKAoYXNlzAqGSMortUhAqFZViKBcSVbZgVrATdbMBnpkxGfjruDkLEqNrREkTRHMpoqaqF", "TXpELJfpTrnnKpWZtbogCRfGGkVheIcKAoYXNlzAqGSMortUhAqFZViKBcSVbZgVrATdbMBnpkxGfjruDkLEqNrREkTRHMpoqaqF");
    tests.put("dxPaPeEmjhjgYuQgWdxYUpuTJRkjWOKLeZGDHGwXVvwaGUtqejqmHHzMweEFylKbiZxQetAYbHGxGcqpnFveUfuoGMPZrJzyZqgS", "dxPaPeEmjhjgYuQgWdxYUpuTJRkjWOKLeZGDHGwXVvwaGUtqejqmHHzMweEFylKbiZxQetAYbHGxGcqpnFveUfuoGMPZrJzyZqgS");
    tests.put("awoSYSjrxQBuDjjIbnjyKPgQXqmiwYYjZGRfutcmYgAiEiuYaLdnAxhqhWmsqBxctQzUxzrvZWNwmJAQaIPLdSSVIrtGNShWUQkU", "awoSYSjrxQBuDjjIbnjyKPgQXqmiwYYjZGRfutcmYgAiEiuYaLdnAxhqhWmsqBxctQzUxzrvZWNwmJAQaIPLdSSVIrtGNShWUQkU");
    tests.put("VtmSwYEZCUIXanPGjpzzbrMbWBwWvnWNzycPzMypRZsAaBkKanyUYraWWlslWcMvTsrHLhsiWmnVEXMeWYkklcNGLOmHFPoNyEqw", "VtmSwYEZCUIXanPGjpzzbrMbWBwWvnWNzycPzMypRZsAaBkKanyUYraWWlslWcMvTsrHLhsiWmnVEXMeWYkklcNGLOmHFPoNyEqw");
    tests.put("ERXjDEXiyECJyOGTCNNWETizGhZHPsGqilYahRlpojCWTyPgFUCYnVzwykHUEfGWGbqIFYlIqFcIeLiLWoopXZNBaxzfNvXbAWmZ", "ERXjDEXiyECJyOGTCNNWETizGhZHPsGqilYahRlpojCWTyPgFUCYnVzwykHUEfGWGbqIFYlIqFcIeLiLWoopXZNBaxzfNvXbAWmZ");
    tests.put("wmGoOfHPQHneEzitVnpgmllijaUoxYvdrUzFCMwMpBhuXWxSgylsVzUDuRcPCbYoPiKXGWDEXvbceAyGkAgjgjjBUoGKRWAwPRBk", "wmGoOfHPQHneEzitVnpgmllijaUoxYvdrUzFCMwMpBhuXWxSgylsVzUDuRcPCbYoPiKXGWDEXvbceAyGkAgjgjjBUoGKRWAwPRBk");
    tests.put("yOKETUpXrbefAFsYZVrawAfZeegQsdjKHItgYZkkHAzCuhTFIcwrYPGXbbGZwkDtfgfkCEKIisoOyrPcnyPCukfTfkBKNQbvDQbr", "yOKETUpXrbefAFsYZVrawAfZeegQsdjKHItgYZkkHAzCuhTFIcwrYPGXbbGZwkDtfgfkCEKIisoOyrPcnyPCukfTfkBKNQbvDQbr");
    tests.put("sMnobKFxbZQTQFOnOIwlXFKHMQTiipgLBiYhArYpfzxZjZiSNAUbUCFUHCoInxWuFnwmXsRHaEobMHMQWODppsGyePGsPaYSlFXF", "sMnobKFxbZQTQFOnOIwlXFKHMQTiipgLBiYhArYpfzxZjZiSNAUbUCFUHCoInxWuFnwmXsRHaEobMHMQWODppsGyePGsPaYSlFXF");

    String got;
    for(Map.Entry<String, String> par : tests.entrySet()) {
      got = CapsLockOn.solucao(par.getKey());
      if(!par.getValue().equals(got)) {
        System.out.printf("Testado  '%s'\nEsperado '%s'\nRecebido '%s'\n%s\n", par.getKey(), par.getValue(), got, "_".repeat(15));
      }
      Assertions.assertEquals(par.getValue(), got);
    }
  }
}
