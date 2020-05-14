package lemubit.academy;


public class Main {

    public static void main(String[] args) {

        var store = new Store(770);
        var store2 = new Store(90);

        operateNum(Store::size, store, store2);

    }

    static void operateNum(Operation op, Store store, Store store2) {
        op.execute(store, store2);
    }

    interface Operation {
        void execute(Store store, Store store2);
    }

}
