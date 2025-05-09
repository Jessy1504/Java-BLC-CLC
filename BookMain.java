package com.BLC.ELC;

public class BookMain {
	public static void main(String[] args) {
	    	Book book = new Book();
	    	book.setBookDetails("Java Basics", "John Deo", 450.0);
            String res = book.getBookDetails();
            System.out.println(res);
	}
}
