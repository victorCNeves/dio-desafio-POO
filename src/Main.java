import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Curso Java","descricao curso java",8);
        Conteudo curso2 = new Curso("Curso js","descricao curso js",4);
        Conteudo mentoria = new Mentoria("mentoria em java","descricao mentoria java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev("Victor");
        System.out.println(dev.getConteudosInscritos());
        dev.increverBootcamp(bootcamp);
        System.out.println(dev.getConteudosInscritos());
        dev.progredir();
        System.out.println(dev.getConteudosInscritos());
        System.out.println(dev.calcularTotalXp());

        Dev devJoao = new Dev("joao");
        System.out.println(devJoao.getConteudosInscritos());
        devJoao.increverBootcamp(bootcamp);
        System.out.println(devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println(devJoao.getConteudosInscritos());
        System.out.println(devJoao.calcularTotalXp());

    }
}
