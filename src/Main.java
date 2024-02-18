public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        byte cat = 5;
        System.out.println(cat);
        short dog = 300;
        System.out.println(dog);
        int pig = 60000;
        System.out.println(pig);
        long starFish = - 1234567891;
        System.out.println(starFish);
        float squid = 5.3f;
        System.out.println(squid);
        double friedFish = 1.8f;
        System.out.println(friedFish);

        System.out.println("Задание 2");
        double a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = - 159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);

        System.out.println("Задание 3");
        byte LyudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        int sheets = 480;
        int students = LyudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna;
        int sheetsPerStudent = sheets / students;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        System.out.println("Задание 4");
        byte bottlesPer2Minutes = 16;
        byte minutesInHour = 60;
        byte hoursInDay = 24;
        byte daysInMonth = 30;
        int bottlesPer20Minutes = (bottlesPer2Minutes / 2) * 20;
        int bottlesPerDay = (bottlesPer2Minutes / 2) * minutesInHour * hoursInDay;
        int bottlesPer3Days = (bottlesPer2Minutes / 2) * minutesInHour * hoursInDay * 3;
        int bottlesPerMonth = (bottlesPer2Minutes / 2) * minutesInHour * hoursInDay * daysInMonth;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("В сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        System.out.println("Задание 5");
        byte cansOfTwoColors = 120;
        byte cansOfWhitePaint = 2;
        byte brownWhitePaint = 4;
        int forOneClass =cansOfWhitePaint + brownWhitePaint;
        int totalClassesOnTheSchool = cansOfTwoColors / forOneClass;
        int totalOfWhiteCansOfPaint = totalClassesOnTheSchool * cansOfWhitePaint;
        int TotaOfBrownCansOfPaint = totalClassesOnTheSchool * brownWhitePaint;
        System.out.println("В школе, где " + totalClassesOnTheSchool + " классов, нужно " + totalOfWhiteCansOfPaint +
                " банок белой краски и " + TotaOfBrownCansOfPaint + " банок коричневой краски");

        System.out.println("Задание 6");
        byte oneBanana = 80;
        int bananas = oneBanana * 5;
        byte hundredMillilitersOfMilk = 105;
        int milk = hundredMillilitersOfMilk * 2;
        byte oneBriquette = 100;
        int iceCreamSundae = oneBriquette * 2;
        byte oneEgg = 70;
        int eggs = oneEgg * 4;
        int totalWeight = bananas + milk + iceCreamSundae + eggs;
        float sportsBreakfastInKilograms = totalWeight / 1000f;
        System.out.println("вес в граммах " + totalWeight + " , вес в кг " + sportsBreakfastInKilograms);

        System.out.println("Задание 7");
        byte kilogram = 7;
        int gram = kilogram * 1000;
        int day1 = gram / 250;
        System.out.println(day1 + " , если будет терять 250 грамм");
        int day2 = gram / 500;
        System.out.println(day2 + " , если будет терять 500 грамм");
        long daysOnAverage = (day1 + day2) / 2;
        System.out.println(daysOnAverage + " день может потребоваться в среднем");

        System.out.println("Задание 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        double mashaNewSalary = mashaSalary * 1.1f;
        double denisNewSalary = denisSalary * 1.1f;
        double kristinaNewSalary = kristinaSalary * 1.1f;

        double mashaYearlyIncomeAfter = mashaNewSalary * 12f;
        double denisYearlyIncomeAfter = denisNewSalary * 12f;
        double kristinaYearlyIncomeAfter = kristinaNewSalary * 12f;
        System.out.printf("Маша теперь получает " + mashaNewSalary + " рублей. " +
                "Годовой доход вырос на " + mashaYearlyIncomeAfter + " рублей. ");
        System.out.printf("Денис теперь получает " + denisNewSalary + " рублей. " +
                "Годовой доход вырос на " + denisYearlyIncomeAfter + " рублей. ");
        System.out.printf("Кристина теперь получает " + kristinaNewSalary + " рублей. " +
                "Годовой доход вырос на " + kristinaYearlyIncomeAfter + " рублей. ");
    }
}