import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameA = new ArrayList<>();
        ArrayList<String> nameB = new ArrayList<>();
        ArrayList<String> nameC = new ArrayList<>();
        System.out.println("Введите 5 (мужских) имён для списка А --------------");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            nameA.add(scanner.next());
        }
        System.out.println("Ваш список ----------------------");
        System.out.println(nameA);
        System.out.println("Введите 5 (женских) имён для списка В-------------------");

        for (int i = 0; i < 5; i++) {
            nameB.add(scanner.next());
        }
        Collections.reverse(nameB);
        System.out.println("-------------------------------------------------");
        nameC.addAll(nameA);
        nameC.addAll(nameB);
        System.out.println(nameC);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Вот ваши результаты "+ nameC.get(0) + " " +nameC.get(5) +" " +nameC.get(1) + " " +nameC.get(6) + " " +
                nameC.get(2) + " " +nameC.get(7) + " " + nameC.get(3) + " " +nameC.get(8) + " " + nameC.get(4) + " " +nameC.get(9) +
                " " );
    }
}