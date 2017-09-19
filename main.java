import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) {

        int radius = 0;
        System.out.println("Proszę wpisać promień okręgu: ");

        try{
            //Pobierz promień od użytkownika
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            radius = Integer.parseInt(br.readLine());
        }
        //Jeśli została wprowadzona niepoprawna liczba
        catch(NumberFormatException ne){
            System.out.println("Została wprowadzona niepoprawna liczba" + ne);
            System.exit(0);
        }
        catch (IOException ioe){
            System.out.println("Błąd IO: " + ioe);
            System.exit(0);
        }
        /*
        Pole okręgu liczy się ze wzoru:
        Pi * promień * promień (P*r^2)
        Liczba PI wyciągnięta z Math.PI
         */

        double area = Math.PI * radius * radius;

        System.out.println("Pole koła wynosi :" + area);
    }
}
