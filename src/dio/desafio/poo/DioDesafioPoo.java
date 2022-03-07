package dio.desafio.poo;

import dio.desafio.poo.br.dominio.Bootcamp;
import dio.desafio.poo.br.dominio.Conteudo;
import dio.desafio.poo.br.dominio.Curso;
import dio.desafio.poo.br.dominio.Dev;
import dio.desafio.poo.br.dominio.Mentoria;
import java.time.LocalDate;

public class DioDesafioPoo {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("POO na prática com java");
        curso1.setCargaHoraria(4);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso JavaScript prática");
        curso2.setCargaHoraria(3);
        
        //System.out.println(curso1);
        //System.out.println(curso2);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Aprendendo OO");
        mentoria1.setDescricao("mentoria java OO");
        mentoria1.setData(LocalDate.now());
        
        //System.out.println(m1);
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Python Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        //bootcamp.getConteudos().add(mentoria1);
        
        Dev devRicardo = new Dev();
        devRicardo.setNome("Ricardo Emanual");
        devRicardo.inscreverBootcamp(bootcamp);
        devRicardo.progredir();
     
        
        Dev devMaira = new Dev();
        devMaira.setNome("Maira Fuijikawa");
        devMaira.inscreverBootcamp(bootcamp);
        devMaira.progredir();
        
        System.out.println("Conteúdos inscritos Ricardo\n" + devRicardo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Ricardo\n" + devRicardo.getConteudosConcluidos());
        
        System.out.println("\n===========================================\n");
        System.out.println("Conteúdos inscritos Maira\n" + devMaira.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Maira\n" + devMaira.getConteudosConcluidos());
        
        devMaira.progredir();
        devRicardo.progredir();
        devRicardo.progredir();
        System.out.println("\n===========================================\n");
        
        System.out.println("XP " + devRicardo.getNome() + " = " + devRicardo.calcularTotalXp());
        System.out.println("XP " + devMaira.getNome() + " = " + devMaira.calcularTotalXp());
        
        
   
    }
    
}
