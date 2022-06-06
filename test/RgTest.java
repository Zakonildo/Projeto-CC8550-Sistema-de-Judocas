package test.java.org.fpij.jitakyoei.model.beans;

import static org.junit.Assert.assertEquals;

import org.fpij.jitakyoei.model.beans.Rg;
import org.junit.Test;


public class RgTest
{
    @Test
    public void verificarRgVazio() {

        // setup inicial
        Rg rg_teste = new Rg();
        
        rg_teste.setNumero("106601507");

        // (29 * 7) + 1234567 deve resultar em 1234770
        assertNotEquals(rg_teste.getNumero(), "");
    }
}
