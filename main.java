import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) {

        int radius = 0;
        System.out.println("Prosze wpisac promien okregu: "); //Please enter radius of the circle

        try{
            //Pobierz promień od użytkownika
            //Get radius value from user
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            radius = Integer.parseInt(br.readLine());
        }
        //Jeśli została wprowadzona niepoprawna liczba
        //If invalid value was entered
        catch(NumberFormatException ne){
            System.out.println("Zostala wprowadzona niepoprawna liczba" + ne); //Invalid radius value
            System.exit(0);
        }
        catch (IOException ioe){
            System.out.println("Blad IO: " + ioe); //IO ERROR
            System.exit(0);
        }
        double area = Math.PI * radius * radius;
        
        //Area of the circle is
        System.out.println("Pole kola wynosi :" + area); 
    }
}
