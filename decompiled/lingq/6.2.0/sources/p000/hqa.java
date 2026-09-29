package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class hqa {

    /* JADX INFO: renamed from: a */
    public final long f42793a;

    /* JADX INFO: renamed from: b */
    public final long f42794b;

    /* JADX INFO: renamed from: c */
    public final boolean f42795c;

    /* JADX INFO: renamed from: d */
    public final boolean f42796d;

    /* JADX INFO: renamed from: e */
    public final ac7 f42797e;

    /* JADX INFO: renamed from: f */
    public final float f42798f;

    /* JADX INFO: renamed from: g */
    public final boolean f42799g;

    public hqa(long j, long j2, boolean z, boolean z2, ac7 ac7Var, float f, boolean z3) {
        ac7Var.getClass();
        this.f42793a = j;
        this.f42794b = j2;
        this.f42795c = z;
        this.f42796d = z2;
        this.f42797e = ac7Var;
        this.f42798f = f;
        this.f42799g = z3;
    }

    /* JADX INFO: renamed from: a */
    public static hqa m13434a(hqa hqaVar, long j, long j2, boolean z, int i) {
        if ((i & 1) != 0) {
            j = hqaVar.f42793a;
        }
        long j3 = j;
        long j4 = (i & 2) != 0 ? hqaVar.f42794b : j2;
        boolean z2 = (i & 4) != 0 ? hqaVar.f42795c : z;
        boolean z3 = (i & 8) != 0 ? hqaVar.f42796d : true;
        ac7 ac7Var = hqaVar.f42797e;
        float f = hqaVar.f42798f;
        boolean z4 = hqaVar.f42799g;
        hqaVar.getClass();
        ac7Var.getClass();
        return new hqa(j3, j4, z2, z3, ac7Var, f, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqa)) {
            return false;
        }
        hqa hqaVar = (hqa) obj;
        return this.f42793a == hqaVar.f42793a && this.f42794b == hqaVar.f42794b && this.f42795c == hqaVar.f42795c && this.f42796d == hqaVar.f42796d && fa4.m11650l(this.f42797e, hqaVar.f42797e) && Float.compare(this.f42798f, hqaVar.f42798f) == 0 && this.f42799g == hqaVar.f42799g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42799g) + wq1.m24105a((this.f42797e.hashCode() + g9a.m12428e(g9a.m12428e(ux5.m22981d(this.f42794b, Long.hashCode(this.f42793a) * 31, 31), 31, this.f42795c), 31, this.f42796d)) * 31, this.f42798f, 31);
    }

    public final String toString() {
        StringBuilder sbM22996s = ux5.m22996s(this.f42793a, "VideoPlayerState(currentPositionMs=", ", durationMs=");
        sbM22996s.append(this.f42794b);
        sbM22996s.append(", isPlaying=");
        sbM22996s.append(this.f42795c);
        sbM22996s.append(", isReady=");
        sbM22996s.append(this.f42796d);
        sbM22996s.append(", playbackRate=");
        sbM22996s.append(this.f42797e);
        sbM22996s.append(", initialPositionSeconds=");
        sbM22996s.append(this.f42798f);
        sbM22996s.append(", initialPositionLoaded=");
        sbM22996s.append(this.f42799g);
        sbM22996s.append(")");
        return sbM22996s.toString();
    }

    public /* synthetic */ hqa() {
        this(0L, 0L, false, false, new ac7(), 0.0f, false);
    }
}
