package projects;
import java.util.*;
public class Cricket {
	
	public static void Team(String km,String v) {
		System.out.println(km+" vs "+v);
	}
	public static void Scoreboard(int wicket,double over,int ball,int target) {
		System.out.println("Wicket: "+wicket);
		System.out.println("Over: "+over);
		System.out.println("Ball: "+ball);
		System.out.println("target: "+target);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Cricket");
		System.out.println("Enter the team name");
		String ch=in.nextLine();
		System.out.println("Enter the second team name");
		String ch2=in.nextLine();
		Team(ch,ch2);
		int wicket =0;
		int po=10;
		double over =20.0d;
		int ball =120;
		Random n=new Random();
		int target =n.nextInt(100, 200);
		Scoreboard(po,over,ball,target);
		int ball1=0;
		int score = 0;
		int y=0;
		while(ball1<=ball) {
			System.out.println("ball: "+ball1);
			System.out.println("Over: "+over);
			System.out.println("Enter the number");
			int bat=in.nextInt();
			
			int com=n.nextInt(0, 10);
			System.out.println(ch+" choose number: "+bat);
			System.out.println(ch2+" choose number: "+com);
			y+=bat+com;
			 
			System.out.println(y+" / "+wicket);
			if(bat == com) {
				wicket++;
				po--;
				y+=0;
				System.out.println(y+" / "+wicket);
			}
			if(po==0 && wicket==10) {
				System.out.println("Team "+ch+" lost by "+y);
				return;
			}
			if(y>target) {
				System.out.println("Team "+ch+" won by "+y);
				return;
			}
			ball1++;
			
		}

	}

}
