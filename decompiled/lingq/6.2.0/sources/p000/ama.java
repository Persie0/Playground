package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class ama {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f850a = 0;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f851b = 0;

    /* JADX INFO: renamed from: a */
    public static void m576a(int i, int i2) {
        String strM17392c;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM17392c = ndd.m17392c("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C3386nv.m17626m(ux5.m22988k(i2, "negative size: "));
                    return;
                }
                strM17392c = ndd.m17392c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM17392c);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m577b(int i, int i2, int i3) {
        String strM578c;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM578c = m578c(i, "start index", i3);
            } else {
                strM578c = (i2 < 0 || i2 > i3) ? m578c(i2, "end index", i3) : ndd.m17392c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM578c);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m578c(int i, String str, int i2) {
        if (i < 0) {
            return ndd.m17392c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return ndd.m17392c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C3386nv.m17626m(ux5.m22988k(i2, "negative size: "));
        return null;
    }
}
