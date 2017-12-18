
public class Show 
{	
	private double filmPrice;
	private double filmTime;
	
	public Show(double filmPrice, double filmTime) 
	{
		this.filmPrice = filmPrice;
		this.filmTime = filmTime;
	}
			// accessor for filmPrice
			public double getfilmPrice() {
				return filmPrice;
			}
			// mutator for filmPrice
			public void setAMfilmPrice(double newfilmPrice)
			{
				filmPrice = newfilmPrice;
			}
			// accessor for filmtime
			public double getFilmTime() {
				return filmTime;
			}
			// mutator for filmtime
			public void setFilmTime(double newfilmTime) 
			{
				filmTime = newfilmTime;
			}
			

		}
