package com.company.classes;

public class Rules {

    public int controle = 0; //variavel responsavel por controlar se é linha ou não conforme a leitura vai acontecendo

    public boolean getlines(String leitura) {

        leitura.trim();
        for (int i=1; i<leitura.length();i++) {
            if(leitura == "") {
                controle = 2;
                break;
            }
            if ((leitura.charAt(0)!= '/')&&(controle != 1)){
                controle = 0;
                break;
            }
            if ((leitura.charAt(0) == '/')&&(leitura.charAt(1) == '/')){
                controle = 2;
            }
            if (leitura.charAt(i - 1) == '/' && leitura.charAt(i) == '*') {
                controle = 1;
            }
            else
                if (leitura.charAt(i - 1) == '*' && leitura.charAt(i) == '/') {
                controle = 2;
                }
        }
        if (controle==1){
            return false;
        }
        else
            if(controle==2){
                controle = 0;
                return false;
            }
            else{
                return true;
            }
    }
}
