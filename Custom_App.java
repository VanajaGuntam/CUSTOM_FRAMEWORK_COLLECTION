package com.vanaja.maven.customlist2;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App 
{
	
	public static CustomList<Book> getList() {
                Logger logger =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
		Book book1 = new Book("Dan Brown", "‎The Da Vinci Code", "956:789:567", LocalDate.of(2003, Month.APRIL, 23),600);
	        Book book2 = new Book("Stephen Hawking", "A Brief History of Time", "113:222", LocalDate.of(1988, Month.JULY, 21), 550);
	        Book book3 = new Book("A P J Abdul Kalam", "Wings of Fire", "411:622", LocalDate.of(2000, Month.JULY, 21), 250);
	        Book book4 = new Book("Rabindranath Tagore","GORA", "161:242", LocalDate.of(1880, Month.JULY, 21), 550);
	        Book book5 = new Book("Naseem Hijazi","The Caravan of Hijaz", "161:242", LocalDate.of(1998, Month.JULY, 21), 600);
	        Book book6 = new Book("Anisul Hoque", "Maa", "980:678",LocalDate.of(200, Month.JULY, 21), 250);

	        logger.log("___function___");
	        CustomList<Book> list = new CustomList<Book>();
	        list.add(book1);
	        list.add(book2);
	        list.add(book3);
	        list.add(book4);
	        list.add(book5);
	        list.add(book6);

		return list;

	}
	
	
    public static void main( String[] args )
    {
       
        //___Driver Class___
        Logger logger =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
        Book book1 = new Book("Dan Brown", "‎The Da Vinci Code", "956:789:567", LocalDate.of(2003, Month.APRIL, 23),600);
        Book book2 = new Book("Stephen Hawking", "A Brief History of Time", "113:222", LocalDate.of(1988, Month.JULY, 21), 550);
        Book book3 = new Book("A P J Abdul Kalam", "Wings of Fire", "411:622", LocalDate.of(2000, Month.JULY, 21), 250);
        Book book4 = new Book("Rabindranath Tagore","GORA", "161:242", LocalDate.of(1880, Month.JULY, 21), 550);
        Book book5 = new Book("Naseem Hijazi","The Caravan of Hijaz", "161:242", LocalDate.of(1998, Month.JULY, 21), 600);
        Book book6 = new Book("Anisul Hoque", "Maa", "980:678",LocalDate.of(200, Month.JULY, 21), 250);

        logger.log("___ADD list___");
        CustomList<Book> list = new CustomList<Book>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);
        
        list.displayCustomList();
        logger.log("book1 from list: "+list.get(0).getName());
       logger.log("Size: "+list.size());
      
        
        CustomList<Book> list3 = new CustomList<Book>();
        list3 = getList();
        list3.displayCustomList();
        logger.log("book1 from function: "+list3.get(0).getName());
        logger.log("Size: "+list.size());

      
        
        logger.log("___ADD list2___");
        CustomList<Book> list2 = new CustomList<Book>();
        list2.add(book1);
        list2.add(book2);
        
        list2.displayCustomList();
        logger.log("Size: "+list2.size());
        
        logger.log("<<___ADDall(list2) ___>>");
        list3.addAll(list2);
        list3.displayCustomList();
        logger.log("list 3 Size: "+list3.size());

        logger.log("___Remove book4___");
        
        list.remove(book4);
        
        list.displayCustomList();
        logger.log("Size: "+list.size());
        
        logger.log("___get index 1___");
        
        logger.log("get : "+list.get(1));
        
        


        logger.log("___clear___");        
        list.clear();
        
        list.displayCustomList();
        logger.log("Size: "+list.size());
        
   
        
    }
}