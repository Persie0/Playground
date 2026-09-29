package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class c45 implements uf7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9476a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f9477b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f9478c;

    public /* synthetic */ c45(int i, ui3 ui3Var, t66 t66Var) {
        this.f9476a = i;
        this.f9477b = t66Var;
        this.f9478c = ui3Var;
    }

    @Override // p000.uf7
    /* JADX INFO: renamed from: e */
    public final void mo3849e() {
        int i = this.f9476a;
        ui3 ui3Var = this.f9478c;
        t66 t66Var = this.f9477b;
        switch (i) {
            case 0:
                t66Var.setValue(Boolean.FALSE);
                ui3Var.mo0a();
                break;
            default:
                t66Var.setValue(Boolean.FALSE);
                ui3Var.mo0a();
                break;
        }
    }

    @Override // p000.uf7
    public final void onDismiss() {
        int i = this.f9476a;
        t66 t66Var = this.f9477b;
        switch (i) {
            case 0:
                t66Var.setValue(Boolean.FALSE);
                break;
            default:
                t66Var.setValue(Boolean.FALSE);
                break;
        }
    }
}
