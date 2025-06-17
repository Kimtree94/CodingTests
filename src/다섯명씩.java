public class 다섯명씩 {
    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

        for (int i = 0; i < names.length; i += 5) {
            String[] answer = new String[]{names[i]};
            System.out.println("names = " + answer[i]);
        }
    }
}
