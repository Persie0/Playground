package p000;

/* JADX INFO: renamed from: zx */
/* JADX INFO: loaded from: classes2.dex */
public final class C3849zx {

    /* JADX INFO: renamed from: a */
    public final double f72327a;

    /* JADX INFO: renamed from: b */
    public final double f72328b;

    /* JADX INFO: renamed from: c */
    public final boolean f72329c;

    /* JADX INFO: renamed from: d */
    public final long f72330d;

    public C3849zx(double d, double d2, boolean z, long j) {
        this.f72327a = d;
        this.f72328b = d2;
        this.f72329c = z;
        this.f72330d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3849zx)) {
            return false;
        }
        C3849zx c3849zx = (C3849zx) obj;
        return Double.compare(this.f72327a, c3849zx.f72327a) == 0 && Double.compare(this.f72328b, c3849zx.f72328b) == 0 && this.f72329c == c3849zx.f72329c && this.f72330d == c3849zx.f72330d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f72330d) + g9a.m12428e(g9a.m12424a(this.f72328b, Double.hashCode(this.f72327a) * 31, 31), 31, this.f72329c);
    }

    public final String toString() {
        return "AudioEditState(start=" + this.f72327a + ", end=" + this.f72328b + ", isPlaying=" + this.f72329c + ", audioProgress=" + this.f72330d + ")";
    }
}
