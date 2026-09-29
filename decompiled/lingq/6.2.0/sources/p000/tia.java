package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tia implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62349a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f62350b;

    public /* synthetic */ tia(int i, t66 t66Var) {
        this.f62349a = i;
        this.f62350b = t66Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f62349a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f62350b;
        switch (i) {
            case 0:
                t66Var.setValue(new gq6(((gq6) obj).f41189a));
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                t66Var.setValue(str);
                break;
            case 2:
                q98 q98Var = (q98) obj;
                q98Var.getClass();
                q98Var.m19813c(((Boolean) t66Var.getValue()).booleanValue() ? 1.0f : 0.0f);
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                t66Var.setValue(bool);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                t66Var.setValue(bool2);
                break;
        }
        return xfaVar;
    }
}
