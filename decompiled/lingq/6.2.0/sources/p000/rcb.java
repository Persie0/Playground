package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rcb implements i70 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ so3 f59096a;

    public rcb(so3 so3Var) {
        this.f59096a = so3Var;
    }

    @Override // p000.i70
    /* JADX INFO: renamed from: a */
    public final void mo12374a(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        so3 so3Var = this.f59096a;
        so3Var.f61092H.sendMessage(so3Var.f61092H.obtainMessage(1, boolValueOf));
    }
}
