package p000;

/* JADX INFO: renamed from: kw */
/* JADX INFO: loaded from: classes.dex */
public final class C3276kw extends AbstractC3387nw {

    /* JADX INFO: renamed from: a */
    public final y27 f48488a;

    /* JADX INFO: renamed from: b */
    public final kt2 f48489b;

    public C3276kw(y27 y27Var, kt2 kt2Var) {
        this.f48488a = y27Var;
        this.f48489b = kt2Var;
    }

    @Override // p000.AbstractC3387nw
    /* JADX INFO: renamed from: a */
    public final y27 mo14691a() {
        return this.f48488a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3276kw)) {
            return false;
        }
        C3276kw c3276kw = (C3276kw) obj;
        return fa4.m11650l(this.f48488a, c3276kw.f48488a) && this.f48489b.equals(c3276kw.f48489b);
    }

    public final int hashCode() {
        y27 y27Var = this.f48488a;
        return this.f48489b.hashCode() + ((y27Var == null ? 0 : y27Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f48488a + ", result=" + this.f48489b + ')';
    }
}
