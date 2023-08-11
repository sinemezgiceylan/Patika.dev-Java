import java.util.*;

public class Brands {

    private int id;
    private String name;
    static Map<Integer, String> brandList = new TreeMap<>();
    private static String[] brandArray = new String[9];


    public Brands(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Brands() {

        brandList.put(1, "Samsung");
        brandList.put(2, "Lenovo");
        brandList.put(3, "Apple");
        brandList.put(4, "Huawei");
        brandList.put(5, "Casper");
        brandList.put(6, "Asus");
        brandList.put(7, "HP");
        brandList.put(8, "Xiaomi");
        brandList.put(9, "Monster");

        brandArray = brandList.values().toArray(new String[0]);
    }

    public static void compare() {

        List<Map.Entry<Integer, String>> sortedBrands = new ArrayList<>(brandList.entrySet());
        Collections.sort(sortedBrands, Comparator.comparing(Map.Entry::getValue));

        System.out.println("Markalarımız\n--------------");
        for (Map.Entry<Integer, String> entry : sortedBrands) {
            System.out.print(" - " + entry.getValue() + "\n");
        }
    }

    public static boolean isThere(String enteredBrand) {
        for (String brand : brandArray) {
            if (enteredBrand.equals(brand)) {
                return true;
            }
        }
        return false;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String[] getBrandArray() {
        return brandArray;
    }

    public static void setBrandArray(String[] brandArray) {
        Brands.brandArray = brandArray;
    }
}
