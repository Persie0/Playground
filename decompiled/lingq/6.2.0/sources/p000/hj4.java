package p000;

/* JADX INFO: loaded from: classes.dex */
public final class hj4 {

    /* JADX INFO: renamed from: d */
    public static final hj4 f42487d = new hj4(0, 0, null, 127);

    /* JADX INFO: renamed from: a */
    public final int f42488a;

    /* JADX INFO: renamed from: b */
    public final int f42489b;

    /* JADX INFO: renamed from: c */
    public final xi5 f42490c;

    public hj4(int i, int i2, xi5 xi5Var, int i3) {
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? -1 : i2;
        xi5Var = (i3 & 64) != 0 ? null : xi5Var;
        this.f42488a = i;
        this.f42489b = i2;
        this.f42490c = xi5Var;
    }

    /* JADX INFO: renamed from: a */
    public final w04 m13294a(boolean z) {
        v04 v04Var;
        int i = this.f42488a;
        ij4 ij4Var = new ij4(i);
        if (i == 0) {
            ij4Var = null;
            v04Var = null;
        } else {
            v04Var = null;
        }
        int i2 = ij4Var != null ? ij4Var.f44184a : 1;
        int i3 = this.f42489b;
        v04 v04Var2 = new v04(i3);
        if (i3 == -1) {
            v04Var2 = v04Var;
        }
        int i4 = v04Var2 != null ? v04Var2.f64658a : 1;
        xi5 xi5Var = this.f42490c;
        if (xi5Var == null) {
            xi5Var = xi5.f68250c;
        }
        return new w04(z, 0, true, i2, i4, xi5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj4)) {
            return false;
        }
        hj4 hj4Var = (hj4) obj;
        return this.f42488a == hj4Var.f42488a && this.f42489b == hj4Var.f42489b && fa4.m11650l(this.f42490c, hj4Var.f42490c);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f42489b, wq1.m24106b(this.f42488a, Integer.hashCode(-1) * 961, 31), 29791);
        xi5 xi5Var = this.f42490c;
        return iM24106b + (xi5Var != null ? xi5Var.f68251a.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) ij4.m13943a(this.f42488a)) + ", imeAction=" + ((Object) v04.m23037a(this.f42489b)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=" + this.f42490c + ')';
    }
}
