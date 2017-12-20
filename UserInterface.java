import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/*
 * @authors: Alex McWhorter, Steven Biedenbach, Sagar Hansalia
 * version: 1.0
 * Written: November 2017
 * 
 * This class holds the entire UI using JavaFX and uses methods from the Controller class to sort
 * 
 * Purpose: To provide a UI for the hat application 
 */


public class UserInterface extends Application{
	
	//main method
	public static void main(String[] args)
	{
		launch(args);
	}

	//start method needed to create a stage and all of the scenes contained within it
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/* *************************
		 * Login Page
		 */
		
		//gridpane that holds everything on the first/login screen
		GridPane login = new GridPane();
		
		login.setId("loginPane");
		login.setAlignment(Pos.CENTER);
		login.setHgap(10);
		login.setVgap(10);
		login.setPadding(new Insets(25,25,25,25));
		
		//created an Hbox and Vbox to give the gridpane a little more control of positioning things in the sceene
		VBox loginMaster = new VBox();
		loginMaster.setAlignment(Pos.CENTER);
		loginMaster.setSpacing(50);
		
		HBox loginBox = new HBox();
		loginBox.setSpacing(10);
		
		//large text at the top of login screen
		Text loginTitle = new Text("KoOkY kApS");
		
		loginTitle.setFont(Font.font("Allura", FontWeight.NORMAL, 90));
		loginTitle.setFill(Color.GREENYELLOW);
		loginTitle.setStroke(Color.BLACK);
		loginTitle.setTextAlignment(TextAlignment.CENTER);
		login.add(loginTitle, 2, 0);
		
		//to browse hats as a guest WITHOUT logging in
		Button browse = new Button("Browse our selection!");
		
		//usnInput and pswInput to login with an already created account
		TextField usnInput = new TextField();
		usnInput.setPromptText("Username");
		usnInput.setMaxWidth(150);
		
		PasswordField pswInput = new PasswordField();
		pswInput.setPromptText("Password");
		pswInput.setMaxWidth(150);
		
		//
		Button submitLogin = new Button("Login");
		
		//button to send you to registration page
		Button signUp = new Button("Sign Up");
		
		//after registering on registration page, you will be prompted with the text below
		Text registeredPrompt = new Text("Registration complete. Log in now!");
		registeredPrompt.setFill(Color.WHITE);
		registeredPrompt.setStroke(Color.GREENYELLOW);
		registeredPrompt.setFont(Font.font("Allura", FontWeight.NORMAL, 20));
		registeredPrompt.setVisible(false);
		
		//adding everything to the original gridpane on the login page
		loginBox.getChildren().addAll(usnInput, pswInput, submitLogin);
		loginMaster.getChildren().addAll(browse, registeredPrompt, loginBox, signUp);
		login.add(loginMaster, 2, 2);
		
		//creating the scene for this page
		Scene loginPage = new Scene(login, 800, 600);
		loginPage.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
		primaryStage.setScene(loginPage);
		primaryStage.setTitle("Kooky Kaps");
		primaryStage.show();
		
		/* *************************
		 * Register Page
		 */
		
		//setting up the "master" pane for the registration page
		GridPane register = new GridPane();
		
		register.setId("registerPane");
		register.setAlignment(Pos.TOP_CENTER);
		register.setHgap(10);
		register.setVgap(20);
		register.setPadding(new Insets(0,25,25,25));
		
		//created Hbox's and Vbox's for every input credential necessary for creating an account
		VBox registerBox = new VBox();
		registerBox.setAlignment(Pos.CENTER);
		registerBox.setSpacing(25);

		HBox usernameBox = new HBox();
		usernameBox.setSpacing(10);
		usernameBox.setAlignment(Pos.CENTER);
		
		HBox firstNameBox = new HBox();
		firstNameBox.setSpacing(10);
		firstNameBox.setAlignment(Pos.CENTER);
		
		HBox lastNameBox = new HBox();
		lastNameBox.setSpacing(5);
		lastNameBox.setAlignment(Pos.CENTER);
		
		HBox emailBox = new HBox();
		emailBox.setSpacing(1);
		emailBox.setAlignment(Pos.CENTER);
		
