package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class k34 implements iab, nm1 {

    /* JADX INFO: renamed from: a */
    public Integer f46617a;

    /* JADX INFO: renamed from: b */
    public Integer f46618b;

    public k34(Integer num, Integer num2) {
        this.f46617a = num;
        this.f46618b = num2;
    }

    @Override // p000.iab
    /* JADX INFO: renamed from: c */
    public final void mo11512c(Integer num) {
        this.f46618b = num;
    }

    @Override // p000.nm1
    public final Object copy() {
        return new k34(this.f46617a, this.f46618b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k34)) {
            return false;
        }
        k34 k34Var = (k34) obj;
        return fa4.m11650l(this.f46617a, k34Var.f46617a) && fa4.m11650l(this.f46618b, k34Var.f46618b);
    }

    @Override // p000.iab
    /* JADX INFO: renamed from: f */
    public final Integer mo11513f() {
        return this.f46617a;
    }

    public final int hashCode() {
        Integer num = this.f46617a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f46618b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // p000.iab
    /* JADX INFO: renamed from: k */
    public final void mo11516k(Integer num) {
        this.f46617a = num;
    }

    @Override // p000.iab
    /* JADX INFO: renamed from: l */
    public final Integer mo11517l() {
        return this.f46618b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object obj = this.f46617a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append('-');
        Integer num = this.f46618b;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }
}
