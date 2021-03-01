package application;

import entities.Course;
import entities.Student;
import entities.Teacher;

import java.util.HashSet;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        int matricula;
        String nome;
        String curso;
        HashSet<Teacher> teachers = new HashSet<>();
        HashSet<Student> students = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        int opt = 0;
        while (opt != 9){
            System.out.println("1 - Cadastra professor:");
            System.out.println("2 - Cadastra aluno:");
            System.out.println("3 - Cadastra curso:");
            System.out.println("4 - Matricula aluno ao curso:");
            System.out.println("5 - Mostra quantidade de alunos do Curso:");
            System.out.println("6 - Mostra quantidade de alunos do Professor:");
            System.out.println("9 - Encerra!");

            opt = sc.nextInt(); sc.nextLine();

            switch(opt){

                case 1:
                    System.out.print("Entre com a matricula do professor: ");
                    matricula = sc.nextInt();
                    System.out.print("Entre com o Nome do professor: ");
                    nome = sc.nextLine();
                    teachers.add(new Teacher(matricula, nome));
                    break;

                case 2:
                    System.out.print("Entre com a matricula do aluno: ");
                    matricula = sc.nextInt();
                    System.out.print("Entre com o Nome do aluno: ");
                    nome = sc.nextLine();
                    students.add(new Student(matricula, nome));
                    break;

                case 3:
                    System.out.print("Entre com o nome do Curso: ");
                    curso = sc.nextLine();
                    Course course = new Course(curso);
                    System.out.print("Entre com o Nome do professor do curso: ");
                    nome = sc.nextLine();
                    for (Teacher teach : teachers){
                        if(teach.equals(nome)){
                            addCourse.
                        }
                    }
                    if(teachers.contains(nome)){

                    }
                    teachers.contains(nome)

                    break;

            }






        }
    }
}
