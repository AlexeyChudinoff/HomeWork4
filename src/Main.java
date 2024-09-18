public class Main {

  public static void main(String[] args) {

    byte ageMan = 17;
    if (ageMan >= 18) {
      System.out.println("возраст человека равен : " + ageMan + " лет, он совершеннолетний ");
    } else {
      System.out.println(
          "возраст человека " + ageMan + " лет, он не достиг совершеннолетия, нужно подождать");
    }

    byte outdorTemperature = 4; //ситуация когда ровно 5 градусов в звдании не указана
    if (outdorTemperature < 5) {
      System.out.println(
          "На улице температура :" + outdorTemperature + " холодно, нужно надеть шапку");
    }
    if (outdorTemperature > 5) {
      System.out.println(
          "Сегодня тепло, температура :" + outdorTemperature + " можно идти без шапки");
    }

    int speed = 70;
    if (speed <= 60) {
      System.out.println("скорость : " + speed + " - превышения нет, можно ехать спокойно");
    }
    if (speed > 60) {
      System.out.println(
          "скорость : " + speed + " - это превышение скорости, придется заплатить штраф");
    }

    int ageBoyn = 50;
    if (ageBoyn >= 2 && ageBoyn <= 6) {
      System.out.println(
          "если возраст человека равен : " + ageBoyn + " лет, то ему нужно ходить в сад");
    }
    if (ageBoyn >= 7 && ageBoyn <= 17) {
      System.out.println(
          "если возраст человека : " + ageBoyn + " лет, то ему нужно ходить в школу");
    }
    if (ageBoyn >= 18 && ageBoyn <= 24) {
      System.out.println(
          "если возраст человека : " + ageBoyn + " лет, то ему нужно ходить в институт");
    }
    if (ageBoyn > 24) {
      System.out.println(
          "если возраст человека : " + ageBoyn + " лет, то ему ходить на работу");
    }

    int ageChild = 10;
    if (ageChild < 5) {
      System.out.println(
          "если возраст ребенка: " + ageChild + " то ему нельзя кататься на аттракционе");
    }
    if (ageChild >= 5 && ageChild <= 14) {
      System.out.println("если возраст ребенка: " + ageChild
          + " то ему можно кататься на аттракционе в сопровождении взрослого");
    }
    if (ageChild > 14) {
      System.out.println("если возраст ребенка: " + ageChild
          + " то ему можно кататься на аттракционе без сопровождения взрослого");
    }

    int vsegoMest = 102;
    int sidychihMest = 60;
    int stoychihMest = vsegoMest - sidychihMest;
    int tiketsSold = 80; // без этой переменной нет логики в задаче
    if (tiketsSold <= sidychihMest) {
      System.out.println(
          "в вагоне свободно: " + (sidychihMest - tiketsSold) + "сидячих мест и : " + stoychihMest
              + "стоячих мест");
    }
    if (tiketsSold > sidychihMest && tiketsSold <= vsegoMest) {
      System.out.println(
          "в вагоне нет свободных сидячих мест, осталось только: " + (vsegoMest - tiketsSold)
              + " стоячих места");
    }

    int one = 18;
    int two = 19;
    int three = 16;
    if (one > two && one > three) {
      System.out.println("самое большое число " + one);
    } else {
      if (two > one && two > three) {
        System.out.println("самое большое число " + two);
      } else {
        System.out.println("самое большое число " + three);
      }
    }


  }
}
