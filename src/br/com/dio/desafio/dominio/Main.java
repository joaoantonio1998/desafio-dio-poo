package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Mentoria java");
        mentoria.setData(LocalDate.now());
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }


}