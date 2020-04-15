package methods;

public class FindIntersection {

   // FindIntersection fi = new FindIntersection();

    public static String findIntersection(String[] strArr) {
        // code goes here
        String[] stringArr1 = strArr[0].split(", ");
        String[] stringArr2 = strArr[1].split(", ");
        String result = "";

        for (int i = 0; i < stringArr1.length; i++) {
            for (int j = 0; j < stringArr2.length; j++) {
                if (stringArr1[i].equals(stringArr2[j])) {
                    result += stringArr1[i] += ",";
                }
            }
        }
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        // keep this function call here
        //Scanner s = new Scanner(System.in);
        // System.out.print(methods.FindIntersection(new String[]{s.nextLine()}));
        //String[] strArr = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        //String[] strArr = new String[] {"1,2,3,4,5", "1,2,3,4,5"};
        String[] strArr = new String[]{"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"};

        // System.out.println(methods.FindIntersection(strArr));
    }

}

