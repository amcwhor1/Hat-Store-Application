import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import javafx.scene.image.Image;

/*
 * @author: Alex McWhorter, Steven Biedenbach, Sagar Hansalia
 * version: 1.0
 * Written: November 2017
 * 
 * This class holds all methods needed to sort hats, create a customer account, login to said account.
 * 
 * Purpose: To give functionality to the UserInterface class
 */

public class Controller {

	//created a map that holds the customers user name (first param -- string) as the key and the 4 attributes that make up a customer object as the values to that key
	static Map<String, Customer> customers = new TreeMap<String, Customer>();
	
	//method to create an account by taking the customers username and placing it into customers map as the key, followed by a customer object as the "values" for that key
	public static String createAccount(String user, String first, String last, String email, String password){
		
		//create a customer object
		Customer created = new Customer(first, last, email, password); //values for the customers map
		
		try{
			customers.put(user, created); //placing the username as the key along with the subsequent values into the TreeMap
		} catch(Exception e)
		{
			return "ERROR999"; //just an arbitrary string to show if an error occurs
		}
		
		return user;
	}
	
	//this method checks the customers credentials to see if they match and either allows/denies access to the corresponding account
	public static int login(String username, String password){
		try{ //checking the tree map from above to see if the the typed in password matches the password on file for that username
			if(customers.get(username).password.equals(password)){
				return 1;
			}else return 0;
		} catch(Exception e){
			return 0;
		}	
	}
	
	//this method gives the user a welcome heading in the search page after they log in with correct username and password
	public static String setWelcome(String username){
		return customers.get(username).firstName;
	}
	
	//method that returns an ArrayList of hats to show the current hat objects on the hat search page
	public static ArrayList<Hat> createHats(){
		
		//array list that holds hat objects (hats) based on the attributes set and the constructor in the hat class
		ArrayList<Hat> hats = new ArrayList<Hat>();
		
		//adding six new hats here
		hats.add(new Hat("Condiment Hat", 10.00, new Image("https://i.pinimg.com/originals/f8/09/bb/f809bb3f111b94acf36cd149a902f182.jpg")));
		hats.add(new Hat("Saturday Morning Hat", 20.00, new Image("https://i.pinimg.com/236x/95/13/8e/95138e60193eb2fd295be768e63eb631--crazy-hat-day-crazy-hats.jpg")));
		hats.add(new Hat("Caliente Hat", 15.00, new Image("https://images-na.ssl-images-amazon.com/images/I/51HmBIawgxL._UX385_.jpg")));
		hats.add(new Hat("Balanced Breakfast Hat", 15.00, new Image("https://i.pinimg.com/736x/a1/d6/6c/a1d66cd962b9618332149ef37889b3f5--silly-hats-funny-hats.jpg")));
		hats.add(new Hat("Aviary Hat", 25.00, new Image("https://s-media-cache-ak0.pinimg.com/originals/33/48/26/334826e669c421a9f7afadd0ec9cf3e7.jpg")));
		hats.add(new Hat("Weenie Hat Jr.", 10.00, new Image("https://i.pinimg.com/736x/da/38/70/da38702ca8f4729cc2e0d29e3810da24--silly-hats-funny-hats.jpg")));
		
		return hats;
	}
}
