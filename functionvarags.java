public class functionvarags {
    static float getavg(float... varags){
        float total = 0;
        System.out.println(varags.getClass().getSimpleName());
        for(float num:varags){
            total += num;
        }
        return total / varags.length;

    }
    public static void main(String[] args) {
        float avg1=getavg(2,5,6,7,8,9);
        
        float avg2=getavg(1,5,9);
        System.out.println(avg1);
        System.out.println(avg2);
    }
    
}
