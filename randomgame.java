public class randomgame {
    public static void main(String[] args) {
        while(true){
            int num=(int)(Math.random() * 10+1);
            if(num==5)
            break;
            System.out.print("the  random no. that is generated"+" ");
            System.out.println(num+" ");

        }
    }
}
