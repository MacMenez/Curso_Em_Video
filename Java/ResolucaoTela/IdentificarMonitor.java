import java.awt.*;

public class IdentificarMonitor {
    public static void main(String[] args) {
        // Obter informações do ambiente gráfico
        GraphicsEnvironment ambiente = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // Obter todas as telas disponíveis
        GraphicsDevice[] monitores = ambiente.getScreenDevices();

        for (int i = 0; i < monitores.length; i++) {
            // Obter o modo de exibição atual para cada dispositivo gráfico
            DisplayMode resolucao = monitores[i].getDisplayMode();

            // Dados específicos
            int largura = resolucao.getWidth();
            int altura = resolucao.getHeight();
            int bpp = resolucao.getBitDepth();
            int frequencia = resolucao.getRefreshRate();

            // Exibir a resolução da tela
            if (i == 0) {
                System.out.println(
                    "Resolucao da tela principal:" + altura + "x" + largura + 
                    "\n" + bpp + " Bits Por Pixel \n" +
                    frequencia + "Hz"
                );
            } else {
                System.out.println(
                    "Resolucao da tela " + i + ":" + altura + "x" + largura + 
                    "\n" + bpp + " Bits Por Pixel \n" +
                    frequencia + "Hz"
                );
            }
        }
    }
}
