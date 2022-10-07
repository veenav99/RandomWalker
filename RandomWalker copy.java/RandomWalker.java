public class RandomWalker{
    public static void main(String[] args){
        int x = 0; 
        int y = 0;
        int n = Integer.parseInt(args[0]);
        double sum = 0;
        System.out.println("("+x+","+y+")");
        for (int foot = 1; foot <= n; foot++)
        {
            double r = Math.random();

            if (r < 0.25)
            {
                x++;
                sum += x;
            }
            else if (r < 0.5)
            {
                y--;
                sum += y;
            }
            else if (r < 0.75)
            {
                x--;
                sum += x;
            }
            else if (r < 1)
            {
                y++;
            }
            System.out.println("Squared sum");
            
           
        }
  
    }
}