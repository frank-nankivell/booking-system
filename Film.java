import java.util.concurrent.atomic.AtomicInteger;

public class Film {
	
	// private fields for film name, time and price
	private String filmName;
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	
		public Film(String filmName)
		{
			this.filmName = filmName;
		}
		// Accessor for filmName
		public String getfilmName()
		{
			return filmName;
		}
		// Mutator for FilmName
		public void newFilmName(String newFilmName)
		{
			filmName = newFilmName;	
		}
		// Accessor for ID generator
		public static AtomicInteger getID_GENERATOR() 
		{
			return ID_GENERATOR;
		}
		// mutator for ID generator
		public static void setID_GENERATOR(AtomicInteger iD_GENERATOR) 
		{
				ID_GENERATOR = iD_GENERATOR;
		}
}