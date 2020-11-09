package ohtu.verkkokauppa;

import java.util.ArrayList;

public interface BookKeeping {
    void lisaaTapahtuma(String tapahtuma);
    ArrayList<String> getTapahtumat();
}
