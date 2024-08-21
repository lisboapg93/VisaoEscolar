package com.educacao.visaoescolar.model;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Date;


@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "func_matricula", nullable = false)
    private BigInteger matricula;
    @Column(name = "func_nome", length = 50, nullable = false)
    private String nome;
    @Column(name = "func_sobrenome", length = 50, nullable = false)
    private String sobrenome;
    @Column(name = "func_email", length = 50, nullable = false)
    private String email;
    @Column(name = "func_rg", nullable = false)
    private BigInteger rg;
    @Column(name = "func_cpf", nullable = false)
    private BigInteger cpf;
    @Column(name = "func_telefone", nullable = false)
    private BigInteger telefone;
    @Column(name = "func_endereco", length = 100, nullable = false)
    private String endereco;
    @Column(name = "func_pis_pasep",  nullable = false)
    private BigInteger pis_pasep;
    @Column(name = "func_nome_parente", length = 100, nullable = true)
    private String nome_De_Parente;
    @Column(name = "func_telefone_parente", nullable = true)
    private BigInteger telefone_parente;
    @Column(name = "func_data_nascimento", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dataDeNascimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigInteger getMatricula() {
        return matricula;
    }

    public void setMatricula(BigInteger matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getRg() {
        return rg;
    }

    public void setRg(BigInteger rg) {
        this.rg = rg;
    }

    public BigInteger getCpf() {
        return cpf;
    }

    public void setCpf(BigInteger cpf) {
        this.cpf = cpf;
    }

    public BigInteger getTelefone() {
        return telefone;
    }

    public void setTelefone(BigInteger telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public BigInteger getPis_pasep() {
        return pis_pasep;
    }

    public void setPis_pasep(BigInteger pis_pasep) {
        this.pis_pasep = pis_pasep;
    }

    public String getNome_De_Parente() {
        return nome_De_Parente;
    }

    public void setNome_De_Parente(String nome_De_Parente) {
        this.nome_De_Parente = nome_De_Parente;
    }

    public BigInteger getTelefone_parente() {
        return telefone_parente;
    }

    public void setTelefone_parente(BigInteger telefone_parente) {
        this.telefone_parente = telefone_parente;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
