package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import p000.o49;

/* JADX INFO: loaded from: classes2.dex */
public enum ShapeStroke$LineJoinType {
    MITER,
    ROUND,
    BEVEL;

    public Paint.Join toPaintJoin() {
        int i = o49.f53843b[ordinal()];
        if (i == 1) {
            return Paint.Join.BEVEL;
        }
        if (i == 2) {
            return Paint.Join.MITER;
        }
        if (i != 3) {
            return null;
        }
        return Paint.Join.ROUND;
    }
}
