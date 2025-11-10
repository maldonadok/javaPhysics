package org.qft.ml.structure;

import java.util.List;

public interface vectorInterface {
    double x = 0;
    double y = 0;
    double z = 0;
    double getX();
    double getY();
    double getZ();
    void setX(double x);
    void setY(double y);
    void setZ(double z);
    List<Double> returnValuesAsList();
}
