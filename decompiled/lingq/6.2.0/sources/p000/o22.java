package p000;

/* JADX INFO: loaded from: classes3.dex */
@ey8(with = v16.class)
public final class o22 extends k22 {
    public static final n22 Companion = new n22();

    /* JADX INFO: renamed from: d */
    public final int f53648d;

    public o22(int i) {
        this.f53648d = i;
        if (i > 0) {
            return;
        }
        C3386nv.m17624j(ux5.m22989l("Unit duration must be positive, but was ", i, " months."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o22) {
            return this.f53648d == ((o22) obj).f53648d;
        }
        return false;
    }

    public final int hashCode() {
        return this.f53648d ^ 131072;
    }

    public final String toString() {
        int i = this.f53648d;
        if (i % 1200 == 0) {
            return r22.m20252a(i / 1200, "CENTURY");
        }
        if (i % 12 == 0) {
            return r22.m20252a(i / 12, "YEAR");
        }
        return i % 3 == 0 ? r22.m20252a(i / 3, "QUARTER") : r22.m20252a(i, "MONTH");
    }
}
