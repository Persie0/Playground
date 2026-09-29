package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import p000.o49;

/* JADX INFO: loaded from: classes2.dex */
public enum ShapeStroke$LineCapType {
    BUTT,
    ROUND,
    UNKNOWN;

    public Paint.Cap toPaintCap() {
        int i = o49.f53842a[ordinal()];
        if (i != 1) {
            return i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
        }
        return Paint.Cap.BUTT;
    }
}
