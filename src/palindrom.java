import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindrom {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите слово из 5 (пяти) букв:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();



        if (word.length() != 5){
            System.out.println("ОШИБКА: Вы ввели слово которое содержит менее или более 5 символов.");
        }else {
            char a1 = word.charAt(0);
            char a2 = word.charAt(1);
            char a4 = word.charAt(3);
            char a5 = word.charAt(4);

            if ((a1 != a5) || (a2 != a4)){
                System.out.println("Введенное слово не является палиндромом.");
            }else{
                System.out.println("Поздравляю! Вы ввели слово которое является палиндромом.");
            }
        }
    }
}
