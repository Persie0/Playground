package p000;

import com.lingq.feature.review.components.AbstractC2753a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class go5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41078a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f41079b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f41080c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f41081d;

    public /* synthetic */ go5(boolean z, ui3 ui3Var, int i, int i2) {
        this.f41078a = i2;
        this.f41079b = z;
        this.f41080c = ui3Var;
        this.f41081d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f41078a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f41081d;
        ui3 ui3Var = this.f41080c;
        boolean z = this.f41079b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                wnb.m24084a(z, ui3Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
            default:
                AbstractC2753a.m9589c(z, ui3Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }
}
