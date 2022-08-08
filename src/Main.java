import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMislene = new Dev();
        devMislene.setNome("Mislene");
        devMislene.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mislene" + devMislene.getConteudosInscritos());
        devMislene.progredir();
        devMislene.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mislene" + devMislene.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Mislene" + devMislene.getConteudosConcluidos());
        System.out.println("XP:" + devMislene.calcularTotalXp());

        System.out.println("------");

        Dev devLazaro = new Dev();
        devLazaro.setNome("Lázaro");
        devLazaro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lázaro" + devLazaro.getConteudosInscritos());
        devLazaro.progredir();
        devLazaro.progredir();
        devLazaro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lázaro" + devLazaro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lázaro" + devLazaro.getConteudosConcluidos());
        System.out.println("XP:" + devLazaro.calcularTotalXp());




    }
}
