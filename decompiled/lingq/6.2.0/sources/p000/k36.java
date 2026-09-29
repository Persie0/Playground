package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class k36 implements dy5 {

    /* JADX INFO: renamed from: a */
    public final long f46620a;

    /* JADX INFO: renamed from: b */
    public final long f46621b;

    /* JADX INFO: renamed from: c */
    public final long f46622c;

    /* JADX INFO: renamed from: d */
    public final long f46623d;

    /* JADX INFO: renamed from: e */
    public final long f46624e;

    public k36(long j, long j2, long j3, long j4, long j5) {
        this.f46620a = j;
        this.f46621b = j2;
        this.f46622c = j3;
        this.f46623d = j4;
        this.f46624e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k36.class == obj.getClass()) {
            k36 k36Var = (k36) obj;
            if (this.f46620a == k36Var.f46620a && this.f46621b == k36Var.f46621b && this.f46622c == k36Var.f46622c && this.f46623d == k36Var.f46623d && this.f46624e == k36Var.f46624e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return hnb.m13380b(this.f46624e) + ((hnb.m13380b(this.f46623d) + ((hnb.m13380b(this.f46622c) + ((hnb.m13380b(this.f46621b) + ((hnb.m13380b(this.f46620a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f46620a + ", photoSize=" + this.f46621b + ", photoPresentationTimestampUs=" + this.f46622c + ", videoStartPosition=" + this.f46623d + ", videoSize=" + this.f46624e;
    }
}
