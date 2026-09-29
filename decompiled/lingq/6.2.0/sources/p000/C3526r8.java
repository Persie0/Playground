package p000;

/* JADX INFO: renamed from: r8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3526r8 {

    /* JADX INFO: renamed from: a */
    public final long f58868a;

    /* JADX INFO: renamed from: b */
    public final long f58869b;

    public C3526r8(long j, long j2) {
        this.f58868a = j;
        this.f58869b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3526r8)) {
            return false;
        }
        C3526r8 c3526r8 = (C3526r8) obj;
        return this.f58868a == c3526r8.f58868a && this.f58869b == c3526r8.f58869b;
    }

    public final int hashCode() {
        return (((int) this.f58868a) * 31) + ((int) this.f58869b);
    }
}
