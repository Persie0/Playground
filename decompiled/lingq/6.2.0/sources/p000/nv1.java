package p000;

import com.lingq.feature.challenges.cup.data.CupPhase;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nv1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53279a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zt1 f53280b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CupPhase f53281c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f53282d;

    public /* synthetic */ nv1(zt1 zt1Var, CupPhase cupPhase, int i, int i2) {
        this.f53279a = i2;
        this.f53280b = zt1Var;
        this.f53281c = cupPhase;
        this.f53282d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f53279a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f53282d;
        CupPhase cupPhase = this.f53281c;
        zt1 zt1Var = this.f53280b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                rv1.m20861f(zt1Var, cupPhase, ye1Var, pk9.m19383z(i2 | 1));
                break;
            default:
                rv1.m20860e(zt1Var, cupPhase, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }
}
