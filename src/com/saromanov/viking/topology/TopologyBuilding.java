package com.saromanov.viking.topology;

/**
 * Created by motorcode on 18.06.16.
 */
public class TopologyBuilding implements Topology {
    private String topologyName;
    public TopologyBuilding() {
        this.topologyName = "default";
    }

    public TopologyBuilding(String name){
        this.topologyName = name;
    }
    @Override
    public boolean AddSource(Source source) {
        return false;
    }
}
