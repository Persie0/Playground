package p000;

import com.lingq.feature.challenges.cup.AbstractC1976c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ow1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55054a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tw1 f55055b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e16 f55056c;

    public /* synthetic */ ow1(tw1 tw1Var, e16 e16Var, int i, int i2) {
        this.f55054a = i2;
        this.f55055b = tw1Var;
        this.f55056c = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f55054a;
        xfa xfaVar = xfa.f68157a;
        e16 e16Var = this.f55056c;
        tw1 tw1Var = this.f55055b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC1976c.m8818a(tw1Var, e16Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                AbstractC1976c.m8840w(tw1Var, e16Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
