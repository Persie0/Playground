package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ihx {

    /* JADX INFO: renamed from: a */
    public final kbc f31019a;

    /* JADX INFO: renamed from: b */
    public final kan f31020b;

    /* JADX INFO: renamed from: c */
    public final mrm f31021c;

    /* JADX INFO: renamed from: d */
    private final kmq f31022d;

    public ihx() {
    }

    public ihx(kmq kmqVar, kbc kbcVar, kan kanVar, mrm mrmVar) {
        this.f31022d = kmqVar;
        this.f31019a = kbcVar;
        this.f31020b = kanVar;
        this.f31021c = mrmVar;
    }

    /* JADX INFO: renamed from: a */
    public static ihx m11369a(kmq kmqVar, kbc kbcVar, kan kanVar) {
        return m11370b(kmqVar, kbcVar, kanVar, mqu.f41450a);
    }

    /* JADX INFO: renamed from: b */
    public static ihx m11370b(kmq kmqVar, kbc kbcVar, kan kanVar, mrm mrmVar) {
        if (kmqVar == null) {
            throw new NullPointerException("Null cameraFacing");
        }
        if (kbcVar != null) {
            return new ihx(kmqVar, kbcVar, kanVar, mrmVar);
        }
        throw new NullPointerException("Null resolution");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ihx) {
            ihx ihxVar = (ihx) obj;
            if (this.f31022d.equals(ihxVar.f31022d) && this.f31019a.equals(ihxVar.f31019a) && this.f31020b.equals(ihxVar.f31020b) && this.f31021c.equals(ihxVar.f31021c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f31022d.hashCode() ^ 1000003) * 1000003) ^ this.f31019a.hashCode()) * 1000003) ^ this.f31020b.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "ViewfinderConfig{cameraFacing=" + String.valueOf(this.f31022d) + ", resolution=" + String.valueOf(this.f31019a) + ", aspectRatio=" + String.valueOf(this.f31020b) + ", format=" + String.valueOf(this.f31021c) + "}";
    }
}