		HBox passwordBox = new HBox();
		passwordBox.setSpacing(5);
		passwordBox.setAlignment(Pos.CENTER);
		
		HBox buttonBox = new HBox();
		buttonBox.setSpacing(10);
		buttonBox.setAlignment(Pos.CENTER);
		
		
		//the heading of the registration page
		Text registerTitle = new Text("Register & Get Kooky!");
		
		registerTitle.setFont(Font.font("Allura", FontWeight.NORMAL, 60));
		registerTitle.setFill(Color.GREENYELLOW);
		registerTitle.setStroke(Color.BLACK);
		registerTitle.setTextAlignment(TextAlignment.CENTER);
		register.add(registerTitle, 2, 0);
		
		//buttons to either cancel or complete new account information
		Button cancelBT = new Button("Cancel"); //cancel will take you back to login page
		Button submitBT = new Button("Submit");
		
		//labels for the above text fields 
		Text firstNameL = new Text("First Name: ");
		firstNameL.setFill(Color.WHITE);
		firstNameL.setStroke(Color.BLACK);
		firstNameL.setFont(Font.font("Allura", FontWeight.BOLD, 25));
		
		Text usernameL = new Text("Username: ");
		usernameL.setFill(Color.WHITE);
		usernameL.setStroke(Color.BLACK);
		usernameL.setFont(Font.font("Allura", FontWeight.BOLD, 25));
		
		Text lastNameL= new Text("Last Name: ");
		lastNameL.setFill(Color.WHITE);
		lastNameL.setStroke(Color.BLACK);
		lastNameL.setFont(Font.font("Allura", FontWeight.BOLD, 25));
		
		
		Text emailL = new Text("Email Address: ");
		emailL.setFill(Color.WHITE);
		emailL.setStroke(Color.BLACK);
		emailL.setFont(Font.font("Allura", FontWeight.BOLD, 25));
		
		Text passwordL = new Text("Password: ");
		passwordL.setFill(Color.WHITE);
		passwordL.setStroke(Color.BLACK);
		passwordL.setFont(Font.font("Allura", FontWeight.BOLD, 25));
		
		//user will enter credentials into these text fields
		TextField firstNameTF = new TextField();
		firstNameTF.setMaxWidth(200);
		
		TextField usernameTF = new TextField();
		usernameTF.setMaxWidth(200);
		
		TextField lastNameTF = new TextField();
		lastNameTF.setMaxWidth(200);
		
		TextField emailTF = new TextField();
		emailTF.setMaxWidth(200);
		
		PasswordField passwordTF = new PasswordField();
		passwordTF.setMaxWidth(200);
		
		//adding the label and text fields to the corresponding HBox or Vbox it belongs to
		usernameBox.getChildren().addAll(usernameL, usernameTF);
		firstNameBox.getChildren().addAll(firstNameL, firstNameTF);
		lastNameBox.getChildren().addAll(lastNameL, lastNameTF);
		emailBox.getChildren().addAll(emailL, emailTF);
		passwordBox.getChildren().addAll(passwordL, passwordTF);
		buttonBox.getChildren().addAll(cancelBT, submitBT);
		
		//adding all boxes to the second to master Vbox
		registerBox.getChildren().addAll(usernameBox, firstNameBox, lastNameBox, emailBox, passwordBox, buttonBox);
		
		//adding master Vbox to the master Gridpane of registration page
		register.add(registerBox, 2, 2);
		
		
		//setting scene for registration
		Scene registerPage = new Scene(register, 800, 600);
		registerPage.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
		
		
		
		/*********************
		 * Search page
		 */
		
		//WELCOME banner
		Text title = new Text("Kooky Kaps");
		title.setFont(Font.font("Arial Black", FontWeight.BLACK, 25));
		title.setFill(Color.GREENYELLOW);
		title.setStroke(Color.BLACK);
		
		
		Text welcome = new Text("Welcome Guest!");//if not logged into an account, this string will be shown at the top
		welcome.setFont(Font.font("Arial Black", FontWeight.BLACK, 15));
		welcome.setFill(Color.WHITE);
		
