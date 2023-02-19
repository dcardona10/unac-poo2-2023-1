import java.util.*;

public class PersonalData {

    public static void main(String[] args) {
        
        Map<Integer, String> data = new HashMap<Integer, String>();
        int option;
        int id;
        String name;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("*****Data*****");
            System.out.println("1. Create Person Record");
            System.out.println("2. Get Person By ID");
            System.out.println("3. Delete Person");
            System.out.println("4. List of People");
            System.out.println("5. Total People");
            System.out.println("0. Exit");
            option = scan.nextInt();
            switch(option) {
                case 1:
                    System.out.println("ID: ");
                    id = scan.nextInt();
                    System.out.println("Name: ");
                    name = scan.next();
                    data.put(id, name);
                    break;
                case 2:
                    System.out.println("ID to query: ");
                    id = scan.nextInt();
                    System.out.println(data.get(id));
                    break;
                case 3:
                    System.out.println("ID to delete: ");
                    id = scan.nextInt();
                    data.remove(id);
                    break;
                case 4:
                    data.values().forEach((String s) -> System.out.println(s));
                    break;
                case 5:
                    System.out.println(data.size());
            }
        } while (option != 0);
    }
}
