package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ps4 {

    /* JADX INFO: renamed from: a */
    public final xs4 f56757a;

    /* JADX INFO: renamed from: b */
    public final int f56758b;

    /* JADX INFO: renamed from: c */
    public final int f56759c;

    /* JADX INFO: renamed from: d */
    public final os4 f56760d;

    /* JADX INFO: renamed from: e */
    public final at4 f56761e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ xs4 f56762f;

    public ps4(xs4 xs4Var, int i, int i2, os4 os4Var, at4 at4Var) {
        this.f56762f = xs4Var;
        this.f56757a = xs4Var;
        this.f56758b = i;
        this.f56759c = i2;
        this.f56760d = os4Var;
        this.f56761e = at4Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m19468a(int i, int i2) {
        int i3;
        xs4 xs4Var = this.f56757a;
        int[] iArr = xs4Var.f68644a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = xs4Var.f68645b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            k54.m14852a("width must be >= 0");
        }
        return dk1.m10430h(i3, i3, 0, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public final us4 m19469b(int i) {
        C3126ix c3126ixM3028c = this.f56761e.m3028c(i);
        int i2 = c3126ixM3028c.f44720b;
        int size = ((List) c3126ixM3028c.f44721c).size();
        int i3 = 0;
        int i4 = (size == 0 || i2 + size == this.f56758b) ? 0 : this.f56759c;
        ts4[] ts4VarArr = new ts4[size];
        int i5 = 0;
        while (true) {
            List list = (List) c3126ixM3028c.f44721c;
            if (i3 >= size) {
                return new us4(i, ts4VarArr, this.f56762f, list, i4);
            }
            int i6 = (int) ((aq3) list.get(i3)).f7358a;
            ts4 ts4VarM18462E = this.f56760d.m18462E(i2 + i3, i5, i6, i4, m19468a(i5, i6));
            i5 += i6;
            ts4VarArr[i3] = ts4VarM18462E;
            i3++;
        }
    }
}
