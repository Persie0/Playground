package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ima extends AbstractC2947e0 {

    /* JADX INFO: renamed from: a */
    public final pl0 f44297a;

    public ima(pl0 pl0Var) {
        this.f44297a = pl0Var;
    }

    @Override // p000.AbstractC2947e0
    /* JADX INFO: renamed from: a */
    public final pl0 mo4679a() {
        return this.f44297a;
    }

    @Override // p000.AbstractC2947e0
    /* JADX INFO: renamed from: b */
    public final nm1 mo4680b() {
        return jma.f45842d;
    }

    @Override // p000.AbstractC2947e0
    /* JADX INFO: renamed from: d */
    public final Object mo4681d(nm1 nm1Var) {
        j34 j34Var = (j34) nm1Var;
        j34Var.getClass();
        int i = fa4.m11650l(j34Var.f45005a, Boolean.TRUE) ? -1 : 1;
        Integer num = j34Var.f45006b;
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() * i) : null;
        Integer num2 = j34Var.f45007c;
        Integer numValueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i) : null;
        Integer num3 = j34Var.f45008d;
        return lma.m16388a(numValueOf, numValueOf2, num3 != null ? Integer.valueOf(num3.intValue() * i) : null);
    }
}
