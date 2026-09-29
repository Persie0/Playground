package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.premium.AbstractC1839a;
import com.lingq.core.settings.AbstractC1858a;
import com.lingq.feature.chat.AbstractC2005i;
import com.lingq.feature.playlist.AbstractC2253c;
import com.lingq.feature.vocabulary.AbstractC2823a;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cw0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34620a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f34621b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f34622c;

    public /* synthetic */ cw0(ui3 ui3Var, ui3 ui3Var2, int i) {
        this.f34620a = i;
        this.f34621b = ui3Var;
        this.f34622c = ui3Var2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f34620a;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        ui3 ui3Var = this.f34622c;
        ui3 ui3Var2 = this.f34621b;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                u6d.m22518c(ui3Var2, ui3Var, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 0);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var3);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    omd.m18141c(this.f34621b, c99.m4422o(b16Var, 40.0f), false, null, null, tnb.f62614g, tj3Var, 1572912, 60);
                    omd.m18141c(this.f34622c, c99.m4422o(b16Var, 40.0f), false, null, null, tnb.f62615h, tj3Var, 1572912, 60);
                    tj3Var.m22139q(true);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC2005i.m8901b(ui3Var2, ui3Var, (ye1) obj, pk9.m19383z(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                led.m16156a(ui3Var2, ui3Var, (ye1) obj, pk9.m19383z(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                xid.m24556b(ui3Var2, ui3Var, (ye1) obj, pk9.m19383z(1));
                break;
            case 5:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    e16 e16VarM15962y = l70.m15962y(b16Var);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(e16VarM15962y, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, 0.0f, 2), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38952a, 7);
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var2.m22128k(zf1Var)).f38952a, true, new gm5(28)), nj0.f52792K, tj3Var2, 48);
                    int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m2 = tj3Var2.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X);
                    se1.f60731q.getClass();
                    ui3 ui3Var4 = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var4);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c2);
                    ss5.m21710f(c99.m4412e(b16Var, 1.0f), null, null, false, this.f34621b, n3c.f52303c, tj3Var2, 196614, 14);
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    ((fe9) tj3Var2.m22128k(zf1Var)).getClass();
                    ss5.m21711g(c99.m4414g(e16VarM4412e, 48.0f), false, null, 0L, null, null, this.f34622c, n3c.f52304d, tj3Var2, 12582912, 62);
                    WeakHashMap weakHashMap = l6b.f49204w;
                    thb.m22044c(tj3Var2, pvc.m19502J(ho5.m13397r(tj3Var2).f49209e));
                    tj3Var2.m22139q(true);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC2253c.m9215a(ui3Var2, ui3Var, (ye1) obj, pk9.m19383z(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC2253c.m9220f(ui3Var2, ui3Var, (ye1) obj, pk9.m19383z(1));
                break;
            case 8:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    boolean zM22120g = tj3Var3.m22120g(ui3Var2) | tj3Var3.m22120g(ui3Var);
                    Object objM22097O = tj3Var3.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new pn5(ui3Var2, ui3Var, 2);
                        tj3Var3.m22131l0(objM22097O);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var3, (ui3) objM22097O, tgc.f62262a, null, null, null, false);
                }
                break;
            case 9:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    boolean zM22120g2 = tj3Var4.m22120g(ui3Var2) | tj3Var4.m22120g(ui3Var);
                    Object objM22097O2 = tj3Var4.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new pn5(ui3Var2, ui3Var, 1);
                        tj3Var4.m22131l0(objM22097O2);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var4, (ui3) objM22097O2, tgc.f62265d, null, null, null, false);
                }
                break;
            case 10:
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tj3Var5.m22102U();
                } else {
                    boolean zM22120g3 = tj3Var5.m22120g(ui3Var2) | tj3Var5.m22120g(ui3Var);
                    Object objM22097O3 = tj3Var5.m22097O();
                    if (zM22120g3 || objM22097O3 == p84Var) {
                        objM22097O3 = new pn5(ui3Var2, ui3Var, 12);
                        tj3Var5.m22131l0(objM22097O3);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var5, (ui3) objM22097O3, kic.f47357a, null, null, null, false);
                }
                break;
            case 11:
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tj3Var6.m22102U();
                } else {
                    boolean zM22120g4 = tj3Var6.m22120g(ui3Var2) | tj3Var6.m22120g(ui3Var);
                    Object objM22097O4 = tj3Var6.m22097O();
                    if (zM22120g4 || objM22097O4 == p84Var) {
                        objM22097O4 = new pn5(ui3Var2, ui3Var, 13);
                        tj3Var6.m22131l0(objM22097O4);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var6, (ui3) objM22097O4, pic.f56280a, null, null, null, false);
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8585a(ui3Var2, ui3Var, (ye1) obj, pk9.m19383z(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8586b(ui3Var2, ui3Var, (ye1) obj, pk9.m19383z(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8588d(ui3Var2, ui3Var, (ye1) obj, pk9.m19383z(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                AbstractC1839a.m8525c(ui3Var2, ui3Var, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC2823a.m9734a(ui3Var2, ui3Var, (ye1) obj, pk9.m19383z(49));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ cw0(ui3 ui3Var, ui3 ui3Var2, int i, int i2) {
        this.f34620a = i2;
        this.f34621b = ui3Var;
        this.f34622c = ui3Var2;
    }
}
