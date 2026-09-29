package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.settings.theme.AbstractC1881a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uv1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64391a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f64392b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f64393c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f64394d;

    public /* synthetic */ uv1(String str, boolean z, vi3 vi3Var, int i) {
        this.f64391a = 2;
        this.f64394d = str;
        this.f64392b = z;
        this.f64393c = vi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f64391a;
        p84 p84Var = we1.f66679a;
        int i2 = 2;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f64393c;
        boolean z = this.f64392b;
        String strM23620a0 = this.f64394d;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    boolean z2 = !z;
                    boolean zM22120g = tj3Var.m22120g(vi3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new hv1(vi3Var, 21);
                        tj3Var.m22131l0(objM22097O);
                    }
                    AbstractC0231g.m1153f(805306368, 506, null, tj3Var, (ui3) objM22097O, ci8.m4703P(-574400077, new iq0(strM23620a0, i2), tj3Var), null, null, null, z2);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    e16 e16VarM815b = b16.f7762a;
                    if (z) {
                        tj3Var2.m22111b0(-702394162);
                    } else {
                        tj3Var2.m22111b0(-702320878);
                        boolean zM22120g2 = tj3Var2.m22120g(vi3Var);
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (zM22120g2 || objM22097O2 == p84Var) {
                            objM22097O2 = new et6(vi3Var, 28);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O2, e16VarM815b, 15);
                    }
                    tj3Var2.m22139q(false);
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var2, 48);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM815b);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                    if (strM23620a0 == null) {
                        tj3Var2.m22111b0(1852840610);
                        strM23620a0 = vz1.m23620a0(tj3Var2, R$string.playlist_playlists);
                    } else {
                        tj3Var2.m22111b0(1852839122);
                    }
                    tj3Var2.m22139q(false);
                    lw9.m16554b(strM23620a0, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                    if (z) {
                        tj3Var2.m22111b0(1603925938);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(1603663585);
                        ty3.m22351a(pvc.m19521q(), vz1.m23620a0(tj3Var2, com.lingq.feature.playlist.R$string.playlist_change_playlist), null, 0L, tj3Var2, 0, 12);
                        tj3Var2.m22139q(false);
                    }
                    tj3Var2.m22139q(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1881a.m8676o(strM23620a0, z, vi3Var, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ uv1(boolean z, vi3 vi3Var, String str, int i) {
        this.f64391a = i;
        this.f64392b = z;
        this.f64393c = vi3Var;
        this.f64394d = str;
    }
}
