package p000;

/* JADX INFO: loaded from: classes.dex */
public final class aw9 {

    /* JADX INFO: renamed from: c */
    public static final aw9 f7624c = new aw9(d32.m10018P(0), d32.m10018P(0));

    /* JADX INFO: renamed from: a */
    public final long f7625a;

    /* JADX INFO: renamed from: b */
    public final long f7626b;

    public aw9(long j, long j2) {
        this.f7625a = j;
        this.f7626b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw9)) {
            return false;
        }
        aw9 aw9Var = (aw9) obj;
        return zx9.m25846a(this.f7625a, aw9Var.f7625a) && zx9.m25846a(this.f7626b, aw9Var.f7626b);
    }

    public final int hashCode() {
        ay9[] ay9VarArr = zx9.f72358b;
        return Long.hashCode(this.f7626b) + (Long.hashCode(this.f7625a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) zx9.m25850e(this.f7625a)) + ", restLine=" + ((Object) zx9.m25850e(this.f7626b)) + ')';
    }
}
