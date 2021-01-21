public class Main {

    public static void main(String[] args) {
        boolean bo;
        byte by = 1;
        short s = 1;
        int i = 1, i1 = 19, i5 = -1, year, i3;
        long l = 1L;
        float a = 2.0f, b = 3.0f, c = 7.0f, d = 1.5f, functionReturn;
        double dou = 2.2;
        char ch = 'q';
        String text = "Vasia";
// number 3
        functionReturn = func(a, b, c, d);
        System.out.println("3: "+a+"*("+b+"+("+c+"/"+d+"))=" + functionReturn);
// number 4
        bo = check(i,i1);
        i3 = i1+i;
        System.out.println("4: "+i+"+"+i1+"="+i3+"  результат- " + bo);
// number 5,6
        bo = check5(i5);
        System.out.println("6: " + bo);
// number 7
        number7(text);
// number 8
        year = 2020;
        number8(year);
    }
    // number 3
       static float func(float a, float b, float c, float d)
        {
         return a*(b+(c/d));
        }
    // number 4
        static boolean check(int i, int i1)
        {
            if (i+i1>=10 && i+i1<=20) return true;
            else return false;
        }
    // number 5,6
        static boolean check5(int i5)
        {
            if (i5 >= 0)
            {
                System.out.println("5: число "+i5+" положительное");
                return false;
            }
            else {
                System.out.println("5: число "+i5+" отрицательное");
                return true;
            }
        }
    //number 7
    public static void number7(String text)
    {
        System.out.println("7: Привет," + text);
    }
    // number 8
    public static void number8(int year)
    {
        float p1;
        int p2;
        boolean typ;
// проверяем високосность
        p1 = year/4f;
        p2 = year/4;
        if (p1==p2) typ = true;
        else typ = false;
// проверяем каждый 100
        p2 = year/100;
        p1 = year/100f;
        if (p1==p2) typ = false;
// проверяем каждый 400
        p2 = year/400;
        p1 = year/400f;
        if (p1==p2) typ = true;
        if (typ) System.out.println("8: год "+year+" високосный");
        else System.out.println("8: год "+year+" не високосный");

    }
}
