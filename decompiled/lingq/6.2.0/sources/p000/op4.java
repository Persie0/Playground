package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class op4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fk9 f54681b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tg9 f54682c;

    public /* synthetic */ op4(fk9 fk9Var, tg9 tg9Var, int i, int i2) {
        this.f54680a = i2;
        this.f54681b = fk9Var;
        this.f54682c = tg9Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f54680a;
        xfa xfaVar = xfa.f68157a;
        tg9 tg9Var = this.f54682c;
        fk9 fk9Var = this.f54681b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                gid.m12674a(fk9Var, tg9Var, ye1Var, pk9.m19383z(1));
                break;
            case 1:
                gpb.m12794a(fk9Var, tg9Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                t3d.m21835a(fk9Var, tg9Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
