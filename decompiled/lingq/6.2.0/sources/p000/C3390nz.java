package p000;

/* JADX INFO: renamed from: nz */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3390nz implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53424a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f53425b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f53426c;

    public /* synthetic */ C3390nz(vi3 vi3Var, int i, int i2) {
        this.f53424a = i2;
        this.f53425b = vi3Var;
        this.f53426c = i;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f53424a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f53426c;
        vi3 vi3Var = this.f53425b;
        switch (i) {
            case 0:
                vi3Var.invoke(new c15(100, i2));
                break;
            case 1:
                vi3Var.invoke(new c15(-100, i2));
                break;
            case 2:
                vi3Var.invoke(new c15(10, i2));
                break;
            case 3:
                vi3Var.invoke(new c15(-10, i2));
                break;
            case 4:
                vi3Var.invoke(new c15(6000, i2));
                break;
            case 5:
                vi3Var.invoke(new c15(-6000, i2));
                break;
            case 6:
                vi3Var.invoke(Integer.valueOf(i2));
                break;
            case 7:
                vi3Var.invoke(new h45(i2));
                break;
            case 8:
                vi3Var.invoke(Integer.valueOf(i2));
                break;
            case 9:
                vi3Var.invoke(new kra(i2));
                break;
            case 10:
                vi3Var.invoke(new uqa(i2));
                break;
            default:
                vi3Var.invoke(Integer.valueOf(i2));
                break;
        }
        return xfaVar;
    }
}
