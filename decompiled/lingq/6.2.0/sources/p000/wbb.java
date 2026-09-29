package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class wbb {

    /* JADX INFO: renamed from: a */
    public final double f66605a;

    /* JADX INFO: renamed from: b */
    public final double f66606b;

    /* JADX INFO: renamed from: c */
    public final long f66607c;

    public /* synthetic */ wbb(double d, double d2, long j, int i) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0L : j);
    }

    /* JADX INFO: renamed from: a */
    public static wbb m23839a(wbb wbbVar, double d, double d2, long j, int i) {
        if ((i & 1) != 0) {
            d = wbbVar.f66605a;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = wbbVar.f66606b;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            j = wbbVar.f66607c;
        }
        return new wbb(d3, d4, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbb)) {
            return false;
        }
        wbb wbbVar = (wbb) obj;
        return Double.compare(this.f66605a, wbbVar.f66605a) == 0 && Double.compare(this.f66606b, wbbVar.f66606b) == 0 && this.f66607c == wbbVar.f66607c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f66607c) + g9a.m12424a(this.f66606b, Double.hashCode(this.f66605a) * 31, 31);
    }

    public final String toString() {
        return "YoutubeSentencePlayerDataState(start=" + this.f66605a + ", end=" + this.f66606b + ", duration=" + this.f66607c + ")";
    }

    public wbb(double d, double d2, long j) {
        this.f66605a = d;
        this.f66606b = d2;
        this.f66607c = j;
    }
}
