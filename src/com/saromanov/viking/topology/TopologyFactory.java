package com.saromanov.viking.topology;

/**
 * Created by motorcode on 19.06.16.
 */


public class TopologyFactory {
    public TopologyBuilding getTopology(TopologyEnum top){
        if (top == TopologyEnum.DEFAULT) return new TopologyBuilding();
        return null;
    }
}
