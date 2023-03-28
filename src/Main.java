public class Main {

    public static void main(String[] args) {

        int score = 100;

        int add = 1200;

        int bonus = 0;

        if (add >= 1000) {
            bonus = add / 100;
        }
        int end = score + add + bonus;

        System.out.println("Итоговый счет: " + end);
        System.out.println("Бонус: " + bonus);

    }
}


