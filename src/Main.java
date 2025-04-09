public class Main {
    public static void main(String[] args) {
       // Задача № 1
        System.out.println("Задача № 1");
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9_223_372_036_854_775_807L;
        float e = 1.1234567f;
        double f = 1.1234567890123456;
        char g = 'g';
        boolean h = true;
        System.out.println("Значение переменной 'a' с типом byte равно " + a);
        System.out.println("Значение переменной 'b' с типом short равно " + b);
        System.out.println("Значение переменной 'c' с типом int равно " + c);
        System.out.println("Значение переменной 'd' с типом long равно " + d);
        System.out.println("Значение переменной 'e' с типом float равно " + e);
        System.out.println("Значение переменной 'f' с типом double равно " + f);
        System.out.println("Значение переменной 'g' с типом char равно " + g);
        System.out.println("Значение переменной 'h' с типом boolean равно " + h);
        // Задача № 2
        System.out.println("\nЗадача № 2");

        float i = 27.12F;
        long j = 987_678_965_549L;
        float k = 2.786f;
        short l = 569;
        short m = -159;
        short n = 27897;
        byte o = 67;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        // Задача № 3
        System.out.println("\nЗадача № 3");
        short studentsLP = 23;
        short studentsAS = 27;
        short studentsEA = 30;
        short paper = 480;
        short totalStudents = (short) (studentsAS + studentsEA + studentsLP);
        float paperPerStudent = (float) (paper / totalStudents);
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
        // Задача № 4
        System.out.println("\nЗадача № 4");
        int productivityPer2Min = 16;
        int productivityPerMin = productivityPer2Min / 2;
        int productivityPer20Min = productivityPerMin * 20;
        int productivityPerDay = productivityPerMin * 60 * 24;
        int productivityPer3Days = productivityPerDay * 3;
        int productivityPerMonth = productivityPerDay * 30 * 3;
        System.out.println("За 20 минут машина произвела " + productivityPer20Min + " штук бутылок");
        System.out.println("За день машина произвела " + productivityPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivityPer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + productivityPerMonth + " штук бутылок");
        // Задача № 5
        System.out.println("\nЗадача № 5");
        short totalPaint = 120;
        short whitePaintPerClass = 2;
        short brownPaintPerClass = 4;
        short paintPerClass = (short) (whitePaintPerClass + brownPaintPerClass);
        short totalClass = (short) (totalPaint / paintPerClass);
        short totalWhitePaint = (short) (totalClass * whitePaintPerClass);
        short totalBrownPaint = (short) (totalClass * brownPaintPerClass);
        System.out.println("В школе, где "+ totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски" );
        // Задача № 6
        System.out.println("\nЗадача № 6");
        int bananasWeight = 5 * 80;
        int milkWeight = 2 * 105;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        int totalWeightInGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float totalWeightInKilograms = (float) totalWeightInGrams / 1000;
        System.out.println("Вес завтрака в граммах составляет " + totalWeightInGrams + " грамм");
        System.out.println("Вес завтрака в килограммах составляет " + totalWeightInKilograms + " килограмм");
        // Задача № 7
        System.out.println("\nЗадача № 7");
        int needToLoseKilo = 7;
        float losePerDay250 = (float) 250 / 1000;
        float losePerDay500 = (float) 500 / 1000;
        int daysPer250 = (int) (needToLoseKilo / losePerDay250);
        int daysPer500 = (int) (needToLoseKilo / losePerDay500);
        int averageDays = (int)((daysPer250 + daysPer500) / 2);
        System.out.println("Если спортсмен будеть терять 250 грамм в день, то ему понадобится " + daysPer250 + " дней");
        System.out.println("Если спортсмен будеть терять 500 грамм в день, то ему понадобится " + daysPer500 + " дней");
        System.out.println("В среднем спотсмену понадобится " + averageDays + " дней на похудение");
        // Задача № 8
        System.out.println("\nЗадача № 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        float salaryIncrease = 1.1f;
        int increasedSalaryMasha = (int) (salaryMasha * salaryIncrease);
        int increasedSalaryDenis = (int) (salaryDenis * salaryIncrease);
        int increasedSalaryChristina = (int) (salaryChristina * salaryIncrease);
        int diffSalaryMasha = (increasedSalaryMasha - salaryMasha) * 12 ;
        int diffSalaryDenis = (increasedSalaryDenis - salaryDenis) * 12 ;
        int diffSalaryChristina = (increasedSalaryChristina - salaryChristina) * 12 ;
        System.out.println("Маша теперь получает " + increasedSalaryMasha + " рублей в месяц. Годовой доход вырос на " + diffSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + increasedSalaryDenis+ " рублей в месяц. Годовой доход вырос на " + diffSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + increasedSalaryChristina + " рублей в месяц. Годовой доход вырос на " + diffSalaryChristina + " рублей");


    }
}