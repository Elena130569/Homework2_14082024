public class Main {
    public static void main(String[] args) {
    var dog = 8.0;
    System.out.println(dog);
    var cat = 3.6;
    System.out.println(cat);
    var paper = 763789;
    System.out.println(paper);

    var result1 = dog + 4;
    System.out.println("dog + 4 = " + result1);
    var result2 = cat + 4;
    System.out.println("cat + 4 = " + result2);
    var result3 = paper + 4;
    System.out.println("paper + 4 = " + result3);

    var result4 = dog - 3.5;
    System.out.println("dog - 3.5 = " + result4);
    var result5 = cat - 1.6;
    System.out.println("cat - 1.6 = " + result5);
    var result6 = paper - 7639;
    System.out.println("paper - 7639 = " + result6);

    var friend = 19;
    System.out.println(friend);
    var result7 = friend + 2;
    System.out.println("friend + 2 = " + result7);
    var result8 = (friend + 2) / 7;
    System.out.println("(friend + 2) / 7 = " + result8);

    var frog = 3.5;
    System.out.println(frog);
    var result9 = frog * 10;
    System.out.println("frog * 10 = " + result9);
    var result10 = (frog * 10) / 3.5;
    System.out.println("(frog * 10) / 3.5 = " + result10);
    var result11 = ((frog * 10) / 3.5) + 4;
    System.out.println("((frog * 10) / 3.5) + 4 = " + result11);

    var boxerWeight1 = 78.2;
    var boxerWeight2 = 82.7;
    var result12 = boxerWeight1 + boxerWeight2;
    System.out.println("Общая масса двух боксеров " + result12);
    var result13 = boxerWeight2 - boxerWeight1;
    System.out.println("Разница между массами двух боксеров " + result13);

    var weight1 = 40;
    var weight2 = 12;
    var result14 = weight1 % weight2;
    System.out.println("Остаток от деления равен " + result14);

    var totalNumberHour = 640;
    var numberHour = 8;
    var numberEmployees = totalNumberHour / numberHour;
    System.out.println("Всего работников в компании - " + numberEmployees + " человек");

    var startNumberEmployees = 80;
    var finishNumberEmployees = startNumberEmployees + 94;
    var numberHours = finishNumberEmployees * 8;
    System.out.println("Если в компании работат " + finishNumberEmployees + " человек, то всего " +  numberHours + " часов работы может быть поделено между сотрудниками ");}
}