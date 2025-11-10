package org.qft.ml.structure;

import java.util.ArrayList;
import java.util.List;

// A simple point of space described by coordinates
public class point implements vectorInterface{
    // Let's let default values be 0 for now.
    public double x = 0;
    public double y = 0;
    public double z = 0;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public List<Double> returnValuesAsList() {
        List<Double> toReturn = new ArrayList<>();
        toReturn.add(this.x);
        toReturn.add(this.y);
        toReturn.add(this.z);
        return toReturn;
    }

    public point(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // return midpoint in 3 dimensions
    public point getMidpoint(point a, point b){
        double midX = ( b.getX() + a.getX() ) /2;
        double midY = ( b.getY() + a.getY() ) /2;
        double midZ = ( b.getZ() + a.getZ() ) /2;
        return new point(midX,midY,midZ);
    }

    public point getDistanceAsPoint(point a, point b) {
        double distX = b.getX() - a.getX();
        double distY = b.getY() - a.getY();
        double distZ = b.getZ() - a.getZ();
        return new point(distX,distY,distZ);
    }

    public Double getDistanceAsScalarValue(point a, point b) {
        double distX = b.getX() - a.getX();
        double distY = b.getY() - a.getY();
        double distZ = b.getZ() - a.getZ();
        return Math.sqrt(distX+distY+distZ);
    }
}

