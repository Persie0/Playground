package p000;

/* JADX INFO: loaded from: classes.dex */
public final class tm7 {

    /* JADX INFO: renamed from: d */
    public static final tm7 f62530d = new tm7(0.0f, new h41(0.0f, 0.0f), 0);

    /* JADX INFO: renamed from: a */
    public final float f62531a;

    /* JADX INFO: renamed from: b */
    public final h41 f62532b;

    /* JADX INFO: renamed from: c */
    public final int f62533c;

    public tm7(float f, h41 h41Var, int i) {
        this.f62531a = f;
        this.f62532b = h41Var;
        this.f62533c = i;
        if (Float.isNaN(f)) {
            C3386nv.m17626m("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm7)) {
            return false;
        }
        tm7 tm7Var = (tm7) obj;
        return this.f62531a == tm7Var.f62531a && fa4.m11650l(this.f62532b, tm7Var.f62532b) && this.f62533c == tm7Var.f62533c;
    }

    public final int hashCode() {
        return ((this.f62532b.hashCode() + (Float.hashCode(this.f62531a) * 31)) * 31) + this.f62533c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.f62531a);
        sb.append(", range=");
        sb.append(this.f62532b);
        sb.append(", steps=");
        return wq1.m24122r(sb, this.f62533c, ')');
    }
}
