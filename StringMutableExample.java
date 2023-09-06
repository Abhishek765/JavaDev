public class StringMutableExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("hello");

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" World");

        sb.insert(6, "World2-");
        System.out.println(sb);

        String newStr = sb.toString();

    }
}
