import java.util.Scanner;

class DepositCalculator {

    public static void main(String[] args) {
        new DepositCalculator().contributionResult();
    }

    double calculateComplexPercent(double amount, double yearRate, int depositPeriod) {
        double pay = amount * Math.pow((1 + yearRate / 12), 12 * depositPeriod);
        return getSum(pay, 2);
    }

    double calculateSimplePercent(double amount, double yearRate, int depositPeriod) {
        return getSum(amount + amount * yearRate * depositPeriod, 2);
    }

    double getSum(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    void contributionResult() {
        int period;
        int action;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();

        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double depositType = 0;

        if (action == 1) {
            depositType = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            depositType = calculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + depositType);
    }
}

// Каждая переменная объявлена на отдельной строке.
// Каждая инструкция выполняется на отдельной строке.
//Длина строки в коде должна быть не более 120 символов.
//Если выражение не умещается на одной строке, его можно перенести на следующую. Правила переноса:
//1.Перенос строки должен выполняться после запятой.
    /*
      2.Если строка прерывается оператором, например, арифметическим (+, -, /, *),
    логическим (&&, ||, !), сравнения (==, !=, >, <, >=, <=) и так далее,
    то перенос выполняется перед ним. Это же правило относится и к символам ., ::, &, |.
    */
//3.При переносе строки метод или имя конструктора должны оставаться на одной линии с открывающей скобкой (.
//4.Если выражение умещается в лимит — его переносить не надо.

//Фигурные скобки:
//1.Перенос строки выполняется после открывающей фигурной скобки, а не перед ней.
//2.Перенос строки выполняется перед закрывающей фигурной скобкой.
    /*
    3.Перенос строки выполняется после закрывающей фигурной скобки,
    если эта фигурная скобка завершает оператор, тело метода, конструктора или именованного класса.
     */

//Пробелы:
//1.Любые зарезервированные слова (catch, if, for и другие) отделяются от открывающей круглой скобки пробелом.
//2.Любые зарезервированные слова (else, catch и другие) отделяются от предшествующей им закрывающей фигурной скобки пробелом.
//3.Пробел ставится перед открывающей фигурной скобкой.
//4.В бинарных (+, -, *, / и так далее) и тернарном ( ? : ) операторах пробелы ставятся с двух сторон.
//Исключения: до и после унарных операторов (++, --, ! и так далее) и символов (., ::) пробелы не ставятся.
//5.Пробел ставится после следующих символов-разделителей: ,, :, ;.
//6.Пробел ставится между типом и объявлением переменной.