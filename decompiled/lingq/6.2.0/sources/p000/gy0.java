package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.chat.AbstractC2008l;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gy0 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41512a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f41513b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f41514c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f41515d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f41516e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f41517f;

    public /* synthetic */ gy0(List list, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f41512a = i;
        this.f41513b = list;
        this.f41514c = obj;
        this.f41515d = obj2;
        this.f41516e = obj3;
        this.f41517f = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0500  */
    /* JADX WARN: Code duplicated, block: B:117:0x0514  */
    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        float f;
        long j;
        tj3 tj3Var;
        int i2 = this.f41512a;
        xfa xfaVar = xfa.f68157a;
        Object obj5 = this.f41517f;
        Object obj6 = this.f41516e;
        Object obj7 = this.f41515d;
        Object obj8 = this.f41514c;
        List list = this.f41513b;
        switch (i2) {
            case 0:
                tx0 tx0Var = (tx0) obj8;
                String str = (String) obj7;
                String str2 = (String) obj6;
                jv0 jv0Var = (jv0) obj5;
                ft4 ft4Var = (ft4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ye1 ye1Var = (ye1) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ft4Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
                }
                tj3 tj3Var2 = (tj3) ye1Var;
                if (tj3Var2.m22099R(i & 1, (i & 147) != 146)) {
                    lw0 lw0Var = (lw0) list.get(iIntValue);
                    boolean z = lw0Var instanceof jw0;
                    b16 b16Var = b16.f7762a;
                    if (z) {
                        tj3Var2.m22111b0(1804540796);
                        jw0 jw0Var = (jw0) lw0Var;
                        ChatMessage chatMessage = jw0Var.f46240a;
                        if (fa4.m11650l(chatMessage.f18921b, "user")) {
                            tj3Var2.m22111b0(1804546066);
                            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37237c, nj0.f52817l, tj3Var2, 6);
                            int iHashCode = Long.hashCode(tj3Var2.f62385T);
                            l77 l77VarM22132m = tj3Var2.m22132m();
                            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
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
                            AbstractC2008l.m8911b(c99.m4431x(b16Var), tx0Var.f63046k, tx0Var.f63041f, jw0Var, tx0Var.f63050o, tx0Var.f63051p, jv0Var, tj3Var2, 64, 0);
                            tj3Var2.m22139q(true);
                            tj3Var2.m22139q(false);
                        } else if (fa4.m11650l(chatMessage.f18921b, "tutor")) {
                            tj3Var2.m22111b0(1805644644);
                            AbstractC2008l.m8910a(c99.m4412e(b16Var, 1.0f).mo3161g(new gv3(nj0.f52791J)), tx0Var.f63046k, tx0Var.f63041f, jw0Var, str, str2, tx0Var.f63050o, tx0Var.f63051p, jv0Var, tj3Var2, 64, 0);
                            tj3Var2.m22139q(false);
                        } else {
                            tj3Var2.m22111b0(1807096715);
                            tj3Var2.m22139q(false);
                        }
                        f = ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a;
                    } else {
                        if (lw0Var instanceof kw0) {
                            tj3Var2.m22111b0(1807257450);
                            r46.m20381f(c99.m4414g(c99.m4426s(b16Var, 36.0f), 28.0f), ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64857c, null, null, wnb.f67100a, tj3Var2, 24582, 12);
                            f = ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a;
                        } else {
                            tj3Var2.m22111b0(1807658187);
                            tj3Var2.m22139q(false);
                        }
                        if (iIntValue < list.size() - 1) {
                            tj3Var2.m22111b0(1807708159);
                            ux5.m23003z(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38957f, tj3Var2, false);
                        } else {
                            tj3Var2.m22111b0(1807811947);
                            tj3Var2.m22139q(false);
                        }
                    }
                    ux5.m23003z(b16Var, f, tj3Var2, false);
                    if (iIntValue < list.size() - 1) {
                        tj3Var2.m22111b0(1807708159);
                        ux5.m23003z(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38957f, tj3Var2, false);
                    } else {
                        tj3Var2.m22111b0(1807811947);
                        tj3Var2.m22139q(false);
                    }
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 1:
                lp4 lp4Var = (lp4) obj8;
                vi3 vi3Var = (vi3) obj7;
                fe9 fe9Var = (fe9) obj6;
                Context context = (Context) obj5;
                int iIntValue3 = ((Integer) obj2).intValue();
                ye1 ye1Var2 = (ye1) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                C3549ru c3549ru = eh0.f37236b;
                ((ft4) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= ((tj3) ye1Var2).m22116e(iIntValue3) ? 32 : 16;
                }
                int i3 = iIntValue4;
                tj3 tj3Var3 = (tj3) ye1Var2;
                if (tj3Var3.m22099R(i3 & 1, (i3 & 145) != 144)) {
                    em4 em4Var = (em4) list.get(iIntValue3);
                    boolean z2 = em4Var instanceof dm4;
                    b16 b16Var2 = b16.f7762a;
                    if (z2) {
                        tj3Var3.m22111b0(1426056693);
                        il4 il4Var = ((dm4) em4Var).f35823a;
                        String str3 = il4Var.f44255a;
                        boolean zM11650l = fa4.m11650l(str3, lp4Var.f49977b);
                        e16 e16VarM4416i = c99.m4416i(c99.m4412e(b16Var2, 1.0f), 48.0f, 0.0f, 2);
                        vh9 vh9Var = ps5.f56764b;
                        e16 e16VarM19045o = pb1.m19045o(e16VarM4416i, ((ms5) tj3Var3.m22128k(vh9Var)).f51801c.f64857c);
                        if (zM11650l) {
                            tj3Var3.m22111b0(1426462514);
                            j = ((ms5) tj3Var3.m22128k(vh9Var)).f51799a.f55823H;
                            tj3Var3.m22139q(false);
                        } else {
                            tj3Var3.m22111b0(1426597271);
                            j = ((ms5) tj3Var3.m22128k(vh9Var)).f51799a.f55824I;
                            tj3Var3.m22139q(false);
                        }
                        e16 e16VarM10007D = d32.m10007D(e16VarM19045o, j, ((ms5) tj3Var3.m22128k(vh9Var)).f51801c.f64857c);
                        boolean zM22120g = tj3Var3.m22120g(vi3Var) | tj3Var3.m22120g(il4Var);
                        Object objM22097O = tj3Var3.m22097O();
                        if (zM22120g || objM22097O == we1.f66679a) {
                            objM22097O = new C3577sk(27, vi3Var, il4Var);
                            tj3Var3.m22131l0(objM22097O);
                        }
                        e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM10007D, 15), fe9Var.f38960i, fe9Var.f38952a);
                        sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, nj0.f52789H, tj3Var3, 48);
                        int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m2 = tj3Var3.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM21608U);
                        se1.f60731q.getClass();
                        ui3 ui3Var2 = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var2);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a2);
                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m2);
                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode2));
                        oha.m18000f(tj3Var3, C0352b.f4305h);
                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c2);
                        bq1.m4042R(AbstractC3423or.m18236U(AbstractC3423or.m18282v(context, str3), tj3Var3, 0), null, pb1.m19045o(AbstractC3584sr.m21607T(c99.m4422o(b16Var2, 48.0f), 4.0f), ui8.f63972a), null, hl1.f42564a, 0.0f, null, tj3Var3, 24632, 104);
                        lw9.m16554b(AbstractC3352my.m17093L(context, str3), AbstractC3393o1.m17728c(1.0f, AbstractC3584sr.m21611X(b16Var2, fe9Var.f38956e, 0.0f, 0.0f, 0.0f, 14), true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262140);
                        if (zM11650l) {
                            tj3Var3.m22111b0(-630048223);
                            ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_check, tj3Var3, 0), null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var3, 440, 8);
                            tj3Var = tj3Var3;
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var = tj3Var3;
                            tj3Var.m22111b0(-629695536);
                            tj3Var.m22139q(false);
                        }
                        tj3Var.m22139q(true);
                        tj3Var.m22139q(false);
                    } else {
                        if (!(em4Var instanceof cm4)) {
                            throw ux5.m23001x(tj3Var3, 323094980, false);
                        }
                        tj3Var3.m22111b0(1428547233);
                        e16 e16VarM4412e2 = c99.m4412e(b16Var2, 1.0f);
                        sj8 sj8VarM20003a3 = qj8.m20003a(c3549ru, nj0.f52817l, tj3Var3, 0);
                        int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m3 = tj3Var3.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e2);
                        se1.f60731q.getClass();
                        ui3 ui3Var3 = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var3);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a3);
                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m3);
                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode3));
                        oha.m18000f(tj3Var3, C0352b.f4305h);
                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c3);
                        lw9.m16554b(vz1.m23620a0(tj3Var3, ((cm4) em4Var).f10267a), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                        tj3Var3.m22139q(true);
                        tj3Var3.m22139q(false);
                    }
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            default:
                wz7 wz7Var = (wz7) obj8;
                nz9 nz9Var = (nz9) obj7;
                vi3 vi3Var2 = (vi3) obj6;
                e08 e08Var = (e08) obj5;
                int iIntValue5 = ((Integer) obj2).intValue();
                ye1 ye1Var3 = (ye1) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((ft4) obj).getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= ((tj3) ye1Var3).m22116e(iIntValue5) ? 32 : 16;
                }
                tj3 tj3Var4 = (tj3) ye1Var3;
                if (tj3Var4.m22099R(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    e37 e37Var = (e37) list.get(iIntValue5);
                    lw8 lw8Var = (lw8) u91.m22591I0(e37Var.f36654c);
                    Integer numValueOf = lw8Var != null ? Integer.valueOf(lw8Var.f50212a) : null;
                    h2d.m13015a(e37Var, wz7Var, numValueOf != null ? (qx8) e08Var.f36540a.get(Integer.valueOf(numValueOf.intValue())) : null, numValueOf != null ? (String) e08Var.f36541b.get(Integer.valueOf(numValueOf.intValue())) : null, nz9Var, vi3Var2, tj3Var4, 32768);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
        }
    }
}
