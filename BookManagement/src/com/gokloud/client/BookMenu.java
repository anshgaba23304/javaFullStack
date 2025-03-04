package com.gokloud.client;

import java.util.*;

import com.gokloud.service.BookServiceImple;

public class BookMenu {
	BookServiceImple bookimpl;
	private Scanner sc;
	public BookMenu() {
		bookimpl=new BookServiceImple();
		sc=new Scanner(System.in);
	}
	
	public void menu() {
		String choice="y";
		while(choice.equals("y")) {
		System.out.println("1. Insert Book");
		System.out.println("2. Delete Book");
		System.out.println("3. View Books");
		System.out.println("4. Update Book");
		System.out.println("5. Exit");
		
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			bookimpl.insertBook();
			break;
		case 2:
			bookimpl.deleteBook();
			break;
		case 3:
			bookimpl.retreiveData();
			break;
		case 4:
			bookimpl.updateBoook();
			break;
		case 5:
			System.exit(0);
		}
		System.out.println("Do u want to continue (y/n)");
		choice=sc.next();
		}
	}

}
