package org.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();

//        //Example usage
//        Book book = new Book();
//        book.setIdBook(1);
//        book.setTitle("else");
//        book.setAuthor("bradpit");
//        book.setDescription("lorem ipsum");
//        book.setCategories(List.of("Programming", "Java"));
//        book.setQuantity(4);
//        book.setBooked(1);
//
//        Member member = new Member();
//        member.setIdMember(1);
//        member.setName("Jane Smith");
//        member.setPhoneNumber("1234567890");
//        member.setEmail("jane.smith@example.com");
//        member.setAddress("123 Main St");


        Transaction transaction = new Transaction();
        transaction.setIdTransaction(1);
        transaction.setDateTransaction(new Date());
        transaction.setIdmember(1);
        transaction.setIdBook(1);
        transaction.setStatus(2);

//        app.addBook(book);
//        app.addMember(member);
        app.addTransaction(transaction);

//        System.out.println("Books: " + app.getBooks());
//        System.out.println("Members: " + app.getMembers());
        System.out.println("Transactions: " + app.getTransactions());


    }
}