package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzp {

    /* JADX INFO: renamed from: a */
    public final hzo f30074a;

    /* JADX INFO: renamed from: b */
    public final hzm f30075b;

    /* JADX INFO: renamed from: c */
    public final hzt f30076c;

    /* JADX INFO: renamed from: d */
    public final hzs f30077d;

    public hzp(hzo hzoVar, hzm hzmVar, hzt hztVar, hzs hzsVar) {
        this.f30074a = hzoVar;
        if (hzmVar == null) {
            throw new NullPointerException("Null boxes");
        }
        this.f30075b = hzmVar;
        this.f30076c = hztVar;
        this.f30077d = hzsVar;
    }

    /* JADX INFO: renamed from: a */
    public static hzp m10949a(hzo hzoVar, hzm hzmVar, hzt hztVar, hzs hzsVar) {
        return new hzp(hzoVar, hzmVar, hztVar, hzsVar);
    }

    public final boolean equals(Object obj) {
        hzt hztVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hzp)) {
            return false;
        }
        hzp hzpVar = (hzp) obj;
        if (this.f30074a.equals(hzpVar.f30074a) && this.f30075b.equals(hzpVar.f30075b) && ((hztVar = this.f30076c) != null ? hztVar.equals(hzpVar.f30076c) : hzpVar.f30076c == null)) {
            hzs hzsVar = this.f30077d;
            hzs hzsVar2 = hzpVar.f30077d;
            if (hzsVar != null ? hzsVar.equals(hzsVar2) : hzsVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f30074a.hashCode() ^ 1000003) * 1000003) ^ this.f30075b.hashCode();
        hzt hztVar = this.f30076c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (hztVar == null ? 0 : hztVar.hashCode())) * 1000003;
        hzs hzsVar = this.f30077d;
        return iHashCode2 ^ (hzsVar != null ? hzsVar.hashCode() : 0);
    }

    public final String toString() {
        return "CameraLayoutHolder{layoutConstants=" + this.f30074a.toString() + ", boxes=" + this.f30075b.toString() + ", viewfinderSpec=" + String.valueOf(this.f30076c) + ", constraintsSetter=" + String.valueOf(this.f30077d) + "}";
    }

    public hzp() {
    }
}
