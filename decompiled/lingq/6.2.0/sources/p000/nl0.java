package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nl0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52901a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h27 f52902b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sq5 f52903c;

    public /* synthetic */ nl0(h27 h27Var, sq5 sq5Var, int i) {
        this.f52901a = i;
        this.f52902b = h27Var;
        this.f52903c = sq5Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f52901a;
        xfa xfaVar = xfa.f68157a;
        sq5 sq5Var = this.f52903c;
        h27 h27Var = this.f52902b;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                h27Var.m13005c(sq5Var, iIntValue, iIntValue2);
                break;
            default:
                h27Var.m13005c(sq5Var, iIntValue, iIntValue2);
                break;
        }
        return xfaVar;
    }
}
