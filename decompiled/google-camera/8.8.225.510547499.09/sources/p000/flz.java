package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class flz {

    /* JADX INFO: renamed from: a */
    public final kmg f22529a;

    /* JADX INFO: renamed from: b */
    public final kmq f22530b;

    /* JADX INFO: renamed from: c */
    public final kbc f22531c;

    /* JADX INFO: renamed from: d */
    public final ihx f22532d;

    /* JADX INFO: renamed from: e */
    private final kan f22533e;

    public flz() {
    }

    public flz(kmg kmgVar, kmq kmqVar, kan kanVar, kbc kbcVar, ihx ihxVar) {
        this.f22529a = kmgVar;
        this.f22530b = kmqVar;
        this.f22533e = kanVar;
        this.f22531c = kbcVar;
        this.f22532d = ihxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof flz) {
            flz flzVar = (flz) obj;
            if (this.f22529a.equals(flzVar.f22529a) && this.f22530b.equals(flzVar.f22530b) && this.f22533e.equals(flzVar.f22533e) && this.f22531c.equals(flzVar.f22531c) && this.f22532d.equals(flzVar.f22532d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f22529a.f36541b ^ 1000003) * 1000003) ^ this.f22530b.hashCode()) * 1000003) ^ this.f22533e.hashCode()) * 1000003) ^ this.f22531c.hashCode()) * 1000003) ^ this.f22532d.hashCode();
    }

    public final String toString() {
        return "OneModeConfig{cameraId=" + String.valueOf(this.f22529a) + ", cameraFacing=" + String.valueOf(this.f22530b) + ", aspectRatio=" + String.valueOf(this.f22533e) + ", captureResolution=" + String.valueOf(this.f22531c) + ", viewfinderConfig=" + String.valueOf(this.f22532d) + "}";
    }
}
