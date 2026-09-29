package p000;

import androidx.compose.animation.core.C0059a;
import androidx.compose.material3.C0250j0;
import androidx.compose.p002ui.layout.AbstractC0343j;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b0a implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7735a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f7736b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7737c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f7738d;

    public /* synthetic */ b0a(float f, t66 t66Var, t66 t66Var2) {
        this.f7736b = f;
        this.f7737c = t66Var;
        this.f7738d = t66Var2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f7735a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f7738d;
        Object obj3 = this.f7737c;
        float fFloatValue = this.f7736b;
        switch (i) {
            case 0:
                l87 l87Var = (l87) obj3;
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                C0059a c0059a = ((C0250j0) obj2).f3543N;
                if (c0059a != null) {
                    fFloatValue = ((Number) c0059a.m745d()).floatValue();
                }
                AbstractC0343j.m1521j(abstractC0343j, l87Var, (int) fFloatValue, 0);
                break;
            default:
                aq4 aq4Var = (aq4) obj;
                aq4Var.getClass();
                ((t66) obj3).setValue(new xj2((((int) (aq4Var.mo1687j() >> 32)) * 0.7f) - (fFloatValue * 2.0f)));
                ((t66) obj2).setValue(new xj2((int) (aq4Var.mo1687j() & 4294967295L)));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ b0a(l87 l87Var, C0250j0 c0250j0, float f) {
        this.f7737c = l87Var;
        this.f7738d = c0250j0;
        this.f7736b = f;
    }
}
