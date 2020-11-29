package com.algorithms.greedy;

/*
 * Spanning Tree: Given a connected and undirected graph, a spanning tree of that graph is a subgraph that is a tree and connects all the vertices together.
 * 
 * A minimum spanning tree has (V – 1) edges where V is the number of vertices in the given graph.
 * 
 * A graph can have multiple spanning trees
 * 
 * Minimum Spanning Tree:  a spanning tree with weight less than or equal to the weight of every other spanning tree.
 * 
 * The weight of a spanning tree is the sum of weights given to each edge of the spanning tree.
 * 
 * Algorithm:
 * 
 * 1. Sort all the edges in non-decreasing order of their weight.
 * 2. Pick the smallest edge. Check if it forms a cycle with the spanning tree formed so far. If cycle is not formed, include this edge. Else, discard it.
 * 3. Repeat step#2 until there are (V-1) edges in the spanning tree.
 * 
 * */
public class KruskalMST {

}
