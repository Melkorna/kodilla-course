package com.kodilla.testing.shape;

import java.util.Objects;

public class Triagle implements Shape {
    private final static String name = "Triangle";
    private double edgeLengthA;
    private double edgeLengthB;
    private double edgeLengthC;

    public Triagle(double edgeLengthA, double edgeLengthB, double edgeLengthC) {
        this.edgeLengthA = edgeLengthA;
        this.edgeLengthB = edgeLengthB;
        this.edgeLengthC = edgeLengthC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triagle triagle = (Triagle) o;
        return Double.compare(triagle.edgeLengthA, edgeLengthA) == 0
                && Double.compare(triagle.edgeLengthB, edgeLengthB) == 0
                && Double.compare(triagle.edgeLengthC, edgeLengthC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeLengthA, edgeLengthB, edgeLengthC);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        if(checkTriangleCondition()){
            double halfOfCircuit = getHalfOfCircuit();
            return heronsPattern(halfOfCircuit);
        } else {
            return 0;
        }
    }

    private boolean checkTriangleCondition(){
        return(edgeLengthA + edgeLengthB > edgeLengthC &&
                edgeLengthA + edgeLengthC > edgeLengthB &&
                edgeLengthB + edgeLengthC > edgeLengthA);
    }

    private double getHalfOfCircuit(){
        return (edgeLengthA + edgeLengthB + edgeLengthC)/2;
    }

    private double heronsPattern(double halfOfCircuit) {
        return Math.sqrt(halfOfCircuit*(halfOfCircuit-edgeLengthA)*(halfOfCircuit-edgeLengthB)*(halfOfCircuit-edgeLengthC));
    }
}