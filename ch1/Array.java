public class Array 
{
    
    public static void main(String[] args)
    {
        int[] a = new int[]{1};
        int[] b = {1};
        int[] c = new int[1];
        int []d = new int[1];
        int e[] = new int[1];
        
        int[][] arrays = new int[][]{a,b,c,d,e};
        
        int count = 0;
        for(int[] array: arrays)
        {
            System.out.println("array #: "+ count);
            count++;

            for(int i: array)
            {
                System.out.println("i: "+i);
            }
        }
    }
}
