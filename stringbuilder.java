public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I love java");
        sb.append(" and python");
        System.out.println(sb);
        sb.insert(11, ", gaming");
        System.out.println(sb);
        sb.replace(2, 6, "like");
        System.out.println(sb);
        sb.delete(11, 19);
        System.out.println(sb);
        String s1=sb.toString();
        System.out.println(s1);
    }
}
