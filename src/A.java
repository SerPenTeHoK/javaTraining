/**
 * Created by SerP on 24.03.2016.
 */
public class A{

    static int a = 1111;
    static
    {
        a = a-- - --a;
    }

    {
        a = a++ + ++a;
    }

    public static void main(String[] args)  {
        System.out.println(a);
    }
}