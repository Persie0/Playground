package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ty7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63097a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Integer f63098b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f63099c;

    public /* synthetic */ ty7(Integer num, vi3 vi3Var, int i) {
        this.f63097a = i;
        this.f63098b = num;
        this.f63099c = vi3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f63097a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f63099c;
        Integer num = this.f63098b;
        switch (i) {
            case 0:
                if (num != null) {
                    vi3Var.invoke(new vu7(num.intValue()));
                }
                break;
            case 1:
                if (num != null) {
                    vi3Var.invoke(new tu7(num.intValue()));
                }
                break;
            case 2:
                if (num != null) {
                    vi3Var.invoke(new yra(num.intValue()));
                }
                break;
            default:
                if (num != null) {
                    vi3Var.invoke(new xra(num.intValue()));
                }
                break;
        }
        return xfaVar;
    }
}
