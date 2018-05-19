package card;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
//import javax.swing.*;
//import javax.swing.event.*;
//import java.util.*;

abstract class Card
{
  String recipient;
  public abstract void greeting();
}

class Holiday extends Card
{
  public Holiday( String r )
  {
    recipient = r;
  }

  public void greeting()
  {
    System.out.println("Dear " + recipient + ",\n");
    System.out.println("Season's Greetings!\n\n");
  }
}

class Birthday extends Card
{
  int age;

  public Birthday ( String r, int years )
  {
    recipient = r;
    age = years;
  }

  public void greeting()
  {
    System.out.println("Dear " + recipient + ",\n");
    System.out.println("Happy " + age + "th Birthday\n\n");
  }
}

class Valentine extends Card
{
  int kisses;

  public Valentine ( String r, int k )
  {
    recipient = r;
    kisses    = k;
  }

  public void greeting()
  {
    System.out.println("Dear " + recipient + ",\n");
    System.out.println("Love and Kisses,\n");
    for ( int j=0; j < kisses; j++ )
      System.out.print("fuck");
    System.out.println("\n\n");
  }
}

class Haloween extends Card{

    String booo;
    int tally;
public Haloween(String b, String r, int t)
{
    booo = b;
    recipient = r;
    tally = t;
}
public void greeting(){
System.out.println("Dear " + recipient + ",\n");
System.out.println("Booooooooh,\n");
System.out.println("your tally:"+ tally);
}
}

class YouthBirthday  extends  Birthday

{
    String pillow;
  public  YouthBirthday ( String r, int years, String p  )
  {
    super ( r, years );
    pillow = p;
  }

  public void greeting(String til)
  {
    super.greeting();
    System.out.println("How you have grown!!\n");
    System.out.println("Ass shit " + pillow);
    System.out.println("Ass shit " + til);
  }
}

public class CardTester
{
  public static void main ( String[] args )
  {
    String me;
    String st;
    Scanner input = new Scanner( System.in );
    System.out.print("Your name: ");
    me = input.next();
    
    Card[] cards = new Card[15];

cards[0] = new YouthBirthday( "Valerie", 7 ,"");
cards[1] = new YouthBirthday( "Walter", 47,"" );
cards[2] = new Birthday( "Zoe", 30 );
cards[3] = new Holiday( "Kelly" );
cards[4] = new Valentine( "Jill", 42 );

for ( int j=0; j <= 4; j++ )
  cards[j].greeting();

    Holiday   hol = new Holiday( me );
    hol.greeting();

    Birthday  bd  = new Birthday( me, 21 );
    bd.greeting();

    Valentine val = new Valentine( me, 7 );
    val.greeting();
    
    
    System.out.print("Your boooo: ");
    st = input.next();
  Haloween hal = new Haloween(st,me, 7 );
    hal.greeting();
    
     Card card = new Holiday( "Amy" );
    card.greeting(); 
    
  YouthBirthday tr = new YouthBirthday("fill her", 54, "Wrapshit");
   tr.greeting();
    tr.greeting("Wrabbit");
  }
}
