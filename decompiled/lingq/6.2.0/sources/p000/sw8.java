package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class sw8 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f61517b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zaa f61518c;

    public /* synthetic */ sw8(vi3 vi3Var, zaa zaaVar, int i) {
        this.f61516a = i;
        this.f61517b = vi3Var;
        this.f61518c = zaaVar;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f61516a;
        xfa xfaVar = xfa.f68157a;
        zaa zaaVar = this.f61518c;
        vi3 vi3Var = this.f61517b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                vi3Var.invoke(new g15(zaaVar.f71294a, str));
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                vi3Var.invoke(new o15(zaaVar.f71294a, str2));
                break;
        }
        return xfaVar;
    }
}
