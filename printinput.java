public class printinput {

    public void printString(String name){

        int size = (name.length())*8;

        characterpattern charObject = new characterpattern();

        for(int i=0; i<size; i++)
        {
            System.out.print("-");
        }

        System.out.println();
        
        for(int r=0; r<8; r++)
        {
            for(int i=0; i<name.length(); i++)
            {
                switch (name.charAt(i)) {

                    case 'A':
                    charObject.Aalpha(r);
                    break;
                    
                    case 'B':
                    charObject.Balpha(r);
                    break;

                    case 'C':
                    charObject.Calpha(r);
                    break;
                    
                    case 'D':
                    charObject.Dalpha(r);
                    break;
                    
                    case 'E':
                    charObject.Ealpha(r);
                    break;

                    case 'F':
                    charObject.Falpha(r);
                    break;

                }
            }
            System.out.println();
        }
        for(int i=0; i<size; i++)
        {
            System.out.print("-");
        }
    }
}
