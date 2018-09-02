package mavenhello;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String abc = "111";
        if (abc == "111"){
            System.out.println("ooo");
        }

        if (abc != "111"){
            System.out.println("dddd");
        }
        System.out.println( "Hello Alauda - Maven !" );
    }

    public int Add(int a, int b){
        return a+b;
    }

    public int Foo(int a, int b){
        return 0;
    }
}
