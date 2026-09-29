package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class om8 {

    /* JADX INFO: renamed from: a */
    public static final long[] f54590a = {-9187201950435737345L, -1};

    static {
        new n66(0);
    }

    /* JADX INFO: renamed from: a */
    public static final int m18108a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    /* JADX INFO: renamed from: b */
    public static final int m18109b(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    /* JADX INFO: renamed from: c */
    public static final int m18110c(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static final int m18111d(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }
}
