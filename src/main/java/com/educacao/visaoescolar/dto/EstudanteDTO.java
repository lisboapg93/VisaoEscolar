package com.educacao.visaoescolar.dto;

import java.math.BigInteger;
import java.util.Date;

public class EstudanteDTO {

    private Long id;
    private BigInteger matricula;
    private String nome;
    private String sobrenome;
    private String email;
    private BigInteger rg;
    private BigInteger cpf;
    private String endereco;
    private BigInteger telefone;
    private String nomeDaMae;
    private String NomeDoPai;
    private BigInteger telefoneDaMae;
    private BigInteger telefoneDoPai;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public BigInteger getTelefone() {
        return telefone;
    }

    public void setTelefone(BigInteger telefone) {
        this.telefone = telefone;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getNomeDoPai() {
        return NomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        NomeDoPai = nomeDoPai;
    }

    public BigInteger getTelefoneDaMae() {
        return telefoneDaMae;
    }

    public void setTelefoneDaMae(BigInteger telefoneDaMae) {
        this.telefoneDaMae = telefoneDaMae;
    }

    public BigInteger getTelefoneDoPai() {
        return telefoneDoPai;
    }

    public void setTelefoneDoPai(BigInteger telefoneDoPai) {
        this.telefoneDoPai = telefoneDoPai;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
