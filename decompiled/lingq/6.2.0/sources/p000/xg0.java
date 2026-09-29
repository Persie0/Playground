package p000;

import androidx.compose.material3.AbstractC0229f;
import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.layout.AbstractC0343j;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xg0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68162a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f68163b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f68164c;

    public /* synthetic */ xg0(float f, fb2 fb2Var) {
        this.f68162a = 1;
        this.f68163b = f;
        this.f68164c = fb2Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f68162a;
        xfa xfaVar = xfa.f68157a;
        float f = this.f68163b;
        Object obj2 = this.f68164c;
        switch (i) {
            case 0:
                q98 q98Var = (q98) obj;
                float fM19861h = ((C0269z) obj2).f3651e.f2241j.m19861h();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (q98Var.f57462M & 4294967295L));
                if (!Float.isNaN(fM19861h) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    q98Var.m19823p(AbstractC0229f.m1146c(q98Var, f));
                    q98Var.m19824q(AbstractC0229f.m1147d(q98Var, f));
                    q98Var.m19828x(omd.m18157m(0.5f, (fM19861h + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return xfaVar;
            case 1:
                ((fb2) obj).getClass();
                int iM21693T = ss5.m21693T(f);
                return new f84((((long) ((fb2) obj2).mo916w0(-8.0f)) & 4294967295L) | (((long) iM21693T) << 32));
            default:
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                abstractC0343j.m1530f((l87) obj2, abstractC0343j.mo916w0(f), 0, 0.0f);
                return xfaVar;
        }
    }

    public /* synthetic */ xg0(Object obj, float f, int i) {
        this.f68162a = i;
        this.f68164c = obj;
        this.f68163b = f;
    }
}
