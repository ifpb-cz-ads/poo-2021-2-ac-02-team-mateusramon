import java.util.Scanner;
public class BMExercio03 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double item1 = 2.95;
        double item2 = 3.50; //A

        System.out.println("O item 1 custa " + item1);
        System.out.println("O item 2 custa " + item2); // B

        double ValorTotal = item1 + item2;
        System.out.println("" + ValorTotal); //C

        final double taxa = 8.25 /100; //D
        
        double taxaCalculada = ValorTotal + (taxa * ValorTotal); 
        System.out.println("" + taxaCalculada);

        double novoCusto = (item1 + taxaCalculada) + (item2 + taxaCalculada); //E
        System.out.println("" + novoCusto);

        System.out.println("\n o novo total é "+novoCusto); //f

         boolean muitoCaro = (novoCusto >10);

         System.out.println(""+muitoCaro);

       
        
    }

}