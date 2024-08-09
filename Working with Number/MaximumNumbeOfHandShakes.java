/*
Maximum number of handshakes
For the number of handshakes to be maximum, every person should hand-shake with every other person in the room

i.e. all persons present should shake hands.

For the first person, there will be N-1 people to shake hands with
For second person, there will be N -1 people available but as he has already shaken hands with the first person, there will be N-1-1 = N-2 shake-hands
For third person, there will be N-1-1-1 = N-3, and So On…
Therefore the total number of handshake   =   ( N – 1 + N – 2 +….+ 1 + 0 )   =   ( (N-1) * N ) / 2.
 */

import java.lang.*;
import java.util.*;
public class MaximumNumbeOfHandShakes{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the No Of People : ");
        int num=scanner.nextInt();
        System.out.println("Maximum No of Handshakes for "+num+" people are : "+((num-1)*num)/2);
        scanner.close();
    }
}

/*
Output :
Enter the No Of People : 30
Maximum No of Handshakes for 30 people are : 435
 */
