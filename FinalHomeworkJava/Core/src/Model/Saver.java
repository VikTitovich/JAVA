package Model;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Saver {
        public void save(HashMap<String,String> lottery){
            String filePath = "lotteryFile.txt";
            try(FileWriter write = new FileWriter(filePath,true)){
                write.write("Призы участников этой лотереи: \n");
                write.write(lottery.toString());
                write.write("\n");
            }catch (IOException e){
                System.out.println(e.getMessage());
                System.out.println("Writing to the file failed");
            }

        }
    }

