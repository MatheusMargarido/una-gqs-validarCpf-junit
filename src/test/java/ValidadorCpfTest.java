import org.junit.jupiter.api.Test;

import application.ValidadorCpf;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorCpfTest {

    @Test
    public void deveRetornarTrueParaCpfCom11Digitos() {
        assertTrue(ValidadorCpf.validarTamanhoCpf("12345678901"));
    }

    @Test
    public void deveRetornarFalseParaCpfComMenosDe11Digitos() {
        assertFalse(ValidadorCpf.validarTamanhoCpf("12345678"));
    }

    @Test
    public void deveRetornarFalseParaCpfComMaisDe11Digitos() {
        assertFalse(ValidadorCpf.validarTamanhoCpf("123456789012"));
    }

    @Test
    public void deveRetornarFalseParaCpfComCaracteresNaoNumericos() {
        assertFalse(ValidadorCpf.validarTamanhoCpf("abc45678901"));
    }

    @Test
    public void deveRetornarFalseParaCpfNulo() {
        assertFalse(ValidadorCpf.validarTamanhoCpf(null));
    }
}
