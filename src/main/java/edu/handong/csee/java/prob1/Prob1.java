package edu.handong.csee.java.prob1;// package name

public class Prob1 { //a class named prob1 is made

	public static void main(String[] args) { //main method

		Friend friend1 = new Friend(); //instantiating friend as friend1
		SchoolFriend friend2 = new SchoolFriend(); //instantiating schoolfriend as friend2
		ClassFriend friend3 = new ClassFriend(); //instacntiating classfriend as friend3

		InstanceOf.whatFriend(friend1); //calling whatfriend method in instanceof class, inputting friend1
		InstanceOf.whatFriend(friend2); //calling whatfriend method in instanceof class, inputting friend2
		InstanceOf.whatFriend(friend3);//calling whatfriend method in instanceof class, inputting friend3
	}
}

