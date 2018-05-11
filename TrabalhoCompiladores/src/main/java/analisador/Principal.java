package analisador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe Principal que gera o arquivo Lexer
 *
 * @author Edoardo, Lucas e Matheus
 */
public class Principal {

    private static final String path = "\\src\\main\\java\\analisador\\Lexer.flex";

    /**
     * Método Main para gerar o arquivo Lexer.java
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file;
        String pathAbsolute = new File("").getAbsolutePath();
        String fullPath = pathAbsolute + path;
        System.out.println(fullPath);
        try {
            file = new File(fullPath);
            jflex.Main.generate(file);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
