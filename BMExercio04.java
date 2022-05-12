public class BMExercio04 {
    
    public static void main(String[] args) throws Exception {

        long long1 = 100;

        int int1 = 200;

        int int2 = int1 + ((int)long1); // nao é possivel converter o tipo long para o tipo inteiro porque o int tem 32bits e o long tem 64bits.
    
        System.out.println("" + int2);
        }
}
