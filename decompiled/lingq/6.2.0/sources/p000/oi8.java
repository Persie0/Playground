package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oi8 extends Drawable {

    /* JADX INFO: renamed from: a */
    public static final double f54380a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    public static float m18033a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f54380a) * ((double) f2)) + ((double) f));
    }

    /* JADX INFO: renamed from: b */
    public static float m18034b(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f54380a) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
