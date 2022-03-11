package co.pedrobelle.livro;

public class User {
    public String titulo;
    public String autores;
    public int paginas;
    public float preco;
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    public User(String titulo, String autores, int paginas, float preco) {
        this.titulo = titulo;
        this.autores = autores;
        this.paginas = paginas;
        this.preco = preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setPreco(float preco) {
        if (preco < 0) {
            System.out.println("Erro. Preço inválido");
        } else {
            this.preco = preco;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutores() {
        return autores;
    }

    public int getPaginas() {
        return paginas;
    }

    public float getPreco() {
        return preco;
    }

    public String output() {
        return "\nTítulo: " + getTitulo() + "\nAutor(es): " + getAutores() + "\nPáginas: " + getPaginas() + "\nPreço: " + getPreco();
    }

    public float aumenta_preco(float aumento) {
        this.preco = aumento + getPreco();
        return preco;
    }

    public float diminui_preco(float reducao) {
        if(reducao <= 0) {
            System.out.println("Erro. Redução inválida");
        } else{
            this.preco = getPreco() - reducao;
        }
        return preco;
    }

    public float deconto_pct(float pct){
        return this.preco * pct/100;
    }

    public float preco_por_pagina(){
        return this.preco / this.paginas;
    }

    public String acresenta_autor(String n_autor){
        return this.autores = this.autores + n_autor;
    }
}