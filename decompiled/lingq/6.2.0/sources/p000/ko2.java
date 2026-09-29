package p000;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class ko2 {

    /* JADX INFO: renamed from: a */
    public static final float f47599a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b */
    public static final double f47600b;

    /* JADX INFO: renamed from: c */
    public static final double f47601c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f47600b = dLog;
        f47601c = dLog - 1.0d;
    }
}
