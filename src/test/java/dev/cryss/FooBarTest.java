package dev.cryss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FooBarTest {
    @Test
    void test(){
       var bola = "bola";

        List<Bola> bolas = new ArrayList<> ();

       Bola bola1 = new Bola (bola);

       bolas.add (bola1);
       bolas.add (bola1);
       bolas.add (bola1);

       String error = "Error";

        Assertions.assertEquals ("bola", bola);
        Assertions.assertEquals ("bola", bola1.getBola ());
        Assertions.assertNotNull (bolas, error);
        Assertions.assertEquals (bolas.get (0).getBola (), bola );



    }

    private class Bola {
        private String bola;

        public Bola(String bola) {
            this.bola = bola;
        }

        public String getBola() {
            return bola;
        }


    }
}