package org.java.books;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Biblioteca {

	public static void main(String[] args) {
		
//		Chiedere all'utente quanti libri vuole inserire
		System.out.println("Quanti libri vuoi inserire?");
		Scanner sc = new Scanner(System.in);
		int userNumber = sc.nextInt();
		
		
//		Generare un array della dimensione fornita dall'utente
		Libro[] listaLibri = new Libro[userNumber];
		Libro libro = null;
		
//		Richiedere i dati necessari per creare quei libri
		for (int i = 0; i < listaLibri.length; i++) {
			System.out.println("Inserisci il titolo del libro");
			String title = sc.next();
			
			System.out.println("Inserisci il numero di pagine del libro");
			int pagesNumber = sc.nextInt();
			
			System.out.println("Inserisci l'autore del libro");
			String author = sc.next();
			
			System.out.println("Inserisci l'editore del libro");
			String editor = sc.next();
			
			try {
				libro = new Libro (title, pagesNumber, author, editor);
				
			} catch (Exception e) {
				System.err.println("Errore: " + e.getMessage());
			}
			
//			salvare all'interno dell'array
			listaLibri[i] = libro;
		}
		sc.close();
		
		
		for(int i = 0; i < listaLibri.length; i++) {
//				salvare tutti gli elementi dell'array all'interno di un file
				try {
		            FileWriter Mywriter = new FileWriter("C:\\biblioteca.txt");
		            Mywriter.write(listaLibri[i].toString() + "\n");
		    
		            Mywriter.close();
		        } catch (IOException e) {
		        	System.err.println("Errore nella scrittura del file" + e.getMessage());
		        }
				
//				leggere tutti gli elementi del file
				try {
//					apro il file
					File mioFile = new File("C:\\biblioteca.txt");
					Scanner reader = new Scanner(mioFile);
					// FileReader reader = new FileReader("C:\\biblioteca.txt");
						
//					leggo riga per riga
					while (reader.hasNextLine()) {
						String data = reader.nextLine();
						System.out.println(data);
						}
						
					reader.close();
				}catch (Exception e) {
					
					System.err.println("Errore nella lettura di biblioteca.txt\n" + e.getMessage());
				}
					
		
		}
		
		
	}
}
