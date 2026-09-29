package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ni3 {

    /* JADX INFO: renamed from: a */
    public final float f52754a;

    /* JADX INFO: renamed from: b */
    public final float f52755b;

    /* JADX INFO: renamed from: c */
    public final long f52756c;

    public ni3(float f, float f2, long j) {
        this.f52754a = f;
        this.f52755b = f2;
        this.f52756c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3)) {
            return false;
        }
        ni3 ni3Var = (ni3) obj;
        return Float.compare(this.f52754a, ni3Var.f52754a) == 0 && Float.compare(this.f52755b, ni3Var.f52755b) == 0 && this.f52756c == ni3Var.f52756c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f52756c) + wq1.m24105a(Float.hashCode(this.f52754a) * 31, this.f52755b, 31);
    }

    public final String toString() {
        return "ClickInfo(x=" + this.f52754a + ", y=" + this.f52755b + ", timestamp=" + this.f52756c + ')';
    }
}
