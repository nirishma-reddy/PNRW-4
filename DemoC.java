public class DemoC
{
public static void main(String[] args)
{
String str = "Welcome Back Nirishma";
System.out.println("String: "+str);
int pos = 7;
char rep = 'p';
String res = str.substring(0, pos) + rep + str.substring(pos + 1);
System.out.println("String after replacing a character: "+res);
}
}