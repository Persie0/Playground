package p066d7;

import com.clevertap.android.sdk.C2181a;

/* JADX INFO: renamed from: d7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5052d {

    /* JADX INFO: renamed from: a */
    public static final int f32898a;

    /* JADX INFO: renamed from: b */
    public static final int f32899b;

    /* JADX INFO: renamed from: c */
    public static C5051c f32900c;

    static {
        int iMaxMemory = ((int) Runtime.getRuntime().maxMemory()) / 1024;
        f32898a = iMaxMemory;
        f32899b = Math.max(iMaxMemory / 32, 20480);
    }

    /* JADX INFO: renamed from: a */
    public static void m10730a() {
        boolean z10;
        synchronized (C5052d.class) {
            try {
                synchronized (C5052d.class) {
                    try {
                        z10 = f32900c.size() <= 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z10) {
            C2181a.m6455h("CTInAppNotification.ImageCache: cache is empty, removing it");
            f32900c = null;
        }
    }
}
