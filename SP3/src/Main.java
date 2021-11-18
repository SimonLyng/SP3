import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    static FileReader fileReader;
    public static void main(String[] args) throws FileNotFoundException {
        UI ui=new UI();
        //ui.getUserInput("ok");
        ui.startDialog("ok");
    }

}