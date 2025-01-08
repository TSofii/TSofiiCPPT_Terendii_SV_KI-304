package Lab6;

public class Main {
    public static void main(String[] args) {
        Lab6.Storage<Lab6.Product> storage = new Lab6.Storage<>();

        // Додаємо різні типи товарів у сховище
        storage.addItem(new Lab6.ElectronicProduct("Laptop", 1500));
        storage.addItem(new Lab6.GroceryProduct("Apple", 1.5));
        storage.addItem(new Lab6.ElectronicProduct("Smartphone", 800));
        storage.addItem(new Lab6.GroceryProduct("Milk", 1.2));
        storage.addItem(new Lab6.ElectronicProduct("Laptop", 1500));
        storage.addItem(new Lab6.ElectronicProduct("Laptop", 1500));
        storage.addItem(new Lab6.ElectronicProduct("Laptop", 1500));

        System.out.println("Кількість товарів у сховищі: " + storage.getItemCount());
        System.out.println("Найдорожчий товар у сховищі: " + storage.getMaxItem());
        main(storage);
    }
    public static void main (Lab6.Storage<Lab6.Product> storage)
    {
        int count = 0;
        for (Lab6.Product product : storage.getItems())
        {
            if (product instanceof Lab6.ElectronicProduct) {
                count++;
            }
        }
        System.out.println("ElectronicProduct: " + count);
    }
}



