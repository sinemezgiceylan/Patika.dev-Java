import java.util.Comparator;

public class BrandNameComparator implements Comparator<Brands> {
    @Override
    public int compare(Brands b1, Brands b2) {
        return b1.getName().compareTo(b2.getName());
    }
}
