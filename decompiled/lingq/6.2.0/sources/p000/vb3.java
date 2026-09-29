package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vb3 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65160a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f65161b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f65162c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f65163d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ui3 f65164e;

    public /* synthetic */ vb3(boolean z, int i, vi3 vi3Var, ui3 ui3Var, int i2) {
        this.f65161b = z;
        this.f65162c = i;
        this.f65163d = vi3Var;
        this.f65164e = ui3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f65160a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(49);
                tdd.m21966a(this.f65162c, iM19383z, (ye1) obj, this.f65164e, this.f65163d, this.f65161b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(1);
                rfd.m20653b(this.f65162c, iM19383z2, (ye1) obj, this.f65164e, this.f65163d, this.f65161b);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(1 | this.f65162c);
                u4d.m22468c(this.f65161b, this.f65163d, this.f65164e, (ye1) obj, iM19383z3);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ vb3(boolean z, ui3 ui3Var, vi3 vi3Var, int i, int i2) {
        this.f65161b = z;
        this.f65164e = ui3Var;
        this.f65163d = vi3Var;
        this.f65162c = i;
    }

    public /* synthetic */ vb3(boolean z, vi3 vi3Var, ui3 ui3Var, int i) {
        this.f65161b = z;
        this.f65163d = vi3Var;
        this.f65164e = ui3Var;
        this.f65162c = i;
    }
}
