package lemubit.academy;

public class Store {

    int size;

    public Store(int size) {
        this.size = size;
    }

    void size(Store s) {
        if (size > s.size) {
            System.out.println("Larger");
        } else {
            System.out.println("Smaller");
        }
    }
}
