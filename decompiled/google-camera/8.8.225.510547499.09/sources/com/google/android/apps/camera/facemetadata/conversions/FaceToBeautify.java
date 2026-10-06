package com.google.android.apps.camera.facemetadata.conversions;

import android.graphics.Point;
import android.graphics.Rect;
import p000.kvd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class FaceToBeautify {
    /* JADX INFO: renamed from: a */
    public static kvd m4117a(Rect rect) {
        kvd kvdVar = new kvd();
        if (rect == null) {
            throw new NullPointerException("Null bounds");
        }
        kvdVar.f37321d = rect;
        return kvdVar;
    }

    public abstract Rect bounds();

    public abstract Float confidence();

    public abstract float[] faceAttributes();

    public abstract Integer index();

    public abstract Point leftEarTragion();

    public abstract Point leftEye();

    public abstract Point mouthCenter();

    public abstract Point noseTip();

    public abstract Float panAngleDegrees();

    public abstract Point rightEarTragion();

    public abstract Point rightEye();
}
