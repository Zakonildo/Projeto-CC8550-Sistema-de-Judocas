package test.java.org.fpij.jitakyoei.model.beans;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.fpij.jitakyoei.model.beans.Entidade;
import org.junit.Test;


public class EntidadeTest
{
    @Test
    public void verificarTamanhoCNPJ() {

        Entidade entidade_test = new Entidade();
        entidade_test.setCnpj("93278514000194");

        assertEquals(entidade_test.getCnpj().length(), 14);
    }

    @Test
    public void verificarNumerosCNPJ() {

        Entidade entidade_test = new Entidade();
        entidade_test.setCnpj("12984024000101");

        assertFalse(entidade_test.getCnpj().matches("[a-zA-Z]+"));
    }
}
