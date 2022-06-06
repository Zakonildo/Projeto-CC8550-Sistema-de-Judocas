package test.java.org.fpij.jitakyoei.model.beans;

import static org.junit.Assert.assertEquals;

import org.fpij.jitakyoei.model.beans.Filiado;
import org.junit.Test;


public class FiliadoTest
{
    @Test
    public void verificarTamanhoCPF() {

        Filiado filiado_teste = new Filiado();
        filiado_teste.setCpf("21327221020");

        assertEquals(filiado_teste.getCpf().length(), 11);
    }
}
