package Dijkstras;

import java.util.Scanner;

public class Main {
	
	void printSolution(int dest[],int V) {
		System.out.println("Vertex"+"\tDistance from src");
		for(int i =0;i<V;i++) {
			System.out.println(i+"\t"+dest[i]);
		}
	}
	
	int minDis( int dest[],boolean sptSET[],int V) {
		int min=Integer.MAX_VALUE,minInd=-1;
		
		for(int i=0;i<V;i++) {
			if(!sptSET[i]&&dest[i]<min) {
				min=dest[i];
				minInd=i;
			}
		}
		
		return minInd;
		
	}
	
	void Dijkastras(int graph[][],int src,int V) {
		int [] dest=new int[V];
		boolean[] sptSET=new boolean[V];
		
		for(int i=0;i<V;i++) {
			dest[i]=Integer.MAX_VALUE;
			sptSET[i]=false;
		}
		
		dest[src]=0;
		
		for(int i=0;i<V-1;i++) {
			int u= minDis(dest,sptSET,V);
			sptSET[u]=true;
			
			for(int v=0;v<V;v++) {
				if(!sptSET[v] && graph[u][v]!=0 && dest[u]!=Integer.MAX_VALUE&& dest[u]+graph[u][v]<dest[v]) {
					dest[v]=graph[u][v]+dest[u];
				}
			}
		}
		
		printSolution(dest,V);
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("NO of vertex:");
		int V=input.nextInt();
		
		int [][] graph=new int[V][V];
		
		
		for(int i=0;i<V;i++) {
			for(int j=i;j<V;j++) {
				if(i==j)
					graph[i][j]=0;
				else {
					System.out.print("weight from "+i+" to "+j+": ");
					graph[i][j]=input.nextInt();
					graph[j][i]=graph[i][j];
					
				}
			}
		}
		
		System.out.println("adajancy matrix:");
		for(int i=0;i<V;i++) {
			for(int j=0;j<V;j++) {
				System.out.print(graph[i][j]+"\t");

			}
			System.out.print("\n");
		}
		
		Main obj =new Main();
		obj.Dijkastras(graph,0,V);
		input.close();
	
	}

}
