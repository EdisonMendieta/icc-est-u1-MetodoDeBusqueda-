import controller.MetodosBusqueda;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        MetodosBusqueda mBusqueda = new MetodosBusqueda();
        //mBusqueda.busquedaLineal( 5);

        Persona [] personas = new Persona[] {
            new Persona ("Ana", 25),
            new Persona ("Luis", 30),
            new Persona ("Maria", 28),
            new Persona ("Carlos", 35),
            new Persona ("Sofia", 22),
            new Persona ("Jorge", 27),
            new Persona ("Lucia", 24),
        };
    
        //Busca de juan
        String name = "Juan"; 
        Persona resultado = mBusqueda.searchPersonaByName(personas,name);
        //imprime la persona si encontro

        ShowConsole show =new ShowConsole();
        show.showPersonResult(resultado, name);

        //busqueda de edad impar mayor a 25

        resultado = mBusqueda.findPersonaByAge(personas,25);
        show.showPersonResult(resultado, 25);
    }
}
