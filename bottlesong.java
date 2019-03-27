public class cc{
 public static void main(String[]args){
int i;
for(i=99;i>0;i--)
{
if(i==1)
{
System.out.println(i+"bottle of beer on the wall,"+i+"bottle of beer.");
System.out.println("Take one down.");
System.out.println("Pass it around.");
System.out.println("No more bottle of beer on the walln");
}
else if(i==2)
{
System.out.println(i+"bottles of beer on the wall,"+i+"bottles of beer.");
System.out.println("Take one down.");
System.out.println("Pass it around.");
System.out.println((i-1)+"bottle of beer on the wall\n");
}
else
{
System.out.println(i+"bottles of beer on the wall,"+i+"bottles of beer.");
System.out.println("Take one down.");
System.out.println("Pass it around.");
System.out.println((i-1)+"bottles of beer on the wall\n");
}
}
}
}
