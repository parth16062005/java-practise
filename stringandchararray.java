public class stringandchararray {
    public static void main(String[] args) {
        String s1="hello String";
        char[]arr={'h','e','l','l','o',' ','s','t','r','i','n','g'};
        System.out.println(s1);
        System.out.println(arr);

        char[]arr2=s1.toCharArray();
        System.out.println(arr2);

        String str2= new String(arr);
        System.out.println(str2);
    }
}
