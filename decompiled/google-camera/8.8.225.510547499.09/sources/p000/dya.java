package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dya {

    /* JADX INFO: renamed from: a */
    public final dxx f12865a;

    /* JADX INFO: renamed from: b */
    private final imu f12866b;

    public dya(dxx dxxVar, imu imuVar) {
        if (dxxVar == null) {
            throw new NullPointerException("Null metadataFrameStore");
        }
        this.f12865a = dxxVar;
        if (imuVar == null) {
            throw new NullPointerException("Null cameraCharacteristicsDirectory");
        }
        this.f12866b = imuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dya) {
            dya dyaVar = (dya) obj;
            if (this.f12865a.equals(dyaVar.f12865a) && this.f12866b.equals(dyaVar.f12866b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12865a.hashCode() ^ 1000003) * 1000003) ^ this.f12866b.hashCode();
    }

    public final String toString() {
        return "PerOneCameraFrameStoreResource{metadataFrameStore=" + this.f12865a.toString() + ", cameraCharacteristicsDirectory=" + this.f12866b.toString() + "}";
    }

    public dya() {
    }
}
