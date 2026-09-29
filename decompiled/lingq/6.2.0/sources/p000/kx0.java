package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kx0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48533a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jv0 f48534b;

    public /* synthetic */ kx0(jv0 jv0Var, int i) {
        this.f48533a = i;
        this.f48534b = jv0Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f48533a;
        xfa xfaVar = xfa.f68157a;
        jv0 jv0Var = this.f48534b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                jv0Var.mo8892s(str);
                break;
            case 1:
                jv0Var.mo8889p(((Integer) obj).intValue());
                break;
            case 2:
                oz0 oz0Var = (oz0) obj;
                oz0Var.getClass();
                jv0Var.mo8879f(oz0Var.f55317b);
                break;
            case 3:
                e05 e05Var = (e05) obj;
                e05Var.getClass();
                jv0Var.mo8891r(e05Var);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                jv0Var.mo8878e(str2);
                break;
        }
        return xfaVar;
    }
}
