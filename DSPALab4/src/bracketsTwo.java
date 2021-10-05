import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class bracketsTwo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Игнатиks\\Desktop\\Fourth1.txt");
        Scanner scanner = new Scanner(file);
        Deque temp = new ArrayDeque();
        Deque bracket = new ArrayDeque();
        while (scanner.hasNext()) {
            temp.add(scanner.nextLine());
        }
        Iterator iterator = temp.iterator();
        int open=0, close=0;
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            char[] ch= s.toCharArray();
            for (int i=0;i<s.length();i++){
                char o = '[';
                char c = ']';
                if (Character.compare(ch[i],o)==0) {
                    open++;
                }
                if (Character.compare(ch[i],c)==0) {
                    close++;
                }
            }
        }
        if (open == close)
            System.out.println("Количество символов совпадает");
        else
            System.out.println("Количество символов не совпадает");
    }
}