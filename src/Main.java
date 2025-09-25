import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //IO
        File file = new File("/home/alexaraujo/ada/turmas/1418/tprog/src/resources/nomes.txt");
        System.out.printf("Arquivo existe %b", file.exists());

        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //NIO
        Path path = Path.of("/home/alexaraujo/ada/turmas/1418/tprog/src/resources/nomes.txt");
        Path path2 = Paths.get("home", "alexaraujo", "ada", "turmas", "1418", "tprog", "src", "resources", "nomes.txt");

        System.out.println(file.getParent());
        System.out.println(file.isAbsolute());
        String newFile = file.getParent().concat(File.separator).concat("turma1418.txt");
        File novoArquivo = new File(newFile);
        try {
            novoArquivo.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}