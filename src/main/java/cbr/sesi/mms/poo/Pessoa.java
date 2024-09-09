package cbr.sesi.mms.poo;

import cbr.sesi.mms.poo.cabeca.Cabeca;
import cbr.sesi.mms.poo.inferior.MembrosInferiores;
import cbr.sesi.mms.poo.tronco.Tronco;

public class Pessoa {
    public Cabeca cabeca;
    Tronco tronco;
    MembrosInferiores inferiores;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferiores = new MembrosInferiores();
    }
}
