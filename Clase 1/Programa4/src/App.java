import java.util.Scanner;

public class App {
    public static void main(String[] parametrosDeConsola){
        Integer numeroLeido = LeerNumero();
        float fahrenheit = ComversorDeCelciusAFahrenheit( numeroLeido );
        System.out.println( "La temperatura en F es: " + fahrenheit );
    }

    public static float ComversorDeCelciusAFahrenheit(float tCelcius){
        float temperaturaFahrenheit = 32 + ( 9 * tCelcius / 5 );
        return temperaturaFahrenheit;
    }

    public static Integer LeerNumero(){
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Por favor ingrese el numero:");
        int numero=Lectura.nextInt();
        Lectura.close();
        return numero;
    }
    //Este es un comentario
}