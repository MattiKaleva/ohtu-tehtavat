package laskin;

import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public abstract class Komento {
    protected TextField tuloskentta;
    protected TextField syotekentta;
    protected Button nappi;
    protected Button undo;
    protected Sovelluslogiikka sovellus;

    public Komento(TextField tuloskentta, TextField syotekentta, Button nappi, Button undo, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nappi = nappi;
        this.undo = undo;
        this.sovellus = sovellus;
    }

    public abstract void suorita();
    public abstract void peru();
}

