package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pic {

    /* JADX INFO: renamed from: a */
    public static final C0282a f56280a = new C0282a(300849403, false, new yd1(25));

    /* JADX INFO: renamed from: b */
    public static final C0282a f56281b = new C0282a(227264825, false, new yd1(26));

    /* JADX INFO: renamed from: c */
    public static final C0282a f56282c = new C0282a(932635988, false, new zd1(25));

    /* JADX INFO: renamed from: d */
    public static final C0282a f56283d = new C0282a(-1251639949, false, new zd1(26));

    /* JADX INFO: renamed from: a */
    public static final void m19187a(int i, int i2) {
        if (i2 > i) {
            return;
        }
        ij6.m13956n("Random range is empty: [", Integer.valueOf(i), ", ", Integer.valueOf(i2), ").");
    }

    /* JADX INFO: renamed from: b */
    public static final int m19188b(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX INFO: renamed from: c */
    public static final int m19189c(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
