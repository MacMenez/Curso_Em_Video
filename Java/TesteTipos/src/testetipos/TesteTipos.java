package testetipos;

public class TesteTipos {
    public static void main(String[] args) {
        
        int valorA = 30;
        String valorB = Integer.toString(valorA);
        System.out.println(valorB);

        String valorC = "30";
        int valorD = Integer.parseInt(valorC);
        System.out.println(valorD);

        String valorE = "30.5";
        float valorF = Float.parseFloat(valorE);
        System.out.printf("%.3f", valorF);
    }
}
