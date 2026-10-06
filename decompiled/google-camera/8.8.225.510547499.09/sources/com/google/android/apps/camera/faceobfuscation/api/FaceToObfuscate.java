package com.google.android.apps.camera.faceobfuscation.api;

import android.graphics.PointF;
import android.graphics.RectF;
import p000.dss;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class FaceToObfuscate {
    /* JADX INFO: renamed from: c */
    public static dss m4118c(int i, RectF rectF) {
        dss dssVar = new dss();
        dssVar.f12507a = i;
        dssVar.f12511e = (byte) (dssVar.f12511e | 1);
        dssVar.f12508b = rectF;
        return dssVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract float mo4119a();

    /* JADX INFO: renamed from: b */
    public abstract int mo4120b();

    public abstract RectF bounds();

    public abstract float faceRoll();

    public abstract PointF leftEye();

    public abstract PointF rightEye();
}
