package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jv5 {

    /* JADX INFO: renamed from: a */
    public final Object f46226a;

    /* JADX INFO: renamed from: b */
    public final int f46227b;

    /* JADX INFO: renamed from: c */
    public final int f46228c;

    /* JADX INFO: renamed from: d */
    public final long f46229d;

    /* JADX INFO: renamed from: e */
    public final int f46230e;

    public jv5(Object obj, int i, int i2, long j, int i3) {
        this.f46226a = obj;
        this.f46227b = i;
        this.f46228c = i2;
        this.f46229d = j;
        this.f46230e = i3;
    }

    /* JADX INFO: renamed from: a */
    public final jv5 m14689a(Object obj) {
        if (this.f46226a.equals(obj)) {
            return this;
        }
        return new jv5(obj, this.f46227b, this.f46228c, this.f46229d, this.f46230e);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14690b() {
        return this.f46227b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv5)) {
            return false;
        }
        jv5 jv5Var = (jv5) obj;
        return this.f46226a.equals(jv5Var.f46226a) && this.f46227b == jv5Var.f46227b && this.f46228c == jv5Var.f46228c && this.f46229d == jv5Var.f46229d && this.f46230e == jv5Var.f46230e;
    }

    public final int hashCode() {
        return ((((((((this.f46226a.hashCode() + 527) * 31) + this.f46227b) * 31) + this.f46228c) * 31) + ((int) this.f46229d)) * 31) + this.f46230e;
    }

    public jv5(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public jv5(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public jv5(Object obj) {
        this(obj, -1L);
    }
}
