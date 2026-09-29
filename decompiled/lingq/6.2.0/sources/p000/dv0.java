package p000;

import com.lingq.core.p012ui.chart.AbstractC1917a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dv0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36254a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f36255b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ic5 f36256c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f36257d;

    public /* synthetic */ dv0(e16 e16Var, ic5 ic5Var, vi3 vi3Var, int i, int i2) {
        this.f36254a = i2;
        this.f36255b = e16Var;
        this.f36256c = ic5Var;
        this.f36257d = vi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f36254a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f36257d;
        ic5 ic5Var = this.f36256c;
        e16 e16Var = this.f36255b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                q6d.m19684a(e16Var, ic5Var, vi3Var, ye1Var, pk9.m19383z(449));
                break;
            default:
                AbstractC1917a.m8795a(e16Var, ic5Var, vi3Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
