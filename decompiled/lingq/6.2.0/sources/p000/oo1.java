package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.playlist.R$string;
import com.lingq.feature.statistics.StatsShareFragment;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oo1 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54646a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f54647b;

    public /* synthetic */ oo1(int i, t66 t66Var) {
        this.f54646a = i;
        this.f54647b = t66Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f54646a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f54647b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ((xj2) t66Var.getValue()).f68285a));
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    thb.m22044c(tj3Var2, c99.m4414g(b16Var, ((xj2) t66Var.getValue()).f68285a));
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
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var3, 54);
                    int iHashCode = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m = tj3Var3.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                    zf1 zf1Var = ge9.f40637a;
                    ((fe9) tj3Var3.m22128k(zf1Var)).getClass();
                    ty3.m22351a(((Boolean) t66Var.getValue()).booleanValue() ? xzb.m24801a() : z1c.m25402a(), vz1.m23620a0(tj3Var3, R$string.audio_shuffle), AbstractC3584sr.m21611X(c99.m4422o(b16Var, 32.0f), 0.0f, 0.0f, ((fe9) tj3Var3.m22128k(zf1Var)).f38952a, 0.0f, 11), 0L, tj3Var3, 0, 8);
                    lw9.m16554b(vz1.m23620a0(tj3Var3, ((Boolean) t66Var.getValue()).booleanValue() ? R$string.audio_pause : R$string.audio_play), new as4(1.0f, true), 0L, new m20(vs9.f65864a, ((vx9) tj3Var3.m22128k(lw9.f50220a)).f66065a.f42265b, d32.m10017O(0.25d)), 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var3, 0, 24576, 114676);
                    tj3Var3.m22139q(true);
                }
                break;
            default:
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                bh4[] bh4VarArr = StatsShareFragment.f33326U0;
                ((db1) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    tj3Var4.m22102U();
                } else {
                    e5d.m10858b(null, (uj9) t66Var.getValue(), tj3Var4, 0, 5);
                }
                break;
        }
        return xfaVar;
    }
}
