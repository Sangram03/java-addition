class abc
{
int sum (int a, int b)
{
return a+b ;
}
int sum ( int a , int b , int c )
{
return a+b+c ;
}
public static void main (String args[])
{
abc a1 = new abc();
int z = a1.sum(6,90);
System.out.println("the sum=" +z);
int y = a1.sum(5,2,9);
System.out.println("the sum=" +y);
}
}
