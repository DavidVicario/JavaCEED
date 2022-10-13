package concatenar;

//Ejercicio de concatenar

public class Concatenar {

    public static void main(String[] args) {

        var nomb = "David";
        var apell = "Vicario";
        var edad = 32;

        var concat = nomb + " " + apell + " tiene " + edad + " años.";
        System.out.println(concat);
        System.out.println("");

        var num1 = 8;
        var num2 = 2;
        System.out.println(num1 + num2);
        System.out.println(num1 + num2 + nomb);
        System.out.println(nomb + num1 + num2);
        System.out.println(nomb + (num1 + num2));

    }

}
