package p000;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class k0a {
    public static final j0a Companion = new j0a();

    /* JADX INFO: renamed from: a */
    public final long f46519a;

    /* JADX INFO: renamed from: b */
    public final long f46520b;

    /* JADX INFO: renamed from: c */
    public final long f46521c;

    public /* synthetic */ k0a(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, i0a.f43300a.getDescriptor());
            throw null;
        }
        this.f46519a = j;
        this.f46520b = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.f46521c = j / 1000;
        } else {
            this.f46521c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0a) && this.f46519a == ((k0a) obj).f46519a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f46519a);
    }

    public final String toString() {
        return "Time(ms=" + this.f46519a + ')';
    }

    public k0a(long j) {
        this.f46519a = j;
        this.f46520b = j * 1000;
        this.f46521c = j / 1000;
    }
}
