package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lw6 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f50207b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f50208c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ i48 f50209d;

    public /* synthetic */ lw6(t66 t66Var, zi3 zi3Var, i48 i48Var, int i, int i2) {
        this.f50206a = i2;
        this.f50207b = t66Var;
        this.f50208c = zi3Var;
        this.f50209d = i48Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f50206a;
        xfa xfaVar = xfa.f68157a;
        i48 i48Var = this.f50209d;
        zi3 zi3Var = this.f50208c;
        t66 t66Var = this.f50207b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                oxb.m18562a(t66Var, zi3Var, i48Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                oxb.m18568g(t66Var, zi3Var, i48Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
