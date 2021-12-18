import com.blackcode.CadastroPessoas;
import com.blackcode.CadastroVazioException;
import com.blackcode.Pessoa;
import com.blackcode.PessoaSemNomeException;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CadastroPessoasTeste {

    // Primerio escreve o teste
    @Test
    public void deveCriarCadastroPessoas(){
        // O NOME DA CLASSE FICA VERMELHA POR QUE AINDA NÃO TEM O CLASSE CRIADA
        CadastroPessoas cadastro = new CadastroPessoas();
        //Verificação
        Assertions.assertThat( cadastro.getPessoas() ).isEmpty();
    }

    @Test
    public void deveAdicionarPessoa(){
        CadastroPessoas cadastro = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setPessoa("Anderson");
        //execução
        CadastroPessoas.adicionar(pessoa);
        //Verificação
        Assertions.assertThat( cadastro.getPessoas() )
                  .isNotEmpty()
                  .hasSize(1)
                  .contains(pessoa);
    }

    @Test(expected = PessoaSemNomeException.class)
    public void naoDeveAdiconarPessoaComNomeVazio(){
        CadastroPessoas CadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        //execução
        CadastroPessoas.adicionar(pessoa);
    }

    @Test
    public void deveRemoverUmaPessoa(){
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setPessoa("Anderson");
        CadastroPessoas.removerPessoas(pessoa);

        cadastroPessoas.removerPessoas(pessoa);
    }

    @Test(expected = CadastroVazioException.class)
    public void deveLancarErroAoRemoverPessoaInexistente(){
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        cadastroPessoas.removerPessoas(pessoa);

    }
}
