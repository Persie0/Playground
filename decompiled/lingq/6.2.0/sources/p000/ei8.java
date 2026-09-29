package p000;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ei8 implements ao9, zn9 {

    /* JADX INFO: renamed from: h */
    public static final TreeMap f37291h = new TreeMap();

    /* JADX INFO: renamed from: a */
    public volatile String f37292a;

    /* JADX INFO: renamed from: b */
    public final long[] f37293b;

    /* JADX INFO: renamed from: c */
    public final double[] f37294c;

    /* JADX INFO: renamed from: d */
    public final String[] f37295d;

    /* JADX INFO: renamed from: e */
    public final byte[][] f37296e;

    /* JADX INFO: renamed from: f */
    public final int[] f37297f;

    /* JADX INFO: renamed from: g */
    public int f37298g;

    public ei8(int i) {
        int i2 = i + 1;
        this.f37297f = new int[i2];
        this.f37293b = new long[i2];
        this.f37294c = new double[i2];
        this.f37295d = new String[i2];
        this.f37296e = new byte[i2][];
    }

    /* JADX INFO: renamed from: a */
    public final p33 m11161a() {
        return new p33(mo2959x(), new cg7(this, 14));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.zn9
    /* JADX INFO: renamed from: g */
    public final void mo3711g(int i, double d) {
        this.f37297f[i] = 3;
        this.f37294c[i] = d;
    }

    @Override // p000.zn9
    /* JADX INFO: renamed from: j */
    public final void mo3712j(int i, long j) {
        this.f37297f[i] = 2;
        this.f37293b[i] = j;
    }

    @Override // p000.zn9
    /* JADX INFO: renamed from: k */
    public final void mo3713k(int i, byte[] bArr) {
        this.f37297f[i] = 5;
        this.f37296e[i] = bArr;
    }

    @Override // p000.zn9
    /* JADX INFO: renamed from: m */
    public final void mo3714m(int i) {
        this.f37297f[i] = 1;
    }

    @Override // p000.zn9
    /* JADX INFO: renamed from: t */
    public final void mo3716t(int i, String str) {
        this.f37297f[i] = 4;
        this.f37295d[i] = str;
    }

    @Override // p000.ao9
    /* JADX INFO: renamed from: x */
    public final String mo2959x() {
        String str = this.f37292a;
        if (str != null) {
            return str;
        }
        C3386nv.m17633t("Required value was null.");
        return null;
    }

    @Override // p000.ao9
    /* JADX INFO: renamed from: z */
    public final void mo2960z(zn9 zn9Var) {
        int i = this.f37298g;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.f37297f[i2];
            if (i3 == 1) {
                zn9Var.mo3714m(i2);
            } else if (i3 == 2) {
                zn9Var.mo3712j(i2, this.f37293b[i2]);
            } else if (i3 == 3) {
                zn9Var.mo3711g(i2, this.f37294c[i2]);
            } else if (i3 == 4) {
                String str = this.f37295d[i2];
                if (str == null) {
                    C3386nv.m17626m("Required value was null.");
                    return;
                }
                zn9Var.mo3716t(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.f37296e[i2];
                if (bArr == null) {
                    C3386nv.m17626m("Required value was null.");
                    return;
                }
                zn9Var.mo3713k(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }
}
