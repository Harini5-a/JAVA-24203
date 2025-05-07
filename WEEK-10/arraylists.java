import java.util.ArrayList;

public class arraylists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Papaya");
        fruits.add(1, "Orange"); 
        System.out.println("after adding : " + fruits);
        fruits.set(2, "Mango"); 
        System.out.println("after changing : " + fruits);
        String element = fruits.get(1); 
        System.out.println("element 1 : " + element);
        fruits.remove(3);
        System.out.println("after removing: " + fruits);
        fruits.clear();
        System.out.println("after clearing: " + fruits);
        System.out.println("Harini Kasi");
        System.out.println("CSE-C");
        System.out.println("AV.SC.U4CSE24203");
    }
}
