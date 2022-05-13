import java.util.Scanner;
public class CBBAtividadePratica4 {
    public static void main(String[] args) throws Exception {
        final double VALORMETROCUBICO = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a altura, comprimento e largura : ");
        
        double altura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double largura = sc.nextDouble();
     
        double metrocubico = altura*comprimento*largura;
        double orcamento = metrocubico*VALORMETROCUBICO;

        System.out.println("O orcamento eh de = " + orcamento + " R$");

    }
}
