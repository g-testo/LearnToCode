package com.asset;

public class Asset {
    private String description;
    private String dataAcquired;
    private double originalCost;

    public Asset(String description, String dataAcquired, double originalCost) {
        this.description = description;
        this.dataAcquired = dataAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public String getDataAcquired() {
        return dataAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public double getValue() {
        return this.originalCost;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "description='" + description + '\'' +
                ", dataAcquired='" + dataAcquired + '\'' +
                ", originalCost=" + originalCost +
                '}';
    }
}
