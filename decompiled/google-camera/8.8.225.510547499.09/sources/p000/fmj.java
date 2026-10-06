package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fmj {

    /* JADX INFO: renamed from: a */
    public final flz f22561a;

    /* JADX INFO: renamed from: b */
    public final fmf f22562b;

    public fmj(flz flzVar, fmf fmfVar) {
        if (flzVar == null) {
            throw new NullPointerException("Null config");
        }
        this.f22561a = flzVar;
        this.f22562b = fmfVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8586a(fmj fmjVar) {
        return this.f22562b.equals(fmjVar.f22562b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fmj) {
            fmj fmjVar = (fmj) obj;
            if (this.f22561a.equals(fmjVar.f22561a) && this.f22562b.equals(fmjVar.f22562b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22561a.hashCode() ^ 1000003) * 1000003) ^ this.f22562b.hashCode();
    }

    public final String toString() {
        return "CaptureOneCameraRequest{config=" + String.valueOf(this.f22561a) + ", key=" + this.f22562b.toString() + "}";
    }

    public fmj() {
    }
}
