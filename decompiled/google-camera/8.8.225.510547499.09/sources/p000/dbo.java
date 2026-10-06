package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbo {

    /* JADX INFO: renamed from: a */
    public final int f10402a;

    /* JADX INFO: renamed from: b */
    public final int f10403b;

    /* JADX INFO: renamed from: c */
    public final int f10404c;

    /* JADX INFO: renamed from: d */
    public final kmq f10405d;

    /* JADX INFO: renamed from: e */
    public final ikw f10406e;

    /* JADX INFO: renamed from: f */
    public final boolean f10407f;

    /* JADX INFO: renamed from: g */
    public final int f10408g;

    /* JADX INFO: renamed from: h */
    public final int f10409h;

    public dbo() {
    }

    public dbo(int i, int i2, int i3, kmq kmqVar, int i4, int i5, ikw ikwVar, boolean z) {
        this.f10402a = i;
        this.f10403b = i2;
        this.f10404c = i3;
        this.f10405d = kmqVar;
        this.f10408g = i4;
        this.f10409h = i5;
        this.f10406e = ikwVar;
        this.f10407f = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dbo)) {
            return false;
        }
        dbo dboVar = (dbo) obj;
        if (this.f10402a == dboVar.f10402a && this.f10403b == dboVar.f10403b && this.f10404c == dboVar.f10404c && this.f10405d.equals(dboVar.f10405d)) {
            int i = this.f10408g;
            int i2 = dboVar.f10408g;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                int i3 = this.f10409h;
                int i4 = dboVar.f10409h;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == i4 && this.f10406e.equals(dboVar.f10406e) && this.f10407f == dboVar.f10407f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.f10402a ^ 1000003) * 1000003) ^ this.f10403b) * 1000003) ^ this.f10404c) * 1000003) ^ this.f10405d.hashCode();
        int i = this.f10408g;
        if (i == 0) {
            throw null;
        }
        int i2 = ((iHashCode * 1000003) ^ i) * 1000003;
        int i3 = this.f10409h;
        if (i3 != 0) {
            return ((((i2 ^ i3) * 1000003) ^ this.f10406e.hashCode()) * 1000003) ^ (true != this.f10407f ? 1237 : 1231);
        }
        throw null;
    }

    public final String toString() {
        return "VideoCaptureSessionMetadata{creationLatencyMs=" + this.f10402a + ", sessionDurationMs=" + this.f10403b + ", numRecordedSessions=" + this.f10404c + ", cameraFacing=" + String.valueOf(this.f10405d) + ", sessionState=" + bzq.m3255aa(this.f10408g) + ", sessionSource=" + bzq.m3256ab(this.f10409h) + ", mode=" + String.valueOf(this.f10406e) + ", actionOnUserEdu=" + this.f10407f + "}";
    }
}
