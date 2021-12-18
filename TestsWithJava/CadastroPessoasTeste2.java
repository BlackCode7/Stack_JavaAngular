import com.blackcode.CadastroPessoas;
import com.blackcode.CadastroVazioException;
import com.blackcode.Pessoa;
import com.blackcode.PessoaSemNomeException;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CadastroPessoasTeste2 {
    //Criação de cadastro de pessoas
    @Test
    public void deveCriarCadastroPessoas() {
        CadastroPessoas cadastro = new CadastroPessoas();
        Assertions.assertThat( cadastro.getPessoas() ).isEmpty();
    }

    //Depois da criação de cadastro, deve adicionar uma pessoa ao cadastro
    @Test(expected = PessoaSemNomeException.class)
    public void deveAdicionarUmaPessoa() throws PessoaSemNomeException{
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Anderson");
        //Ação
        pessoa.adicionar(pessoa);
        //Verificação
        Assertions.assertThat(cadastroPessoas.getPessoas())
                .isNotEmpty()
                .hasSize(1)
                .contains(pessoa);
    }

    //Guando cadastrado no sistema, ele não deve adicionar uma pessoa com nome vazio
    @Test(expected = PessoaSemNomeException.class)
    public void naoDeveAdiconarPessoaComNomeVazio(){
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        cadastroPessoas.adicionar(pessoa);
    }

    //Guando cadastrado ele deve ter a possíbilidade de remover um nome
    @Test
    public void deveRemoverUmaPessoa() throws CadastroVazioException {
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Anderson");
        cadastroPessoas.adicionar(pessoa);
        //Apaga a pessoa
        cadastroPessoas.remover(pessoa);
        //Verifica se foi apagada a pessoa
        Assertions.assertThat(cadastroPessoas.getPessoas()).isEmpty();
    }

    @Test(expected = CadastroVazioException.class)
    public void naoDeveRemoverPessoaSeEstiverVazio() throws CadastroVazioException {
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        cadastroPessoas.remover(pessoa);
    }

}
