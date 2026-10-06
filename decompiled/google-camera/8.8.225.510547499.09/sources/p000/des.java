package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class des {

    /* JADX INFO: renamed from: a */
    public final long f10734a;

    /* JADX INFO: renamed from: b */
    public final mws f10735b;

    /* JADX INFO: renamed from: c */
    public final mrm f10736c;

    public des() {
    }

    public des(long j, mws mwsVar, mrm mrmVar) {
        this.f10734a = j;
        this.f10735b = mwsVar;
        this.f10736c = mrmVar;
    }

    /* JADX INFO: renamed from: a */
    static der m6021a() {
        der derVar = new der(null);
        int i = mws.f41739d;
        derVar.m6019b(mzr.f41857a);
        return derVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof des) {
            des desVar = (des) obj;
            if (this.f10734a == desVar.f10734a && mkv.m16505M(this.f10735b, desVar.f10735b) && this.f10736c.equals(desVar.f10736c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f10734a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f10735b.hashCode()) * 1000003) ^ this.f10736c.hashCode();
    }

    public final String toString() {
        return "CameraVisionKitResult{timestampNs=" + this.f10734a + ", cameraVisionKitChipResults=" + String.valueOf(this.f10735b) + ", cameraVisionKitDataResult=" + String.valueOf(this.f10736c) + "}";
    }
}
