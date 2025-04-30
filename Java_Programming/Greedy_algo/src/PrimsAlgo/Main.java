package PrimsAlgo;

import java.util.Scanner;

public class Main {
	
	void print(int parent[],int graph[][],int vertex) {
		System.out.println("Edge \tWeight");
		
		for(int i=1;i<vertex;i++) {
			System.out.println(parent[i]+"-"+i+"\t"+graph[parent[i]][i]);
		}
	}
	
	
	
	
	
	int minkey(int key[],boolean mstSET[],int vertex) {
		int min=Integer.MAX_VALUE,min_Ind=-1;
		
		for(int i=0;i<vertex;i++) {
			if(!mstSET[i] && key[i]<min) {
				min=key[i];
				min_Ind=i;
			}
		}
		
		return min_Ind;
	}
	
	
	
	void primsMST(int graph[][],int vertex){
		
		int[] key=new int[vertex];
		int[] parent=new int[vertex];
		boolean[] mstSET=new boolean[vertex];
		
		for(int i=0;i<vertex;i++) {
			key[i]=Integer.MAX_VALUE;
			parent[i]=-1;
			mstSET[i]=false;
		}
		key[0]=0;
		
		for(int i=0;i<vertex-1;i++) {
			int u =minkey(key,mstSET,vertex);
			mstSET[u]=true;
			
			for(int v=0;v<vertex;v++) {
				if(!mstSET[v] &&graph[u][v]!=0&&graph[u][v]<key[v]) {
					parent[v]=u;
					key[v]=graph[u][v];
					
				}
			}
		
		}
		
		print(parent,graph,vertex);
		
		
		
	}

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many vertices are there: ");
        int vertexTot = input.nextInt(); 

        
        int graph[][] = new int[vertexTot][vertexTot];

        //System.out.println("Enter the graph in matrix form (0 for no edge):");

        for (int i = 0; i < vertexTot; i++) {
            for (int j = i; j < vertexTot; j++) { 
                if (i != j) {
                    System.out.print("Weight between " + i + " and " + j + ": ");
                    int weight = input.nextInt();
                    graph[i][j] = weight;
                    graph[j][i] = weight; 
                } else {
                    graph[i][j] = 0; 
                }
            }
        }

        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < vertexTot; i++) {
            for (int j = 0; j < vertexTot; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
        
        Main obj1=new Main();
        
        obj1.primsMST(graph,vertexTot);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
