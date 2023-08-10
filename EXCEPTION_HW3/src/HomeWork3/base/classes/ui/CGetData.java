package HomeWork3.base.classes.ui;

import HomeWork3.base.abstractClasses.AGetData;
import HomeWork3.base.exceptions.GetDataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.sql.SQLOutput;

public class CGetData extends AGetData {
    BufferedReader reader;

    /**
     * Интерфейс консольного ввода.
     */
    public CGetData() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String getData() throws IOException {
        String text = """
                 ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___                
               |              Enter Data Separated by Spaces:                    |
               |<Surname> <Name> <Patronymic> <Birthday> <PhoneNumber> <Gender>: |
               |    |        |         |           |           |           |     |
               | --------------------------- [dd.mm.yyyy] ------------- ---------|
               |            [string]                       [  only  ]  [f or m]  |
               |                                           [ digits ]            | 
                 --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- 
                """;
        System.out.println(text);
        System.out.print("Enter Data: ");
        String data = "";
        try {
            data = this.reader.readLine();
        }catch (IOException e){
            throw new GetDataException(new IOException());
        }
        return data;
    }
}
