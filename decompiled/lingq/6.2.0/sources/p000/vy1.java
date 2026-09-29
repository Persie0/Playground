package p000;

import android.content.Context;
import androidx.compose.foundation.layout.IntrinsicSize;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vy1 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66087a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f66088b;

    public /* synthetic */ vy1(Context context, int i) {
        this.f66087a = i;
        this.f66088b = context;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f66087a;
        xfa xfaVar = xfa.f68157a;
        b16 b16Var = b16.f7762a;
        Context context = this.f66088b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4430w(AbstractC3423or.m18285y(b16Var, IntrinsicSize.Max), nj0.f52812g, 2), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38958g, 0.0f, 2);
                    String string = context.getString(R$string.share_share);
                    string.getClass();
                    vh9 vh9Var = ps5.f56764b;
                    g4d.m12360a(string, e16VarM21609V, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, new ks9(3), 0L, 0, false, 2, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h, null, tj3Var, 12582912, 624);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    e16 e16VarM21609V2 = AbstractC3584sr.m21609V(c99.m4430w(AbstractC3423or.m18285y(b16Var, IntrinsicSize.Max), nj0.f52812g, 2), ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38958g, 0.0f, 2);
                    String string2 = context.getString(R$string.share_share);
                    string2.getClass();
                    vh9 vh9Var2 = ps5.f56764b;
                    g4d.m12360a(string2, e16VarM21609V2, ((ms5) tj3Var2.m22128k(vh9Var2)).f51799a.f55873q, new ks9(3), 0L, 0, false, 2, ((ms5) tj3Var2.m22128k(vh9Var2)).f51800b.f71409m, null, tj3Var2, 12582912, 624);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tj3Var3.m22102U();
                } else {
                    e16 e16VarM4430w = c99.m4430w(AbstractC3423or.m18285y(b16Var, IntrinsicSize.Max), nj0.f52812g, 2);
                    String string3 = context.getString(com.lingq.feature.review.R$string.warning_try_again);
                    string3.getClass();
                    vh9 vh9Var3 = ps5.f56764b;
                    lw9.m16554b(string3, e16VarM4430w, ((ms5) tj3Var3.m22128k(vh9Var3)).f51799a.f55873q, new m20(d32.m10018P(12), ((ms5) tj3Var3.m22128k(vh9Var3)).f51800b.f71402f.f66065a.f42265b, d32.m10017O(0.25d)), 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 1, 0, null, ((ms5) tj3Var3.m22128k(vh9Var3)).f51800b.f71406j, tj3Var3, 48, 24576, 113648);
                }
                break;
            default:
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    tj3Var4.m22102U();
                } else {
                    e16 e16VarM18285y = AbstractC3423or.m18285y(b16Var, IntrinsicSize.Max);
                    String string4 = context.getString(R$string.ui_continue);
                    string4.getClass();
                    vh9 vh9Var4 = ps5.f56764b;
                    lw9.m16554b(string4, e16VarM18285y, ((ms5) tj3Var4.m22128k(vh9Var4)).f51799a.f55878v, new m20(d32.m10018P(12), ((ms5) tj3Var4.m22128k(vh9Var4)).f51800b.f71402f.f66065a.f42265b, d32.m10017O(0.25d)), 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 1, 0, null, ((ms5) tj3Var4.m22128k(vh9Var4)).f51800b.f71406j, tj3Var4, 48, 24576, 113648);
                }
                break;
        }
        return xfaVar;
    }
}
