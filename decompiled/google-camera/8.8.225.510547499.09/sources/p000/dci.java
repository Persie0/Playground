package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dci {

    /* JADX INFO: renamed from: a */
    public final boolean f10509a;

    /* JADX INFO: renamed from: b */
    public final jwn f10510b;

    /* JADX INFO: renamed from: c */
    public final fvu f10511c;

    public dci(fvu fvuVar, boolean z, jwn jwnVar) {
        this.f10511c = fvuVar;
        this.f10509a = z;
        if (jwnVar == null) {
            throw new NullPointerException("Null sensorOrientationObservable");
        }
        this.f10510b = jwnVar;
    }

    /* JADX INFO: renamed from: a */
    public final kmq m5923a() {
        return this.f10511c.mo14558k();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5924b() {
        return m5923a() == kmq.f36557a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dci) {
            dci dciVar = (dci) obj;
            if (this.f10511c.equals(dciVar.f10511c) && this.f10509a == dciVar.f10509a && this.f10510b.equals(dciVar.f10510b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10511c.hashCode() ^ 1000003) * 1000003) ^ (true != this.f10509a ? 1237 : 1231)) * 1000003) ^ this.f10510b.hashCode();
    }

    public final String toString() {
        return "CameraFacingChange{characteristics=" + this.f10511c.toString() + ", isDynamicSensorOrientation=" + this.f10509a + ", sensorOrientationObservable=" + this.f10510b.toString() + "}";
    }

    public dci() {
    }
}
