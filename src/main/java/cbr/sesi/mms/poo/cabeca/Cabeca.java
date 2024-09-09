package cbr.sesi.mms.poo.cabeca;

public class Cabeca {
    public Olho olho;
    public Orelha orelha;
    public Nariz nariz;
    public Boca boca;

    public Cabeca(){
        this.olho = new Olho();
        this.boca = new Boca();
        this.orelha = new Orelha();
        this.nariz = new Nariz();
    }
}
