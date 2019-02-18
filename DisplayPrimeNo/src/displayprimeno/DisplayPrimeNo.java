
package displayprimeno;

public class DisplayPrimeNo 
{
  
    public static void main(String[] args)
    {
        for(int i=2; i<=100;i++)
        {
                    boolean b=true;

            for(int j=2;j<=i-1;j++)
            {
                if(i%j==0)
                {
                    b=false;
                    break;
                }             
            }
            if(b==true)
            {
                System.out.println(i);                
            }
           
        }
        
    }
    
}
