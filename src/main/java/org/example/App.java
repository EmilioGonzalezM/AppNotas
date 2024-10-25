package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hola guapos" );

        System.out.println(stringReversed("holass"));
    }

    public static String  stringReversed(String str){

        int len = str.length();
        StringBuilder res = new StringBuilder();

        for ( int i = len - 1 ; i >= 0; i-- ){
            res.append(str.charAt(i));
        }

        return res.toString();

    }
}
