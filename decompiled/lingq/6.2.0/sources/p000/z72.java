package p000;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z72 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dh9 f71004b;

    public /* synthetic */ z72(dh9 dh9Var, int i) {
        this.f71003a = i;
        this.f71004b = dh9Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f71003a;
        xfa xfaVar = xfa.f68157a;
        dh9 dh9Var = this.f71004b;
        switch (i) {
            case 0:
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                long j = ((aa1) dh9Var.getValue()).f414a;
                if (!aa1.m199c(j, aa1.f412k)) {
                    InterfaceC0310a.m1414L0(interfaceC0310a, j, 0L, 0L, 0.0f, null, 0, 126);
                }
                break;
            default:
                ((q98) obj).m19813c(((Number) dh9Var.getValue()).floatValue());
                break;
        }
        return xfaVar;
    }
}
