package p000;

import kotlinx.datetime.YearMonth;

/* JADX INFO: loaded from: classes3.dex */
public final class kab extends AbstractC2947e0 {

    /* JADX INFO: renamed from: a */
    public final pl0 f46952a;

    public kab(pl0 pl0Var) {
        this.f46952a = pl0Var;
    }

    @Override // p000.AbstractC2947e0
    /* JADX INFO: renamed from: a */
    public final pl0 mo4679a() {
        return this.f46952a;
    }

    @Override // p000.AbstractC2947e0
    /* JADX INFO: renamed from: b */
    public final nm1 mo4680b() {
        return lab.f49375a;
    }

    @Override // p000.AbstractC2947e0
    /* JADX INFO: renamed from: d */
    public final Object mo4681d(nm1 nm1Var) {
        k34 k34Var = (k34) nm1Var;
        k34Var.getClass();
        Integer num = k34Var.f46617a;
        lab.m16050a(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = k34Var.f46618b;
        lab.m16050a(num2, "monthNumber");
        return new YearMonth(iIntValue, num2.intValue());
    }
}
