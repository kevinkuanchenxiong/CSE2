//Kevin Xiong
//SECOND HOMEWORK
//Arithmetic Class Java Program
//Number of pairs of socks

//Define a class
public class Arithmetic{

//add main method    
    public static void main(String[] args){
        int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
        double sockCost$=2.58;

//Number of drinking glasses
        int nGlasses=6;
//Cost per glass
        double glassCost$=2.29;

//Number of boxes of envelopes
        int nEnvelopes=1;
//cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;

        double totalSockCost$=nSocks*sockCost$;   //total cost of socks
        double totalGlassCost$=nGlasses*glassCost$;   //total cost of glasses
        double totalEnvelopeCost$=nEnvelopes*envelopeCost$;   //total cost of envelopes

        double sockTax$=(int)(totalSockCost$*taxPercent*100)/100.0;  //tax of socks
        double glassTax$=(int)(totalGlassCost$*taxPercent*100)/100.0;  //tax of glasses
        double envelopeTax$=(int)(totalEnvelopeCost$*taxPercent*100)/100.0;  //tax of envelopes

        double totalCostExceptTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;     //total cost without tax
        double totalTax$=(int)(totalCostExceptTax$*taxPercent*100)/100.0;       //total tax
        double totalCostIncludeTax$=totalCostExceptTax$+totalTax$;        //tatal cost with tax

//print the receipt
        System.out.println("Item"+"       "+"Price"+"      "+"Number"+"     "+"Total Cost"+"     "+"Tax");
        System.out.println("Sock"+"       "+sockCost$+"       "+nSocks+"          "+totalSockCost$+"           "+sockTax$);
        System.out.println("Glass"+"      "+glassCost$+"       "+nGlasses+"          "+totalGlassCost$+"          "+glassTax$);
        System.out.println("Envelope"+"   "+envelopeCost$+"       "+nEnvelopes+"          "+totalEnvelopeCost$+"           "+envelopeTax$);
        System.out.println("-------------------------Summary-----------------------");
        System.out.println("Total cost before Tax: "+totalCostExceptTax$);
        System.out.println("Total tax: "+totalTax$);
        System.out.println("Total cost including tax: "+totalCostIncludeTax$);
        }
}
