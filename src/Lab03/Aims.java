package src.Lab03;

import java.util.Scanner;

public class Aims {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Order anOrder = new Order();
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
	        dvd1.setCategory("Animation");
	        dvd1.setCost(19.95f);
	        dvd1.setDirector("Roger Allers");
	        dvd1.setLength(87);
	        anOrder.addDigitalVideoDisc(dvd1);

	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
	        dvd2.setCategory("Science Fiction");
	        dvd2.setCost(24.95f);
	        dvd2.setDirector("Geogre Lucas");
	        dvd2.setLength(124);
	        anOrder.addDigitalVideoDisc(dvd2);

	        DigitalVideoDisc dvd3 = new DigitalVideoDisc("ALaddin");
	        dvd3.setCategory("Animation");
	        dvd3.setCost(18.99f);
	        dvd3.setDirector("John Musker");
	        dvd3.setLength(90);
	        anOrder.addDigitalVideoDisc(dvd3);

	        System.out.print("Total Cost is: ");
	        System.out.println(anOrder.totalCost());

	        System.out.println("Enter disc of title that you want to delete : ");
	        String title = sc.nextLine();
	        DigitalVideoDisc disc = anOrder.searchDiscByTitle(title);
	        if(disc!=null) {
	            anOrder.removeDigitalVideoDisc(disc);
	            System.out.println("Deleted ! ");
	        }
	        else
	            System.out.println("Title wasn't found !");

	        System.out.print("Total Cost is: ");
	        System.out.println(anOrder.totalCost());
	    }

}
