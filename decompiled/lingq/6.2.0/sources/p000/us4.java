package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class us4 {

    /* JADX INFO: renamed from: a */
    public final int f64287a;

    /* JADX INFO: renamed from: b */
    public final ts4[] f64288b;

    /* JADX INFO: renamed from: c */
    public final xs4 f64289c;

    /* JADX INFO: renamed from: d */
    public final List f64290d;

    /* JADX INFO: renamed from: e */
    public final int f64291e;

    /* JADX INFO: renamed from: f */
    public final int f64292f;

    /* JADX INFO: renamed from: g */
    public final int f64293g;

    public us4(int i, ts4[] ts4VarArr, xs4 xs4Var, List list, int i2) {
        this.f64287a = i;
        this.f64288b = ts4VarArr;
        this.f64289c = xs4Var;
        this.f64290d = list;
        this.f64291e = i2;
        int iMax = 0;
        for (ts4 ts4Var : ts4VarArr) {
            iMax = Math.max(iMax, ts4Var.f62811n);
        }
        this.f64292f = iMax;
        int i3 = iMax + this.f64291e;
        this.f64293g = i3 >= 0 ? i3 : 0;
    }

    /* JADX INFO: renamed from: a */
    public final ts4[] m22898a(int i, int i2, int i3) {
        ts4[] ts4VarArr = this.f64288b;
        int length = ts4VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            ts4 ts4Var = ts4VarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((aq3) this.f64290d.get(i5)).f7358a;
            ts4Var.m22285n(i, this.f64289c.f68645b[i6], i2, i3, this.f64287a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return ts4VarArr;
    }
}
