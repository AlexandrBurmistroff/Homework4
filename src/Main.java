public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
        public static void task1 () {
            System.out.println("Задача 1");

            int age = 12;
            System.out.println("Если возраст человека равен " + age + " лет, то ");
            if (age < 18) {
                System.out.println("он не достиг совершеннолетия, нужно немного подождать.");
            } else {
                System.out.println("он совершеннолетний.");
            }
        }

    public static void task2 () {
                System.out.println("Задача 2");

                int temperature = 4;
        System.out.println("Если на улице " + temperature + " градусов, то");
                if (temperature <5) {
                    System.out.println("нужно надеть шапку.");
                }
                else {
                    System.out.println("можно идти без шапки.");
                }

            }
    public static void task3 () {
        System.out.println("Задача 3");

        int speed = 6;
        System.out.println("Если скорость " + speed + " км/ч, то");
        if (speed <=60) {
            System.out.println("можно ездить спокойно.");
        }
        else {
            System.out.println("придется заплатить штраф.");
        }

    }

    public static void task4 () {
        System.out.println("Задача 4");

        int age = 70;
        System.out.println("Если возраст человека равен " + age + " , то");
        boolean babySleep = (age < 2);
        boolean child = (age >= 2) && (age <= 6);
        boolean childSchool = (age > 6) && (age <= 18);
        boolean university = (age > 18) && (age <= 24);
        boolean job = (age > 24) && (age <= 60);
        if (babySleep) {
            System.out.println("ему пора спать.");
        }
        else if (child) {
            System.out.println("ему нужно ходить в детский сад.");
        }
        else if (childSchool) {
            System.out.println("ему нужно ходить в школу.");
        }
        else if (university) {
            System.out.println("его место в университете.");
        }
        else if (job) {
            System.out.println("ему пора ходить на работу.");
        }
        else {
            System.out.println("он может отдохнуть.");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");

        int age = 15;
        System.out.println("Если возраст человека равен " + age + " , то ему");
        boolean baby = (age < 5);
        boolean child = ((age >=5) && (age < 14));
        if (baby) {
            System.out.println("нельзя кататься на аттракционе.");
        }
        else if (child) {
            System.out.println("можно кататься на аттракционе в сопровождении взрослого");
        }
        else  {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");

        int allPerson = 102;                       // всего людей   (не меняющаяся переменная)
        int seatBillet = 60;                       // сидячий билет (не меняющаяся переменная)
        int standBillet = allPerson - seatBillet;  // стоячий билет (не меняющаяся переменная)

        int sitPerson = 50;   // сидячих людей
        int standPerson = 32; // стоячих людей

        if (sitPerson < seatBillet) {
            System.out.println("осталось сидячих мест " + (seatBillet - sitPerson));
        } else {
            System.out.println("сидячих мест нет!");
        }
        if (standPerson < standBillet) {
            System.out.println("осталось стоячих мест " + (standBillet - standPerson));
        }
        else {
            System.out.println("Стоячих мест нет!");
        }

    }

    public static void task7 () {
        System.out.println("Задача 7");

        int one = 15;
        int two = 15;
        int three = 55;

        if ((one >= two) && (one >= three)) {
            System.out.println("Самое большое число = " + one);
            }
            else if ((two >= one) && (two >= three)) {
            System.out.println("Самое большое число = " + two);
            }
        else
        {
            System.out.println("Самое большое число = " + three);
        }
    }
}
