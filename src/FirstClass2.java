public class FirstClass2 {

    int multi(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        FirstClass2 fc=new FirstClass2();

        int sum=fc.multi (12,5);
        System.out.println (sum);
    }
}
