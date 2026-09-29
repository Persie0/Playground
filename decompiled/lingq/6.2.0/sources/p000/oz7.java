package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class oz7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f55329b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a29 f55330c;

    public /* synthetic */ oz7(vi3 vi3Var, a29 a29Var, int i) {
        this.f55328a = i;
        this.f55329b = vi3Var;
        this.f55330c = a29Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f55328a;
        xfa xfaVar = xfa.f68157a;
        a29 a29Var = this.f55330c;
        vi3 vi3Var = this.f55329b;
        switch (i) {
            case 0:
                vi3Var.invoke(new ez7(a29Var.f131c));
                break;
            case 1:
                vi3Var.invoke(new ff8(a29Var.f131c));
                break;
            default:
                vi3Var.invoke(new u09(a29Var.f131c));
                break;
        }
        return xfaVar;
    }
}
