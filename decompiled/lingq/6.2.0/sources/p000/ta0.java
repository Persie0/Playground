package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ta0 implements xl6 {

    /* JADX INFO: renamed from: a */
    public final d33 f62036a;

    public ta0(d33 d33Var) {
        this.f62036a = d33Var;
    }

    @Override // p000.mc3
    /* JADX INFO: renamed from: a */
    public final pc3 mo337a() {
        return this.f62036a.mo10071a();
    }

    @Override // p000.mc3
    /* JADX INFO: renamed from: b */
    public final t47 mo338b() {
        return this.f62036a.mo10072b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ta0) {
            return this.f62036a.equals(((ta0) obj).f62036a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f62036a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.f62036a + ')';
    }
}
