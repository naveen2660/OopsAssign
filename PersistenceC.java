package oops;

public class PersistenceC {

	public static void main(String[] args) {
		 FilePersistance fp = new FilePersistance();
	        DatabasePersistance db = new DatabasePersistance();
	        fp.persist();
	        db.persist();

	}

}
abstract class Persistance {
    abstract void persist();
}
class FilePersistance extends Persistance{

    @Override
    void persist() {
        System.out.println("The file is persistance. ");
    }
}
class DatabasePersistance extends Persistance{

    @Override
    void persist() {
        System.out.println("The Database is persistance.");
    }
}
