package p000;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gq7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41190a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dh9 f41191b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dh9 f41192c;

    public /* synthetic */ gq7(dh9 dh9Var, dh9 dh9Var2, int i) {
        this.f41190a = i;
        this.f41191b = dh9Var;
        this.f41192c = dh9Var2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f41190a;
        xfa xfaVar = xfa.f68157a;
        dh9 dh9Var = this.f41192c;
        dh9 dh9Var2 = this.f41191b;
        switch (i) {
            case 0:
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                float fMo912g0 = interfaceC0310a.mo912g0(2.0f);
                float f = fMo912g0 / 2.0f;
                InterfaceC0310a.m1417c0(interfaceC0310a, ((aa1) dh9Var2.getValue()).f414a, interfaceC0310a.mo912g0(hq7.f42784c / 2.0f) - f, 0L, 0.0f, new el9(fMo912g0, 0.0f, 0, 0, 30), 108);
                if (xj2.m24559a(((xj2) dh9Var.getValue()).f68285a, 0.0f) > 0) {
                    InterfaceC0310a.m1417c0(interfaceC0310a, ((aa1) dh9Var2.getValue()).f414a, interfaceC0310a.mo912g0(((xj2) dh9Var.getValue()).f68285a) - f, 0L, 0.0f, w33.f66328a, 108);
                }
                break;
            default:
                q98 q98Var = (q98) obj;
                q98Var.m19823p(((Number) dh9Var2.getValue()).floatValue());
                q98Var.m19824q(((Number) dh9Var2.getValue()).floatValue());
                q98Var.m19813c(((Number) dh9Var.getValue()).floatValue());
                break;
        }
        return xfaVar;
    }
}
