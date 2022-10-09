import java.io.Console;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Пожалуйста введите своё имя:");
        String name = in.nextLine ();
        String hello ="Приветствую вас";
        System.out.println(hello + " "+name);

        System.out.println("Hello world!");
        String myName = "Mike Parker";
        String word ="aplle";
        int num = -14;
        final int NUM = 0;
        System.out.println(myName +  " "+word + " "+ NUM);
        if(NUM < 0){
            System.out.println("It is cold outside!");
        }else  if (NUM > 0) {
            System.out.println("The weather is nice outside");
        }else{
            System.out.println("It`s cool outside");


        }
    }

}