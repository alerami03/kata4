package kata4;

import java.io.File;

public class Kata4 {

    public static void main(String[] args) {
        File files = new File("c:\\pub");
        String[] names = files.list();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
