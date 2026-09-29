package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z0b implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70735a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f70736b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n1b f70737c;

    public /* synthetic */ z0b(vi3 vi3Var, n1b n1bVar) {
        this.f70736b = vi3Var;
        this.f70737c = n1bVar;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f70735a;
        xfa xfaVar = xfa.f68157a;
        n1b n1bVar = this.f70737c;
        vi3 vi3Var = this.f70736b;
        switch (i) {
            case 0:
                w0b w0bVar = n1bVar.f52195e;
                if (w0bVar.f66188a) {
                    vi3Var.invoke(new k0b(w0bVar.f66189b, w0bVar.f66190c));
                }
                break;
            default:
                r0b r0bVar = n1bVar.f52194d;
                vi3Var.invoke(new n0b(r0bVar.f58465a, r0bVar.f58466b));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ z0b(n1b n1bVar, vi3 vi3Var) {
        this.f70737c = n1bVar;
        this.f70736b = vi3Var;
    }
}
