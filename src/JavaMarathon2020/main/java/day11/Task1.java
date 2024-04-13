package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        System.out.println(warehouse + " " + picker + " " + courier);

        picker.doWork();
        courier.doWork();
        System.out.println(warehouse + " " + picker + " " + courier);

        for (int i = 0; i < 1500; i++) {
            picker.doWork();
            courier.doWork();
        }
        System.out.println(warehouse + " " + picker + " " + courier);

        for (int i = 0; i < 1500; i++) {
            picker.doWork();
            courier.doWork();
        }
        System.out.println(warehouse + " " + picker + " " + courier);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        System.out.println(warehouse2 + " " + picker2 + " " + courier2);

        picker2.doWork();
        courier2.doWork();
        System.out.println(warehouse2 + " " + picker2 + " " + courier2);

        System.out.println(warehouse + " " + picker + " " + courier);

    }
}
