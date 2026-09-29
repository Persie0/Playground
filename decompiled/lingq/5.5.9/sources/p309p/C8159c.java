package p309p;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: p.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8159c extends Drawable {

    /* JADX INFO: renamed from: a */
    public static final double f44282a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f44283b = 0;

    /* JADX INFO: renamed from: a */
    public static float m16185a(float f3, float f10, boolean z10) {
        if (!z10) {
            return f3 * 1.5f;
        }
        return (float) (((1.0d - f44282a) * ((double) f10)) + ((double) (f3 * 1.5f)));
    }
}