		Button logout = new Button("Logout");

		//using the createHats method form the controller class to get all values that pertain to a hat (image, name, price)
		ArrayList<Hat> hats = Controller.createHats();

		//Images of each hat on the page that is pulled from the hats ArrayList in the Controller class
		ImageView image = new ImageView (hats.get(0).image);
		image.setFitHeight(163);
		image.setFitWidth(163);
		
		ImageView image2 = new ImageView (hats.get(1).image);
		image2.setFitHeight(163);
		image2.setFitWidth(163);
		
		ImageView image3 = new ImageView (hats.get(2).image);
		image3.setFitHeight(163);
		image3.setFitWidth(163);
		
		ImageView image4 = new ImageView (hats.get(3).image);
		image4.setFitHeight(163);
		image4.setFitWidth(163);
		
		ImageView image5 = new ImageView (hats.get(4).image);
		image5.setFitHeight(163);
		image5.setFitWidth(163);
		
		ImageView image6 = new ImageView (hats.get(5).image);
		image6.setFitHeight(163);
		image6.setFitWidth(163);
		

		//this CB is where sorting functionality will take place for hat prices
		ChoiceBox<String> cb = new ChoiceBox<>();
		cb.getItems().addAll("Please Select Your Options", "Sort High to Low","Sort Low To High");
		cb.setValue("Please Select Your Options");
		
		
		/*
		 * these are the texts labeling the hats with images along with the corresponding hat information (name & price) 
		 * from the hats ArrayList in the Controller class.. this applies to all 6 hats below
		 */
		Text condimentHat = new Text();
		condimentHat.setText(hats.get(0).name + "\t $" + hats.get(0).price);
		condimentHat.setFill(Color.WHITE);

		Text cerealHat = new Text();
		cerealHat.setText(hats.get(1).name + "\t $" + hats.get(1).price);
		cerealHat.setFill(Color.WHITE);

		Text calienteHat = new Text();
		calienteHat.setText(hats.get(2).name + "\t $" + hats.get(2).price);
		calienteHat.setFill(Color.WHITE);

		Text satMorningHat = new Text();
		satMorningHat.setText(hats.get(3).name + "\t $" + hats.get(3).price);
		satMorningHat.setFill(Color.WHITE);

		Text birdHat = new Text();
		birdHat.setText(hats.get(4).name + "\t $" + hats.get(4).price);
		birdHat.setFill(Color.WHITE);

		Text hotDog = new Text();
		hotDog.setText(hats.get(5).name + "\t $" + hats.get(5).price);
		hotDog.setFill(Color.WHITE);

		//creating all H/V Box's to place all of the subsequent children into
		VBox masterVBox = new VBox (25);
		HBox titleBox = new HBox(150);
		VBox vb2 = new VBox(25);
		HBox searchHBox = new HBox(25);
		HBox hMaster = new HBox (25);
		VBox VBoxA = new VBox(25);
		VBox VBoxB = new VBox(25);
		VBox VBoxC = new VBox(25);

		masterVBox.setId("searchPage");
		
		
		//adding all children to appropriate boxes
		
		titleBox.getChildren().addAll(title, welcome, logout);
		
		masterVBox.getChildren().addAll(titleBox, vb2);
		masterVBox.setAlignment(Pos.BASELINE_CENTER);
		masterVBox.setPadding(new Insets(25,25,25,25));

		hMaster.getChildren().addAll(VBoxA, VBoxB, VBoxC);
		hMaster.setAlignment(Pos.CENTER);

		searchHBox.getChildren().addAll(cb);
		searchHBox.setAlignment(Pos.CENTER);

		vb2.getChildren().addAll(searchHBox, hMaster);
		
		VBoxA.getChildren().addAll(image, condimentHat, image4, satMorningHat);
		
		VBoxB.getChildren().addAll(image2, cerealHat, image5, birdHat);
		
		VBoxC.getChildren().addAll(image3, calienteHat, image6, hotDog);

		//create scene for the searching hat page
		Scene searchPage = new Scene (masterVBox, 800, 600);
		//there is one CSS page used for the application called "styles.css" that can be found in this package as well
		searchPage.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
		
