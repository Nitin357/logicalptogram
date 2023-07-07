package logicalprogram;

public class ReverseStringLogicalProgram {

    public static void main(String [] args)
    {
        String originalString= "ABCDEFG";
        String reverseString= "";

        System.out.println("Original:-"+ originalString);
        //method-1 by using StringBuilder
        StringBuilder str=new StringBuilder();
        str.append(originalString);
        System.out.println("method-1:-"+str.reverse());
        //method-2--by using split
        String [] splitSting=originalString.split("") ;
        System.out.print("method-2:-");
        for(int i=splitSting.length-1; i>=0; i--)
        {
            System.out.print(splitSting[i]+"");
        }
        //method-3--by using charAt()
        System.out.println("");
        for(int i=originalString.length()-1; i>=0;i--)
        {
            reverseString= reverseString+originalString.charAt(i);
        }
        System.out.print("method-3:-"+reverseString);

    }
}
