package cbr.sesi.mms.file;

import java.io.IOException;

public class MainFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Aluno\\Desktop\\MGUEL-MS-3DS\\java-projects\\java-repos\\java-aulas-poo\\file.txt";
        ManipuladorArquivo arquivo = new ManipuladorArquivo();
        arquivo.leitor(path);
    }
}
