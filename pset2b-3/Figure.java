class Figure
{
public static void main(String[] args)
{
    drawFigure();
}

public static void drawFigure()
{
    for (int line = 1; line <= 5; line++)
    {
for (int i = 1; i< 4*line-3 ; i++ ) 
       {
            System.out.print("\\");
        }
for (int i = 1; i<=(8*(5-line));i++) 
       {
            System.out.print("*");
        }
for (int i = 1; i<= 5*(line-1) ;i++) {
            System.out.print("/");
        }
        System.out.println();
    }
}}