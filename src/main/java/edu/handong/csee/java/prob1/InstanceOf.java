package edu.handong.csee.java.prob1; //package name

public class InstanceOf { //class named instancof is made

	public static void whatFriend(Friend friend) // a method with static void type is made
	{
		if(friend instanceof ClassFriend) //if statement to find if its classfriend
			((ClassFriend) friend).classFriend(); // if it is classfriend, the it calls classfriend

		else if(friend instanceof SchoolFriend)//if statement to find if its schoolfriend
			((SchoolFriend) friend).schoolFriend(); //if its schoolfriend, it calls schoolfriend

		else //else statement to find the last option
			friend.justFriend(); //else then it calls the justfriend

	}
}

