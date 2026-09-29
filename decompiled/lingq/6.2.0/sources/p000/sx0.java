package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0232g0;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.achievements.R$string;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.p012ui.util.AbstractC1935a;
import com.lingq.core.settings.theme.C1883c;
import com.lingq.core.token.C1909e;
import com.lingq.feature.chat.AbstractC2005i;
import com.lingq.feature.chat.C2009m;
import com.lingq.feature.chat.settings.C2010a;
import com.lingq.feature.onboarding.AbstractC2174a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sx0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61528a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f61529b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f61530c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f61531d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f61532e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f61533f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f61534g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f61535h;

    public /* synthetic */ sx0(ty1 ty1Var, g77 g77Var, vi3 vi3Var, t66 t66Var, Context context, t66 t66Var2, t66 t66Var3) {
        this.f61528a = 1;
        this.f61529b = ty1Var;
        this.f61530c = g77Var;
        this.f61531d = vi3Var;
        this.f61532e = t66Var;
        this.f61533f = context;
        this.f61534g = t66Var2;
        this.f61535h = t66Var3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f61528a;
        Object obj3 = this.f61530c;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = this.f61535h;
        Object obj5 = this.f61534g;
        Object obj6 = this.f61533f;
        Object obj7 = this.f61532e;
        Object obj8 = this.f61531d;
        Object obj9 = this.f61529b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2005i.m8904e((C2009m) obj9, (C1909e) obj3, (C1883c) obj8, (C2010a) obj7, (ud6) obj6, (w41) obj5, (r32) obj4, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 1:
                ty1 ty1Var = (ty1) obj9;
                g77 g77Var = (g77) obj3;
                vi3 vi3Var = (vi3) obj8;
                t66 t66Var = (t66) obj7;
                Context context = (Context) obj6;
                t66 t66Var2 = (t66) obj5;
                t66 t66Var3 = (t66) obj4;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM4429v = c99.m4429v(c99.m4412e(b16Var, 1.0f));
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4429v);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    boolean z = ty1Var.f63090d;
                    p84 p84Var = we1.f66679a;
                    if (z) {
                        tj3Var.m22111b0(-380291363);
                        boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
                        C0282a c0282aM4703P = ci8.m4703P(-311561949, new xy1(context, ty1Var), tj3Var);
                        Object objM22097O = tj3Var.m22097O();
                        if (objM22097O == p84Var) {
                            objM22097O = new C0023al(12, t66Var2);
                            tj3Var.m22131l0(objM22097O);
                        }
                        AbstractC1935a.m8801a(zBooleanValue, c0282aM4703P, (vi3) objM22097O, tj3Var, 432);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-378039368);
                        boolean zBooleanValue2 = ((Boolean) t66Var.getValue()).booleanValue();
                        C0282a c0282aM4703P2 = ci8.m4703P(-454673684, new xy1(ty1Var, context, 2), tj3Var);
                        Object objM22097O2 = tj3Var.m22097O();
                        if (objM22097O2 == p84Var) {
                            objM22097O2 = new C0023al(11, t66Var2);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        AbstractC1935a.m8801a(zBooleanValue2, c0282aM4703P2, (vi3) objM22097O2, tj3Var, 432);
                        tj3Var.m22139q(false);
                    }
                    if (((Boolean) t66Var3.getValue()).booleanValue()) {
                        tj3Var.m22111b0(-372999357);
                        e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), 64.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e);
                        boolean zM22120g = tj3Var.m22120g(g77Var);
                        Object objM22097O3 = tj3Var.m22097O();
                        if (zM22120g || objM22097O3 == p84Var) {
                            objM22097O3 = new C3539rk(g77Var, 12);
                            tj3Var.m22131l0(objM22097O3);
                        }
                        e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O3, e16VarM21608U, 15);
                        C3341mn c3341mn = new C3341mn();
                        String string = context.getString(R$string.notifications_daily_reminder);
                        string.getClass();
                        c3341mn.m16929d(string);
                        c3341mn.m16929d(" ");
                        int iM16932g = c3341mn.m16932g(new he9(0L, 0L, bc3.f8324j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                        try {
                            String string2 = context.getString(R$string.texts_notify_me);
                            string2.getClass();
                            c3341mn.m16929d(string2);
                            c3341mn.m16931f(iM16932g);
                            C3419on c3419onM16933h = c3341mn.m16933h();
                            vh9 vh9Var = ps5.f56764b;
                            lw9.m16555c(c3419onM16933h, e16VarM815b, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71408l, tj3Var, 0, 0, 261112);
                            tj3Var.m22139q(false);
                        } catch (Throwable th) {
                            c3341mn.m16931f(iM16932g);
                            throw th;
                        }
                    } else {
                        tj3Var.m22111b0(-371691591);
                        tj3Var.m22139q(false);
                    }
                    e16 e16VarM4414g = c99.m4414g(AbstractC3584sr.m21611X(c99.m4431x(b16Var), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38958g, 7), 40.0f);
                    vh9 vh9Var2 = ps5.f56764b;
                    si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var2)).f51801c.f64856b;
                    vf0 vf0VarM4714a = ci8.m4714a(1.0f, ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55875s);
                    boolean zM22120g2 = tj3Var.m22120g(vi3Var);
                    Object objM22097O4 = tj3Var.m22097O();
                    if (zM22120g2 || objM22097O4 == p84Var) {
                        objM22097O4 = new wy0(vi3Var, t66Var2, t66Var, 1);
                        tj3Var.m22131l0(objM22097O4);
                    }
                    AbstractC0231g.m1151d((ui3) objM22097O4, e16VarM4414g, false, si8Var, null, vf0VarM4714a, null, ci8.m4703P(1019339579, new vy1(context, 0), tj3Var), tj3Var, 805306368, 436);
                    tj3Var.m22139q(true);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC2174a.m9104a((C0232g0) obj9, this.f61530c, (String) obj8, (String) obj7, (SnackbarDuration) obj6, (ui3) obj5, (ui3) obj4, (ye1) obj, pk9.m19383z(24583));
                return xfaVar;
            case 3:
                ((Integer) obj2).getClass();
                zjc.m25680b((ey7) obj9, (nz9) obj3, (bx7) obj8, (f00) obj7, (AudioUnderlineMode) obj6, (vi3) obj5, (zi3) obj4, (ye1) obj, pk9.m19383z(65));
                return xfaVar;
            default:
                ((Integer) obj2).getClass();
                fbd.m11753c((h0b) obj9, (x17) obj3, (vi3) obj8, (zi3) obj7, (vi3) obj6, (C0282a) obj5, (e16) obj4, (ye1) obj, pk9.m19383z(1769473));
                return xfaVar;
        }
    }

    public /* synthetic */ sx0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2) {
        this.f61528a = i2;
        this.f61529b = obj;
        this.f61530c = obj2;
        this.f61531d = obj3;
        this.f61532e = obj4;
        this.f61533f = obj5;
        this.f61534g = obj6;
        this.f61535h = obj7;
    }
}
