import java.util.*;

public class Playerlist {
	private int playerid;
	private String playername;
	private int age;
	private String team;
	Playerlist(int pid,String pname,int age,String team) 
	{
		this.playerid=pid;
		this.playername=pname;
		this.age=age;
		this.team=team;
		
	}
	
	public static void main(String[] args) {
		

	}

	@Override
	public String toString() {
		return "Playerlist [playerid=" + playerid + ", playername=" + playername + ", age=" + age + ", team=" + team
				+ "]";
	}

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
class MainPlayers{
	
	public static void main(String[] args) {
		ArrayList<Playerlist>players=new ArrayList();
		players.add(new Playerlist(7,"Dhoni",46,"CSK"));
		players.add(new Playerlist(18,"Viratkohli",32,"RCB"));
		players.add(new Playerlist(17,"Raina",40,"CSK"));
		players.add(new Playerlist(47,"Rohit",37,"MI"));
		players.add(new Playerlist(111,"Russel",40,"KKR"));
		players.add(new Playerlist(41,"Shreyesh",36,"KKR"));
		players.add(new Playerlist(3,"Gill",26,"GT"));
		for(Playerlist player:players)
		{
			if(player.getPlayername().equals("Dhoni"));
			{
				System.out.println(player);
			}
		}
		
	}

}