		//setting all on action events for each button that switches to the appropriate scene
		browse.setOnAction(e -> {
		logout.setText("Home");	
		registeredPrompt.setVisible(false);
		primaryStage.setScene(searchPage);
		});
		
		//changing scene from login to register when clicking sign up button
		signUp.setOnAction(e -> {	
			primaryStage.setScene(registerPage);
		});
		
		//canceling registration back to login page when clicking cancel
		cancelBT.setOnAction(e -> {
			primaryStage.setScene(loginPage);
		});
		
		//attempting create a new account via submit button on register page
		submitBT.setOnAction(e -> {
			
			//this if statement checks to see if an error occurs by checking if the createAccount method returns the string that is defined as in an error in the Controller class
			if(Controller.createAccount(usernameTF.getText(), firstNameTF.getText(), lastNameTF.getText(), emailTF.getText(), passwordTF.getText()).equals("ERROR999")){
				return;
			}else{
				/*
				 * if there is no error, then the customer is taken back to the login screen, 
				 * successfully creating an account where they will be prompted with the message below
				 */
			primaryStage.setScene(loginPage);
			registeredPrompt.setText("Registration complete. Log in now!");
			registeredPrompt.setVisible(true);
			}
		});
		
		submitLogin.setOnAction(e -> {
			//this if statement uses the login method from the controller class to see if the username and password entered match what is recorded in the customers treemap
			if(Controller.login(usnInput.getText(), pswInput.getText()) == 1){
				
				//this changes the "Welcome Guest!" heading on the search page to welcome + username you have just logged in to
					welcome.setText("Welcome " + Controller.setWelcome(usnInput.getText()) + "!"); //displays username that you registered with on hat search page
					
					//after logging in, customers will be taken to search page
					logout.setText("Logout");
					registeredPrompt.setVisible(false);
					primaryStage.setScene(searchPage);
					registeredPrompt.setVisible(true);
					usnInput.setText("");
					pswInput.setText("");
					registeredPrompt.setText("Login Failed!");

			}else{
				registeredPrompt.setVisible(true);
				usnInput.setText("");
				pswInput.setText("");
				registeredPrompt.setText("Login Failed!");
			}
			usnInput.setText("");
			pswInput.setText("");
		});
		
		//by clicking the logout button on the search hats page, you will be taken back to the first/login page
		logout.setOnAction(e -> {
		primaryStage.setScene(loginPage);
		registeredPrompt.setVisible(false);
		});
		
		
		cb.setOnAction(e ->{
			//if the user chooses this option, the hats with images and labels will be arranged in descending order (high to low)
			if(cb.getSelectionModel().getSelectedItem().equals("Sort High to Low"))
			{
				Collections.sort(hats, Collections.reverseOrder());
				System.out.println("Sorted... hat 1: " + hats.get(0).name + "\t $" + hats.get(0).price);
				
				//if the user chooses low to high, the hats will be sorted in ascending order (low to high)
			}else if(cb.getSelectionModel().getSelectedItem().equals("Sort Low To High"))
			{
				Collections.sort(hats);
				System.out.println("Sorted... hat 1: " + hats.get(0).name + "\t $" + hats.get(0).price);
			}
			//after the sort, the the images must be "reset"
			image.setImage(hats.get(0).image);
			image2.setImage(hats.get(1).image);
			image3.setImage(hats.get(2).image);
			image4.setImage(hats.get(3).image);
			image5.setImage(hats.get(4).image);
			image6.setImage(hats.get(5).image);
			
			//the same way images needed to be reset, the text and prices for each hat must be set as well
			condimentHat.setText(hats.get(0).name + "\t $" + hats.get(0).price);
			cerealHat.setText(hats.get(1).name + "\t $" + hats.get(1).price);
			calienteHat.setText(hats.get(2).name + "\t $" + hats.get(2).price);
			satMorningHat.setText(hats.get(3).name + "\t $" + hats.get(3).price);
			birdHat.setText(hats.get(4).name + "\t $" + hats.get(4).price);
			hotDog.setText(hats.get(5).name + "\t $" + hats.get(5).price);
		});
		
	}

}
