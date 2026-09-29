package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class w29 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f66307b;

    public /* synthetic */ w29(vi3 vi3Var, int i) {
        this.f66306a = i;
        this.f66307b = vi3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f66306a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f66307b;
        switch (i) {
            case 0:
                vi3Var.invoke(n09.f52147a);
                break;
            case 1:
                vi3Var.invoke(a19.f67a);
                break;
            case 2:
                vi3Var.invoke(d19.f34852a);
                break;
            default:
                vi3Var.invoke(w09.f66187a);
                break;
        }
        return xfaVar;
    }
}
