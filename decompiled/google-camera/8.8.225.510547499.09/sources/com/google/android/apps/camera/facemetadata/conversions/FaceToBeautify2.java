package com.google.android.apps.camera.facemetadata.conversions;

import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FaceToBeautify2 {
    public final RectF normalizedBounds;
    public final float normalizingAspectRatio;

    public FaceToBeautify2(RectF rectF, float f) {
        this.normalizedBounds = rectF;
        this.normalizingAspectRatio = f;
    }
}
