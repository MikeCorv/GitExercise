import java.util.ArrayList;
import java.util.List;

public class Esercizio2 {

	public static void main(String[] args) {
		int[] prova_array = {2,3,11,13,17,19,21,30,50};
		System.out.println(getNumeriPrimi(prova_array ));
		
		// TODO Auto-generated method stub

	}
	
	public static List <Integer> getNumeriPrimi (int[] arrayOfPositiveNumbers){
		List <Integer> numeriPrimi = new ArrayList<>();
		for (int i = 0; i<arrayOfPositiveNumbers.length; i++) {
			if (isPrime(arrayOfPositiveNumbers[i])) {
				numeriPrimi.add(arrayOfPositiveNumbers[i]);
			}
			
		}
		return numeriPrimi;
	}
	
	public static boolean isPrime(int x) {
		boolean result = true;
		for (int i = 2; i<x; i++) {//Dividi il numero per gli inferiori
			if (x%i==0) {//Reminder=0 -> il numero non è primo
				result = false;
			}
		}
		return result;
	}

}
