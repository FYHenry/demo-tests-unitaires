package fr.diginamic.enumerations;

import org.junit.Test;
import org.junit.Assert;

public class SaisonTest {
    @Test
    public void testValueOfLibelle(){
        final String[] libelles = {"Printemps",
                "Eté",
                "Automne",
                "Hiver"};
        final Saison[] saisons = {Saison.PRINTEMPS,
                Saison.ETE,
                Saison.AUTOMNE,
                Saison.HIVER};
        /* Libellés attendus */
        for(int i=0; i<4; i++){
            Assert.assertEquals("TEST_FAILURE: mauvais libellés.",
                    saisons[i],
                    Saison.valueOfLibelle(libelles[i]));
        }
        /* Autre libellé */
        Assert.assertNull("TEST_FAILURE: libellés nul attendu.",
                Saison.valueOfLibelle(""));
    }
}
