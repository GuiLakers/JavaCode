/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classedategregorian;

import java.util.GregorianCalendar;

/**
 *
 * @author pmotel
 */
public class LivroDeBiblioteca {
    
    private String nome;
    private String autor;
    private int qtdPag;
    private int anoLancamento;
    private String isbn;
    private boolean emprestado;
    private GregorianCalendar dataRetirada;
    private GregorianCalendar dataEntrega;
    

    public GregorianCalendar getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(GregorianCalendar dataRetirada) {
        this.dataRetirada = dataRetirada;
    }
    
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public GregorianCalendar getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(GregorianCalendar dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    
    public String detalharLivro() {
    return "LivroDeBiblioteca{" + "nome=" + nome + "\n, autor=" + autor + ""
    + ", qtdPag=" + qtdPag + ", anoLancamento=" + anoLancamento + ", isbn=" + isbn + ""
     + ", emprestado=" + emprestado + "\n, dataEntrega=" + "a data e horario da entrega "
     + "eh: "+dataEntrega.getTime() + '}';
    }
    
}
