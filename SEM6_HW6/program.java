import java.util.*;

public class program {
    
    public static void main(String[] args) throws Exception {
        
        Note note1 = new Note("HONOR MagicBook X 14 2023 FRI-F56", 16, 512, "Windows 11", "grey", 14.0);
        Note note2 = new Note("Lenovo IdeaPad Gaming 3 15ARH7", 16, 512, "Windows 11", "black", 15.6);
        Note note3 = new Note("Apple Macbook Air 13 M1 2020 MGN63", 8, 256, "MacOs", "grey", 13.3);
        Note note4 = new Note("ASUS TUF Gaming F15 FX506HC-HN004", 16, 512, "no OS", "black", 15.6);
        Note note5 = new Note("Horizont H-book 15", 16, 512, "Windows 11", "blue", 15.6);
        Note note6 = new Note("HP Victus 15-fa0129nw 6Y7X3EA", 16, 512, "Windows 11", "grey", 14.0);

        Set<Note> uniqueNote = new HashSet<Note>();
        uniqueNote.add(note1);
        uniqueNote.add(note2);
        uniqueNote.add(note3);
        uniqueNote.add(note4);
        uniqueNote.add(note5);
        uniqueNote.add(note6);
        System.out.printf("Number of unique notebooks: %d\n", uniqueNote.size());             

        Scanner sc = new Scanner(System.in);
        System.out.println("\nChoose Your Settings:\n1.RAM: ");
        int ramUser = sc.nextInt();
        System.out.println("SSD: ");
        int storUser = sc.nextInt();
        System.out.println("Screen Size: ");
        double digUser = sc.nextDouble();
        
        System.out.println("\nExisting positions:\n");             

        for(Note lap: uniqueNote) {
            if ((lap.getRAM() >= ramUser) && (lap.getSSD() >= storUser)  && lap.getScreenSize() >= digUser){
                System.out.println(lap.toString());                
            }                    
        }
        sc.close();        
    }    
}