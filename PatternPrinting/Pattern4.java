package PatternPrinting;

public class Pattern4 {
    public static void main(String[] args) {
    for(int row = 1; row <= 5; row++){
        for(int j = 1; j <= row ; j++){
            System.out.print(row +" ");
        }
        System.out.println();
    }
}
}

/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
*/