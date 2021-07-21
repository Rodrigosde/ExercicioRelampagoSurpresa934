package exercicioRelampagoSupresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarPaisAlocacaoFuncionario() {
       Pais pais = new Pais("Brasil");
       Grupo grupo = new Grupo();
       Empresa empresa = new Empresa();
       Departamento departamento = new Departamento();
       Funcionario funcionario = new Funcionario();

       funcionario.setAlocacao(departamento);
       departamento.setEmpresa(empresa);
       empresa.setGrupo(grupo);
       grupo.setSede(pais);

       assertEquals("Brasil", funcionario.getPaisAlocacaoFuncionario());
    }

    @Test
    void deveRetornarSemPaisAlocacaoFuncionario() {
        Grupo grupo = new Grupo();
        Empresa empresa = new Empresa();
        Departamento departamento = new Departamento();
        Funcionario funcionario = new Funcionario();

        funcionario.setAlocacao(departamento);
        departamento.setEmpresa(empresa);
        empresa.setGrupo(grupo);

        assertEquals("País não informado", funcionario.getPaisAlocacaoFuncionario());
    }

}