package org.java.books;

public class Libro {
	
	private String title;
	private int pagesNumber;
	private String author;
	private String editor;
	
	public Libro(String title, int pagesNumber, String author, String editor) throws Exception {
		setTitle(title);
		setPagesNumber(pagesNumber);
		setAuthor(author);
		setEditor(editor);
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) throws Exception {
		
		if(title.length()<= 0) {
			
			throw new Exception("Il titolo deve contenere almeno un carattere");
		}
		
		this.title = title;
		
	}
	public int getPagesNumber() {
		return pagesNumber;
	}
	public void setPagesNumber(int pagesNumber) throws Exception {
		
		if(pagesNumber <= 0) {
			throw new Exception("Il numero di pagine deve essere superiore a 0");
		}
		this.pagesNumber = pagesNumber;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) throws Exception {
		
			if(author.length()<= 0) {
						
				throw new Exception("L'autore deve contenere almeno un carattere");
			}
		this.author = author;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	@Override
	public String toString() {
		return "Libro: " + getTitle()
		+ "\nNumero Pagine: " + getPagesNumber()
		+ "\nAutore: " + getAuthor()
		+"\nEditore: " + getEditor();
	}
	
}
