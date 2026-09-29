package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vy7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66099a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hx7 f66100b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f66101c;

    public /* synthetic */ vy7(hx7 hx7Var, vi3 vi3Var, int i) {
        this.f66099a = i;
        this.f66100b = hx7Var;
        this.f66101c = vi3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f66099a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f66101c;
        hx7 hx7Var = this.f66100b;
        switch (i) {
            case 0:
                String str = hx7Var.f43112a;
                if (str != null) {
                    vi3Var.invoke(new ou7(str));
                }
                break;
            default:
                String str2 = hx7Var.f43112a;
                if (str2 != null) {
                    vi3Var.invoke(new tra(str2));
                }
                break;
        }
        return xfaVar;
    }
}
