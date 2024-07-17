public class functionpanda {
    public static void main(String[] args) {
        String Name = "parth";
        int Age = 19;
        String [] hobbies = {"dance","drawing"};
        introduce(Name,Age,hobbies);
        }
        public static void introduce(String Name,int Age,String [] hobbieS){
            System.out.println(Name);
            System.out.println(Age);
            for(String hobby:hobbieS){
                System.out.println(hobby);
            }
        }
}
