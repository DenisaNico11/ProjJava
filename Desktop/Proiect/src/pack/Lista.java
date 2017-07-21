package pack;
import java.util.ArrayList;
import java.util.List;

public class Lista {

	    public void returnList(int tmp) {

	        List<Integer> array = new ArrayList<>();
	        for (int i = 8; i >= 0; i--) {
	            array.add(i+1);
	        }

	        boolean swapped = true;
	        int j = 0;
	        int n = 4;

	        while (swapped) {
	            swapped = false;
	            j++;
	            for (int i = 0; i < array.size() - j; i++) {
	                if (array.get(i) > array.get(i+1)) {
	                    tmp = array.get(i);
	                    array.set(i, array.get(i + 1));
	                    array.set(i + 1, tmp);
	                    swapped = true;
	                    System.out.println(array);
	                }
	            }
	        }

	        List<Integer> newArray = new ArrayList<Integer>();
	        //String[] num = newArray.spliterator();

	        for (int i = 0; i < array.size(); i++) {
	            if (!((i + 1) % n == 0)) {
	                newArray.add(array.get(i));
	                //array.remove(3);
	                Integer xas = 3;
	                array.remove(xas);
	            }
	        }
	        System.out.println(newArray);
	    }
	}

