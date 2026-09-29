package p000;

/* JADX INFO: loaded from: classes3.dex */
@ey8(with = w22.class)
public final class m22 extends k22 {
    public static final l22 Companion = new l22();

    /* JADX INFO: renamed from: d */
    public final int f50447d;

    public m22(int i) {
        this.f50447d = i;
        if (i > 0) {
            return;
        }
        C3386nv.m17624j(ux5.m22989l("Unit duration must be positive, but was ", i, " days."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m22) {
            return this.f50447d == ((m22) obj).f50447d;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50447d ^ 65536;
    }

    public final String toString() {
        int i = this.f50447d;
        return i % 7 == 0 ? r22.m20252a(i / 7, "WEEK") : r22.m20252a(i, "DAY");
    }
}
