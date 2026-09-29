package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p87 {

    /* JADX INFO: renamed from: a */
    public final long f55755a;

    /* JADX INFO: renamed from: b */
    public final long f55756b;

    public p87(long j, long j2) {
        this.f55755a = j;
        this.f55756b = j2;
        ay9[] ay9VarArr = zx9.f72358b;
        if ((j & 1095216660480L) == 0) {
            j54.m14288a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            j54.m14288a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p87)) {
            return false;
        }
        p87 p87Var = (p87) obj;
        return zx9.m25846a(this.f55755a, p87Var.f55755a) && zx9.m25846a(this.f55756b, p87Var.f55756b);
    }

    public final int hashCode() {
        ay9[] ay9VarArr = zx9.f72358b;
        return Integer.hashCode(4) + ux5.m22981d(this.f55756b, Long.hashCode(this.f55755a) * 31, 31);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) zx9.m25850e(this.f55755a)) + ", height=" + ((Object) zx9.m25850e(this.f55756b)) + ", placeholderVerticalAlign=" + ((Object) "Center") + ')';
    }
}
