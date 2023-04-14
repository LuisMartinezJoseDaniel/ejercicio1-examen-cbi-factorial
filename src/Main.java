public class Main {
    public static void main(String[] args) {
//        System.out.println(factorial(4L));
        reverseFactorial(24L);

    }

    public static Long factorial(Long numero){
        return numero == 1 ? 1 : numero * factorial(numero - 1);
    }

    public static void reverseFactorial(Long numero){
        Long factorial = 1L;//5
        Long contador = 1L;//1
        while (factorial < numero){
            factorial *= contador; // 5*2 =10
            contador++; // 2
        }
        if (factorial == numero){
            System.out.println( (contador - 1) + "!") ;
        }else{
            System.out.println("NINGUNO");
        }
    }
}