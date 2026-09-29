package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.chat.LynxChatModel;
import com.lingq.core.domain.model.chat.LynxReasoningEffort;
import com.lingq.feature.chat.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class snb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f61072a = new C0282a(345802645, false, new jx0(23));

    /* JADX INFO: renamed from: b */
    public static final C0282a f61073b = new C0282a(1723427033, false, new jx0(24));

    /* JADX INFO: renamed from: c */
    public static final C0282a f61074c = new C0282a(-1892070877, false, new jx0(25));

    /* JADX INFO: renamed from: d */
    public static final C0282a f61075d = new C0282a(540409498, false, new jx0(26));

    /* JADX INFO: renamed from: e */
    public static final C0282a f61076e = new C0282a(1919711178, false, new jx0(27));

    /* JADX INFO: renamed from: a */
    public static final void m21494a(qn5 qn5Var, vi3 vi3Var, vi3 vi3Var2, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        String displayName;
        boolean z;
        LynxChatModel lynxChatModel = qn5Var.f57987a;
        vi3Var.getClass();
        vi3Var2.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(921344839);
        int i2 = 2;
        int i3 = i | (tj3Var.m22120g(qn5Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var2) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | 24576;
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.chat_qa_model_default);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38954c, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16Var2 = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var2);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            if (lynxChatModel == null || (displayName = lynxChatModel.getDisplayName()) == null) {
                displayName = strM23620a0;
            }
            m21495b(displayName, ci8.m4703P(-622439241, new dw0(ui3Var, strM23620a0, vi3Var, i2), tj3Var), tj3Var, 48);
            List<LynxReasoningEffort> supportedEfforts = lynxChatModel != null ? lynxChatModel.getSupportedEfforts() : null;
            if (supportedEfforts == null) {
                supportedEfforts = EmptyList.f47638a;
            }
            if (supportedEfforts.isEmpty()) {
                tj3Var.m22111b0(-2068414593);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-2069054619);
                LynxReasoningEffort lynxReasoningEffort = qn5Var.f57988b;
                String displayName2 = lynxReasoningEffort != null ? lynxReasoningEffort.getDisplayName() : null;
                if (displayName2 == null) {
                    tj3Var.m22111b0(-1729309580);
                    displayName2 = vz1.m23620a0(tj3Var, R$string.chat_qa_reasoning_effort);
                    z = false;
                } else {
                    z = false;
                    tj3Var.m22111b0(-1729311223);
                }
                tj3Var.m22139q(z);
                m21495b(displayName2, ci8.m4703P(-1468416772, new dw0(vi3Var2, qn5Var, strM23620a0, 3), tj3Var), tj3Var, 48);
                tj3Var.m22139q(z);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0((Object) qn5Var, (Object) vi3Var, (Object) vi3Var2, ui3Var, (Object) e16Var2, i, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m21495b(String str, C0282a c0282a, ye1 ye1Var, int i) {
        t66 t66Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(430381566);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var2 = (t66) objM22097O;
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM19045o = pb1.m19045o(b16Var, p58.m18901i(tj3Var).f64856b);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new do4(13, t66Var2);
                tj3Var.m22131l0(objM22097O2);
            }
            e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, (ui3) objM22097O2, e16VarM19045o, 15), ge9.m12515a(tj3Var).f38952a, ge9.m12515a(tj3Var).f38954c);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            lw9.m16554b(str, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71410n, tj3Var, i2 & 14, 0, 131066);
            p04 p04VarM17721b = y99.f69514b;
            if (p04VarM17721b == null) {
                o04 o04Var = new o04("Rounded.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i3 = soa.f61116a;
                pd9 pd9Var = new pd9(aa1.f403b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new q57(8.71f, 11.71f));
                arrayList.add(new x57(2.59f, 2.59f));
                arrayList.add(new v57(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f));
                arrayList.add(new x57(2.59f, -2.59f));
                arrayList.add(new v57(0.63f, -0.63f, 0.18f, -1.71f, -0.71f, -1.71f));
                arrayList.add(new o57(9.41f));
                arrayList.add(new v57(-0.89f, 0.0f, -1.33f, 1.08f, -0.7f, 1.71f));
                arrayList.add(m57.f50613c);
                o04.m17720a(o04Var, arrayList, pd9Var);
                p04VarM17721b = o04Var.m17721b();
                y99.f69514b = p04VarM17721b;
            }
            ty3.m22351a(p04VarM17721b, null, null, p58.m18900f(tj3Var).f55875s, tj3Var, 48, 4);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            boolean zBooleanValue = ((Boolean) t66Var2.getValue()).booleanValue();
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                t66Var = t66Var2;
                objM22097O3 = new do4(14, t66Var);
                tj3Var.m22131l0(objM22097O3);
            } else {
                t66Var = t66Var2;
            }
            AbstractC3003fj.m11885a(zBooleanValue, (ui3) objM22097O3, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(1399267369, new iz4(4, c0282a, t66Var), tj3Var), tj3Var, 48, 2044);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new pb0(str, c0282a, i);
        }
    }
}
