import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        // Obter informações do ambiente gráfico
        GraphicsEnvironment ambiente = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // Obter dados do monitor principal. Dados gráficos de resolução
        GraphicsDevice monitor = ambiente.getDefaultScreenDevice();

        // Obter modo de exibição atual. Altura, Largura, Bits/Pixel, Frequência
        DisplayMode resolucao = monitor.getDisplayMode();
        // System.out.println(resolucao);

        // Dados específicos
        int largura = resolucao.getWidth();
        int altura = resolucao.getHeight();
        int bpp = resolucao.getBitDepth();
        int frequencia = resolucao.getRefreshRate();

        System.out.println("A sua tela esta em resolucao " + largura + "x" + altura);
        System.out.println(bpp + " Bits Por Pixel e " + frequencia + "Hz de frequencia");
    }    
}