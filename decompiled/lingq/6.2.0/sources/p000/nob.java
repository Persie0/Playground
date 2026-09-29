package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nob {

    /* JADX INFO: renamed from: a */
    public static final C0282a f53080a = new C0282a(-932914098, false, new jd1(28));

    /* JADX INFO: renamed from: b */
    public static final C0282a f53081b = new C0282a(803631217, false, new jd1(29));

    /* JADX INFO: renamed from: a */
    public static final double m17572a(int i, double d) {
        double d2 = 1.0d;
        for (int i2 = 0; i2 < i; i2++) {
            d2 *= 10.0d;
        }
        return Math.rint(d * d2) / d2;
    }

    /* JADX INFO: renamed from: b */
    public static String m17573b(double d) {
        if (d >= 1.0E9d) {
            return String.format(ux5.m22989l("%.", 1, "f M+"), Arrays.copyOf(new Object[]{Double.valueOf(d / 1.0E9d)}, 1));
        }
        if (d >= 1000000.0d) {
            return String.format(ux5.m22989l("%.", 1, "f M"), Arrays.copyOf(new Object[]{Double.valueOf(d / 1000000.0d)}, 1));
        }
        int i = (int) d;
        return d - ((double) i) == 0.0d ? String.valueOf(i) : String.format(ux5.m22989l("%.", 1, "f"), Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
    }
}
