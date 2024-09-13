package cbr.sesi.mms.poo;

import cbr.sesi.mms.poo.cabeca.Cabeca;
import cbr.sesi.mms.poo.cabeca.Olho;

public class Main {
    public static void main(String[] args) {
        Olho olho1 = new Olho();
        olho1.corIris = "azul";
        olho1.diametroOlho = 2.0f;
        olho1.cego = true;

        Olho olho2 = new Olho();
        olho2.corIris = "verde";
        olho2.diametroOlho = 2.5f;
        olho2.cego = false;

        Cabeca cabeca = new Cabeca();
        cabeca.olhoEsquerdo = olho1;
        cabeca.olhoDireito = olho2;

        Pessoa pessoa1 = new Pessoa();
        pessoa1.cabeca = cabeca;

        //pessoa1.cabeca.olho.corIris = "marrom";
        //pessoa1.cabeca.olho.cego = "false";
        //pessoa1.cabeca.olho.diametroOlho = 3.0f;
    }
}
