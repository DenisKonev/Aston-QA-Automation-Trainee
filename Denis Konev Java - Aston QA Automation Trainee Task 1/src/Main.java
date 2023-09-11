import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //здесь мы можем словить исключение если будут введены данные, которые на парсятся в int
        //по-хорошему нужно обернуть это в try-catch блок и выдавать сообщение о правильном формате ввода
        //по скольку про это нет ни слова в ТЗ то я делаю вывод, что так и задумывалось, хотя в проде, конечно, лучше так не делать
        int inputNumber = scanner.nextInt();
        scanner.close();

        if (inputNumber > 7 )
            System.out.println("Привет");
    }
}