import java.util.Scanner;
public class App {

    static int f(int n){

       if(n == 1 || n== 2 ){
            return 1;
        }
        return f(n-1) + f(n-2);
    }

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int n = inp.nextInt(); 
        System.out.print(f(n));
    }
}