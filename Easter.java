//Carson Kim
//This program will calculate the date easter falls on given the year after 1584
import java.util.*;
public class Easter{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
  int a;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g; 
  int h;
  int i;
  int k;
  int r;
  int m;
  int n;
  int p;
a = y%19;
System.out.println("a = "+a);
b = y/100;
c = y%100;
System.out.println("b = "+b);
System.out.println("c = "+c);
d = b/4;
e = b%4;
f=(b+8)/25;
g=(b-f+1)/3;
h=(19 * a + b - d - g + 15)%30;
i=c/4;
k=c%4;
r=(32 + 2 * e + 2 * i - h - k)%7;
m=(a + 11 * h + 22 * r)/451;
n=(h + r - 7 * m + 114)/31;
p=(h + r - 7 * m + 114)%31;
System.out.println("d = "+d);
System.out.println("f = "+f);
System.out.println("e = "+e);
System.out.println("g = "+g);
System.out.println("h = "+h);
System.out.println("i = "+i);
System.out.println("k = "+k);
System.out.println("r = "+r);
System.out.println("m = "+m);
System.out.println("n = "+n);
System.out.println("p = "+p);
System.out.println("Easter will fall on "+n+"/"+(p+1)+" in "+y);
  }}
    


