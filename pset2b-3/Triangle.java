class Triangle
{
    public static void main(String[] args)
    
    {   int x=120;
        int y=0;
        
        for(int row=1; row<=9; row++)
        
            { 
                System.out.print(x);
                    System.out.print("   ");
                for(int j=0; j<row; j++)
                    {
                             y= x+2*(row-1);
                        for(int k=0; k<j; k++)
                            {
                            System.out.print(y);
                            System.out.print("   ");
                            y= y+2*(row-1);
                           }
                    }
                   
            System.out.println();
            x=x+80;
            
            }
    }   
}