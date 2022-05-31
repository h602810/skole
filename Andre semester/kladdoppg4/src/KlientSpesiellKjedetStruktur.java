package src;

public class KlientSpesiellKjedetStruktur{ 
	  
    public static void main(String[] args){ 
        SpesiellKjedetStruktur<Character> spesiell = new SpesiellKjedetStruktur<>(); 
         
        String streng = "Hippsann Hoppsann!"; 
         
        int lengde = streng.length(); 
 
        for(int i = 0; i < lengde; i++){ 
            spesiell.leggTil((streng.charAt(i))); 
        } 
        System.out.println(spesiell);    
                   
        spesiell.snuKjedetStruktur(); 
              
        System.out.println(spesiell); 
        
        int r = spesiell.finnAntalLik('p');
        System.out.println(r);
        
        spesiell.leggTilBak('!', '?');
        System.out.println(spesiell); 

       
     }//main 
       
   }//class
