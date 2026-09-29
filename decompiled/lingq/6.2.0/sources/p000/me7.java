package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class me7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51208a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f51209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f51210c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f51211d;

    public /* synthetic */ me7(ui3 ui3Var, vi3 vi3Var, String str) {
        this.f51208a = 0;
        this.f51211d = ui3Var;
        this.f51209b = vi3Var;
        this.f51210c = str;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f51208a;
        xfa xfaVar = xfa.f68157a;
        ui3 ui3Var = this.f51211d;
        String str = this.f51210c;
        vi3 vi3Var = this.f51209b;
        switch (i) {
            case 0:
                ui3Var.mo0a();
                vi3Var.invoke(str);
                break;
            case 1:
                vi3Var.invoke(str);
                ui3Var.mo0a();
                break;
            default:
                vi3Var.invoke(str);
                ui3Var.mo0a();
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ me7(vi3 vi3Var, String str, ui3 ui3Var, int i) {
        this.f51208a = i;
        this.f51209b = vi3Var;
        this.f51210c = str;
        this.f51211d = ui3Var;
    }
}
