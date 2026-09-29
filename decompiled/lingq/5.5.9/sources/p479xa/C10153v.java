package p479xa;

/* JADX INFO: renamed from: xa.v */
/* JADX INFO: loaded from: classes.dex */
public final class C10153v {

    /* JADX INFO: renamed from: c */
    public static final C10153v f51445c = new C10153v(-1, -1);

    /* JADX INFO: renamed from: a */
    public final int f51446a;

    /* JADX INFO: renamed from: b */
    public final int f51447b;

    static {
        new C10153v(0, 0);
    }

    public C10153v(int i10, int i11) {
        C10129a.m18990b((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f51446a = i10;
        this.f51447b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10153v)) {
            return false;
        }
        C10153v c10153v = (C10153v) obj;
        return this.f51446a == c10153v.f51446a && this.f51447b == c10153v.f51447b;
    }

    public final int hashCode() {
        int i10 = this.f51446a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f51447b;
    }

    public final String toString() {
        return this.f51446a + "x" + this.f51447b;
    }
}
