package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class rla {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f59507a = 0;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f59508b = 0;

    /* JADX INFO: renamed from: a */
    public static void m20707a(int i, int i2) {
        String strM24459b;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM24459b = xcd.m24459b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C3386nv.m17626m(ux5.m22988k(i2, "negative size: "));
                    return;
                }
                strM24459b = xcd.m24459b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM24459b);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m20708b(int i, int i2) {
        if (i < 0 || i > i2) {
            v63.m23143u(m20710d(i, "index", i2));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m20709c(int i, int i2, int i3) {
        String strM20710d;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM20710d = m20710d(i, "start index", i3);
            } else {
                strM20710d = (i2 < 0 || i2 > i3) ? m20710d(i2, "end index", i3) : xcd.m24459b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM20710d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m20710d(int i, String str, int i2) {
        if (i < 0) {
            return xcd.m24459b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return xcd.m24459b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C3386nv.m17626m(ux5.m22988k(i2, "negative size: "));
        return null;
    }
}
