package exercicioRelampagoSupresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    void deveRetornarEscolaridadePresidenteGrupo(){
        Grupo grupo = new Grupo();
        Funcionario presidente = new Funcionario();
        Escolaridade escolaridade = new Escolaridade();

        escolaridade.setDescricao("Doutor");

        presidente.setEscolaridade(escolaridade);
        grupo.setPresidente(presidente);

       // assertEquals("Doutor",grupo.getEscolaridadePresidente());
    }
}