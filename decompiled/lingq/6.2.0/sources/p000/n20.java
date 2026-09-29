package p000;

import android.util.Patterns;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n20 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f52210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f52211c;

    public /* synthetic */ n20(t66 t66Var, t66 t66Var2, int i) {
        this.f52209a = i;
        this.f52210b = t66Var;
        this.f52211c = t66Var2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f52209a;
        boolean z = false;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f52211c;
        t66 t66Var2 = this.f52210b;
        switch (i) {
            case 0:
                rw9 rw9Var = (rw9) obj;
                rw9Var.getClass();
                if (!rw9Var.m20964k(rw9Var.f59976b.f66381f - 1)) {
                    t66Var.setValue(Boolean.TRUE);
                } else {
                    vx9 vx9Var = (vx9) t66Var2.getValue();
                    long j = ((vx9) t66Var2.getValue()).f66065a.f42265b;
                    d32.m10009G(j);
                    t66Var2.setValue(vx9.m23584b(vx9Var, 0L, d32.m10032c0((float) (((double) zx9.m25848c(j)) * 0.9d), 1095216660480L & j), null, null, null, 0L, null, null, 0, 0L, null, 16777213));
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                t66Var2.setValue(str);
                t66Var.setValue(Boolean.valueOf(str.length() > 500));
                break;
            case 2:
                ia4 ia4Var = (ia4) obj;
                ia4Var.getClass();
                t66Var2.setValue(ia4Var);
                t66Var.setValue(Boolean.TRUE);
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                t66Var2.setValue(str2);
                if (!Patterns.EMAIL_ADDRESS.matcher(str2).matches() && str2.length() > 0) {
                    z = true;
                }
                t66Var.setValue(Boolean.valueOf(z));
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                t66Var2.setValue(bool);
                if (zBooleanValue && ((Boolean) t66Var.getValue()).booleanValue()) {
                    t66Var.setValue(Boolean.FALSE);
                }
                break;
            case 5:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                t66Var2.setValue(bool2);
                if (zBooleanValue2 && ((Boolean) t66Var.getValue()).booleanValue()) {
                    t66Var.setValue(Boolean.FALSE);
                }
                break;
            default:
                float fFloatValue = ((Float) obj).floatValue();
                t66Var2.setValue(Boolean.TRUE);
                t66Var.setValue(Long.valueOf((long) (fFloatValue * 1000.0f)));
                break;
        }
        return xfaVar;
    }
}
