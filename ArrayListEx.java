import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Kia");
	    cars.add("Tesla");
	    cars.add("BMW");
	    cars.add("Renault");

	    for (String carsList: cars) {
		System.out.println(carsList);
	    }
        cars.add(1, "Ford");
	    cars.remove(2);
	    
	    int mbIndex = cars.indexOf("BMW");
	    if (mbIndex != -1)  {
	    	cars.set(mbIndex, "Audi");
	    	}  	
	    System.out.println("MODIFIED LIST");
	    for (String carsList: cars) {
			System.out.println(carsList);
		    }
	    

    
    }

}