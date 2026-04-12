abstract class WarehouseItem {}

class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public void display(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item.getClass().getSimpleName());
        }
    }
}