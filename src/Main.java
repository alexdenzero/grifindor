public class Main {
    public static void main(String[] args) {
        Griffindor[] students = {
                new Griffindor("Гарри Поттер",90,90,90,90,95),
                new Griffindor("Гермиона Грейнджер",80,95,90,90,90),
                new Griffindor("Рон Уизли",44,95,90,90,90)
        };
       Slytherin[] students2 = {
                new Slytherin("Драко Малфой",90,90,90,90,95),
                new Slytherin("Грэхэм Монтегю",80,95,90,90,90),
                new Slytherin("Грегори Гойл",44,95,90,90,90)
        };
        Hufflepuf[] students3 = {
                new Hufflepuf("Захария Смит",90,90,90,90,95),
                new Hufflepuf("Седрик Диггори",80,95,90,90,90),
                new Hufflepuf("Джастин Финч-Флетчли",44,95,90,90,90)
        };
        Ravenclaw[] students4 = {
                new Ravenclaw("Чжоу Чанг",90,90,90,90,95),
                new Ravenclaw("Падма Патил",80,95,90,90,90),
                new Ravenclaw("Маркус Белби",44,95,90,90,90)
        };
        HogwartsStudentPrinter printer = new HogwartsStudentPrinter();
        for (HogwartsStudent student: students){
            printer.print(student);
        }
        for (HogwartsStudent student2: students2){
            printer.print(student2);
        }
        for (HogwartsStudent student3: students3){
            printer.print(student3);
        }
        for (HogwartsStudent student4: students4){
            printer.print(student4);
        }
        Hogwarts hogwarts = new Hogwarts();
        hogwarts.compareSlytherin(students2[0],students2[1]);
        hogwarts.compareRavenclaw(students4[0],students4[1]);
        hogwarts.compareHufflepuf(students3[0],students3[1]);
        hogwarts.compareGrifindor(students[0],students[1]);
        hogwarts.compareHogwartsStudents(students4[0],students3[1]);
    }
}