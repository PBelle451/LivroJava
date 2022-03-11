package co.pedrobelle.livro;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    public static void main(String[] args){
        List<String> authors = new ArrayList<>();
        authors.add("Frank Herbert");
        authors.add("Stephen King");
        authors.add("Boris Strugatsky, Arkady Strugatsky");
        User user1 = new User("Duna", authors.get(0), 702, 65);
        User user2 = new User("Christine", authors.get(1), 522, 72);
        User user3 = new User("Piquenique na Estrada", authors.get(2), 259, 45);
        System.out.println(user1.aumenta_preco(23));
        System.out.println(user2.diminui_preco(23));
        System.out.println(user1.preco_por_pagina());
        System.out.println(user1.deconto_pct(10));
        System.out.println(user3.acresenta_autor(", Cuca Beludo"));

        System.out.println(user1.output());
        System.out.println(user3.getAutores());
    }

}
