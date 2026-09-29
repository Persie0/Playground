package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class tw8 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63019a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f63020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zaa f63021c;

    public /* synthetic */ tw8(vi3 vi3Var, zaa zaaVar, int i) {
        this.f63019a = i;
        this.f63020b = vi3Var;
        this.f63021c = zaaVar;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f63019a;
        xfa xfaVar = xfa.f68157a;
        zaa zaaVar = this.f63021c;
        vi3 vi3Var = this.f63020b;
        switch (i) {
            case 0:
                vi3Var.invoke(new h15(zaaVar.f71294a));
                break;
            default:
                vi3Var.invoke(new p15(zaaVar.f71294a));
                break;
        }
        return xfaVar;
    }
}
