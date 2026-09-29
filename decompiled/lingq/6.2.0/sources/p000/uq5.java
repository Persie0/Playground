package p000;

/* JADX INFO: loaded from: classes.dex */
public final class uq5 {

    /* JADX INFO: renamed from: a */
    public final String f64214a;

    /* JADX INFO: renamed from: b */
    public final i84 f64215b;

    public uq5(String str, i84 i84Var) {
        this.f64214a = str;
        this.f64215b = i84Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq5)) {
            return false;
        }
        uq5 uq5Var = (uq5) obj;
        return this.f64214a.equals(uq5Var.f64214a) && this.f64215b.equals(uq5Var.f64215b);
    }

    public final int hashCode() {
        return this.f64215b.hashCode() + (this.f64214a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f64214a + ", range=" + this.f64215b + ')';
    }
}
