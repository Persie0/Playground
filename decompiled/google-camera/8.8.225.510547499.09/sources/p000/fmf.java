package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fmf {

    /* JADX INFO: renamed from: a */
    private final kmg f22552a;

    /* JADX INFO: renamed from: b */
    private final kbc f22553b;

    /* JADX INFO: renamed from: c */
    private final kbc f22554c;

    /* JADX INFO: renamed from: d */
    private final boolean f22555d;

    public fmf(kmg kmgVar, kbc kbcVar, kbc kbcVar2, boolean z) {
        if (kmgVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f22552a = kmgVar;
        if (kbcVar == null) {
            throw new NullPointerException("Null viewfinderSize");
        }
        this.f22553b = kbcVar;
        if (kbcVar2 == null) {
            throw new NullPointerException("Null captureResolution");
        }
        this.f22554c = kbcVar2;
        this.f22555d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fmf) {
            fmf fmfVar = (fmf) obj;
            if (this.f22552a.equals(fmfVar.f22552a) && this.f22553b.equals(fmfVar.f22553b) && this.f22554c.equals(fmfVar.f22554c) && this.f22555d == fmfVar.f22555d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f22552a.f36541b ^ 1000003) * (-721379959)) ^ this.f22553b.hashCode()) * 1000003) ^ this.f22554c.hashCode()) * 1000003) ^ (true != this.f22555d ? 1237 : 1231);
    }

    public final String toString() {
        return "CaptureModuleCameraKey{cameraId=" + this.f22552a.f36540a + ", hdrPlusMode=null, viewfinderSize=" + this.f22553b.toString() + ", captureResolution=" + this.f22554c.toString() + ", jupiterSessionActivated=" + this.f22555d + "}";
    }

    public fmf() {
    }
}
