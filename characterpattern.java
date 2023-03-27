public class characterpattern {
    
    public void Aalpha(int r)
    {
        for(int c=0; c<6; c++)
        {
            if(((r==0) && (c>0) && (c<5)) || ((r>0) && (c==5)) || ((r>0) && (c==0)) || (r==4))
            {
                System.out.print("#");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.print("  ");
    }
    
    public void Balpha(int r)
    {
        for(int c=0; c<6; c++)
        {
            if(((r==0) && (c<5)) || ((r>0) && (r<7) && (c==5)) || (c==0) || (r==3) || ((r==7) && (c<5)))
            {
                System.out.print("#");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.print("  ");
    }
    
    public void Calpha(int r)
    {
        for(int c=0; c<6; c++)
        {
            if(((c>0) && (r==0)) || ((r>0) && (r<7) && (c==0)) || ((c>0) && (r==7)))
            {
                System.out.print("#");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.print("  ");
    }
    
    public void Dalpha(int r)
    {
        for(int c=0; c<6; c++)
        {
            if(((r==0) && (c<5)) || ((r>0) && (r<7) && (c==5)) || (c==0) || ((r==7) && (c<5)))
            {
                System.out.print("#");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.print("  ");
    }
    
    public void Ealpha(int r)
    {
        for(int c=0; c<6; c++)
        {
            if((r==0) || (c==0) || ((r==3) && (c<4)) || (r==7))
            {
                System.out.print("#");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.print("  ");
    }
    
    
    public void Falpha(int r)
    {
        for(int c=0; c<6; c++)
        {
            if((r==0) || (c==0) || ((r==3) && (c<4)))
            {
                System.out.print("#");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.print("  ");
    }
    
    public void Oalpha(int r)
    {
        for(int c=0; c<6; c++)
        {
            if((r==0) || (c==5) || (c==0) || (r==7))
            {
                System.out.print("#");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.print("  ");
    }
    
}
