package com.teamtechtalk;

import com.teamtechtalk.model.Book;
import com.teamtechtalk.repository.BookDao;
import com.teamtechtalk.repository.Dao;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dao<Book> bookDao = new BookDao();

        List<Book> books = bookDao.findAll();

        for(Book book: books){
            System.out.println("id: "+ book.getId());
            System.out.println("Title: "+ book.getTitle());
        }
    }
}
