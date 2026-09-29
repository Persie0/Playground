package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zy0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f72370a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f72371b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f72372c;

    public /* synthetic */ zy0(t66 t66Var, t66 t66Var2, int i) {
        this.f72370a = i;
        this.f72371b = t66Var;
        this.f72372c = t66Var2;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i;
        int i2 = this.f72370a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f72372c;
        t66 t66Var2 = this.f72371b;
        switch (i2) {
            case 0:
                t66Var2.setValue(Boolean.FALSE);
                t66Var.setValue(null);
                return xfaVar;
            case 1:
                if (!((Boolean) t66Var2.getValue()).booleanValue()) {
                    t66Var.setValue(null);
                }
                return xfaVar;
            case 2:
                Boolean bool = Boolean.FALSE;
                t66Var2.setValue(bool);
                t66Var.setValue(bool);
                return xfaVar;
            case 3:
                if (t66Var2.getValue() == null || t66Var.getValue() == null) {
                    i = 0;
                } else {
                    Object value = t66Var2.getValue();
                    value.getClass();
                    long jMo1695q = ((aq4) value).mo1695q(0L);
                    Object value2 = t66Var.getValue();
                    value2.getClass();
                    long j = ((gq6) value2).f41189a;
                    if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (jMo1695q >> 32))) {
                        i = Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (jMo1695q & 4294967295L)) ? 1 : 3;
                    } else {
                        i = Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (jMo1695q & 4294967295L)) ? 2 : 4;
                    }
                }
                return Integer.valueOf(i);
            default:
                t66Var2.setValue(Boolean.FALSE);
                t66Var.setValue(null);
                return xfaVar;
        }
    }
}
