public class Main {
    public static void main(String[] args) {
        int check = 200;
        int replenishment1 = 200;
        int replenishment2 = 1400;
        int bonus1 = 1;
        int bonus0 = 0;
        boolean more1000 = true;

        if (more1000) {
            bonus1 = 1;
        } else {
            bonus1 = 0;
        }
        int bonus3 = replenishment1;

        if (replenishment1 < 1000) {
            bonus3 = 0;
        }
        System.out.println("Итоговые бонусные мили: " + bonus3 );

        if (more1000) {
            bonus1 = 1;
        } else {
            bonus1 = 0;
        }
        int bonus4 = replenishment2 / 100;

        if(replenishment2 < 1000) {
            bonus4 = 0;



        }

        System.out.println("Итоговые бонусные мили: " + bonus4 );










    }
}

