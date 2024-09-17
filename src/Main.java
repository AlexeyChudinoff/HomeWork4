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
      System.out.println("скорость : " + speed + " превышения нет, можно ехать спокойно");
    }
    if (speed > 60) {
      System.out.println("скорость : " + speed + " превышение скорости, придется заплатить штраф");
    }


  }
}