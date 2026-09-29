package p000;

import android.content.Context;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.notification.InAppNotificationAction;
import com.lingq.feature.challenges.AbstractC1985e;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ys0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70357a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f70358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f70359c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f70360d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f70361e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f70362f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f70363g;

    public /* synthetic */ ys0(et0 et0Var, vi3 vi3Var, vi3 vi3Var2, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3) {
        this.f70357a = 0;
        this.f70360d = et0Var;
        this.f70358b = vi3Var;
        this.f70359c = vi3Var2;
        this.f70361e = ui3Var;
        this.f70362f = ui3Var2;
        this.f70363g = ui3Var3;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object g91Var;
        q91 q91Var;
        vi3 vi3Var;
        xs8 xs8Var;
        int i;
        int i2 = this.f70357a;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = this.f70363g;
        Object obj5 = this.f70362f;
        Object obj6 = this.f70361e;
        Object obj7 = this.f70359c;
        Object obj8 = this.f70360d;
        switch (i2) {
            case 0:
                et0 et0Var = (et0) obj8;
                vi3 vi3Var2 = (vi3) obj7;
                ui3 ui3Var = (ui3) obj6;
                ui3 ui3Var2 = (ui3) obj5;
                ui3 ui3Var3 = (ui3) obj4;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bi0) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC1985e.m8852d(et0Var, this.f70358b, vi3Var2, ui3Var, ui3Var2, ui3Var3, tj3Var, 0);
                } else {
                    tj3Var.m22102U();
                }
                break;
            case 1:
                q91 q91Var2 = (q91) obj8;
                t66 t66Var = (t66) obj6;
                uc9 uc9Var = (uc9) obj5;
                C0127b c0127b = (C0127b) obj4;
                vi3 vi3Var3 = (vi3) obj7;
                t17 t17Var = (t17) obj;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((tj3) ye1Var2).m22120g(t17Var) ? 4 : 2;
                }
                boolean z = (iIntValue2 & 19) != 18;
                int i3 = iIntValue2 & 1;
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(i3, z)) {
                    boolean z2 = q91Var2.f57441c || ((Boolean) t66Var.getValue()).booleanValue();
                    boolean zM22124i = tj3Var2.m22124i(q91Var2);
                    vi3 vi3Var4 = this.f70358b;
                    boolean zM22120g = tj3Var2.m22120g(vi3Var4) | zM22124i;
                    Object objM22097O = tj3Var2.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        q91Var = q91Var2;
                        g91Var = new g91((Object) q91Var, (Object) vi3Var4, (Object) t66Var, (Object) uc9Var, 0);
                        tj3Var2.m22131l0(g91Var);
                    } else {
                        g91Var = objM22097O;
                        q91Var = q91Var2;
                    }
                    lp7.m16424b(z2, (ui3) g91Var, null, null, null, null, false, 0.0f, ci8.m4703P(-2025667877, new hn0((Object) q91Var, (Object) c0127b, (Object) t17Var, vi3Var4, (Object) vi3Var3, 2), tj3Var2), tj3Var2, 100663296, 252);
                } else {
                    tj3Var2.m22102U();
                }
                break;
            case 2:
                fe9 fe9Var = (fe9) obj8;
                Context context = (Context) obj7;
                zy1 zy1Var = (zy1) obj6;
                t66 t66Var2 = (t66) obj5;
                t66 t66Var3 = (t66) obj4;
                t17 t17Var2 = (t17) obj;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t17Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((tj3) ye1Var3).m22120g(t17Var2) ? 4 : 2;
                }
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    e16 e16VarM21606S = AbstractC3584sr.m21606S(l70.m15962y(b16Var), t17Var2);
                    ec0 ec0Var = nj0.f52792K;
                    C3661uu c3661uu = new C3661uu(fe9Var.f38963l, true, new gm5(28));
                    float f = fe9Var.f38960i;
                    x17 x17Var = new x17(f, f, f, f);
                    boolean zM22124i2 = tj3Var3.m22124i(context) | tj3Var3.m22124i(zy1Var) | tj3Var3.m22124i(fe9Var);
                    vi3 vi3Var5 = this.f70358b;
                    boolean zM22120g2 = tj3Var3.m22120g(vi3Var5) | zM22124i2;
                    Object objM22097O2 = tj3Var3.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        b45 b45Var = new b45(zy1Var, vi3Var5, t66Var2, t66Var3, fe9Var, context);
                        tj3Var3.m22131l0(b45Var);
                        objM22097O2 = b45Var;
                    }
                    fa4.m11642c(e16VarM21606S, null, x17Var, c3661uu, ec0Var, null, false, null, (vi3) objM22097O2, tj3Var3, 196608, 458);
                } else {
                    tj3Var3.m22102U();
                }
                break;
            case 3:
                xs8 xs8Var2 = (xs8) obj8;
                t66 t66Var4 = (t66) obj6;
                uc9 uc9Var2 = (uc9) obj5;
                C0127b c0127b2 = (C0127b) obj4;
                vi3 vi3Var6 = (vi3) obj7;
                t17 t17Var3 = (t17) obj;
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                t17Var3.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((tj3) ye1Var4).m22120g(t17Var3) ? 4 : 2;
                }
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    boolean z3 = xs8Var2.f68654c || ((Boolean) t66Var4.getValue()).booleanValue();
                    boolean zM22124i3 = tj3Var4.m22124i(xs8Var2);
                    vi3 vi3Var7 = this.f70358b;
                    boolean zM22120g3 = zM22124i3 | tj3Var4.m22120g(vi3Var7);
                    Object objM22097O3 = tj3Var4.m22097O();
                    if (zM22120g3 || objM22097O3 == p84Var) {
                        vi3Var = vi3Var7;
                        xs8Var = xs8Var2;
                        objM22097O3 = new g91((Object) xs8Var, (Object) vi3Var, (Object) t66Var4, (Object) uc9Var2, 14);
                        tj3Var4.m22131l0(objM22097O3);
                    } else {
                        vi3Var = vi3Var7;
                        xs8Var = xs8Var2;
                    }
                    lp7.m16424b(z3, (ui3) objM22097O3, null, null, null, null, false, 0.0f, ci8.m4703P(1906173388, new hn0((Object) xs8Var, (Object) c0127b2, (Object) t17Var3, vi3Var, (Object) vi3Var6, 17), tj3Var4), tj3Var4, 100663296, 252);
                } else {
                    tj3Var4.m22102U();
                }
                break;
            default:
                String str = (String) obj8;
                String str2 = (String) obj7;
                InterfaceC3624tu interfaceC3624tu = (InterfaceC3624tu) obj6;
                List<InAppNotificationAction> list = (List) obj5;
                Context context2 = (Context) obj4;
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(d32.m10007D(b16Var, p58.m18900f(tj3Var5).f55868n, ss5.f61356d), ge9.m12515a(tj3Var5).f38956e);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var5, 0);
                    int iHashCode = Long.hashCode(tj3Var5.f62385T);
                    l77 l77VarM22132m = tj3Var5.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var5, e16VarM21607T);
                    se1.f60731q.getClass();
                    ui3 ui3Var4 = C0352b.f4299b;
                    tj3Var5.m22119f0();
                    if (tj3Var5.f62384S) {
                        tj3Var5.m22130l(ui3Var4);
                    } else {
                        tj3Var5.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var5, zi3Var, bb1VarM230a);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var5, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var5, zi3Var3, numValueOf);
                    vi3 vi3Var8 = C0352b.f4305h;
                    oha.m18000f(tj3Var5, vi3Var8);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var5, zi3Var4, e16VarM1322c);
                    lw9.m16554b(str, AbstractC3584sr.m21609V(c99.m4430w(b16Var, null, 3), ge9.m12515a(tj3Var5).f38952a, 0.0f, 2), p58.m18900f(tj3Var5).f55870o, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var5).f71405i, tj3Var5, 0, 0, 131064);
                    tj3 tj3Var6 = tj3Var5;
                    if (vk9.m23391n0(str2)) {
                        i = 0;
                        tj3Var6.m22111b0(1817450469);
                        tj3Var6.m22139q(false);
                    } else {
                        tj3Var6.m22111b0(1817066472);
                        lw9.m16554b(str2, AbstractC3584sr.m21609V(c99.m4430w(b16Var, null, 3), ge9.m12515a(tj3Var6).f38952a, 0.0f, 2), p58.m18900f(tj3Var6).f55870o, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var6).f71407k, tj3Var6, 0, 0, 131064);
                        tj3Var6 = tj3Var6;
                        i = 0;
                        tj3Var6.m22139q(false);
                    }
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a = qj8.m20003a(interfaceC3624tu, nj0.f52817l, tj3Var6, i);
                    int iHashCode2 = Long.hashCode(tj3Var6.f62385T);
                    l77 l77VarM22132m2 = tj3Var6.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var6, e16VarM4412e);
                    tj3Var6.m22119f0();
                    if (tj3Var6.f62384S) {
                        tj3Var6.m22130l(ui3Var4);
                    } else {
                        tj3Var6.m22137o0();
                    }
                    oha.m18001g(tj3Var6, zi3Var, sj8VarM20003a);
                    oha.m18001g(tj3Var6, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var6, zi3Var3, tj3Var6, vi3Var8);
                    oha.m18001g(tj3Var6, zi3Var4, e16VarM1322c2);
                    tj3Var6.m22111b0(-1392451855);
                    for (InAppNotificationAction inAppNotificationAction : list) {
                        vi3 vi3Var9 = this.f70358b;
                        boolean zM22120g4 = tj3Var6.m22120g(vi3Var9) | tj3Var6.m22116e(inAppNotificationAction.ordinal());
                        Object objM22097O4 = tj3Var6.m22097O();
                        if (zM22120g4 || objM22097O4 == p84Var) {
                            objM22097O4 = new qk9(6, vi3Var9, inAppNotificationAction);
                            tj3Var6.m22131l0(objM22097O4);
                        }
                        AbstractC0231g.m1153f(805306368, 510, null, tj3Var6, (ui3) objM22097O4, ci8.m4703P(2081262166, new iz4(23, context2, inAppNotificationAction), tj3Var6), null, null, null, false);
                    }
                    AbstractC3393o1.m17723A(tj3Var6, false, true, true);
                } else {
                    tj3Var5.m22102U();
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ys0(zy1 zy1Var, vi3 vi3Var, t66 t66Var, t66 t66Var2, fe9 fe9Var, Context context) {
        this.f70357a = 2;
        this.f70360d = fe9Var;
        this.f70359c = context;
        this.f70361e = zy1Var;
        this.f70358b = vi3Var;
        this.f70362f = t66Var;
        this.f70363g = t66Var2;
    }

    public /* synthetic */ ys0(Object obj, vi3 vi3Var, t66 t66Var, uc9 uc9Var, C0127b c0127b, vi3 vi3Var2, int i) {
        this.f70357a = i;
        this.f70360d = obj;
        this.f70358b = vi3Var;
        this.f70361e = t66Var;
        this.f70362f = uc9Var;
        this.f70363g = c0127b;
        this.f70359c = vi3Var2;
    }

    public /* synthetic */ ys0(String str, String str2, InterfaceC3624tu interfaceC3624tu, List list, vi3 vi3Var, Context context) {
        this.f70357a = 4;
        this.f70360d = str;
        this.f70359c = str2;
        this.f70361e = interfaceC3624tu;
        this.f70362f = list;
        this.f70358b = vi3Var;
        this.f70363g = context;
    }
}
