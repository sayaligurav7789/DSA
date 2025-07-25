
public class min {
    public static void main(String[] args) {

        int num[]={21,34,-56,-73,34};
        int size=5;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<size;i++) 
        {
            if(num[i]<smallest)
            {
                smallest=num[i];
            }
        }
        System.out.println(smallest);
    }
}
