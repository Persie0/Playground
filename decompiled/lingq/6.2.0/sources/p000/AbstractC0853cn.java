package p000;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: cn */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0853cn {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f10296a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final qz2 f10297b = new qz2(1);

    /* JADX INFO: renamed from: c */
    public static final qz2 f10298c = new qz2(0);

    /* JADX INFO: renamed from: d */
    public static final qz2 f10299d = new qz2(2);

    /* JADX INFO: renamed from: e */
    public static final DecelerateInterpolator f10300e = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public static float m4878a(float f, float f2, float f3) {
        return AbstractC3393o1.m17726a(f2, f, f3, f);
    }

    /* JADX INFO: renamed from: b */
    public static float m4879b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : m4878a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* JADX INFO: renamed from: c */
    public static int m4880c(int i, float f, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}
