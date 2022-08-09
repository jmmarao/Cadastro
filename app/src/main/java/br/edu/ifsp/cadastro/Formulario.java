package br.edu.ifsp.cadastro;

public class Formulario {
    private String nomeCompleto;
    private String telefone;
    private String email;
    private boolean listado;
    private String sexo;
    private String cidade;
    private String uf;

    public Formulario(String nomeCompleto, String telefone, String email, boolean listado, String sexo, String cidade, String uf) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.listado = listado;
        this.sexo = sexo;
        this.cidade = cidade;
        this.uf = uf;
    }
}
