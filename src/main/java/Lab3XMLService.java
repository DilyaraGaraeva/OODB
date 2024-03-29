import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Lab3XMLService {
    /**
     * метод saveBankData сохраняет объект типа Bank в XML документ
     */
    public static void saveBankData(Shop shop) {

        try {
            JAXBContext context = JAXBContext.newInstance(Shop.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // маршаллинг объекта в файл
            marshaller.marshal(shop, new File("bank.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    /**
     * Метод loadBankFromXML преобразует XML документ в объект типа Bank
     */
    public static Shop loadShopFromXML() {

        try {
            // создаем объект JAXBContext - точку входа для JAXB
            JAXBContext jaxbContext = JAXBContext.newInstance(Shop.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            return (Shop) un.unmarshal(new File("shop.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}
