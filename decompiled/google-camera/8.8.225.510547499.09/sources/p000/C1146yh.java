package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: yh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1146yh implements Comparable {

    /* JADX INFO: renamed from: a */
    public static int f48127a = 1;

    /* JADX INFO: renamed from: b */
    public boolean f48128b;

    /* JADX INFO: renamed from: f */
    public float f48132f;

    /* JADX INFO: renamed from: n */
    int f48140n;

    /* JADX INFO: renamed from: c */
    public int f48129c = -1;

    /* JADX INFO: renamed from: d */
    int f48130d = -1;

    /* JADX INFO: renamed from: e */
    public int f48131e = 0;

    /* JADX INFO: renamed from: g */
    public boolean f48133g = false;

    /* JADX INFO: renamed from: h */
    final float[] f48134h = new float[9];

    /* JADX INFO: renamed from: i */
    final float[] f48135i = new float[9];

    /* JADX INFO: renamed from: j */
    C1140yb[] f48136j = new C1140yb[16];

    /* JADX INFO: renamed from: k */
    int f48137k = 0;

    /* JADX INFO: renamed from: l */
    public int f48138l = 0;

    /* JADX INFO: renamed from: m */
    boolean f48139m = false;

    public C1146yh(int i) {
        this.f48140n = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m19639a(C1140yb c1140yb) {
        int i = 0;
        while (true) {
            int i2 = this.f48137k;
            if (i >= i2) {
                C1140yb[] c1140ybArr = this.f48136j;
                int length = c1140ybArr.length;
                if (i2 >= length) {
                    this.f48136j = (C1140yb[]) Arrays.copyOf(c1140ybArr, length + length);
                }
                C1140yb[] c1140ybArr2 = this.f48136j;
                int i3 = this.f48137k;
                c1140ybArr2[i3] = c1140yb;
                this.f48137k = i3 + 1;
                return;
            }
            if (this.f48136j[i] == c1140yb) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19640b(C1140yb c1140yb) {
        int i = this.f48137k;
        int i2 = 0;
        while (i2 < i) {
            if (this.f48136j[i2] == c1140yb) {
                while (i2 < i - 1) {
                    C1140yb[] c1140ybArr = this.f48136j;
                    int i3 = i2 + 1;
                    c1140ybArr[i2] = c1140ybArr[i3];
                    i2 = i3;
                }
                this.f48137k--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19641c() {
        this.f48140n = 5;
        this.f48131e = 0;
        this.f48129c = -1;
        this.f48130d = -1;
        this.f48132f = 0.0f;
        this.f48133g = false;
        this.f48139m = false;
        int i = this.f48137k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f48136j[i2] = null;
        }
        this.f48137k = 0;
        this.f48138l = 0;
        this.f48128b = false;
        Arrays.fill(this.f48135i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f48129c - ((C1146yh) obj).f48129c;
    }

    /* JADX INFO: renamed from: d */
    public final void m19642d(C1141yc c1141yc, float f) {
        this.f48132f = f;
        this.f48133g = true;
        this.f48139m = false;
        int i = this.f48137k;
        this.f48130d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f48136j[i2].m19606c(c1141yc, this, false);
        }
        this.f48137k = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m19643e(C1141yc c1141yc, C1140yb c1140yb) {
        int i = this.f48137k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f48136j[i2].mo19607d(c1141yc, c1140yb, false);
        }
        this.f48137k = 0;
    }

    public final String toString() {
        return "" + this.f48129c;
    }
}
