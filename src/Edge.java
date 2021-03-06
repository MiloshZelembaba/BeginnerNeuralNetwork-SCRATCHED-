/**
 * Created by miloshzelembaba on 2017-12-17.
 */
public class Edge {
    private Neuron from;
    private Neuron to;
    private Double weight;

    public Edge(Neuron f, Neuron t, Double w){
        from = f;
        to = t;
        weight = w;
    }

    public void updateWeight(double learningRate, double delta, double val){
        weight += learningRate * delta * val;
    }

    public Neuron getToNeuron(){
        return to;
    }

    public Double getWeight(){
        return weight;
    }
}
