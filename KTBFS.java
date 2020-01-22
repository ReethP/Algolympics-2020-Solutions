import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class KTBFS{

	static void BFS(int [][]coords, int row, int col,int startR, int startC){
	Queue<Node> frontier = new LinkedList<>();
	int boxesTotal = row*col;
	int visited[][] = new int[row][col];
	Node node = new Node(startR,startC,"");
	frontier.add(node);
	visited[startR][startC] = 1;
	int end = 0;
	while(frontier.size()!=0){
		Node currentNode = frontier.remove();
		int x = currentNode.x;
		int y = currentNode.y;
		visited[x][y] = 1;
		if(coords[x][y] == -1) continue;
		if(coords[x][y] == 2){
			System.out.println("Whinny");
			System.out.println(currentNode.moves);
			end = 1;
			break;
		}
		// System.out.println(x+" "+y);
		
		String moves = currentNode.moves;
		if(x-1 >= 0 && y-2 >= 0){
			String move = moves+"A";
			if(visited[x-1][y-2] == 1) continue;
			Node toadd = new Node(x-1,y-2,move);
			// System.out.println(x-1+" "+y-2);
			frontier.add(toadd);
		}
		if(x-2 >= 0 && y-1 >= 0){
			String move = moves+"B";
			if(visited[x-2][y-1] == 1) continue;
			Node toadd = new Node(x-2,y-1,move);
			// System.out.println(x-2," ",y-1);
			frontier.add(toadd);
		}
		if(x-2 >= 0 && y+1 < col){
			String move = moves+"C";
			if(visited[x-2][y+1] == 1) continue;
			Node toadd = new Node(x-2,y+1,move);
			// System.out.println(x-2," ",y+1);
			frontier.add(toadd);
		}
		if(x-1 >= 0 && y+2 < col){
			String move = moves+"D";
			if(visited[x-1][y+2] == 1) continue;
			Node toadd = new Node(x-1,y+2,move);
			// System.out.println(x-1," ",y+2);
			frontier.add(toadd);
		}
		if(x+1 < row && y-2 >= 0){
			String move = moves+"H";
			if(visited[x+1][y-2] == 1) continue;
			Node toadd = new Node(x+1,y-2,move);
			// System.out.println(x+1," ",y-2);
			frontier.add(toadd);
		}
		if(x+2 < row && y-1 >= 0){
			String move = moves+"G";
			if(visited[x+2][y-1] == 1) continue;
			Node toadd = new Node(x+2,y-1,move);
			// System.out.println(x+2," ",y-1);
			frontier.add(toadd);
		}
		if(x+2 < row && y+1 < col){
			String move = moves+"F";
			if(visited[x+2][y+1] == 1) continue;
			Node toadd = new Node(x+2,y+1,move);
			// System.out.println(x+2," ",y+1);
			frontier.add(toadd);
		}
		if(x+1 < row && y+2 < col){
			String move = moves+"E";
			if(visited[x+1][y+2] == 1) continue;
			Node toadd = new Node(x+1,y+2,move);
			// System.out.println(x+1," ",y+2);
			frontier.add(toadd);
		}

	}
	if(end == 0) System.out.println("Neigh");
	
	}

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int cases = Integer.parseInt(sc.nextLine());
		for(int i = 0; i<cases ; i++){
			String ints = sc.nextLine();
			String input[] = ints.split(" ");
		    int row = Integer.parseInt(input[0]);
		    int col = Integer.parseInt(input[1]);
		    int startR = 0;
		    int startC = 0;

			// ArrayList<Integer> coords = new ArrayList<Integer>();
			int coords[][] = new int[row][col]; 	    
		    for(int r = 0; r <row; r++){
		    	String rowInput = sc.nextLine();
		    	for(int c = 0; c < col; c++){
		    		if(rowInput.charAt(c) == 'O'){
		    			coords[r][c] = 0;
		    			continue;
		    		}else if(rowInput.charAt(c) == 'X'){
		    			coords[r][c] = -1;
		    			continue;
		    		}else if(rowInput.charAt(c) == 'K'){
		    			coords[r][c] = 1;
		    			startR = r;
		    			startC = c;
		    			continue;
		    		}else{
		    			coords[r][c] = 2;
		    			continue;}
		    								}
		    							}
		BFS(coords,row,col,startR,startC);



		}
	





	}
}

class Node{
	int x;
	int y;
	String moves;

	public Node(int x, int y, String moves){
		this.x = x;
		this.y = y;
		this.moves = moves;}
}