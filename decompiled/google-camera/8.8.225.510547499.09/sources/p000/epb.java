package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class epb {

    /* JADX INFO: renamed from: a */
    public final eqz f14945a;

    /* JADX INFO: renamed from: b */
    public final String f14946b;

    /* JADX INFO: renamed from: c */
    public final hsu f14947c;

    public epb(eqz eqzVar, String str, hsu hsuVar) {
        if (eqzVar == null) {
            throw new NullPointerException("Null option");
        }
        this.f14945a = eqzVar;
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.f14946b = str;
        this.f14947c = hsuVar;
    }

    /* JADX INFO: renamed from: a */
    static epb m7608a(eqz eqzVar, String str, hsu hsuVar) {
        return new epb(eqzVar, str, hsuVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof epb) {
            epb epbVar = (epb) obj;
            if (this.f14945a.equals(epbVar.f14945a) && this.f14946b.equals(epbVar.f14946b) && this.f14947c.equals(epbVar.f14947c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14945a.hashCode() ^ 1000003) * 1000003) ^ this.f14946b.hashCode()) * 1000003) ^ this.f14947c.hashCode();
    }

    public final String toString() {
        return "Data{option=" + this.f14945a.toString() + ", title=" + this.f14946b + ", subModeTab=" + this.f14947c.toString() + "}";
    }

    public epb() {
    }
}
