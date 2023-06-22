// Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос.

// Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

// Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow

public class program1 {
    public static void main(String[] args) {
        String text = "{\"name\":\"Ivanov\", \"country\":\"null\", \"city\":\"Moscow\", \"age\":\"42\"}";
        String text1 = text.substring(1, text.length() - 1);
        String[] keyWithValue = text1.split(", ");
        StringBuilder result = new StringBuilder();
        boolean flag = true;

        for (String item : keyWithValue) {
            String[] keyValue = item.split(":" );
            String key = keyValue[0].replace("\"", ""); 
            String value = keyValue[1].replace("\"", ""); 
            if (!value.equalsIgnoreCase("null")) {
                if(flag==false)
                result.append(" AND ");
            result.append(key).append("=").append(value);
            flag = false; 
            }  
        }
        String sql = "SELECT * FROM students WHERE " + result.toString();
        System.out.println(sql);          
    }
}