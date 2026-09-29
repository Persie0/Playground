package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class k55 {

    /* JADX INFO: renamed from: a */
    public final boolean f46725a;

    /* JADX INFO: renamed from: b */
    public final long f46726b;

    /* JADX INFO: renamed from: c */
    public final long f46727c;

    /* JADX INFO: renamed from: d */
    public final m97 f46728d;

    public /* synthetic */ k55(boolean z, long j, long j2, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (m97) null);
    }

    /* JADX INFO: renamed from: a */
    public static k55 m14854a(k55 k55Var, boolean z, long j, long j2, m97 m97Var, int i) {
        if ((i & 1) != 0) {
            z = k55Var.f46725a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            j = k55Var.f46726b;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = k55Var.f46727c;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            m97Var = k55Var.f46728d;
        }
        k55Var.getClass();
        return new k55(z2, j3, j4, m97Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k55)) {
            return false;
        }
        k55 k55Var = (k55) obj;
        return this.f46725a == k55Var.f46725a && this.f46726b == k55Var.f46726b && this.f46727c == k55Var.f46727c && fa4.m11650l(this.f46728d, k55Var.f46728d);
    }

    public final int hashCode() {
        int iM22981d = ux5.m22981d(this.f46727c, ux5.m22981d(this.f46726b, Boolean.hashCode(this.f46725a) * 31, 31), 31);
        m97 m97Var = this.f46728d;
        return iM22981d + (m97Var == null ? 0 : m97Var.hashCode());
    }

    public final String toString() {
        return "LessonPlaybackSnapshot(isPlaying=" + this.f46725a + ", positionMs=" + this.f46726b + ", durationMs=" + this.f46727c + ", playbackInterval=" + this.f46728d + ")";
    }

    public k55(boolean z, long j, long j2, m97 m97Var) {
        this.f46725a = z;
        this.f46726b = j;
        this.f46727c = j2;
        this.f46728d = m97Var;
    }
}
