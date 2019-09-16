import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class House {
	protected int ID;
	protected float price;
	protected String location;
	protected String advertiser;
	Photo image = new Photo();
	
	
	public House() {
		ID=0;
		price=0;
		location="";
		advertiser="";
	}

	public House(int IdNum, float Price, String Location, String Adver) {

		ID = IdNum;
		price = Price;
		location = Location;
		advertiser = Adver;
	}
	
	// copy constructor 
	public House(House live) {
		SetIdNo(live.GetID());
		SetPrice(live.GetPrice());
		SetLocation(live.GetLocation());
		SetAdvertiser(live.GetAdvertiser());
		
	}
	
	public void SetIdNo(int id) {
		ID=id;
	}
	
	public void SetPrice(float pr) {
		price= pr;
	}
	
	public void SetLocation(String loc) {
		location=loc;
	}
	
	public void SetAdvertiser(String adv) {
		advertiser=adv;
	}
	
	public int GetID() {
		return ID;
	}
	
	public float GetPrice() {
		return price;
	}
	
	public String GetLocation() {
		return location;
		
	}
	
	public String GetAdvertiser() {
		return advertiser;
	}
	
public void AddHouse(House live) {
		
		int x=0;
		for(x=0;x<3;x++) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Id Number: ");
		live.SetIdNo(in.nextInt());

		System.out.println("Enter the Price: ");
		live.SetPrice(in.nextFloat());

		System.out.println("Enter the Location: ");
		live.SetLocation(in.next());

		System.out.println("Enter the Advertiser: ");
		live.SetAdvertiser(in.next());
		
		try {
			
			FileWriter fileobject = new FileWriter("House.txt", true);

			
			fileobject.write("\t" + live.GetID() + "\t\t\t\t " + live.GetPrice() + "\t\t\t\t\t " + live.GetLocation()
			+ "\t\t\t " + live.GetAdvertiser()+ "\n");
			
			fileobject.close();
			System.out.println("Information was saved successfully...");
			
		} catch (IOException e) {
			System.err.println("Error opening file.....");
		}
		}
		
}
}
