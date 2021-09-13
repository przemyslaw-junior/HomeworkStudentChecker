/*
Stwórz trzy obiekty klasy student.
Przypisz wartości do pól.
Stwórz tablice i dodaj studentów do tablicy.
Przejdz przez studentów w tablicy i wywołaj wszystkie 4 metody
*/
public class HomeworkStudentChecker {

    public static void main(String[] args) {

        Student firstStudent = new Student();
        firstStudent.imie = "Adam";
        firstStudent.nazwisko = "Nowak";
        firstStudent.nik = "Adamus";
        firstStudent.email = "AdamN@gmail.com";
        firstStudent.nrIndeksu = 1;

        Student secondStudent = new Student();
        secondStudent.imie = "Jan";
        secondStudent.nazwisko = "Cios";
        secondStudent.nik = "Jano";
        secondStudent.email = "JanC@gmail.com";
        secondStudent.nrIndeksu = 2;

        Student thirdStudent = new Student();
        thirdStudent.imie = "Marek";
        thirdStudent.nazwisko = "Kowalski";
        thirdStudent.nik = "Kowal";
        thirdStudent.email = "MarekK@gmail.com";
        thirdStudent.nrIndeksu = 3;

        Student[] studentInCamp = new Student[4];
        studentInCamp[1] = firstStudent;
        studentInCamp[2] = secondStudent;
        studentInCamp[3] = thirdStudent;

        for (int i = 1; i < studentInCamp.length; i++){

            System.out.println("Student na liście " + i);
            studentInCamp[i].infoStudent();
        }
    }
}
