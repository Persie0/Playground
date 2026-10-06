package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abu {
    /* JADX INFO: renamed from: a */
    public static int m159a(Context context, int i) {
        return context.getColor(i);
    }

    /* JADX INFO: renamed from: b */
    public static Object m160b(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: c */
    static String m161c(Context context, Class cls) {
        return context.getSystemServiceName(cls);
    }

    /* JADX INFO: renamed from: d */
    public static float m162d(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int iMin = Math.min((int) (200.0f * f), 199);
        float f2 = f - (iMin * 0.005f);
        float f3 = fArr[iMin];
        return f3 + ((f2 / 0.005f) * (fArr[iMin + 1] - f3));
    }
}
