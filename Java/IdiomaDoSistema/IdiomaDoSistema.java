import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {
        //Pegar dados do sistema operacional
        Locale informacaoSistema = Locale.getDefault();

        // Pegar dados do idioma
        String idiomaSigla = informacaoSistema.getLanguage();
        String idioma = informacaoSistema.getDisplayLanguage();

        // pegar informações do país
        String paisSigla = informacaoSistema.getCountry();
        String pais = informacaoSistema.getDisplayCountry();

        System.out.println("Seu sistema está em " + idioma + "(" + idiomaSigla + ")" +" do país " + pais + "(" + paisSigla + ")");
    }
}