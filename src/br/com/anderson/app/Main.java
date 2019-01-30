package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        int x = 10;
        Integer i = new Integer(x);
        byte b = i.byteValue();
        
        System.out.println(x);
        System.out.println(i);
        System.out.println(b);        
    }
}
