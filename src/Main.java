public class Main {
    public static void main(String[] args) {
        //задача 1
        int i = 1;
        byte b = 2;
        short s = 3;
        long l = 4;
        float f = 0.1f;
        double d = 2.2;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        //задача 2
        byte byte2 = 67;
        short short2 = -159;
        int int2 = 27897;
        long long2 = 987678965549L;
        float float2 = 27.12f;
        double double2 = 2.786;
        char char2 = 569;
        boolean boolean2 = false;

        //задача 3
        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int totalPaper = 480;
        int paperEach = (totalPaper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna));
        System.out.println("На каждого ученика рассчитано " + paperEach + " листов бумаги");

        //задача 4
        int min2 = 16;
        int min20 = min2 * 10;
        int h24 = min20 * 3 * 24;
        int days3 = h24 * 3;
        int mounth = h24 * 30;
        System.out.println("За 20 минут машина произвела бутылок - " + min20 + " штук ");
        System.out.println("За сутки машина произвела бутылок - " + h24 + " штук ");
        System.out.println("За 3 дня машина произвела бутылок - " + days3 + " штук ");
        System.out.println("За месяц машина произвела бутылок - " + mounth + " штук ");

        //задача 5
        int white = 2;
        int brown = 4;
        int total = 120;
        int totalClasses = total / (white + brown);
        int totalWhite = white * totalClasses;
        int totalBrown = brown * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        //задача 6
        int banana = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int gWeight = banana + milk + iceCream + eggs;
        double kgWeight = gWeight / 1000.0;
        System.out.println("Вес такого спорт-завтрака в кг - " + kgWeight);

        //задача 7
        int targetKg = 7;
        int minGrammPerDay = 250;
        int maxGrammPerDay = 500;
        int targetGramm = targetKg * 1000;
        int ifMin = targetGramm / minGrammPerDay;
        int ifMax = targetGramm / maxGrammPerDay;
        int daysAverage = (ifMin + ifMax) / 2;
        System.out.println("если спортсмен будет терять каждый день по 250 грамм - " + ifMin);
        System.out.println("если спортсмен будет терять каждый день по 500 грамм - " + ifMax);
        System.out.println("если в среднем - " + daysAverage);

        //задача 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaUp = masha / 100 * 10;
        int denisUp = denis / 100 * 10;
        int kristinaUp = kristina / 100 * 10;
        int mashaNew = masha + mashaUp;
        int denisNew = denis + denisUp;
        int kristinaNew = kristina + kristinaUp;
        int mashaYearUp = mashaUp * 12;
        int denisYearUp = denisUp * 12;
        int kristinaYearUp = kristinaUp * 12;
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaYearUp + " рублей");
        System.out.println("Маша теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisYearUp + " рублей");
        System.out.println("Маша теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + kristinaYearUp + " рублей");
    }
}