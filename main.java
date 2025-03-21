import java.util.*;

public class main {
    public static void main(String[] args) {
        Address ad1 = new Address("Россия", "Казань");
        Address ad2 = new Address("Россия", "Москва");
        Address ad3 = new Address("США", "Чикаго");
        Scanner sc = new Scanner(System.in);
        Map<Address, Integer> costPerAddress = new HashMap<>();
        Set<String> uniqCntrys = new HashSet<String>();
        costPerAddress.put(ad1, 200);
        costPerAddress.put(ad2, 500);
        costPerAddress.put(ad3, 1600);
        int sum = 0;
        int cost = 0;
        boolean isContinue = true;

        while (isContinue) {
            System.out.println("Заполнение нового заказа.\n" +
                    "Введите страну: ");
            String cntry = sc.nextLine();
            System.out.print("");
            System.out.println("Введите город: ");
            String city = sc.nextLine();
            System.out.print("");
            System.out.println("Введите вес (кг): ");
            int weight = Integer.parseInt(sc.nextLine());
            System.out.print("");
            if (cntry.equals("end") || city.equals("end")){
                isContinue = false;
            } else {
                for (Address key: costPerAddress.keySet()) {
                    if (key.country.equals(cntry) && key.city.equals(city)) {
                        sum += weight * costPerAddress.get(key);
                        cost = weight * costPerAddress.get(key);
                        uniqCntrys.add(key.country);

                    }
                }
                if (cost != 0) {
                    System.out.printf("Стоимость доставки составит: %d руб\n" +
                            "Общая стоимость всех доставок: %d руб\n" +
                            "За все время доставка была осуществлена в %d уникальных стран!\n",cost, sum, uniqCntrys.size());
                    } else {
                        System.out.println("Доставки по этому адресу нет");
                    }

                }
            cost = 0;
            }

        }
    }

