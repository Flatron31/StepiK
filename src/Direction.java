import java.io.IOException;
import java.util.Arrays;

public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT;

    public static class Quiz {
        public static void main(String[] args) {
            Robot.moveRobot(new Robot(DOWN, 3, -1), -2, 5);

        }
    }

    public static class Example {
        public static void main(String[] args) throws IOException {
    //        Collection<?> collection = new ArrayList<Object>();;
    //        Object object = new Object();
    //        collection.iterator();
    //        collection.toArray();
    //        collection.contains(object);
    //        collection.add(object);
    //        collection.size();
    //        collection.clear();
    //        collection.addAll(Arrays.asList(object));

    //        System.out.println(Consumer.factorial.calculateFactorial(50));
    //
    //        String name = "Ы";
    //        byte [] bytes = name.getBytes(StandardCharsets.UTF_8);
    //        for (int i = 0; i < bytes.length; i++){
    //            System.out.println(Byte.toUnsignedInt(bytes[i]));
    //        }

    ////////////////////////////////////////////////////////////////////////////////////////
    //        Задача 2.3 - 10

    //        String s = "Madam!";
    //        String pat = s.replaceAll("[^a-zA-Z0-9]", "");
    //        StringBuilder revers =  new StringBuilder(pat).reverse();
    //        boolean check = pat.toLowerCase().equals(revers.toString().toLowerCase());
    //        return check;
    ////////////////////////////////////////////////////////////////////////////////////////
    //        Задача 5.3 - 12

    //        byte [] buf = new byte[]{48, 49, 50, 51};
    //        Charset charset = Charset.forName("ASCII");
    //        ByteArrayInputStream inputStream = new ByteArrayInputStream(buf);
    //        Reader reader = new InputStreamReader(inputStream, charset);
    //        StringWriter writer = new StringWriter();
    //        int b;
    //        while ((b = reader.read()) != -1) {
    //            writer.write(b);
    //        }
    //        String res = writer.toString();
    //        System.out.println(res);
    ////////////////////////////////////////////////////////////////////////////////////////

            int [] a1 = new int[]{6};
            int [] a2 = new int[]{1, 3, 5};
            int [] res = new int[a1.length + a2.length];
            int count = 0;
            for (int i = 0; i < a1.length; i++){
                res[i] = a1[i];
                count++;
            }
            for (int i = 0; i < a2.length; i++){
                res[count] = a2[i];
                count++;
            }
            Arrays.sort(res);

            for (int i = 0; i < res.length; i++){
                System.out.print(res[i]);
            }






        }
    }
}
