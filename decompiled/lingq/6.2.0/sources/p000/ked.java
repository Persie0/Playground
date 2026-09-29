package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ked {
    /* JADX INFO: renamed from: a */
    public static float m15163a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX INFO: renamed from: b */
    public static float m15164b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* JADX INFO: renamed from: c */
    public static int m15165c(int i, float f, int i2) {
        if (i == i2 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float fM15163a = m15163a(((i >> 16) & 255) / 255.0f);
        float fM15163a2 = m15163a(((i >> 8) & 255) / 255.0f);
        float fM15163a3 = m15163a((i & 255) / 255.0f);
        float fM15163a4 = m15163a(((i2 >> 16) & 255) / 255.0f);
        float fM15163a5 = m15163a(((i2 >> 8) & 255) / 255.0f);
        float fM15163a6 = m15163a((i2 & 255) / 255.0f);
        float fM17726a = AbstractC3393o1.m17726a(f3, f2, f, f2);
        float fM17726a2 = AbstractC3393o1.m17726a(fM15163a4, fM15163a, f, fM15163a);
        float fM17726a3 = AbstractC3393o1.m17726a(fM15163a5, fM15163a2, f, fM15163a2);
        float fM17726a4 = AbstractC3393o1.m17726a(fM15163a6, fM15163a3, f, fM15163a3);
        float fM15164b = m15164b(fM17726a2) * 255.0f;
        float fM15164b2 = m15164b(fM17726a3) * 255.0f;
        return Math.round(m15164b(fM17726a4) * 255.0f) | (Math.round(fM15164b) << 16) | (Math.round(fM17726a * 255.0f) << 24) | (Math.round(fM15164b2) << 8);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m15166d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
