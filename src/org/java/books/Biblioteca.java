package org.java.books;

public class Biblioteca {

	public static void main(String[] args) {
		try {
			Libro libro1 = new Libro("Titolo Libro", 250, "Nome autore", "Mondadori");
			System.out.println(libro1);
		} catch (Exception e) {
			System.err.println("Errore: " + e.getMessage());
		}
	}
}
