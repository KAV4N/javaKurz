package programDatabazaKnih.libraryDatabasev4;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class BookStorage implements Serializable {
	private LinkedHashMap<Integer,Book> bookMap = new LinkedHashMap<>();
	private LinkedHashMap<Integer,Book>backupBookMap = new LinkedHashMap<>();
	private  LinkedList<Integer> missingKeys = new LinkedList<>();

	private int databaseSize = 0;

	protected void addBook(Book book){
		int token = databaseSize;
		if (!missingKeys.isEmpty()){
			token = missingKeys.removeFirst();
		}
		bookMap.put(token, book);
		databaseSize++;
	}

	protected void removeBook(int token){
		bookMap.remove(token);
		missingKeys.add(token);
		databaseSize--;
	}

	public LinkedHashMap<Integer, Book> getBookMap() {
		return bookMap;
	}

	public void setBookMap(LinkedHashMap<Integer, Book> bookMap) {
		this.bookMap = bookMap;
	}

	public LinkedHashMap<Integer, Book> getBackupBookMap() {
		return backupBookMap;
	}

	public void setBackupBookMap(LinkedHashMap<Integer, Book> backupBookMap) {
		this.backupBookMap = backupBookMap;
	}

	public LinkedList<Integer> getMissingKeys() {
		return missingKeys;
	}

	public void setMissingKeys(LinkedList<Integer> missingKeys) {
		this.missingKeys = missingKeys;
	}
	public int getDatabaseSize() {
		return databaseSize;
	}
}
