package com.company;

import com.company.classes.Rules;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        boolean a=true;

        try {
            JFileChooser escolha = new JFileChooser();
            int retorno = escolha.showOpenDialog(null);

            if (retorno == JFileChooser.APPROVE_OPTION) {
                FileReader leitura = new FileReader(escolha.getSelectedFile());
                try {
                    BufferedReader arquivo = new BufferedReader(leitura);
                    Rules r = new Rules();
                    while (arquivo.ready()) {
                        String linha = arquivo.readLine();
                        a = r.getlines(linha);
                        System.out.println(a);
                    }
                    arquivo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}