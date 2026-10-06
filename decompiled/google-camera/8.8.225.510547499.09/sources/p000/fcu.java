package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcu {

    /* JADX INFO: renamed from: a */
    public final gyw f21288a;

    /* JADX INFO: renamed from: b */
    public final nkm f21289b;

    /* JADX INFO: renamed from: c */
    public final Float f21290c;

    public fcu() {
    }

    public fcu(gyw gywVar, nkm nkmVar, Float f) {
        this.f21288a = gywVar;
        this.f21289b = nkmVar;
        this.f21290c = f;
    }

    public final boolean equals(Object obj) {
        nkm nkmVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fcu)) {
            return false;
        }
        fcu fcuVar = (fcu) obj;
        if (this.f21288a.equals(fcuVar.f21288a) && ((nkmVar = this.f21289b) != null ? nkmVar.equals(fcuVar.f21289b) : fcuVar.f21289b == null)) {
            Float f = this.f21290c;
            Float f2 = fcuVar.f21290c;
            if (f != null ? f.equals(f2) : f2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM18134L;
        int iHashCode = this.f21288a.hashCode() ^ 1000003;
        nkm nkmVar = this.f21289b;
        if (nkmVar == null) {
            iM18134L = 0;
        } else if (nkmVar.m18142ac()) {
            iM18134L = nkmVar.m18134L();
        } else {
            int iM18134L2 = nkmVar.f44820aG;
            if (iM18134L2 == 0) {
                iM18134L2 = nkmVar.m18134L();
                nkmVar.f44820aG = iM18134L2;
            }
            iM18134L = iM18134L2;
        }
        int i = ((iHashCode * 1000003) ^ iM18134L) * 1000003;
        Float f = this.f21290c;
        return i ^ (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "CaptureStartStats{sessionType=" + String.valueOf(this.f21288a) + ", microvideoMetaData=" + String.valueOf(this.f21289b) + ", zoomValue=" + this.f21290c + "}";
    }
}
