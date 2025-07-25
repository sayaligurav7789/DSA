
public class max {
    public static void main(String[] args) {

        int num[]={21,34,-56,-73,99};
        int size=5;
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<size;i++) 
        {
            if(num[i]>largest)
            {
                largest=num[i];
            }
        }
        System.out.println(largest);
        
    }
    
}
