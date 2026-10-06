package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dee {

    /* JADX INFO: renamed from: a */
    public final mwx f10653a;

    /* JADX INFO: renamed from: b */
    public final mrm f10654b;

    public dee() {
    }

    public dee(mwx mwxVar, mrm mrmVar) {
        this.f10653a = mwxVar;
        this.f10654b = mrmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dee) {
            dee deeVar = (dee) obj;
            if (this.f10653a.equals(deeVar.f10653a) && this.f10654b.equals(deeVar.f10654b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10653a.hashCode() ^ 1000003) * 1000003) ^ this.f10654b.hashCode();
    }

    public final String toString() {
        return "CameraVisionKitDataResult{sceneDetectionResults=" + String.valueOf(this.f10653a) + ", contentDetectionResults=" + String.valueOf(this.f10654b) + "}";
    }
}
