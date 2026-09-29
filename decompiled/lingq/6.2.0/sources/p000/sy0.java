package p000;

import androidx.compose.p002ui.semantics.AbstractC0426f;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sy0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61577a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f61578b;

    public /* synthetic */ sy0(int i, ui3 ui3Var) {
        this.f61577a = i;
        this.f61578b = ui3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f61577a;
        xfa xfaVar = xfa.f68157a;
        ui3 ui3Var = this.f61578b;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                ui3Var.mo0a();
                return xfaVar;
            case 1:
                zm4 zm4Var = (zm4) obj;
                zm4Var.getClass();
                if (zm4Var.equals(zm4.f71763a)) {
                    ui3Var.mo0a();
                    return xfaVar;
                }
                gm5.m12750e();
                return null;
            case 2:
                ui3Var.mo0a();
                return xfaVar;
            case 3:
                tv8 tv8Var = (tv8) obj;
                Object objMo0a = ui3Var.mo0a();
                Float f = (Float) (Float.isNaN(((Number) objMo0a).floatValue()) ? null : objMo0a);
                AbstractC0426f.m1863g(tv8Var, new tm7(f != null ? f.floatValue() : 0.0f, new h41(0.0f, 1.0f), 0));
                return xfaVar;
            case 4:
                ((bk8) obj).getClass();
                return ui3Var.mo0a();
            case 5:
                ui3Var.mo0a();
                return xfaVar;
            case 6:
                obj.getClass();
                return ui3Var.mo0a();
            case 7:
                return (gq6) ui3Var.mo0a();
            case 8:
                ui3Var.mo0a();
                return xfaVar;
            default:
                ((fj4) obj).getClass();
                ui3Var.mo0a();
                return xfaVar;
        }
    }
}
