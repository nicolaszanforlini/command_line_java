package com.company;

import exercice.Command;
import exercice.Fichier;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Fichier f = new Fichier();
        System.out.print("Entrer une commande : ");
        String scan = Command.scanner();
        Command c = new Command(scan);

        f.createDoc(f.infos(c.startProcess(c.getCommand())),c.getCommand());

    }
}
