package src;

import java.time.LocalDate;

import src.Classes.Bootcamp;
import src.Classes.Conteudo;
import src.Classes.Curso;
import src.Classes.Dev;
import src.Classes.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("dewcrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso jS");
        curso2.setDescricao("dewcrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */


         Bootcamp bootcamp = new Bootcamp();
         bootcamp.setNome("Bootcamp Java Developer");
         bootcamp.setDescricao("Descrição Bootcamp java Developer");
         bootcamp.getConteudos().add(curso1);
         bootcamp.getConteudos().add(curso2);
         bootcamp.getConteudos().add(mentoria);

         Dev dev1 = new Dev();
         dev1.setNome("Patrick");
         dev1.inscreverBootcamp(bootcamp);
         System.out.println("Conteudos Inscritos " + dev1.getNome() + dev1.getConteudosInscritos()); 
         dev1.progredir();
         System.out.println("Conteudos Inscritos " + dev1.getNome() + dev1.getConteudosInscritos());
         System.out.println("Conteudos Conclidos " + dev1.getNome() + dev1.getConteudosConcluidos());
         System.out.println("XP: " + dev1.calcularTotalXp());
         System.out.println("---------------- ---------------------------------- ----------------------------");
         
         Dev dev2 = new Dev();
         dev2.setNome("Fulano");
         dev2.inscreverBootcamp(bootcamp);
         System.out.println("Conteudos Inscritos " + dev2.getNome() + dev2.getConteudosInscritos()); 
         dev2.progredir();
         System.out.println("Conteudos Inscritos " + dev2.getNome() + dev2.getConteudosInscritos());
         System.out.println("Conteudos Conclidos " + dev2.getNome() + dev2.getConteudosConcluidos());
         System.out.println("XP: " + dev2.calcularTotalXp());

    }
}
