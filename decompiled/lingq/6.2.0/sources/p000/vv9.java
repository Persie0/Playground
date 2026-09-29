package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vv9 {

    /* JADX INFO: renamed from: d */
    public static final fs6 f65989d = new fs6(19, new am8(29), new wx8(14));

    /* JADX INFO: renamed from: a */
    public final C3419on f65990a;

    /* JADX INFO: renamed from: b */
    public final long f65991b;

    /* JADX INFO: renamed from: c */
    public final cx9 f65992c;

    public vv9(C3419on c3419on, long j, cx9 cx9Var) {
        cx9 cx9Var2;
        this.f65990a = c3419on;
        this.f65991b = eh0.m11130j(c3419on.f54604b.length(), j);
        if (cx9Var != null) {
            cx9Var2 = new cx9(eh0.m11130j(c3419on.f54604b.length(), cx9Var.f34694a));
        } else {
            cx9Var2 = null;
        }
        this.f65992c = cx9Var2;
    }

    /* JADX INFO: renamed from: a */
    public static vv9 m23560a(vv9 vv9Var, C3419on c3419on, long j, int i) {
        if ((i & 1) != 0) {
            c3419on = vv9Var.f65990a;
        }
        if ((i & 2) != 0) {
            j = vv9Var.f65991b;
        }
        cx9 cx9Var = (i & 4) != 0 ? vv9Var.f65992c : null;
        vv9Var.getClass();
        return new vv9(c3419on, j, cx9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv9)) {
            return false;
        }
        vv9 vv9Var = (vv9) obj;
        return cx9.m9920b(this.f65991b, vv9Var.f65991b) && fa4.m11650l(this.f65992c, vv9Var.f65992c) && fa4.m11650l(this.f65990a, vv9Var.f65990a);
    }

    public final int hashCode() {
        int iHashCode = this.f65990a.hashCode() * 31;
        int i = cx9.f34693c;
        int iM22981d = ux5.m22981d(this.f65991b, iHashCode, 31);
        cx9 cx9Var = this.f65992c;
        return iM22981d + (cx9Var != null ? Long.hashCode(cx9Var.f34694a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f65990a) + "', selection=" + ((Object) cx9.m9926h(this.f65991b)) + ", composition=" + this.f65992c + ')';
    }

    public vv9(String str, int i, long j) {
        this(new C3419on((i & 1) != 0 ? "" : str), (i & 2) != 0 ? cx9.f34692b : j, (cx9) null);
    }
}
