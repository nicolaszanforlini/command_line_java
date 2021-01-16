package exercice;

import java.io.IOException;
import java.util.Scanner;


public class Command {

    private String command;


    public Command(String s) {
        setCommand(s);
    }

    public String getCommand() {
        return this.command;
    }

    private void setCommand(String s) {
        this.command = s;
    }

    public static String scanner() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public Process startProcess(String s) throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec(s);
        process.waitFor();
        return process;
    }

}
