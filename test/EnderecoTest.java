package test.java.org.fpij.jitakyoei.model.beans;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.fpij.jitakyoei.model.beans.Endereco;
import org.junit.Test;


public class EnderecoTest
{
    @Test
    public void verificarTamanhoCEP() {

        Endereco endereco_teste = new Endereco();
        endereco_teste.setCep("11345350");

        assertEquals(endereco_teste.getCep().length(), 8);
    }

    @Test
    public void verificarNumeroCEP() {

        Endereco endereco_teste = new Endereco();
        endereco_teste.setCep("1134535j");

        assertTrue(endereco_teste.getCep().matches("[a-zA-Z]+"));
    }
}
