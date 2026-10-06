package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ctg {

    /* JADX INFO: renamed from: a */
    public final ctp f9423a;

    /* JADX INFO: renamed from: b */
    public final int f9424b;

    public ctg() {
    }

    public ctg(ctp ctpVar, int i) {
        this.f9423a = ctpVar;
        this.f9424b = i;
    }

    /* JADX INFO: renamed from: a */
    public static lmv m5491a() {
        return new lmv();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctg) {
            ctg ctgVar = (ctg) obj;
            if (this.f9423a.equals(ctgVar.f9423a) && this.f9424b == ctgVar.f9424b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9423a.hashCode() ^ 1000003) * 1000003) ^ this.f9424b;
    }

    public final String toString() {
        return "CamcorderPendingVideoFile{outputVideo=" + String.valueOf(this.f9423a) + ", pendingVideoId=" + this.f9424b + "}";
    }
}
