package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qaa extends laa {

    /* JADX INFO: renamed from: a */
    public raa f57505a;

    @Override // p000.laa, p000.caa
    /* JADX INFO: renamed from: a */
    public final void mo4474a(daa daaVar) {
        raa raaVar = this.f57505a;
        int i = raaVar.f58991g0 - 1;
        raaVar.f58991g0 = i;
        if (i == 0) {
            raaVar.f58992h0 = false;
            raaVar.m10213q();
        }
        daaVar.mo10189I(this);
    }

    @Override // p000.laa, p000.caa
    /* JADX INFO: renamed from: c */
    public final void mo4476c(daa daaVar) {
        raa raaVar = this.f57505a;
        if (raaVar.f58992h0) {
            return;
        }
        raaVar.m10200U();
        raaVar.f58992h0 = true;
    }
}
