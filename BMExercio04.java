public class BMExercio04 {
    
    public static void main(String[] args) throws Exception {

        long long1 = 100;

        int int1 = 200;

        int int2 = int1 + ((int)long1); // nao é possivel converter o long para o inteiro porque o int tem 32bit e o long tem 64bit.
    
        System.out.println("" + int2);
        }
}
