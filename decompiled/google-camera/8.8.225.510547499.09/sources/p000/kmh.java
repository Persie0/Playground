package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kmh {

    /* JADX INFO: renamed from: a */
    public final String f36543a;

    /* JADX INFO: renamed from: b */
    public final Throwable f36544b;

    public kmh() {
    }

    public kmh(String str, Throwable th) {
        this.f36543a = str;
        this.f36544b = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kmh) {
            kmh kmhVar = (kmh) obj;
            if (this.f36543a.equals(kmhVar.f36543a)) {
                Throwable th = this.f36544b;
                Throwable th2 = kmhVar.f36544b;
                if (th != null ? th.equals(th2) : th2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f36543a.hashCode() ^ 1000003;
        Throwable th = this.f36544b;
        return (iHashCode * 1000003) ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "CameraIdFailure{cameraId=" + this.f36543a + ", exception=" + String.valueOf(this.f36544b) + "}";
    }
}
