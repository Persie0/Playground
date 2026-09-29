package p000;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.semantics.AbstractC0426f;

/* JADX INFO: renamed from: lo */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3305lo implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49878a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f49879b;

    public /* synthetic */ C3305lo(int i, ui3 ui3Var) {
        this.f49878a = i;
        this.f49879b = ui3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f49878a;
        xfa xfaVar = xfa.f68157a;
        ui3 ui3Var = this.f49879b;
        switch (i) {
            case 0:
                ((q98) obj).m19813c(((Number) ui3Var.mo0a()).floatValue());
                break;
            case 1:
                ((q98) obj).m19813c(((Number) ui3Var.mo0a()).floatValue());
                break;
            case 2:
                InterfaceC0310a.m1414L0((InterfaceC0310a) obj, ((aa1) ui3Var.mo0a()).f414a, 0L, 0L, 0.0f, null, 0, 126);
                break;
            case 3:
                ui3Var.mo0a();
                break;
            default:
                tv8 tv8Var = (tv8) obj;
                Object objMo0a = ui3Var.mo0a();
                if (Float.isNaN(((Number) objMo0a).floatValue())) {
                    objMo0a = null;
                }
                Float f = (Float) objMo0a;
                AbstractC0426f.m1863g(tv8Var, new tm7(f != null ? f.floatValue() : 0.0f, new h41(0.0f, 1.0f), 0));
                break;
        }
        return xfaVar;
    }
}
