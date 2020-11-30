package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa extends Komento {
    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nappi, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nappi, undo, sovellus);
    }

    @Override
    public void suorita(){
        sovellus.nollaa();
        int laskunTulos = sovellus.tulos();

        syotekentta.setText("");
        tuloskentta.setText("" + laskunTulos);
    }

    @Override
    public void peru() {
        return;
    }
}
