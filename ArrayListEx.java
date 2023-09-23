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
    }

}