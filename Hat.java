import javafx.scene.image.Image;

/*
 * @author: Alex McWhorter, Steven Biedenbach, Sagar Hansalia
 * version: 1.0
 * Written: November 2017
 * 
 * This class holds attributes for any given hat that is used in the Controller hat when the hats are placed into an ArrayList
 * 
 * Purpose: To allow hats to be comparable to one another via price (sorting these hats on the search page scene of the UI)
 */

public class Hat implements Comparable<Object> {

//attributes
	String name;
	double price;
	Image image;
	
	//constructor 
	public Hat(String name, double price, Image image)
	{
		this.name = name;
		this.price = price;
		this.image = image;
	}

//getters and setters for the attributes defined above
	
	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}



	public double getPrice()
	{
		return price;
	}


	public void setPrice(double price)
	{
		this.price = price;
	}


	@Override
	public int compareTo(Object compareHat) {
		Hat h = (Hat)compareHat;
		return (int) (this.price - h.price);
	}
	
	
	
	
	
	
	
}
