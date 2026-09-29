package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pw1 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56885a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f56886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f56887c;

    public /* synthetic */ pw1(vi3 vi3Var, String str, int i) {
        this.f56885a = i;
        this.f56886b = vi3Var;
        this.f56887c = str;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f56885a;
        xfa xfaVar = xfa.f68157a;
        String str = this.f56887c;
        vi3 vi3Var = this.f56886b;
        switch (i) {
            case 0:
                vi3Var.invoke(new yg6(str));
                break;
            case 1:
                vi3Var.invoke(str);
                break;
            case 2:
                vi3Var.invoke(str);
                break;
            default:
                vi3Var.invoke(str);
                break;
        }
        return xfaVar;
    }
}
