

DOCUMENTING DSA: Sum of Distances in Tree

Problem:
There is an undirected connected tree with n nodes labeled from 0 to n - 1 and n - 1 edges.
Return an array answer of length n where answer[i] is the sum of the distances between the ith node in the tree and all other nodes.
https://leetcode.com/problems/sum-of-distances-in-tree/
(for detailed explanation of question)





Approach 1: Pre order traversal DFS

Idea:
When we move our root from parent to its child (leaf).
We have to sum all node fron each ith index.
convert this adjacency matrix to adjacency series by creating map of integer and a list of integer,we can also write this graph as list of integer array.
After this we will call the dfs method of pre and post order.


Points to note here:
It visits the current node first and then goes to left subtrees.
Total distance is a function of distance and count from previous step and count value is 1
dist[] teturns the sum of distances in subtree[i].
count[i] returns the total number of nodes in the subtree i.


Analysis:

Time complexity:O(N)
Space complexity: O(N)


Code:

int dist[];		//we have to return dist array of size n
int count[];	//counts all nodes in the subtree i(value is 1)


Map<Integer, List<Integer>[] gph= new Hashmap<>();
List<Integer> gph;		//we can also write this graph as array

public int[] sumOfDistancesInTree(int N, int[][] edges)
{
	dist= new  int[N];
	count= new int[N];
	gph= new ArrayList[N];

for(int i=0;i<N;i++)
{
gph[i]= new ArrayList<>();
}
for(int[] edge:edges) 		//for adjacency list
{
	graph.(edge[0]).add.(edge[1]);
   	graph.(edge[1]).add(edge[0]);		//we also have to add their reverse order
}

post order(0,-1);
preorder(0,-1);
return dist;
}

preorder(0,-1);			//you can start this from any index 0 or 1,2 and so on..
void preorderdfs(int node, int parent) {

   for(int next: gph[node])
{
	if(next==parent)
	continue;

	dist[next]=dist[node] - count[next]+gph.length- count[next];			//count[next] cuz we're calculating for each step.
	preorder(next,node);
}
count[node] = count[node]+1;



----------------
Approach 2: Post order traversal DFS




Points to note here:
It visits the current node after visiting the left and right subtrees.
It is actually taking one node and for that node it is successfully returning the total distance.
We  will call the postorderdfs method first and then we"ll calculate count for each step.


Analysis:

Time complexity: O(N)
Space complexity: O(N)


Code:
int dist[];
int count[];

List<Integer>[] gph;
public int[] sumOfDistancesInTree(int N, int[][] edges)
{
	dist= new  int[N];
	count= new int[N];
	gph= new ArrayList[N];

for(int i=0;i<N;i++)
{
gph[i]= new ArrayList<>();
}
for(int[] edge:edges) 
{
	graph.(edge[0]).add.(edge[1]);
   	graph.(edge[1]).add(edge[0]);
}

post order(0,-1);

return dist;
}


void postorderdfs(int node, int parent) {

   for(int next: gph[node])
{
	if(next==parent)
	continue;

	postorderdfs(next,node);
	count[node]=count[node]+count[next];
	
	dist[node]=dist[node]+ dist[next]+count[next];			//count[next] cuz we're calculating for each step.
}
count[node] = count[node]+1;

}