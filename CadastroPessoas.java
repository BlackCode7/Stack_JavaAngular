package com.blackcode;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    private List<Pessoa> pessoas;

    public CadastroPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionar(Pessoa pessoa) {
        if (pessoa.getNombre() == null){
            throw new PessoaSemNomeException();
        }
        this.pessoas.add(pessoa);
    }

    public List<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void removerPessoas(Pessoa pessoa) {
        if(!this.pessoas.contains(pessoa)){
            throw new CadastroVazioException();
        }
        this.pessoas.remove(pessoa);
    }
}
