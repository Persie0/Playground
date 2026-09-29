package p000;

import com.airbnb.lottie.C0868b;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xi8 implements i90, qk1 {

    /* JADX INFO: renamed from: a */
    public final C0868b f68259a;

    /* JADX INFO: renamed from: b */
    public final m90 f68260b;

    /* JADX INFO: renamed from: c */
    public u39 f68261c;

    public xi8(C0868b c0868b, o90 o90Var, wi8 wi8Var) {
        this.f68259a = c0868b;
        m90 m90VarMo550a = wi8Var.f66861a.mo550a();
        this.f68260b = m90VarMo550a;
        o90Var.m17863e(m90VarMo550a);
        m90VarMo550a.m16687a(this);
    }

    /* JADX INFO: renamed from: c */
    public static int m24526c(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // p000.i90
    /* JADX INFO: renamed from: a */
    public final void mo9827a() {
        this.f68259a.invalidateSelf();
    }

    @Override // p000.qk1
    /* JADX INFO: renamed from: b */
    public final void mo9828b(List list, List list2) {
    }
}
