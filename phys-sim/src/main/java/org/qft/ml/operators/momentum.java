package org.qft.ml.operators;

import org.qft.ml.structure.point;
import org.qft.ml.structure.vectorInterface;

import java.util.ArrayList;
import java.util.List;

public class momentum implements vectorInterface {

    double momX=0;
    double momY=0;
    double momZ=0;

    public momentum(double x, double y, double z){
        this.momX = x;
        this.momY = y;
        this.momZ = z;
    }

    public momentum(double mass, List<Double> velocity){
        try{
            this.momX = mass * velocity.get(0);
            this.momY = mass * velocity.get(1);
            this.momZ = mass * velocity.get(2);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public double getX() {
        return this.momX;
    }

    @Override
    public double getY() {
        return this.momY;
    }

    @Override
    public double getZ() {
        return this.momZ;
    }

    @Override
    public void setX(double x) {
        this.momX = x;
    }

    @Override
    public void setY(double y) {
        this.momY = y;
    }

    @Override
    public void setZ(double z) {
        this.momZ = z;
    }

    @Override
    public List<Double> returnValuesAsList() {
        List<Double> momentumValues = new ArrayList<>();
        momentumValues.add(this.momX);
        momentumValues.add(this.momY);
        momentumValues.add(this.momZ);
        return momentumValues;
    }
}
