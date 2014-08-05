package org.psjava.algo.graph.dfs;

import org.psjava.ds.graph.Graph;
import org.psjava.ds.graph.DirectedEdge;
import org.psjava.ds.map.MutableMap;

public class MultiSourceDFS {

	public static <V, E extends DirectedEdge<V>> void traverse(Graph<V, E> adj, Iterable<V> visitOrder, DFSVisitor<V, E> visitor) {
		MutableMap<V, DFSStatus> status = DFSCore.createInitialStatus(adj.getVertices());
		for (V v : visitOrder)
			if (status.get(v) == DFSStatus.NOT_DISCOVERED)
				DFSCore.traverse(adj, status, v, visitor);
	}

	private MultiSourceDFS() {
	}

}
