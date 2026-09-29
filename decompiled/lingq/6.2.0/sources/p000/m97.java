package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class m97 {
    public static final l97 Companion = new l97();

    /* JADX INFO: renamed from: a */
    public final long f50813a;

    /* JADX INFO: renamed from: b */
    public final long f50814b;

    /* JADX INFO: renamed from: c */
    public final long f50815c;

    public m97(long j, long j2) {
        this.f50813a = j;
        this.f50814b = j2;
        if (j < 0 || j2 <= j) {
            C3386nv.m17626m("Failed requirement.");
            throw null;
        }
        this.f50815c = j2 - j;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16697a(long j) {
        return j >= this.f50813a && j < this.f50814b;
    }

    /* JADX INFO: renamed from: b */
    public final long m16698b() {
        return this.f50815c;
    }

    /* JADX INFO: renamed from: c */
    public final long m16699c() {
        return this.f50813a;
    }

    /* JADX INFO: renamed from: d */
    public final long m16700d(long j, long j2) {
        if (j2 <= j) {
            return 0L;
        }
        long jMin = Math.min(j2, this.f50814b) - Math.max(j, this.f50813a);
        if (jMin < 0) {
            return 0L;
        }
        return jMin;
    }

    /* JADX INFO: renamed from: e */
    public final long m16701e(long j) {
        Long lValueOf = Long.valueOf(j);
        if (!m16697a(lValueOf.longValue())) {
            lValueOf = null;
        }
        return lValueOf != null ? lValueOf.longValue() : this.f50813a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m97)) {
            return false;
        }
        m97 m97Var = (m97) obj;
        return this.f50813a == m97Var.f50813a && this.f50814b == m97Var.f50814b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f50814b) + (Long.hashCode(this.f50813a) * 31);
    }

    public final String toString() {
        return wq1.m24113i(this.f50814b, ")", ux5.m22996s(this.f50813a, "PlaybackInterval(startMs=", ", endMs="));
    }
}
