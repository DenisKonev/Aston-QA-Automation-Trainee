import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //здесь мы можем словить исключение если будут введены данные, которые на парсятся в int
        //по-хорошему нужно обернуть это в try-catch блок и выдавать сообщение о правильном формате ввода
        //по скольку про это нет ни слова в ТЗ то я делаю вывод, что так и задумывалось, хотя в проде, конечно, лучше так не делать
        //так же тут используется бесконечный цикл, что тоже не всегда хорошо, но поскольку в ТЗ нет ничего про конечность числового массива, то я допустил что он может быть и бесконечным
        while (true) {
            int input = scanner.nextInt();
            if (input % 3 == 0)
                System.out.println(input);
        }
    }
}