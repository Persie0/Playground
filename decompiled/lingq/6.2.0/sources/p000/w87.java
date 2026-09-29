package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w87 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66523a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f66524b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0282a f66525c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f66526d;

    public /* synthetic */ w87(e16 e16Var, C0282a c0282a, int i, int i2) {
        this.f66523a = i2;
        this.f66524b = e16Var;
        this.f66525c = c0282a;
        this.f66526d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f66523a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f66526d;
        C0282a c0282a = this.f66525c;
        e16 e16Var = this.f66524b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                l70.m15940c(e16Var, c0282a, ye1Var, pk9.m19383z(i2 | 1));
                break;
            default:
                l70.m15938b(e16Var, c0282a, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }
}
