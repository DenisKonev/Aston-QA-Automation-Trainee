import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean intOnlyListFlag = false;
        String input = "";
        List<Integer> parsedInputList = new ArrayList<>();
        List<String> inputList = new ArrayList<>();

        /* Принимаем на вход от пользователя некоторые данные. Мы не знаем их тип заранее, но нас интересуют всего три варианта: 1) int 2) String 3) int последовательность
         * Для начала ссчитаем пользовательский ввод, затем попытаемся распарсить его в int последовательность, если это не получиться то код выбросит NumberFormatException
         * и тогда мы считаем что имеем дело с String (хотя там может быть все что угодно, кроме int).
         * Если наш код выполнится до конца без исключений тогда мы получим последовательность int в parsedInputList листе (она может состоять и из одного элемента, подробнее об этом ниже)
         * и переменная intOnlyListFlag покажет нам что парсинг прошел успешно
         */
        try {
            input = bufferedReader.readLine();
            inputList.addAll(Arrays.stream(input.replaceAll("\\s+$", "").split(" ")).toList());
            for (String arrayEntry : inputList)
                parsedInputList.add(Integer.parseInt(arrayEntry));
            intOnlyListFlag = true;
        }
        //По условиям задания не нужно проверять правильность ввода данных от пользователя и давать обратную связь в случае ошибки, но это является хорошей практикой
        catch (IOException e)
        {
            System.out.println("Введены некорректные данные");
        }
        //Это исключение говорит нам о том, что в листе ввода находятся данные, которые не могут быть конвертированы в int, в этом случае применяем алгоритм №2
        catch (NumberFormatException e) {
            secondAlgo(input);
        }
        bufferedReader.close();

        //intOnlyListFlag флаг указывает на то что входные данные это int последовательность
        //Мы проверяем если в листе находится всего один int, тогда выполняем алгоритм №1 если больше то алгоритм №3
        if (intOnlyListFlag)
            if (parsedInputList.size() == 1)
                firstAlgo(parsedInputList.get(0));
            else
                thirdAlgo(parsedInputList);
    }
    //Алгоритм №1: если введенное число больше 7, то вывести “Привет”
    private static void firstAlgo(Integer integer) {
        if (integer > 7)
            System.out.println("Привет");
    }
    //Алгоритм №2: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
    private static void secondAlgo(String input) {
        System.out.println(input.equals("Вячеслав") ? "Привет, " + input : "Нет такого имени");
    }
    //Алгоритм №3: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
    private static void thirdAlgo(List<Integer> parsedInputList) {
        for (Integer intEntry: parsedInputList)
            if (intEntry % 3 == 0)
                System.out.print(intEntry + " ");
    }
}