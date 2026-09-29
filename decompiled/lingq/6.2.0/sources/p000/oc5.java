package p000;

/* JADX INFO: loaded from: classes.dex */
public final class oc5 {

    /* JADX INFO: renamed from: b */
    public static final float f54170b;

    /* JADX INFO: renamed from: c */
    public static final float f54171c;

    /* JADX INFO: renamed from: d */
    public static final float f54172d;

    /* JADX INFO: renamed from: a */
    public final float f54173a;

    static {
        m17909a(0.0f);
        m17909a(0.5f);
        f54170b = 0.5f;
        m17909a(-1.0f);
        f54171c = -1.0f;
        m17909a(1.0f);
        f54172d = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public static void m17909a(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            j54.m14290c("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m17910b(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == f54170b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == f54171c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == f54172d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oc5) {
            return Float.compare(this.f54173a, ((oc5) obj).f54173a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f54173a);
    }

    public final String toString() {
        return m17910b(this.f54173a);
    }
}
