package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class f00 {

    /* JADX INFO: renamed from: a */
    public final int f38127a;

    /* JADX INFO: renamed from: b */
    public final long f38128b;

    /* JADX INFO: renamed from: c */
    public final long f38129c;

    /* JADX INFO: renamed from: d */
    public final long f38130d;

    /* JADX INFO: renamed from: e */
    public final long f38131e;

    /* JADX INFO: renamed from: f */
    public final float f38132f;

    /* JADX INFO: renamed from: g */
    public final int f38133g;

    public f00(int i, long j, long j2, long j3, long j4, float f, int i2) {
        this.f38127a = i;
        this.f38128b = j;
        this.f38129c = j2;
        this.f38130d = j3;
        this.f38131e = j4;
        this.f38132f = f;
        this.f38133g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f00)) {
            return false;
        }
        f00 f00Var = (f00) obj;
        return this.f38127a == f00Var.f38127a && this.f38128b == f00Var.f38128b && this.f38129c == f00Var.f38129c && this.f38130d == f00Var.f38130d && this.f38131e == f00Var.f38131e && Float.compare(this.f38132f, f00Var.f38132f) == 0 && this.f38133g == f00Var.f38133g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38133g) + wq1.m24105a(ux5.m22981d(this.f38131e, ux5.m22981d(this.f38130d, ux5.m22981d(this.f38129c, ux5.m22981d(this.f38128b, Integer.hashCode(this.f38127a) * 31, 31), 31), 31), 31), this.f38132f, 31);
    }

    public final String toString() {
        return "AudioWaveState(sentenceIndex=" + this.f38127a + ", sentenceStartMs=" + this.f38128b + ", sentenceDurationMs=" + this.f38129c + ", playbackStartTimeNanos=" + this.f38130d + ", playbackStartPositionMs=" + this.f38131e + ", playbackSpeed=" + this.f38132f + ", sentenceTextLength=" + this.f38133g + ")";
    }
}
