package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q46 implements ht5 {

    /* JADX INFO: renamed from: a */
    public final p46 f57264a;

    public q46(p46 p46Var) {
        this.f57264a = p46Var;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: a */
    public final int mo737a(aa4 aa4Var, List list, int i) {
        return this.f57264a.mo1203a(aa4Var, AbstractC3489q9.m19783m(aa4Var), i);
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        return this.f57264a.mo1204b(jt5Var, AbstractC3489q9.m19783m(jt5Var), j);
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: c */
    public final int mo739c(aa4 aa4Var, List list, int i) {
        return this.f57264a.mo1205c(aa4Var, AbstractC3489q9.m19783m(aa4Var), i);
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: d */
    public final int mo740d(aa4 aa4Var, List list, int i) {
        return this.f57264a.mo1206d(aa4Var, AbstractC3489q9.m19783m(aa4Var), i);
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: e */
    public final int mo741e(aa4 aa4Var, List list, int i) {
        return this.f57264a.mo1207e(aa4Var, AbstractC3489q9.m19783m(aa4Var), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q46) && fa4.m11650l(this.f57264a, ((q46) obj).f57264a);
    }

    public final int hashCode() {
        return this.f57264a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f57264a + ')';
    }
}
