package com.thehecklers.aircraftfn;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.Objects;

@Node
public class Aircraft {
    @Id
    @GeneratedValue
    private long id;
    private String adshex, reg, type;

    public Aircraft(String adshex, String reg, String type) {
        this.adshex = adshex;
        this.reg = reg;
        this.type = type;
    }

    public String getAdshex() {
        return adshex;
    }

    public void setAdshex(String adshex) {
        this.adshex = adshex;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "adshex='" + adshex + '\'' +
                ", reg='" + reg + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return Objects.equals(adshex, aircraft.adshex) && Objects.equals(reg, aircraft.reg) && Objects.equals(type, aircraft.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adshex, reg, type);
    }
}
