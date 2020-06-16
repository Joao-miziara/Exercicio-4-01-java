
package EX304;

import java.util.Scanner;

/**
 *
 * @author jpmiz
 */
public class JavaApplication4 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um numero");
        int n1 = entrada.nextInt();
        System.out.println("Digite outro numero");
        int n2 = entrada.nextInt();
        System.out.println("Digite outro numero");
        int n3 = entrada.nextInt();
        double delta, x1, x2;
        if(n1 !=0)
            {
                delta = Math.pow(n2, 2) - (4 * n1 * n3);
                if (delta>0)
                {
                    x1=(((-n2)+Math.sqrt(delta)))/(2+n1);
                    x2 = (((-n2) + Math.sqrt(delta))) / (2 + n1);
                    System.out.println ("x1 =" + x1 + "x2" + x2);

                }
                else
                {
                    if (delta==0)
                    {
                        x1=((-n2) + Math.sqrt(delta))/(2+n1);
                        System.out.println ("x1 e x2:" + x1);
                    
                    }
                    else
                    {
                        System.out.println ("a equaçao nao tem numeros validos");
                    }
                }

    }
    }
}
