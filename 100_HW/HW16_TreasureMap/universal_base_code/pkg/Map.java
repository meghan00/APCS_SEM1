package pkg;
import java.util.Scanner;
import java.util.Random;


public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureX;		// Hidden treasure location X coordinate
	int treasureY;		// Hidden treasure location Y coordinate
	int posX;			// Current X position of the player
	int posY;			// Current Y position of the player

	/*
		Initialize the 2D array map with width and height lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	public Map(int width, int height){
		map = new int[width][height];
		posX=0;
		posY=0;
		map[posX][posY]=2;
	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		treasureX = (int)(Math.random()*map.length);
		treasureY = (int)(Math.random()*map[0].length);
	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Integer paramter m for move represents the below commands:
		1 - up
		2 - down
		3 - left
		4 - right
		5 - left up
		6 - right up
		7 - left down
		8 - right down

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int m){
		if((m==1)&&(posX!=0)){	//up
			map[posX][posY]=map[posX][posY]-2;
			posX--;
			map[posX][posY]=map[posX][posY]+2;
		}
		else if((m==2)&&(posX!=map.length-1)){  // down
			map[posX][posY]=map[posX][posY]-2;
			posX++;
			map[posX][posY]=map[posX][posY]+2;
		}
		else if((m==3)&&(posY!=0)){
			map[posX][posY]=map[posX][posY]-2;
			posY--;
			map[posX][posY]=map[posX][posY]+2;
		}
		else if((m==4)&&(posY!=map[0].length)){
			map[posX][posY]=map[posX][posY]-2;
			posY++;
			map[posX][posY]=map[posX][posY]+2;
		}
		else if((m==5)&&(posY!=0)&&(posX!=0)){
			map[posX][posY]=map[posX][posY]-2;
			posX--;
			posY--;
			map[posX][posY]=map[posX][posY]+2;
		}
		else if((m==6)&&(posY!=map[0].length)&&(posX!=0)){
			map[posX][posY]=map[posX][posY]-2;
			posX--;
			posY++;
			map[posX][posY]=map[posX][posY]+2;
		}
		else if((m==7)&&(posY!=0)&&(posX!=map.length)){
			map[posX][posY]=map[posX][posY]-2;
			posX++;
			posY--;
			map[posX][posY]=map[posX][posY]+2;
		}
		else if((m==8)&&(posY!=map[0].length)&&(posX!=map.length)){
			map[posX][posY]=map[posX][posY]-2;
			posX++;
			posY++;
			map[posX][posY]=map[posX][posY]+2;
		}
		else{
			return false;
		}
		return true;	// Dummy value to make work
	}

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int row, int col){
		if((row<=map.length)&&(row>=0)){
			map[posX][posY]=map[posX][posY]-2;
			posX=row;
			posY=col;
			map[posX][posY]=map[posX][posY]+2;
		}
		else{
			return false;
		}
		return true;	// Dummy value to make work
	}

	/*
		This method checks for treasure!
		Check the current position of the player
		Adding 1 indicates that the spot has been searched for treasure.
			Only check unchecked spots.
		Returns true if treasure was found, false otherwise.
	*/
	public boolean dig(){
		if((posX==treasureX)&&(posY==treasureY)){
//			map[posX][posY]=map[posX][posY]+5;
			return true;
		}
		else{
			map[posX][posY]=map[posX][posY]+1;
			return false;
		}
	}

	/*
		This method prints the location of the treasure.
		Set the map value of the treasure to 7 (7 is the lucky number!)
		Print where the treasure was
		Call printMap()
	*/
	public void printTreasureLoc(){
		System.out.println("The treasure was at "+treasureX+","+treasureY);
		map[treasureX][treasureY]=5;
		printMap();
	}

	/*
		Print the entire map of the 2D array.
	*/
	public void printMap(){
		
		for(int r=0; r<map.length; r++){
			System.out.print("| ");
			for(int c=0; c<map[0].length; c++){
				System.out.print(map[r][c]+" ");
			}
			System.out.println("|");
		}

	}

}
