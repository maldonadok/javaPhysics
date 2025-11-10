package org.qft.ml.operators;

import org.qft.ml.structure.point;
import org.qft.ml.structure.vectorInterface;

import java.util.List;

public class hamiltonian implements vectorInterface {

    double mass = 1;
    double energyValue;
    momentum P;
    List<Double> vectorPotential = null;

    public hamiltonian(momentum P, List<Double> vp){
        this.P = P;
        this.vectorPotential = vp;
        this.energyValue = calculateEnergy(this);

    }

    public hamiltonian(double m, momentum P, List<Double> vp){

    }

    double calculateEnergy(hamiltonian h){
        return 0;
    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public double getZ() {
        return 0;
    }

    @Override
    public void setX(double x) {
    }

    @Override
    public void setY(double y) {
    }

    @Override
    public void setZ(double z) {

    }

    @Override
    public List<Double> returnValuesAsList() {
       return null;
    }
}
