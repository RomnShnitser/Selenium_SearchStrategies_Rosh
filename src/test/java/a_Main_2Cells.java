import java.util.*;

public class a_Main_2Cells {
    public static void main(String[] args) {

        ArrayList<String> arrMain = new ArrayList<>();
        String s;

        for (int i = 0; i < 1000000; i++) {
            s = "";
            Random r = new Random();
            int cell_1 = r.nextInt(2);
            int cell_2 = r.nextInt(3);
            int cell_3 = r.nextInt(2);
            s = s + cell_1 + cell_2 + cell_3;
            if(arrMain.contains(s)) {
                continue;
            }
            else {
                arrMain.add(s);
            }
        }

        arrMain.sort(null);

        //dfgdfgdfg
        //Hello
        System.out.println(arrMain);
        System.out.println(arrMain.size());

    }
}
