package programmer.zaman.now.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Gson gson = new Gson();

        Person person = new Person("Sauqi");
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
