package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hnx {

    /* JADX INFO: renamed from: a */
    public final hnv f28547a;

    /* JADX INFO: renamed from: b */
    public final hnv f28548b;

    public hnx() {
    }

    public hnx(hnv hnvVar, hnv hnvVar2) {
        this.f28547a = hnvVar;
        this.f28548b = hnvVar2;
    }

    /* JADX INFO: renamed from: a */
    public static jdx m10521a() {
        return new jdx();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hnx) {
            hnx hnxVar = (hnx) obj;
            if (this.f28547a.equals(hnxVar.f28547a) && this.f28548b.equals(hnxVar.f28548b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f28547a.hashCode() ^ 1000003) * 1000003) ^ this.f28548b.hashCode();
    }

    public final String toString() {
        return "TwoLevelThermalStates{early=" + String.valueOf(this.f28547a) + ", late=" + String.valueOf(this.f28548b) + "}";
    }
}
