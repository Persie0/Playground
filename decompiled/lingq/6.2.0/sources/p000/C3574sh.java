package p000;

/* JADX INFO: renamed from: sh */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3574sh implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60853a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f60854b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f60855c;

    public /* synthetic */ C3574sh(int i, int i2, e16 e16Var) {
        this.f60854b = e16Var;
        this.f60855c = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f60853a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f60855c;
        e16 e16Var = this.f60854b;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                AbstractC3685vh.m23282b(pk9.m19383z(1), i2, ye1Var, e16Var);
                break;
            default:
                num.intValue();
                qh0.m19963a(e16Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3574sh(e16 e16Var, int i) {
        this.f60854b = e16Var;
        this.f60855c = i;
    }
}
