public class BMExercio03 {
    
    public static void main(String[] args) throws Exception {
        double item1 = 2.95;
        double item2 = 3.50; //A

        System.out.println("O item 1 custa " + item1);
        System.out.println("O item 2 custa " + item2); // B

        double ValorTotal = item1 + item2;
        System.out.println("O total dos itens eh " + ValorTotal); //C

        final double taxa = 8.25 /100; //D
        
        double taxaCalculada = taxa * ValorTotal; 
        System.out.println("A taxa calculada eh " + taxaCalculada);

        double novoCusto = (item1 + taxaCalculada) + (item2 + taxaCalculada); //E
        System.out.println("O novo custo eh " + novoCusto);

    

        boolean muitoCaro = (novoCusto >10); //F

        System.out.println(""+muitoCaro);   
    }

}
