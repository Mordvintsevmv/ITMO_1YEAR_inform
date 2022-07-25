public class FourthClass{
    public static void main(String[] args){
        int p = 0;
        for (int i = 0; i < 30; i++){
            if (i % 2 == 0){
                double d = (double)i / 4;
                System.out.print(d + "; ");
            }
        }
        System.out.println();
        int year = 2018;
        switch(year) {
            case 2016:
                System.out.println("Вы на третьем курсе!");
                break;
            case 2017:
                System.out.println("Вы на втором курсе");
                break;
            case 2018:
                System.out.println("Вы первокурсник!");
                break;
        }

        System.out.println();

        // Самостоятельная работа
        // 11
        System.out.println("f() = x1*x2+(¬x3)");
        System.out.println("x1" + "\tx2" + "\tx3" + "\tf()");
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int xb3 = 0;
        int f = 0;

        // for
        for (int i = 0; i < 8; i++){
            if (x3 == 0) {xb3 = 1;}
            else {xb3 = 0;}
            if ((x1 * x2 + xb3) > 0){f = 1;}
            else {f = 0;}
            System.out.println(x1 + "\t"+ x2 + "\t" + x3 + "\t" + f);
            if (x3 == 1){
                x3 = 0;
                if (x2 == 1){
                    x2 = 0;
                    x1 = 1;
                }
                else {
                    x2 = 1;
                }
            }
            else {
                x3 = 1;
            }
        }
        System.out.println();

        // while
        x1 = 0;
        x2 = 0;
        x3 = 0;
        xb3 = 0;
        f = 0;
        System.out.println("x1" + "\tx2" + "\tx3" + "\tf()");
        int i = 0;
        while (i < 8){

            if (x3 == 0) {xb3 = 1;}
            else {xb3 = 0;}
            if ((x1 * x2 + xb3) > 0){f = 1;}
            else {f = 0;}
            System.out.println(x1 + "\t"+ x2 + "\t" + x3 + "\t" + f);
            if (x3 == 1){
                x3 = 0;
                if (x2 == 1){
                    x2 = 0;
                    x1 = 1;
                }
                else {
                    x2 = 1;
                }
            }
            else {
                x3 = 1;
            }
            i++;
        }
        System.out.println();

        // do..while
        x1 = 0;
        x2 = 0;
        x3 = 0;
        xb3 = 0;
        f = 0;
        System.out.println("x1" + "\tx2" + "\tx3" + "\tf()");
        i = 0;
        do{
            if (x3 == 0) {xb3 = 1;}
            else {xb3 = 0;}
            if ((x1 * x2 + xb3) > 0){f = 1;}
            else {f = 0;}
            System.out.println(x1 + "\t"+ x2 + "\t" + x3 + "\t" + f);
            if (x3 == 1){
                x3 = 0;
                if (x2 == 1){
                    x2 = 0;
                    x1 = 1;
                }
                else {
                    x2 = 1;
                }
            }
            else {
                x3 = 1;
            }
            i++;
        }
        while (i < 8);
        System.out.println();

        // 12

        for (i = 0; i < 130; i++){
            if (i == 23*3){break;}
            if (i % 7 == 0){System.out.print(i + ", ");}
        }
    }
    }
