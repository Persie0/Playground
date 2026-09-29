package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bb9 {

    /* JADX INFO: renamed from: a */
    public final cb9 f8282a;

    /* JADX INFO: renamed from: b */
    public final int[] f8283b;

    /* JADX INFO: renamed from: c */
    public final int f8284c;

    /* JADX INFO: renamed from: d */
    public Object[] f8285d;

    /* JADX INFO: renamed from: e */
    public final int f8286e;

    /* JADX INFO: renamed from: f */
    public boolean f8287f;

    /* JADX INFO: renamed from: g */
    public int f8288g;

    /* JADX INFO: renamed from: h */
    public int f8289h;

    /* JADX INFO: renamed from: i */
    public int f8290i;

    /* JADX INFO: renamed from: j */
    public final o84 f8291j;

    /* JADX INFO: renamed from: k */
    public int f8292k;

    /* JADX INFO: renamed from: l */
    public int f8293l;

    /* JADX INFO: renamed from: m */
    public int f8294m;

    /* JADX INFO: renamed from: n */
    public boolean f8295n;

    public bb9(cb9 cb9Var) {
        this.f8282a = cb9Var;
        this.f8283b = cb9Var.f9842a;
        int i = cb9Var.f9843b;
        this.f8284c = i;
        this.f8285d = cb9Var.f9844c;
        this.f8286e = cb9Var.f9845d;
        this.f8289h = i;
        this.f8290i = -1;
        this.f8291j = new o84();
    }

    /* JADX INFO: renamed from: a */
    public final oj3 m3557a(int i) {
        ArrayList arrayList = this.f8282a.f9850i;
        int iM11014e = eb9.m11014e(arrayList, i, this.f8284c);
        if (iM11014e >= 0) {
            return (oj3) arrayList.get(iM11014e);
        }
        oj3 oj3Var = new oj3(i);
        arrayList.add(-(iM11014e + 1), oj3Var);
        return oj3Var;
    }

    /* JADX INFO: renamed from: b */
    public final Object m3558b(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.f8285d[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return we1.f66679a;
    }

    /* JADX INFO: renamed from: c */
    public final void m3559c() {
        this.f8287f = true;
        cb9 cb9Var = this.f8282a;
        if (cb9Var.f9846e <= 0) {
            cf1.m4605a("Unexpected reader close()");
        }
        cb9Var.f9846e--;
        this.f8285d = new Object[0];
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3560d(int i) {
        return (this.f8283b[(i * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m3561e() {
        if (this.f8292k == 0) {
            if (this.f8288g != this.f8289h) {
                cf1.m4605a("endGroup() not called at the end of a group");
            }
            int i = (this.f8290i * 5) + 2;
            int[] iArr = this.f8283b;
            int i2 = iArr[i];
            this.f8290i = i2;
            int i3 = this.f8284c;
            this.f8289h = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int iM17839b = this.f8291j.m17839b();
            if (iM17839b < 0) {
                this.f8293l = 0;
                this.f8294m = 0;
            } else {
                this.f8293l = iM17839b;
                this.f8294m = i2 >= i3 + (-1) ? this.f8286e : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final Object m3562f() {
        int i = this.f8288g;
        if (i < this.f8289h) {
            return m3558b(this.f8283b, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m3563g() {
        int i = this.f8288g;
        if (i >= this.f8289h) {
            return 0;
        }
        return this.f8283b[i * 5];
    }

    /* JADX INFO: renamed from: h */
    public final Object m3564h(int i, int i2) {
        int[] iArr = this.f8283b;
        int iM11011b = eb9.m11011b(iArr, i);
        int i3 = i + 1;
        int i4 = iM11011b + i2;
        return i4 < (i3 < this.f8284c ? iArr[(i3 * 5) + 4] : this.f8286e) ? this.f8285d[i4] : we1.f66679a;
    }

    /* JADX INFO: renamed from: i */
    public final int m3565i(int i) {
        return this.f8283b[i * 5];
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3566j(int i) {
        return (this.f8283b[(i * 5) + 1] & 134217728) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3567k(int i) {
        return (this.f8283b[(i * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3568l(int i) {
        return (this.f8283b[(i * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: m */
    public final Object m3569m() {
        int i;
        if (this.f8292k > 0 || (i = this.f8293l) >= this.f8294m) {
            this.f8295n = false;
            return we1.f66679a;
        }
        this.f8295n = true;
        Object[] objArr = this.f8285d;
        this.f8293l = i + 1;
        return objArr[i];
    }

    /* JADX INFO: renamed from: n */
    public final Object m3570n(int i) {
        int i2 = i * 5;
        int[] iArr = this.f8283b;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.f8285d[iArr[i2 + 4]] : we1.f66679a;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final int m3571o(int i) {
        return this.f8283b[(i * 5) + 1] & 67108863;
    }

    /* JADX INFO: renamed from: p */
    public final Object m3572p(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f8285d[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX INFO: renamed from: q */
    public final int m3573q(int i) {
        return this.f8283b[(i * 5) + 2];
    }

    /* JADX INFO: renamed from: r */
    public final void m3574r(int i) {
        if (this.f8292k != 0) {
            cf1.m4605a("Cannot reposition while in an empty region");
        }
        this.f8288g = i;
        int[] iArr = this.f8283b;
        int i2 = this.f8284c;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.f8290i) {
            this.f8290i = i3;
            if (i3 < 0) {
                this.f8289h = i2;
            } else {
                this.f8289h = iArr[(i3 * 5) + 3] + i3;
            }
            this.f8293l = 0;
            this.f8294m = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public final int m3575s() {
        if (this.f8292k != 0) {
            cf1.m4605a("Cannot skip while in an empty region");
        }
        int i = this.f8288g;
        int i2 = i * 5;
        int[] iArr = this.f8283b;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.f8288g = iArr[i2 + 3] + i;
        return i4;
    }

    /* JADX INFO: renamed from: t */
    public final void m3576t() {
        if (!(this.f8292k == 0)) {
            cf1.m4605a("Cannot skip the enclosing group while in an empty region");
        }
        this.f8288g = this.f8289h;
        this.f8293l = 0;
        this.f8294m = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f8288g);
        sb.append(", key=");
        sb.append(m3563g());
        sb.append(", parent=");
        sb.append(this.f8290i);
        sb.append(", end=");
        return wq1.m24122r(sb, this.f8289h, ')');
    }

    /* JADX INFO: renamed from: u */
    public final void m3577u() {
        if (this.f8292k <= 0) {
            int i = this.f8290i;
            int i2 = this.f8288g;
            int i3 = i2 * 5;
            int[] iArr = this.f8283b;
            if (iArr[i3 + 2] != i) {
                hi7.m13278a("Invalid slot table detected");
            }
            int i4 = this.f8293l;
            int i5 = this.f8294m;
            o84 o84Var = this.f8291j;
            if (i4 == 0 && i5 == 0) {
                o84Var.m17840c(-1);
            } else {
                o84Var.m17840c(i4);
            }
            this.f8290i = i2;
            this.f8289h = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.f8288g = i6;
            this.f8293l = eb9.m11011b(iArr, i2);
            this.f8294m = i2 >= this.f8284c + (-1) ? this.f8286e : iArr[(i6 * 5) + 4];
        }
    }
}
