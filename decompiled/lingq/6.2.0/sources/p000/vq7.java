package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vq7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65788a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f65789b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f65790c;

    public /* synthetic */ vq7(vi3 vi3Var, boolean z) {
        this.f65788a = 2;
        this.f65790c = z;
        this.f65789b = vi3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f65788a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f65789b;
        boolean z = this.f65790c;
        switch (i) {
            case 0:
                vi3Var.invoke(Boolean.valueOf(!z));
                break;
            case 1:
                vi3Var.invoke(Boolean.valueOf(!z));
                break;
            default:
                if (z) {
                    vi3Var.invoke(i2a.f43391a);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ vq7(int i, vi3 vi3Var, boolean z) {
        this.f65788a = i;
        this.f65789b = vi3Var;
        this.f65790c = z;
    }
}
