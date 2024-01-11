package Association;

public class BoyFriend {
private String boyName;
private GirlFriend girlFriend;
public BoyFriend(String boyName,GirlFriend girlFriend) {
	this.boyName = boyName;
	this.girlFriend = girlFriend;
	
}
public static void main(String[] args) {
	GirlFriend gf = new  GirlFriend("sita");
	BoyFriend bf  = new BoyFriend("mike thyson",gf);
	System.out.println(bf.boyName);
	System.out.println(bf.girlFriend.getGirlName());
}

}
