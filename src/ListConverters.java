import java.util.ArrayList;

/**
 * Created by Mycal on 7/22/2015.
 * Tool for converting between arrays and lists of ints and integers
 */
public class ListConverters {
    public static ArrayList<Integer> convertToArrayList(int[] primitiveArray) {
        ArrayList<Integer> product = new ArrayList<Integer>(primitiveArray.length);
        for (int entry : primitiveArray) {
            product.add(entry);
        }
        return product;
    }

    public static int[] convertFromArrayList(ArrayList<Integer> fancyArray) {
        int[] product = new int[fancyArray.size()];
        for (int i = 0; i < fancyArray.size(); i ++) {
            product[i] = fancyArray.get(i);
        }
        return product;
    }
}
