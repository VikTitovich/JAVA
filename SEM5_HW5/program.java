import java.util.*;

public class program {

    public static void main(String[] args) {
        
        Map<String, ArrayList> abonents = new HashMap<>() {
            {
                put("Зайцев", new ArrayList<Integer>() {
                    {
                        add(7451233);
                        add(5126336);
                        add(3065252);
                    }
                });
                put("Лойко", new ArrayList<Integer>() {
                    {
                        add(1501505);
                    }
                });
                put("Нестеренко", new ArrayList<Integer>() {
                    {
                        add(4528529);
                        add(9635652);

                    }
                });
                put("Жоголь", new ArrayList<Integer>() {
                    {
                        add(8111122);
                        add(8639610);
                        add(7521245);
                    }
                });
            }
        };

    Scanner sc = new Scanner(System.in,"cp866");
    Boolean getOut = false;
    String command;
    while(!getOut){
        System.out.println("Choose Number: (1 - print abonets, 2 - add contact, 9 - EXIT.): ");
        command = sc.nextLine();
        switch (command) {
            case "1":
                sortedPrint(abonents);
                break;
            case "2":
                addContact(abonents);
                System.out.println("Contact added\n");
                break;
            case "9":
                getOut = true;
                System.out.println();
                break;
            default:
                break;
        }
    }
}

static void addContact(Map<String, ArrayList> map){
        Scanner sc = new Scanner(System.in,"cp866");
        String surname;
        String phone;
        System.out.println("Enter Surname: ");
        surname = sc.nextLine();
        if (!map.containsKey(surname)){
            System.out.println("Enter phone numbers sorted by commas: ");
            phone = sc.nextLine();
            String[] arr = phone.split(",");
            ArrayList<Integer> arrInt = new ArrayList<>();
            for (String item: arr) {
                arrInt.add(Integer.parseInt(item.trim())) ;
            }
            map.put(surname, arrInt);
            System.out.println();
        }
        else{
            System.out.println("This name already exists.");
        }
    }

static void sortedPrint(Map<String, ArrayList> map) {

        Set<String> keySet = map.keySet();

        int maxCount = 0;
        int minCount = 1_000_000;

        for (var item : map.entrySet()) {
            if (maxCount < item.getValue().size())
                maxCount = item.getValue().size();
            if (minCount > item.getValue().size())
                minCount = item.getValue().size();

        }

        Stack<String> st = new Stack<>();
        int num = minCount;
        while (num <= maxCount) {
            for (var item : map.entrySet()) {
                if (item.getValue().size() == num) {
                    st.push(item.getKey());
                }
            }
            num += 1;
        }

        String name;
        for (int i = 0; i < keySet.size(); i++) {
            name = st.pop();
            for (var item : map.entrySet()) {
                if (name == item.getKey()) {
                    System.out.printf("%8s: ", item.getKey());
                    System.out.println(item.getValue());
                }
            }
        }
        System.out.println();
    }

}