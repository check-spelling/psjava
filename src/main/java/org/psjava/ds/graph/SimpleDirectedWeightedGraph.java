package org.psjava.ds.graph;

import org.psjava.ds.PSCollection;
import org.psjava.ds.SimpleDirectedWeightedEdge;
import org.psjava.ds.math.Function;

public class SimpleDirectedWeightedGraph<V, W> implements Graph<V, SimpleDirectedWeightedEdge<V, W>> {

    public static <V, W> SimpleDirectedWeightedGraph<V, W> create() {
        return new SimpleDirectedWeightedGraph<V, W>();
    }

    private SimpleDirectedGraph<V, SimpleDirectedWeightedEdge<V, W>> g = SimpleDirectedGraph.create();

    public void insertVertex(V v) {
        g.insertVertex(v);
    }

    public void addEdge(V from, V to, W weight) {
        g.addEdge(new SimpleDirectedWeightedEdge<V, W>(from, to, weight));
    }

    @Override
    public PSCollection<V> getVertices() {
        return g.getVertices();
    }

    @Override
    public Iterable<SimpleDirectedWeightedEdge<V, W>> getEdges(V v) {
        return g.getEdges(v);
    }

    @Override
    public String toString() {
        return g.toString();
    }

    public Function<SimpleDirectedWeightedEdge<V, W>, W> getWeightFunction() {
        return SimpleDirectedWeightedEdge.createWeightFunction();
    }

}
