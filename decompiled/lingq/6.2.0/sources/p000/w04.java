package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w04 {

    /* JADX INFO: renamed from: g */
    public static final w04 f66163g = new w04(false, 0, true, 1, 1, xi5.f68250c);

    /* JADX INFO: renamed from: a */
    public final boolean f66164a;

    /* JADX INFO: renamed from: b */
    public final int f66165b;

    /* JADX INFO: renamed from: c */
    public final boolean f66166c;

    /* JADX INFO: renamed from: d */
    public final int f66167d;

    /* JADX INFO: renamed from: e */
    public final int f66168e;

    /* JADX INFO: renamed from: f */
    public final xi5 f66169f;

    public w04(boolean z, int i, boolean z2, int i2, int i3, xi5 xi5Var) {
        this.f66164a = z;
        this.f66165b = i;
        this.f66166c = z2;
        this.f66167d = i2;
        this.f66168e = i3;
        this.f66169f = xi5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w04)) {
            return false;
        }
        w04 w04Var = (w04) obj;
        return this.f66164a == w04Var.f66164a && this.f66165b == w04Var.f66165b && this.f66166c == w04Var.f66166c && this.f66167d == w04Var.f66167d && this.f66168e == w04Var.f66168e && fa4.m11650l(this.f66169f, w04Var.f66169f);
    }

    public final int hashCode() {
        return this.f66169f.f68251a.hashCode() + wq1.m24106b(this.f66168e, wq1.m24106b(this.f66167d, g9a.m12428e(wq1.m24106b(this.f66165b, Boolean.hashCode(this.f66164a) * 31, 31), 31, this.f66166c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f66164a + ", capitalization=" + ((Object) xwc.m24765f0(this.f66165b)) + ", autoCorrect=" + this.f66166c + ", keyboardType=" + ((Object) ij4.m13943a(this.f66167d)) + ", imeAction=" + ((Object) v04.m23037a(this.f66168e)) + ", platformImeOptions=null, hintLocales=" + this.f66169f + ')';
    }
}
