package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jw9 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46324a;

    public /* synthetic */ jw9(int i) {
        this.f46324a = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f46324a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((iq2) obj).f44417a = (String) obj2;
                return xfaVar;
            case 1:
                ((iq2) obj).f44420d = (on3) obj2;
                return xfaVar;
            case 2:
                ((iq2) obj).f44418b = (ux9) obj2;
                return xfaVar;
            case 3:
                ((iq2) obj).f44419c = ((Integer) obj2).intValue();
                return xfaVar;
            case 4:
                in1 in1Var = (in1) obj2;
                if (!(in1Var instanceof pz9)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? in1Var : Integer.valueOf(iIntValue + 1);
            case 5:
                pz9 pz9Var = (pz9) obj;
                in1 in1Var2 = (in1) obj2;
                if (pz9Var != null) {
                    return pz9Var;
                }
                if (in1Var2 instanceof pz9) {
                    return (pz9) in1Var2;
                }
                return null;
            default:
                uz9 uz9Var = (uz9) obj;
                in1 in1Var3 = (in1) obj2;
                if (in1Var3 instanceof pz9) {
                    pz9 pz9Var2 = (pz9) in1Var3;
                    kn1 kn1Var = uz9Var.f64626a;
                    Object objM19580f = pz9Var2.m19580f();
                    Object[] objArr = uz9Var.f64627b;
                    int i2 = uz9Var.f64629d;
                    objArr[i2] = objM19580f;
                    pz9[] pz9VarArr = uz9Var.f64628c;
                    uz9Var.f64629d = i2 + 1;
                    pz9VarArr[i2] = pz9Var2;
                }
                return uz9Var;
        }
    }
}
