package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lu6 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50145a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f50146b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f50147c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f50148d;

    public /* synthetic */ lu6(ui3 ui3Var, vi3 vi3Var, t66 t66Var) {
        this.f50147c = ui3Var;
        this.f50146b = vi3Var;
        this.f50148d = t66Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f50145a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f50148d;
        ui3 ui3Var = this.f50147c;
        vi3 vi3Var = this.f50146b;
        switch (i) {
            case 0:
                ui3Var.mo0a();
                vi3Var.invoke(((vv9) t66Var.getValue()).f65990a.f54604b);
                break;
            default:
                if (!vk9.m23391n0((String) t66Var.getValue())) {
                    vi3Var.invoke((String) t66Var.getValue());
                }
                ui3Var.mo0a();
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ lu6(vi3 vi3Var, ui3 ui3Var, t66 t66Var) {
        this.f50146b = vi3Var;
        this.f50147c = ui3Var;
        this.f50148d = t66Var;
    }
}
