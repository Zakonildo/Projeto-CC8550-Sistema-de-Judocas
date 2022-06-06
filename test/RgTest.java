package test.java.org.fpij.jitakyoei.model.beans;

import static org.junit.Assert.assertNotEquals;

import org.fpij.jitakyoei.model.beans.Rg;
import org.junit.Test;


public class RgTest
{
    @Test
    public void verificarRgVazio() {

        Rg rg_teste = new Rg();
        
        rg_teste.setNumero("106601507");

        assertNotEquals(rg_teste.getNumero(), "");
    }
}
