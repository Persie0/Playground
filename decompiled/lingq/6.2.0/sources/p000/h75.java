package p000;

import androidx.compose.foundation.AbstractC0080f;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h75 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f41875a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f41876b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vs3 f41877c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f41878d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zi3 f41879e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ vi3 f41880f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zi3 f41881g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ vi3 f41882h;

    public h75(List list, vi3 vi3Var, vs3 vs3Var, boolean z, zi3 zi3Var, vi3 vi3Var2, zi3 zi3Var2, vi3 vi3Var3) {
        this.f41875a = list;
        this.f41876b = vi3Var;
        this.f41877c = vs3Var;
        this.f41878d = z;
        this.f41879e = zi3Var;
        this.f41880f = vi3Var2;
        this.f41881g = zi3Var2;
        this.f41882h = vi3Var3;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ft4 ft4Var = (ft4) obj;
        int iIntValue = ((Number) obj2).intValue();
        ye1 ye1Var = (ye1) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(i & 1, (i & 147) != 146)) {
            w65 w65Var = (w65) this.f41875a.get(iIntValue);
            tj3Var.m22111b0(909746310);
            vh9 vh9Var = ps5.f56764b;
            long j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55872p;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            b16 b16Var = b16.f7762a;
            e16 e16VarM10007D = d32.m10007D(b16Var, j, si8Var);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM19045o = pb1.m19045o(AbstractC3584sr.m21611X(e16VarM10007D, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 0.0f, 0.0f, 0.0f, 14), ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c);
            vi3 vi3Var = this.f41876b;
            boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22124i(w65Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new wz4(vi3Var, w65Var, 1);
                tj3Var.m22131l0(objM22097O);
            }
            ibd.m13755a(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM19045o, 15), this.f41877c, w65Var, this.f41878d, false, this.f41879e, this.f41880f, this.f41881g, this.f41882h, tj3Var, 0, 16);
            thb.m22044c(tj3Var, c99.m4422o(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38956e));
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }
}
