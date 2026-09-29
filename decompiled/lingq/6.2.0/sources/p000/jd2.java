package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jd2 extends kd2 {

    /* JADX INFO: renamed from: a */
    public final Boolean f45437a;

    /* JADX INFO: renamed from: b */
    public final Double f45438b;

    public jd2(Boolean bool, Double d) {
        this.f45437a = bool;
        this.f45438b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd2)) {
            return false;
        }
        jd2 jd2Var = (jd2) obj;
        return fa4.m11650l(this.f45437a, jd2Var.f45437a) && fa4.m11650l(this.f45438b, jd2Var.f45438b);
    }

    public final int hashCode() {
        Boolean bool = this.f45437a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.f45438b;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateConfig(enabled=" + this.f45437a + ", sampleRate=" + this.f45438b + ')';
    }
}
