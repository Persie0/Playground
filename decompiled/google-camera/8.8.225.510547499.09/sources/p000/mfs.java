package p000;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfs {

    /* JADX INFO: renamed from: a */
    public static final TimeInterpolator f40383a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final TimeInterpolator f40384b = new akf();

    /* JADX INFO: renamed from: c */
    public static final TimeInterpolator f40385c = new ake();

    /* JADX INFO: renamed from: d */
    public static final TimeInterpolator f40386d = new akg();

    /* JADX INFO: renamed from: e */
    public static final TimeInterpolator f40387e = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public static float m16340a(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        if (f5 >= f4) {
            return f2;
        }
        return f + (((f5 - f3) / (f4 - f3)) * (f2 - f));
    }

    /* JADX INFO: renamed from: b */
    public static int m16341b(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
