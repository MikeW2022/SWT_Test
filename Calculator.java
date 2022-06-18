package test;

public class Calculator {
    
    public double rechnen(int zahl1, int zahl2, char op) {
        double ergebnis = 0;

        switch (op) {
        case '+':
            ergebnis = zahl1 + zahl2;
            break;
        case '/':
            ergebnis = zahl1 / zahl2;
            break;
        }
        return ergebnis;
    }

    /*
    public static void main(String[] args) {
        int z1 = 10;
        int z2 = 2;
        char op = '/';
        double result = 0;
        try {
            result = rechnen(z1, z2, op);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       System.out.println("Ergebnis aus " + z1 + " " + op + " " + z2 + " ist: " + result);
    }
    
   */
}
