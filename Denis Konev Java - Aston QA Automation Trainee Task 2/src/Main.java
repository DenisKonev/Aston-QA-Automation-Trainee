import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //здесь можно было обернуть в try-catch блок метод readLine(), который потенциально может выбросить IOException,
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString =  bufferedReader.readLine();
        bufferedReader.close();

        System.out.println(inputString.equals("Вячеслав") ? "Привет, Вячеслав" : "Нет такого имени");
    }
}