package com.BLC.ELC;

public class Book {
		private String title;
		private String author;
		private double price;
		public void setBookDetails(string t, String a, double p) {
				title = t;
				author = a;
				price = p;
		}
		public String getBookDetails() {
			    return "Book Title : " + title + "\nAuthor : " + "\nPrice : " + price;
		}
}
