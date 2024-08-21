package com.educacao.visaoescolar.model;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Date;

@Entity
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "estud_matricula", nullable = false)
    private BigInteger matricula;
    @Column(name = "estud_nome", length = 50, nullable = false)
    private String nome;
    @Column(name = "estud_sobrenome", length = 50, nullable = false)
    private String sobrenome;
    @Column(name = "estud_email", length = 50, nullable = false)
    private String email;
    @Column(name = "estud_rg", nullable = false)
    private BigInteger rg;
    @Column(name = "estud_cpf", nullable = false)
    private BigInteger cpf;
    @Column(name = "estud_endereco", length = 100, nullable = false)
    private String endereco;
    @Column(name = "estud_telefone", nullable = false)
    private BigInteger telefone;
    @Column(name = "estud_mae", length = 100, nullable = false)
    private String nomeDaMae;
    @Column(name = "estud_pai", length = 100, nullable = true)
    private String NomeDoPai;
    @Column(name = "estud_tel_mae", nullable = false)
    private BigInteger telefoneDaMae;
    @Column(name = "estud_tel_pai", nullable = true)
    private BigInteger telefoneDoPai;
    @Column(name = "estud_data_nascimento", nullable = true)
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
