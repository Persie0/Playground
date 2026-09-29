package p000;

/* JADX INFO: loaded from: classes.dex */
public final class sa2 implements ma1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60577a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ta2 f60578b;

    public /* synthetic */ sa2(ta2 ta2Var, int i) {
        this.f60577a = i;
        this.f60578b = ta2Var;
    }

    @Override // p000.ma1
    /* JADX INFO: renamed from: c */
    public final long mo16640c() {
        int i = this.f60577a;
        ta2 ta2Var = this.f60578b;
        switch (i) {
            case 0:
                long jMo16640c = ta2Var.f62042O.mo16640c();
                if (jMo16640c != 16) {
                    return jMo16640c;
                }
                ch8 ch8Var = (ch8) thb.m22050i(ta2Var, gh8.f40824b);
                if (ch8Var != null) {
                    long j = ch8Var.f10093a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((aa1) thb.m22050i(ta2Var, sk1.f60948a)).f414a;
            default:
                return ((ms5) thb.m22050i(ta2Var, ps5.f56764b)).f51799a.f55852f;
        }
    }
}
