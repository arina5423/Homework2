//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // задача 2
        System.out.println(dog+4);
        System.out.println(cat+5);
        System.out.println(paper+4);
        // задача 3
        System.out.println(dog+4-3.5);
        System.out.println(cat+5-1.6);
        System.out.println(paper+4-7639);
        // задача 4
        var friend = 19;
        System.out.println(friend);
        System.out.println(friend+2);
        System.out.println((friend+2)/7);
        // задача 5
        var frog =3.5;
        System.out.println(frog);
        System.out.println(frog*10);
        System.out.println(frog*10/3.5);
        System.out.println(frog*10/3.5+4);
        // задача 6
        var boxer1 = 78.2;
        var boxer2 =  82.7;
        System.out.println(boxer1+boxer2+ " кг");
        System.out.println(boxer2-boxer1 + " кг");
        // задача 7

        System.out.println(boxer2%boxer1);
        // задача 8
        var hours = 640;
        System.out.println("Всего работников в компании — "+hours/8+" человек");
        var people = hours/8 + 94;
        System.out.println("Если в компании работает "+people + " человек, то всего " + people*8 + " часов работы может быть поделено между сотрудниками");


    }
}