class simpleintrest
{
public static void main(String[] args)
{
int p=5000,r=2,t=12,omi,totalint,totalamt;
omi=p*r/100;
System.out.println("The One month intrest is "+omi);
totalint=omi*t;
System.out.println("The Total Intrest is "+totalint);
totalamt=p+totalint;
System.out.println("Your payable Amount is "+totalamt);
}
}