package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class paa extends laa {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55899a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ daa f55900b;

    public /* synthetic */ paa(daa daaVar, int i) {
        this.f55899a = i;
        this.f55900b = daaVar;
    }

    @Override // p000.laa, p000.caa
    /* JADX INFO: renamed from: a */
    public void mo4474a(daa daaVar) {
        switch (this.f55899a) {
            case 0:
                this.f55900b.mo10192M();
                daaVar.mo10189I(this);
                break;
        }
    }

    @Override // p000.laa, p000.caa
    /* JADX INFO: renamed from: g */
    public void mo4480g(daa daaVar) {
        switch (this.f55899a) {
            case 1:
                raa raaVar = (raa) this.f55900b;
                raaVar.f58989e0.remove(daaVar);
                if (!raaVar.mo10183A()) {
                    raaVar.m10186F(raaVar, uk9.f64029d, false);
                    raaVar.f35320R = true;
                    raaVar.m10186F(raaVar, uk9.f64028c, false);
                }
                break;
        }
    }
}
