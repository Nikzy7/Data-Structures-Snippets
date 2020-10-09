// C++ program to count all paths from a source to a destination. 
#include <bits/stdc++.h> 

using namespace std; 

// A directed graph using adjacency list 
// representation 
class Graph { 

	// No. of vertices in graph 
	int V; 
	list<int>* adj; 

	// A recursive function 
	// used by countPaths() 
	void countPathsUtil(int, int, int&); 

public: 
	// Constructor 
	Graph(int V); 
	void addEdge(int u, int v); 
	int countPaths(int s, int d); 
}; 

Graph::Graph(int V) 
{ 
	this->V = V; 
	adj = new list<int>[V]; 
} 

void Graph::addEdge(int u, int v) 
{ 

	// Add v to u’s list. 
	adj[u].push_back(v); 
} 

// Returns count of paths from 's' to 'd' 
int Graph::countPaths(int s, int d) 
{ 

	// Call the recursive helper function to print all paths 
	int pathCount = 0; 
	countPathsUtil(s, d, pathCount); 
	return pathCount; 
} 

/* A recursive function to print all paths 
 from 'u' to 'd'. visited[] keeps track of 
 vertices in current path. path[] stores 
 actual vertices and path_index is 
 current index in path[] */
void Graph::countPathsUtil(int u, int d, 
						int& pathCount) 
{ 
	// If current vertex is same as destination, 
	// then increment count 
	if (u == d) 
		pathCount++; 

	// If current vertex is not destination 
	else { 
		// Recur for all the vertices adjacent to 
		// current vertex 
		list<int>::iterator i; 
		for (i = adj[u].begin(); i != adj[u].end(); ++i) 
			countPathsUtil(*i, d, pathCount); 
	} 
} 


int main() 
{ 

	int n,a,b;
	char x;
	cout<<"No. of vertices:";
	cin>>n;
	Graph g(n);
	cin>>a>>b;
	g.addEdge(a, b); 
	while(true)
	{
	cout<<"If want to add edge then press y or Y : ";
	cin>>x;
	if((x=='y') || (x=='Y'))
	{
		cin>>a>>b;
		g.addEdge(a, b); 
	}
	else
	{
		break;
	}
	}
	int s = 0, d = 3; 
	cout <<"No.of paths are:"<<g.countPaths(s, d); 

	return 0; 
} 

