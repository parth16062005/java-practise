public class stringmethod {
    public static void main(String[] args) {
        String s1="Hello world";
        String s2=new String("Hello world");
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println(s1.length());
        System.out.println(s1.indexOf("ll"));
        System.out.println(s1.indexOf('w'));
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.contains("ll")); 
        String s3=s1.toLowerCase();
        String s4=s1.toUpperCase();
        System.out.println(s3);
        System.out.println(s4);
        String s5=s1.replace("world", "java");
        System.out.println(s5);
        String s6="i love my mom";
        String s7=s6.substring(4,8);
        System.out.println(s7);
        String s8=s1 + s6;
        System.out.println(s8);
        }
}
