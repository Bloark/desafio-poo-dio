import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Curso java inciantes");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Script Básico");
        curso2.setDescricao("Curso java Script inciantes");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer for Beginner");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Contéudo inscritos" + devCamila.getConteudosInscritos());
        devCamila.progedir();
        devCamila.progedir();
        System.out.println("-");
        System.out.println("Contéudo inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Contéudo concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" +devCamila.calcularTotalxp());

        System.out.println("---------");

        Dev devWildson = new Dev();
        devWildson.setNome("Wildson");
        devWildson.inscreverBootcamp(bootcamp);
        System.out.println("Contéudo inscritos" + devWildson.getConteudosInscritos());
        devWildson.progedir();
        devWildson.progedir();
        devWildson.progedir();
        System.out.println("-");
        System.out.println("Contéudo inscritos" + devWildson.getConteudosInscritos());
        System.out.println("Contéudo concluidos" + devWildson.getConteudosConcluidos());
        System.out.println("XP:" +devWildson.calcularTotalxp());










    }
}