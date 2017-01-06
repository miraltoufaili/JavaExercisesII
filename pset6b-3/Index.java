class Index
{
    public static void main(String[] args)
    
    {   
        System.out.println(indexOf("Barack Obama", "bam"));
    }
    
    public static int indexOf (String s1 , String s2)
    {   
      
        if (s1.length() < s2.length())  // if the smaller string is actually bigger
             { return -1;
        }if (s1.equals(s2)) // if they are equal 
             { return 0;
        }else if (s1.substring(0, s2.length()).equals(s2)) // moving through the string 
             { return 0;
             
       }else  
            { int x = indexOf (s1.substring(1), s2); // store the value
        
                if (x == -1) // if it is -1 then we return it which means it's not there
                {
                    return -1;
                }
                else
                {
                    return 1 + x; // otherwise we return the index
                }
                
            }    
    }
}