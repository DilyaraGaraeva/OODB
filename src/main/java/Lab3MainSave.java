import java.util.ArrayList;
import java.util.List;

/**
 * Пример, демонстрирующий сохранение (marshalling) объекта в XML документ
 */
public class Lab3MainSave {

    public static void main(String[] args) {

        // Создаем объект банк
        Shop shop = new Shop();

        // Создаем объекты - клиенты банка
        Buyer buyer1 = new Buyer("Иван","Иванов","80809","kfb");
        Buyer buyer2 = new Buyer("Петр","Петров","7786866","gbvb");

        // Добавляем объекту client1 расчетный счет
        ShopAccount account = new ShopAccount(1299876);
        List<ShopAccount> accounts = new ArrayList<>();
        accounts.add(account);
        buyer1.setAccounts(accounts);

        List<Buyer> buyers = new ArrayList<>();
        buyers.add(buyer1);
        buyers.add(buyer2);

        // Прикрепляем клиентов к банку
        shop.setBuyers(buyers);

        // сохраняем объект в в XML документ
        Lab3XMLService.saveBankData(shop);
    }
}