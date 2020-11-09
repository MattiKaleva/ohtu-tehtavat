package ohtu.verkkokauppa;

public class Kauppa {

    private Storage storage;
    private Bank bank;
    private Ostoskori ostoskori;
    private RefGen refgen;
    private String kaupanTili;

    public Kauppa(RefGen refgen, Bank bank, Storage storage) {
        this.storage = storage;
        this.bank = bank;
        this.refgen = refgen;
        kaupanTili = "33333-44455";
    }

    public void aloitaAsiointi() {
        ostoskori = new Ostoskori();
    }

    public void poistaKorista(int id) {
        Tuote t = storage.haeTuote(id);
        storage.palautaVarastoon(t);
    }

    public void lisaaKoriin(int id) {
        if (storage.saldo(id)>0) {
            Tuote t = storage.haeTuote(id);
            ostoskori.lisaa(t);
            storage.otaVarastosta(t);
        }
    }

    public boolean tilimaksu(String nimi, String tiliNumero) {
        int viite = refgen.uusi();
        int summa = ostoskori.hinta();
        
        return bank.tilisiirto(nimi, viite, tiliNumero, kaupanTili, summa);
    }

}
