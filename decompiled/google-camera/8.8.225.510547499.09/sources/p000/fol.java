package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fol {

    /* JADX INFO: renamed from: a */
    public final kmg f22946a;

    /* JADX INFO: renamed from: b */
    public final kbc f22947b;

    public fol() {
    }

    public fol(kmg kmgVar, kbc kbcVar) {
        this.f22946a = kmgVar;
        this.f22947b = kbcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fol) {
            fol folVar = (fol) obj;
            if (this.f22946a.equals(folVar.f22946a) && this.f22947b.equals(folVar.f22947b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22946a.f36541b ^ 1000003) * 1000003) ^ this.f22947b.hashCode();
    }

    public final String toString() {
        return "MoreModesSessionConfig{cameraId=" + String.valueOf(this.f22946a) + ", previewSize=" + String.valueOf(this.f22947b) + "}";
    }
}
