package day11;

public class Picker implements Worker {
    private int salary;
    private final Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrders(warehouse.getCountOrders() + 1);
        bonus();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrders() >= 1500) {
            salary *= 3;
            warehouse.setCountOrders(0);
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}