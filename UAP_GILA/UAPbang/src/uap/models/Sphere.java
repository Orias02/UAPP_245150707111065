package uap.models;

import uap.bases.BaseCetakan;
import uap.interfaces.*;

public class Sphere extends BaseCetakan implements VolumeCalculator, SurfaceAreaCalculator, MassCalculator, DeliveryCostCalculator {
    private static final double PI = 22.0 / 7.0;
    private static final double TEBAL = 0.5;
    private double jariJari;

    public Sphere(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void hitungVolume() {
        volume = (4.0 / 3.0) * PI * Math.pow(jariJari, 3);
    }

    @Override
    public void hitungLuasPermukaan() {
        luasPermukaan = 4 * PI * Math.pow(jariJari, 2);
    }

    @Override
    public void hitungMassa() {
        massa = luasPermukaan * TEBAL * 8; // densitas stainless 304 ~ 8 g/cm³
    }

    @Override
    public int hitungBiayaKirim() {
        double kg = massa / 1000;
        int kgBulat = (int) Math.ceil(kg);
        return kgBulat * 10000;
    }

    public double getMassaKg() {
        return massa / 1000;
    }
}
