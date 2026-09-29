package com.airbnb.lottie.model.content;

/* JADX INFO: loaded from: classes2.dex */
public enum PolystarShape$Type {
    STAR(1),
    POLYGON(2);

    private final int value;

    PolystarShape$Type(int i) {
        this.value = i;
    }

    public static PolystarShape$Type forValue(int i) {
        for (PolystarShape$Type polystarShape$Type : values()) {
            if (polystarShape$Type.value == i) {
                return polystarShape$Type;
            }
        }
        return null;
    }
}
