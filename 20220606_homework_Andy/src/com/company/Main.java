package com.company;

import com.company.onlineStore.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        onlineStore();

        System.out.println(reverseList());
        System.out.println(filteredNames());
    }

    /**
     * Допустим, у нас есть магазин. В нашем магазине есть товары трех категорий:
     * продукты, электроника(мобильные телефоны и ноутбуки), одежда.
     * У каждого товара есть цена и наименование.
     * <p>
     * Каждый товар можно купить (покупателю выставляется счет с цена).
     * при покупки продуктов выставляется дополнительная цена за срочность доставки.
     * при покупке электроники, покупателю предлагается оформить дополнительную гарантию.
     * Телефоны продаются только с контрактом оператора.
     * на отдельные категории иногда товаров действует скидка
     * Необходимо создать соответствующую структуру классов
     */
    public static void onlineStore()
    {
        List<Product> products = new ArrayList<>();

        Product tshirt = new Clothing("T-Shirt Party Hard", 19.99, 0.10);
        Product samsungGalaxy = new MobilePhone("Samsung Galaxy S3", 629.11, 0, true);
        Product pizza = new Food("Pizza Margarita", 21.11, 0.05);
        Product lenovo = new Laptop("Lenovo X3", 871.11, 0, true);

        products.add(tshirt);
        products.add(samsungGalaxy);
        products.add(pizza);
        products.add(lenovo);

        for (Product product : products) {
            Invoice purchaseInvoice = product.purchase();

            System.out.println(purchaseInvoice);
        }
    }

    /**
     * Дан лист Integer. Необходимо написать метод, который возвращает лист
     * аналогичный заданному, но "перевернутый" задом наперед.
     * (1, 4,2,9) ->(9,2,4,1)
     */
    public static List<Integer> reverseList() {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(4);
        numberList.add(2);
        numberList.add(9);

        List<Integer> returnList = new ArrayList<>();

        for (int i = numberList.size() - 1; i >= 0; i--) {
            returnList.add(numberList.get(i));
        }

        return returnList;
    }

    /**
     * Дан лист с именами. Необходимо получить лист в котором присутствуют
     * имена из исходного листа, но только те, что короче 3 символов.
     */
    public static List<String> filteredNames() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Dasti");
        nameList.add("Flo");
        nameList.add("Fibi");
        nameList.add("Xi");
        nameList.add("Ca");
        nameList.add("Jan");
        nameList.add("Mark");

        List<String> outList = new ArrayList<>();

        for (int i = 0; i < nameList.size(); i++) {
            String name = nameList.get(i);
            if (name.length() < 3) {
                outList.add(name);
            }
        }

        return outList;
    }
}
