public class FirstClass {

    int sun(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        FirstClass fc=new FirstClass ();

        int sum=fc.sun (12,5);
        System.out.println (sum);
    }
}
