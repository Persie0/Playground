package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class fza implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39974a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f39975b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i1b f39976c;

    public /* synthetic */ fza(vi3 vi3Var, i1b i1bVar, int i) {
        this.f39974a = i;
        this.f39975b = vi3Var;
        this.f39976c = i1bVar;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f39974a;
        xfa xfaVar = xfa.f68157a;
        i1b i1bVar = this.f39976c;
        vi3 vi3Var = this.f39975b;
        switch (i) {
            case 0:
                vi3Var.invoke(new aza(i1bVar.f43357a.f39761d));
                break;
            default:
                vi3Var.invoke(new oza(i1bVar.f43357a.f39761d));
                break;
        }
        return xfaVar;
    }
}
