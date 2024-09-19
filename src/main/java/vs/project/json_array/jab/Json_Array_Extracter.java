import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArrayExample {
    public static void main(String[] args) {
        String jsonArrayStr = "[{\"name\":\"John\",\"city\":\"Chicago\",\"age\":22}," +
                              "{\"name\":\"Gary\",\"city\":\"Florida\",\"age\":35}," +
                              "{\"name\":\"Selena\",\"city\":\"Vegas\",\"age\":18}]";

        JSONArray jsonArray = new JSONArray(jsonArrayStr);

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String name = jsonObject.getString("name");
            String city = jsonObject.getString("city");
            int age = jsonObject.getInt("age");

            System.out.println("Name: " + name + ", City: " + city + ", Age: " + age);
        }
    }
}
