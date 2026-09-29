package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: renamed from: xk */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3762xk implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68309a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f68310b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0282a f68311c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f68312d;

    public /* synthetic */ C3762xk(e16 e16Var, C0282a c0282a, int i, int i2) {
        this.f68309a = i2;
        this.f68310b = e16Var;
        this.f68311c = c0282a;
        this.f68312d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f68309a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f68312d;
        C0282a c0282a = this.f68311c;
        e16 e16Var = this.f68310b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                d32.m10061u(e16Var, c0282a, ye1Var, pk9.m19383z(i2 | 1));
                break;
            case 1:
                d32.m10062v(e16Var, c0282a, ye1Var, pk9.m19383z(i2 | 1));
                break;
            default:
                u82.m22535d(e16Var, c0282a, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }
}
