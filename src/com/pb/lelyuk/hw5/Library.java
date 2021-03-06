package com.pb.lelyuk.hw5;

import com.pb.lelyuk.hw3.Array;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();

        book1.setTitle("The Adventures of Tom Sawyer");
        book1.setAuthor("Twain Mark");
        book1.setPublicYear(2000);

        book2.setTitle("The DUNE");
        book2.setAuthor("Herbert Frank");
        book2.setPublicYear(1982);

        book3.setTitle("Понедельник начинается в субботу");
        book3.setAuthor("Стругацкий А., Стругацкий Б.");
        book3.setPublicYear(1976);

        book4.setTitle("The It");
        book4.setAuthor("King Stiven");
        book4.setPublicYear(1985);

        book5.setTitle("Улитка на склоне");
        book5.setAuthor("Стругацкий А., Стругацкий Б.");
        book5.setPublicYear(1985);

        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        reader1.setReaderName("Каструбатий І.Є.");
        reader1.setDateOfBirth("01.01.0001");
        reader1.setLibCardNum("777");
        reader1.setFaculty("БЖД");
        reader1.setPhoneNum("немає");


        reader2.setReaderName("Зубодратий Є.І.");
        reader2.setDateOfBirth("02.02.0002");
        reader2.setLibCardNum("778");
        reader2.setFaculty("Роздумів");
        reader2.setPhoneNum("322-22-322");

        reader3.setReaderName("Замахайло Борька");
        reader3.setDateOfBirth("01.01.1000");
        reader3.setLibCardNum("779");
        reader3.setFaculty("Вільних малярів");
        reader3.setPhoneNum("(001)111-000-11");


        System.out.println("Бібліотечний фонд: ");
        System.out.println(book1.getInfoBook());
        System.out.println(book2.getInfoBook());
        System.out.println(book3.getInfoBook());
        System.out.println(book4.getInfoBook());
        System.out.println(book5.getInfoBook());

        System.out.println("----------------------------------------------------------");

        System.out.println("Читачі: ");
        System.out.println(reader1.getInfoReader());
        System.out.println(reader2.getInfoReader());
        System.out.println(reader3.getInfoReader());

        System.out.println("----------------------------------------------------------");

        reader1.takeBook(3);

        System.out.println("----------------------------------------------------------");

        reader2.takeBook("The Adventures of Tom Sawyer", "The DUNE", "Улитка на склоне");

        reader1.takeBook(book1, book2, book3);

        System.out.println("----------------------------------------------------------");

        reader3.returnBook(2);

        System.out.println("----------------------------------------------------------");

        reader3.returnBook("The Adventures of Tom Sawyer", "The DUNE", "Улитка на склоне");

        reader3.returnBook(book5, book4, book3);



    }
}
