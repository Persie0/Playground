package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.p012ui.R$drawable;

/* JADX INFO: renamed from: ee */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2961ee implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37096a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f37097b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f37098c;

    public /* synthetic */ C2961ee(jy7 jy7Var, float f) {
        this.f37096a = 1;
        this.f37098c = jy7Var;
        this.f37097b = f;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f37096a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f37098c;
        float f = this.f37097b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC3369ne.m17394b(f, (C0282a) obj3, (ye1) obj, pk9.m19383z(391));
                break;
            case 1:
                jy7 jy7Var = (jy7) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_headphones, tj3Var, 0), jy7Var.f46393a ? "Pause" : "Play", c99.m4422o(b16.f7762a, 32.0f), aa1.m198b(f, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55873q), tj3Var, 392, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                h5d.m13070c(f, (e16) obj3, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C2961ee(float f, Object obj, int i, int i2) {
        this.f37096a = i2;
        this.f37097b = f;
        this.f37098c = obj;
    }
}
