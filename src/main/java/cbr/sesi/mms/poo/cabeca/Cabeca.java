package cbr.sesi.mms.poo.cabeca;

public class Cabeca {
    public Olho olhoEsquerdo;
    public Olho olhoDireito;
    public Orelha orelha;
    public Nariz nariz;
    public Boca boca;

    public Cabeca() {
        this.olhoEsquerdo = new Olho();
        this.olhoDireito = new Olho();
        this.boca = new Boca();
        this.orelha = new Orelha();
        this.nariz = new Nariz();
    }
}
