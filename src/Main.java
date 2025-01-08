import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println(moltiplicazione(3, 5));
        System.out.println(Arrays.toString(bo(new String[]{"valentina", "mario", "Giovanni", "astrubale", "martino"}, "HELLO")));

    }

    public static int moltiplicazione(int op1, int op2) {
        return op1 * op2;
    }

    public static String[] bo(String[] nomi, String ciao) {
        if (nomi.length != 5)
            throw new Error("l'array non è lungo 5");
        String[] array= new String[6];
        array[0]=nomi[0];
        array[1]=nomi[1];
        array[2]=ciao;
        array[3]=nomi[2];
        array[4]=nomi[3];
        array[5]=nomi[4];

        return array;
    }
  public static void concatena(){


  }

}