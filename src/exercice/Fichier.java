package exercice;

import java.io.*;


public class Fichier {

    public  BufferedReader infos(Process process){
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(process.getInputStream()));
        return buffRead;
    }

    public void createDoc(BufferedReader br, String s) throws IOException {
        FileWriter f = new FileWriter("/home/nicolas/Bureau/"+s+".txt");
        String line = "";
        while((line = br.readLine())!=null){
            f.write(line);
            f.write("\n");
        }
        f.close();
    }

}
