package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findTrain {

	public static void main(String[] args) {
		List<String> trainnames = Arrays.asList("chennai","madurai","Bangalore","pondy");
		Collections.sort(trainnames);
		System.out.println("Sorting list");
		System.out.println(trainnames);
		int size=trainnames.size();
		System.out.println(trainnames.get(size-1));
		System.out.println(trainnames.size());
		//Reverse
		Collections.reverse(trainnames);
		System.out.println("After reversing");
		System.out.println(trainnames);
	}

}
