package weekend7.mockexam.task1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Trojkat trojkat = new Trojkat();
        System.out.println(trojkat.getABok());
        System.out.println(trojkat.getBBok());
        System.out.println(trojkat.getCBok());

        double bokAWartoscInit = trojkat.getABok();
        double bokBWartoscInit = trojkat.getBBok();
        double bokCWartoscInit = trojkat.getCBok();
//        A(-1,0.3) B(-1, 2.3) C(3, 1.3)

        Punkt punkt1 = new Punkt();
        punkt1.x = -1;
        punkt1.y = 0.3;

        Punkt punkt2 = new Punkt();
        punkt2.x = -1;
        punkt2.y = 2.3;

        Punkt punkt3 = new Punkt();
        punkt3.x = 3;
        punkt3.y = 1.3;

        trojkat.setA(punkt1);
        trojkat.setB(punkt2);
        trojkat.setC(punkt3);

        System.out.println(trojkat.getABok());
        System.out.println(trojkat.getBBok());
        System.out.println(trojkat.getCBok());

        try (PrintWriter printWriter = new PrintWriter(new File("wyniki.txt"))) { //try - with - resources
            printWriter.println(bokAWartoscInit);
            printWriter.println(bokBWartoscInit);
            printWriter.println(bokCWartoscInit);
            printWriter.println(trojkat.getABok());
            printWriter.println(trojkat.getBBok());
            printWriter.println(trojkat.getCBok());
        } catch (IOException e) {
            e.printStackTrace();
        }


        Kolo kolo = new Kolo();
        Punkt sr = new Punkt();
        kolo.r = 1;
        kolo.Sr = sr;

        Trojkat trojkat1 = new Trojkat(0,0,1,1,-1,1);

        System.out.println(kolo.Sr.x);
        System.out.println(kolo.Sr.y);
        System.out.println(kolo.r);

        System.out.println(trojkat1.A.x);
        System.out.println(trojkat1.A.y);
        System.out.println(trojkat1.B.x);
        System.out.println(trojkat1.B.y);
        System.out.println(trojkat1.C.x);
        System.out.println(trojkat1.C.y);

        System.out.println(trojkat1.getABok());
        System.out.println(trojkat1.getBBok());
        System.out.println(trojkat1.getCBok());

        kolo.show();
        trojkat1.show();



    }

}
