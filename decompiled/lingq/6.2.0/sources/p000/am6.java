package p000;

/* JADX INFO: loaded from: classes.dex */
public final class am6 implements eaa {

    /* JADX INFO: renamed from: a */
    public final saa f829a;

    /* JADX INFO: renamed from: b */
    public final f04 f830b;

    public am6(saa saaVar, f04 f04Var) {
        this.f829a = saaVar;
        this.f830b = f04Var;
    }

    @Override // p000.eaa
    /* JADX INFO: renamed from: a */
    public final void mo557a() {
        f04 f04Var = this.f830b;
        boolean z = f04Var instanceof hn9;
        saa saaVar = this.f829a;
        if (z) {
            saaVar.mo11812p(((hn9) f04Var).f42663a);
        } else if (f04Var instanceof kt2) {
            saaVar.mo11813s(((kt2) f04Var).f48405a);
        } else {
            gm5.m12750e();
        }
    }
}
