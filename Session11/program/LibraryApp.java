package org.example;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class LibraryApp {
    private static final String BOOKS_FILE = "books.json";
    private static final String MEMBERS_FILE = "members.json";
    private static final String TRANSACTIONS_FILE = "transactions.json";

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    private Gson gson = new Gson();

    public LibraryApp() {
        loadData();
    }

    private void loadData() {
        try {
            File booksFile = new File(BOOKS_FILE);
            File membersFile = new File(MEMBERS_FILE);
            File transactionsFile = new File(TRANSACTIONS_FILE);

            if (booksFile.exists()) {
                try (FileReader reader = new FileReader(booksFile)) {
                    Type bookListType = new TypeToken<List<Book>>() {}.getType();
                    books = gson.fromJson(reader, bookListType);
                }
            }

            if (membersFile.exists()) {
                try (FileReader reader = new FileReader(membersFile)) {
                    Type memberListType = new TypeToken<List<Member>>() {}.getType();
                    members = gson.fromJson(reader, memberListType);
                }
            }

            if (transactionsFile.exists()) {
                try (FileReader reader = new FileReader(transactionsFile)) {
                    Type transactionListType = new TypeToken<List<Transaction>>() {}.getType();
                    transactions = gson.fromJson(reader, transactionListType);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveData() {
        try {
            try (FileWriter writer = new FileWriter(BOOKS_FILE)) {
                gson.toJson(books, writer);
            }

            try (FileWriter writer = new FileWriter(MEMBERS_FILE)) {
                gson.toJson(members, writer);
            }

            try (FileWriter writer = new FileWriter(TRANSACTIONS_FILE)) {
                gson.toJson(transactions, writer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Methods to add, view, and update books, members, and transactions
    public void addBook(Book book) {
        books.add(book);
        saveData();
    }

    public void addMember(Member member) {
        members.add(member);
        saveData();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        for (Book book : books) {
            if (book.getIdBook() == transaction.getIdBook() && transaction.getStatus() == 1) {
                book.setQuantity(book.getQuantity()-1);
                book.setBooked(book.getBooked()+1);
                saveData(); // Menghentikan iterasi setelah buku ditemukan dan diupdate
            } else if (book.getIdBook() == transaction.getIdBook() && transaction.getStatus() == 2) {
                book.setQuantity(book.getQuantity()+1);
                book.setBooked(book.getBooked()-1);
                saveData();
            }
        }

    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
