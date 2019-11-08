/**
 * Пример, демонстрирующий преобразование XML документа в объект
 */
public class Lab3MainLoad {

    public static void main(String[] args) {

        Shop shop = Lab3XMLService.loadShopFromXML();

        System.out.println(shop);
    }
}