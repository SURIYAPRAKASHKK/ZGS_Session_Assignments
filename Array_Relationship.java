package com.zohoGS.Tasks;

public class Array_Relationship {

	public static void main(String[] args) {

		String [][] members = {{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"},{"xxxxx","wayne"},{"fdwf","shaw"}};

		String input = "rooney";
		int count = 0;

		//if(input != )

		for(int i = 0; i < members.length; i++) {

			if(members[i][1] == input) {  //searching input as a father
				System.out.println("Child of "+input+" : "+members[i][0]);  //children of given input

				System.out.println("GrandChildren of "+members[i][1]+":");

				for(int j = 0; j < members.length; j++) {   

					//searching that child's children
					if(members[i][0] == members[j][1]) {
						count++;
						System.out.println(members[j][0]);
					}

				}


			}

		}
		System.out.println("Count of Grandchildren of given member: "+ count);

	}

}
