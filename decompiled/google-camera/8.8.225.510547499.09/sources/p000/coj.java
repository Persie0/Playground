package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class coj {

    /* JADX INFO: renamed from: a */
    public final key f6437a;

    /* JADX INFO: renamed from: b */
    public final kgg f6438b;

    public coj() {
    }

    public coj(key keyVar, kgg kggVar) {
        this.f6437a = keyVar;
        this.f6438b = kggVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof coj) {
            coj cojVar = (coj) obj;
            if (this.f6437a.equals(cojVar.f6437a) && this.f6438b.equals(cojVar.f6438b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6437a.hashCode() ^ 1000003) * 1000003) ^ this.f6438b.hashCode();
    }

    public final String toString() {
        return "FrameFeature{frame=" + this.f6437a.toString() + ", stream=" + this.f6438b.toString() + "}";
    }
}
