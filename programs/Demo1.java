class Demo1
{ 
 int x=10;
 public void add()
 {
  int a=10;
  int b=10;
  int c=a+b;
  System.out.println(c);
}
public static void main(String[] args)
{
 new Demo1().add();
 System.out.println(new Demo1().x);
}
}
