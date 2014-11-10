package org.psjava.ds.graph;

import org.psjava.ds.Collection;

public class MutableDirectedUnweightedGraph<V> implements Graph<V, DirectedEdge<V>> {

	public static <V> MutableDirectedUnweightedGraph<V> create() {
		return new MutableDirectedUnweightedGraph<V>();
	}

	private MutableDirectedGraph<V, DirectedEdge<V>> graph = MutableDirectedGraph.create();

	public void insertVertex(V v) {
		graph.insertVertex(v);
	}

	public void addEdge(V from, V to) {
		graph.addEdge(SimpleDirectedEdge.create(from, to));
	}

	@Override
	public Collection<V> getVertices() {
		return graph.getVertices();
	}

	@Override
	public Iterable<DirectedEdge<V>> getEdges(V v) {
		return graph.getEdges(v);
	}

	@Override
	public String toString() {
		return graph.toString();
	}

}