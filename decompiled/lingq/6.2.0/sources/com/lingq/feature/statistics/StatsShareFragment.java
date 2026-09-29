package com.lingq.feature.statistics;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.layout.AbstractC0334a;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.C0411w;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.achievements.R$string;
import com.lingq.core.designsystem.R$style;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.feature.statistics.StatsShareFragment;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3065h7;
import p000.C3309ls;
import p000.InterfaceC2991f7;
import p000.bh4;
import p000.cs4;
import p000.dua;
import p000.gr3;
import p000.jfa;
import p000.lda;
import p000.or1;
import p000.qf3;
import p000.qt3;
import p000.ui3;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zi3;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class StatsShareFragment extends qt3 {

    /* JADX INFO: renamed from: U0 */
    public static final /* synthetic */ bh4[] f33326U0 = {new PropertyReference1Impl(StatsShareFragment.class, "binding", "getBinding()Lcom/lingq/feature/statistics/databinding/FragmentStatsShareBinding;")};

    /* JADX INFO: renamed from: S0 */
    public final C3309ls f33327S0;

    /* JADX INFO: renamed from: T0 */
    public final w41 f33328T0;

    public StatsShareFragment() {
        super(6);
        this.f33327S0 = jfa.m14432o(this, StatsShareFragment$binding$2.f33329i);
        final StatsShareFragment$special$$inlined$viewModels$default$1 statsShareFragment$special$$inlined$viewModels$default$1 = new StatsShareFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.statistics.StatsShareFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) statsShareFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f33328T0 = new w41(y38.m24933a(C2821i.class), new ui3() { // from class: com.lingq.feature.statistics.StatsShareFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.statistics.StatsShareFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                zta ztaVarMo2102d;
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f33352b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.statistics.StatsShareFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return gr3Var != null ? gr3Var.mo2103e() : or1.f54780b;
            }
        });
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R$layout.fragment_stats_share, viewGroup, false);
    }

    /* JADX INFO: renamed from: A0 */
    public final qf3 m9724A0() {
        return (qf3) this.f33327S0.getValue(this, f33326U0[0]);
    }

    /* JADX INFO: renamed from: B0 */
    public final C2821i m9725B0() {
        return (C2821i) this.f33328T0.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        m2088P(new InterfaceC2991f7() { // from class: com.lingq.feature.statistics.g
            @Override // p000.InterfaceC2991f7
            /* JADX INFO: renamed from: c */
            public final void mo2125c(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bh4[] bh4VarArr = StatsShareFragment.f33326U0;
                if (zBooleanValue) {
                    C2821i c2821iM9725B0 = this.f33468a.m9725B0();
                    c2821iM9725B0.getClass();
                    wfb.m23926u(lda.m16103C(c2821iM9725B0), null, null, new StatsShareViewModel$shareStats$1(c2821iM9725B0, null), 3);
                }
            }
        }, new C3065h7());
        qf3 qf3VarM9724A0 = m9724A0();
        qf3VarM9724A0.f57684a.setOnClickListener(new View.OnClickListener() { // from class: com.lingq.feature.statistics.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bh4[] bh4VarArr = StatsShareFragment.f33326U0;
                C2821i c2821iM9725B0 = this.f33469a.m9725B0();
                c2821iM9725B0.getClass();
                wfb.m23926u(lda.m16103C(c2821iM9725B0), null, null, new StatsShareViewModel$shareStats$1(c2821iM9725B0, null), 3);
            }
        });
        final ComposeView composeView = qf3VarM9724A0.f57688e;
        final int i = 0;
        final int i2 = 1;
        composeView.setContent(new C0282a(-1290662490, true, new zi3() { // from class: ji9
            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                int i3 = i;
                xfa xfaVar = xfa.f68157a;
                C0411w c0411w = C0411w.f4868a;
                final StatsShareFragment statsShareFragment = this;
                ComposeView composeView2 = composeView;
                final int i4 = 1;
                final int i5 = 0;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i3) {
                    case 0:
                        bh4[] bh4VarArr = StatsShareFragment.f33326U0;
                        tj3 tj3Var = (tj3) ye1Var;
                        if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            tj3Var.m22102U();
                        } else {
                            composeView2.setViewCompositionStrategy(c0411w);
                            fy9.m12246a(false, null, ci8.m4703P(-1812445981, new zi3() { // from class: ki9
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // p000.zi3
                                public final Object invoke(Object obj3, Object obj4) {
                                    int i6 = i5;
                                    xfa xfaVar2 = xfa.f68157a;
                                    int i7 = 0;
                                    boolean z = true;
                                    StatsShareFragment statsShareFragment2 = statsShareFragment;
                                    switch (i6) {
                                        case 0:
                                            ye1 ye1Var2 = (ye1) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            bh4[] bh4VarArr2 = StatsShareFragment.f33326U0;
                                            tj3 tj3Var2 = (tj3) ye1Var2;
                                            if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                tj3Var2.m22102U();
                                            } else {
                                                t66 t66VarM2513c = AbstractC0711a.m2513c(statsShareFragment2.m9725B0().f33473e, tj3Var2);
                                                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                                                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                                                l77 l77VarM22132m = tj3Var2.m22132m();
                                                b16 b16Var = b16.f7762a;
                                                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16Var);
                                                se1.f60731q.getClass();
                                                ui3 ui3Var = C0352b.f4299b;
                                                tj3Var2.m22119f0();
                                                if (tj3Var2.f62384S) {
                                                    tj3Var2.m22130l(ui3Var);
                                                } else {
                                                    tj3Var2.m22137o0();
                                                }
                                                oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                                                oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                                                oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                                                oha.m18000f(tj3Var2, C0352b.f4305h);
                                                oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                                                if (((uj9) t66VarM2513c.getValue()) instanceof tj9) {
                                                    tj3Var2.m22111b0(1185879993);
                                                    String strM2111m = statsShareFragment2.m2111m(R$string.stats_n_day_streak);
                                                    strM2111m.getClass();
                                                    uj9 uj9Var = (uj9) t66VarM2513c.getValue();
                                                    uj9Var.getClass();
                                                    lw9.m16554b(String.format(strM2111m, Arrays.copyOf(new Object[]{Integer.valueOf(((tj9) uj9Var).f62421a)}, 1)), AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a, 7), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262140);
                                                    r46.m20382g(null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64857c, null, null, null, null, ci8.m4703P(1698313870, new oo1(3, t66VarM2513c), tj3Var2), tj3Var2, 1572864, 61);
                                                    tj3Var2.m22139q(false);
                                                } else {
                                                    tj3Var2.m22111b0(1186633417);
                                                    tj3Var2.m22139q(false);
                                                }
                                                tj3Var2.m22139q(true);
                                            }
                                            break;
                                        default:
                                            ye1 ye1Var3 = (ye1) obj3;
                                            int iIntValue3 = ((Integer) obj4).intValue();
                                            bh4[] bh4VarArr3 = StatsShareFragment.f33326U0;
                                            ec0 ec0Var = nj0.f52791J;
                                            C3587su c3587su = eh0.f37238d;
                                            tj3 tj3Var3 = (tj3) ye1Var3;
                                            if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                tj3Var3.m22102U();
                                            } else {
                                                t66 t66VarM2513c2 = AbstractC0711a.m2513c(statsShareFragment2.m9725B0().f33479k, tj3Var3);
                                                bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var3, 0);
                                                int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                                                l77 l77VarM22132m2 = tj3Var3.m22132m();
                                                b16 b16Var2 = b16.f7762a;
                                                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, b16Var2);
                                                se1.f60731q.getClass();
                                                ui3 ui3Var2 = C0352b.f4299b;
                                                tj3Var3.m22119f0();
                                                if (tj3Var3.f62384S) {
                                                    tj3Var3.m22130l(ui3Var2);
                                                } else {
                                                    tj3Var3.m22137o0();
                                                }
                                                oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a2);
                                                oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m2);
                                                oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode2));
                                                oha.m18000f(tj3Var3, C0352b.f4305h);
                                                oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c2);
                                                tj3Var3.m22111b0(-1168396039);
                                                Iterator it = ((Iterable) ((Pair) t66VarM2513c2.getValue()).f47623a).iterator();
                                                while (it.hasNext()) {
                                                    yl4 yl4Var = (yl4) it.next();
                                                    e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var2, ge9.m12515a(tj3Var3).f38955d);
                                                    bb1 bb1VarM230a3 = ab1.m230a(c3587su, ec0Var, tj3Var3, i7);
                                                    int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                                                    l77 l77VarM22132m3 = tj3Var3.m22132m();
                                                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, e16VarM21607T);
                                                    se1.f60731q.getClass();
                                                    ui3 ui3Var3 = C0352b.f4299b;
                                                    tj3Var3.m22119f0();
                                                    if (tj3Var3.f62384S) {
                                                        tj3Var3.m22130l(ui3Var3);
                                                    } else {
                                                        tj3Var3.m22137o0();
                                                    }
                                                    zi3 zi3Var = C0352b.f4303f;
                                                    oha.m18001g(tj3Var3, zi3Var, bb1VarM230a3);
                                                    zi3 zi3Var2 = C0352b.f4302e;
                                                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m3);
                                                    Integer numValueOf = Integer.valueOf(iHashCode3);
                                                    zi3 zi3Var3 = C0352b.f4304g;
                                                    oha.m18001g(tj3Var3, zi3Var3, numValueOf);
                                                    vi3 vi3Var = C0352b.f4305h;
                                                    oha.m18000f(tj3Var3, vi3Var);
                                                    zi3 zi3Var4 = C0352b.f4301d;
                                                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c3);
                                                    e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
                                                    Iterator it2 = it;
                                                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var3, i7);
                                                    int iHashCode4 = Long.hashCode(tj3Var3.f62385T);
                                                    l77 l77VarM22132m4 = tj3Var3.m22132m();
                                                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e);
                                                    tj3Var3.m22119f0();
                                                    if (tj3Var3.f62384S) {
                                                        tj3Var3.m22130l(ui3Var3);
                                                    } else {
                                                        tj3Var3.m22137o0();
                                                    }
                                                    oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
                                                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m4);
                                                    AbstractC3393o1.m17747v(iHashCode4, tj3Var3, zi3Var3, tj3Var3, vi3Var);
                                                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c4);
                                                    e16 e16VarMo3161g = c99.m4430w(b16Var2, null, 3).mo3161g(new f7b(AbstractC0334a.f4179a));
                                                    LanguageProgressMetric languageProgressMetric = yl4Var.f69988a;
                                                    String strM23620a0 = vz1.m23620a0(tj3Var3, AbstractC3423or.m18223H(languageProgressMetric));
                                                    vx9 vx9Var = p58.m18902j(tj3Var3).f71408l;
                                                    tj3 tj3Var4 = tj3Var3;
                                                    b16 b16Var3 = b16Var2;
                                                    lw9.m16554b(strM23620a0, e16VarMo3161g, p58.m18900f(tj3Var3).f55873q, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, 0, 0, null, vx9Var, tj3Var4, 0, 0, 130040);
                                                    if (1.0f <= 0.0d) {
                                                        g54.m12362a("invalid weight; must be greater than zero");
                                                    }
                                                    e16 e16VarMo3161g2 = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).mo3161g(new f7b(AbstractC0334a.f4179a));
                                                    boolean zM21391a = shd.m21391a(languageProgressMetric);
                                                    double d = yl4Var.f69989b;
                                                    lw9.m16554b(String.valueOf(zM21391a ? Integer.valueOf((int) d) : Double.valueOf(nob.m17572a(2, d))), e16VarMo3161g2, p58.m18900f(tj3Var4).f55873q, new m20(vs9.f65864a, p58.m18902j(tj3Var4).f71404h.f66065a.f42265b, d32.m10018P(1)), 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 1, 0, null, p58.m18902j(tj3Var4).f71404h, tj3Var4, 0, 24576, 113648);
                                                    e16 e16VarMo3161g3 = c99.m4430w(b16Var3, null, 3).mo3161g(new f7b(AbstractC0334a.f4179a));
                                                    boolean zM21391a2 = shd.m21391a(languageProgressMetric);
                                                    double d2 = yl4Var.f69990c;
                                                    lw9.m16554b("/" + (zM21391a2 ? Integer.valueOf((int) d2) : Double.valueOf(nob.m17572a(2, d2))), e16VarMo3161g3, p58.m18900f(tj3Var4).f55873q, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var4).f71407k, tj3Var4, 0, 0, 130040);
                                                    tj3Var4.m22139q(true);
                                                    e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4415h(c99.m4412e(b16Var3, 1.0f), 24.0f, 48.0f), 0.0f, ge9.m12515a(tj3Var4).f38956e, 1);
                                                    float f = ge9.m12515a(tj3Var4).f38955d;
                                                    long jM4212e = cx2.m9917a(tj3Var4).m4212e();
                                                    boolean zM22120g = tj3Var4.m22120g(yl4Var);
                                                    Object objM22097O = tj3Var4.m22097O();
                                                    if (zM22120g || objM22097O == we1.f66679a) {
                                                        objM22097O = new br8(yl4Var, 4);
                                                        tj3Var4.m22131l0(objM22097O);
                                                    }
                                                    dn7.m10494c((ui3) objM22097O, e16VarM21609V, jM4212e, 0L, 0, f, null, tj3Var4, 0, 88);
                                                    tj3Var4.m22139q(true);
                                                    b16Var2 = b16Var3;
                                                    z = true;
                                                    i7 = 0;
                                                    tj3Var3 = tj3Var4;
                                                    it = it2;
                                                }
                                                tj3 tj3Var5 = tj3Var3;
                                                tj3Var5.m22139q(i7);
                                                tj3Var5.m22139q(z);
                                            }
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            }, tj3Var), tj3Var, 384);
                        }
                        break;
                    default:
                        bh4[] bh4VarArr2 = StatsShareFragment.f33326U0;
                        tj3 tj3Var2 = (tj3) ye1Var;
                        if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            tj3Var2.m22102U();
                        } else {
                            composeView2.setViewCompositionStrategy(c0411w);
                            fy9.m12246a(false, null, ci8.m4703P(-957295412, new zi3() { // from class: ki9
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // p000.zi3
                                public final Object invoke(Object obj3, Object obj4) {
                                    int i6 = i4;
                                    xfa xfaVar2 = xfa.f68157a;
                                    int i7 = 0;
                                    boolean z = true;
                                    StatsShareFragment statsShareFragment2 = statsShareFragment;
                                    switch (i6) {
                                        case 0:
                                            ye1 ye1Var2 = (ye1) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            bh4[] bh4VarArr3 = StatsShareFragment.f33326U0;
                                            tj3 tj3Var3 = (tj3) ye1Var2;
                                            if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                tj3Var3.m22102U();
                                            } else {
                                                t66 t66VarM2513c = AbstractC0711a.m2513c(statsShareFragment2.m9725B0().f33473e, tj3Var3);
                                                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                                                int iHashCode = Long.hashCode(tj3Var3.f62385T);
                                                l77 l77VarM22132m = tj3Var3.m22132m();
                                                b16 b16Var = b16.f7762a;
                                                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, b16Var);
                                                se1.f60731q.getClass();
                                                ui3 ui3Var = C0352b.f4299b;
                                                tj3Var3.m22119f0();
                                                if (tj3Var3.f62384S) {
                                                    tj3Var3.m22130l(ui3Var);
                                                } else {
                                                    tj3Var3.m22137o0();
                                                }
                                                oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a);
                                                oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                                                oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                                                oha.m18000f(tj3Var3, C0352b.f4305h);
                                                oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                                                if (((uj9) t66VarM2513c.getValue()) instanceof tj9) {
                                                    tj3Var3.m22111b0(1185879993);
                                                    String strM2111m = statsShareFragment2.m2111m(R$string.stats_n_day_streak);
                                                    strM2111m.getClass();
                                                    uj9 uj9Var = (uj9) t66VarM2513c.getValue();
                                                    uj9Var.getClass();
                                                    lw9.m16554b(String.format(strM2111m, Arrays.copyOf(new Object[]{Integer.valueOf(((tj9) uj9Var).f62421a)}, 1)), AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38952a, 7), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262140);
                                                    r46.m20382g(null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51801c.f64857c, null, null, null, null, ci8.m4703P(1698313870, new oo1(3, t66VarM2513c), tj3Var3), tj3Var3, 1572864, 61);
                                                    tj3Var3.m22139q(false);
                                                } else {
                                                    tj3Var3.m22111b0(1186633417);
                                                    tj3Var3.m22139q(false);
                                                }
                                                tj3Var3.m22139q(true);
                                            }
                                            break;
                                        default:
                                            ye1 ye1Var3 = (ye1) obj3;
                                            int iIntValue3 = ((Integer) obj4).intValue();
                                            bh4[] bh4VarArr4 = StatsShareFragment.f33326U0;
                                            ec0 ec0Var = nj0.f52791J;
                                            C3587su c3587su = eh0.f37238d;
                                            tj3 tj3Var4 = (tj3) ye1Var3;
                                            if (!tj3Var4.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                tj3Var4.m22102U();
                                            } else {
                                                t66 t66VarM2513c2 = AbstractC0711a.m2513c(statsShareFragment2.m9725B0().f33479k, tj3Var4);
                                                bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var4, 0);
                                                int iHashCode2 = Long.hashCode(tj3Var4.f62385T);
                                                l77 l77VarM22132m2 = tj3Var4.m22132m();
                                                b16 b16Var2 = b16.f7762a;
                                                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var4, b16Var2);
                                                se1.f60731q.getClass();
                                                ui3 ui3Var2 = C0352b.f4299b;
                                                tj3Var4.m22119f0();
                                                if (tj3Var4.f62384S) {
                                                    tj3Var4.m22130l(ui3Var2);
                                                } else {
                                                    tj3Var4.m22137o0();
                                                }
                                                oha.m18001g(tj3Var4, C0352b.f4303f, bb1VarM230a2);
                                                oha.m18001g(tj3Var4, C0352b.f4302e, l77VarM22132m2);
                                                oha.m18001g(tj3Var4, C0352b.f4304g, Integer.valueOf(iHashCode2));
                                                oha.m18000f(tj3Var4, C0352b.f4305h);
                                                oha.m18001g(tj3Var4, C0352b.f4301d, e16VarM1322c2);
                                                tj3Var4.m22111b0(-1168396039);
                                                Iterator it = ((Iterable) ((Pair) t66VarM2513c2.getValue()).f47623a).iterator();
                                                while (it.hasNext()) {
                                                    yl4 yl4Var = (yl4) it.next();
                                                    e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var2, ge9.m12515a(tj3Var4).f38955d);
                                                    bb1 bb1VarM230a3 = ab1.m230a(c3587su, ec0Var, tj3Var4, i7);
                                                    int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
                                                    l77 l77VarM22132m3 = tj3Var4.m22132m();
                                                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, e16VarM21607T);
                                                    se1.f60731q.getClass();
                                                    ui3 ui3Var3 = C0352b.f4299b;
                                                    tj3Var4.m22119f0();
                                                    if (tj3Var4.f62384S) {
                                                        tj3Var4.m22130l(ui3Var3);
                                                    } else {
                                                        tj3Var4.m22137o0();
                                                    }
                                                    zi3 zi3Var = C0352b.f4303f;
                                                    oha.m18001g(tj3Var4, zi3Var, bb1VarM230a3);
                                                    zi3 zi3Var2 = C0352b.f4302e;
                                                    oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m3);
                                                    Integer numValueOf = Integer.valueOf(iHashCode3);
                                                    zi3 zi3Var3 = C0352b.f4304g;
                                                    oha.m18001g(tj3Var4, zi3Var3, numValueOf);
                                                    vi3 vi3Var = C0352b.f4305h;
                                                    oha.m18000f(tj3Var4, vi3Var);
                                                    zi3 zi3Var4 = C0352b.f4301d;
                                                    oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c3);
                                                    e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
                                                    Iterator it2 = it;
                                                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var4, i7);
                                                    int iHashCode4 = Long.hashCode(tj3Var4.f62385T);
                                                    l77 l77VarM22132m4 = tj3Var4.m22132m();
                                                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var4, e16VarM4412e);
                                                    tj3Var4.m22119f0();
                                                    if (tj3Var4.f62384S) {
                                                        tj3Var4.m22130l(ui3Var3);
                                                    } else {
                                                        tj3Var4.m22137o0();
                                                    }
                                                    oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a);
                                                    oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m4);
                                                    AbstractC3393o1.m17747v(iHashCode4, tj3Var4, zi3Var3, tj3Var4, vi3Var);
                                                    oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c4);
                                                    e16 e16VarMo3161g = c99.m4430w(b16Var2, null, 3).mo3161g(new f7b(AbstractC0334a.f4179a));
                                                    LanguageProgressMetric languageProgressMetric = yl4Var.f69988a;
                                                    String strM23620a0 = vz1.m23620a0(tj3Var4, AbstractC3423or.m18223H(languageProgressMetric));
                                                    vx9 vx9Var = p58.m18902j(tj3Var4).f71408l;
                                                    tj3 tj3Var5 = tj3Var4;
                                                    b16 b16Var3 = b16Var2;
                                                    lw9.m16554b(strM23620a0, e16VarMo3161g, p58.m18900f(tj3Var4).f55873q, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, 0, 0, null, vx9Var, tj3Var5, 0, 0, 130040);
                                                    if (1.0f <= 0.0d) {
                                                        g54.m12362a("invalid weight; must be greater than zero");
                                                    }
                                                    e16 e16VarMo3161g2 = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).mo3161g(new f7b(AbstractC0334a.f4179a));
                                                    boolean zM21391a = shd.m21391a(languageProgressMetric);
                                                    double d = yl4Var.f69989b;
                                                    lw9.m16554b(String.valueOf(zM21391a ? Integer.valueOf((int) d) : Double.valueOf(nob.m17572a(2, d))), e16VarMo3161g2, p58.m18900f(tj3Var5).f55873q, new m20(vs9.f65864a, p58.m18902j(tj3Var5).f71404h.f66065a.f42265b, d32.m10018P(1)), 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 1, 0, null, p58.m18902j(tj3Var5).f71404h, tj3Var5, 0, 24576, 113648);
                                                    e16 e16VarMo3161g3 = c99.m4430w(b16Var3, null, 3).mo3161g(new f7b(AbstractC0334a.f4179a));
                                                    boolean zM21391a2 = shd.m21391a(languageProgressMetric);
                                                    double d2 = yl4Var.f69990c;
                                                    lw9.m16554b("/" + (zM21391a2 ? Integer.valueOf((int) d2) : Double.valueOf(nob.m17572a(2, d2))), e16VarMo3161g3, p58.m18900f(tj3Var5).f55873q, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var5).f71407k, tj3Var5, 0, 0, 130040);
                                                    tj3Var5.m22139q(true);
                                                    e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4415h(c99.m4412e(b16Var3, 1.0f), 24.0f, 48.0f), 0.0f, ge9.m12515a(tj3Var5).f38956e, 1);
                                                    float f = ge9.m12515a(tj3Var5).f38955d;
                                                    long jM4212e = cx2.m9917a(tj3Var5).m4212e();
                                                    boolean zM22120g = tj3Var5.m22120g(yl4Var);
                                                    Object objM22097O = tj3Var5.m22097O();
                                                    if (zM22120g || objM22097O == we1.f66679a) {
                                                        objM22097O = new br8(yl4Var, 4);
                                                        tj3Var5.m22131l0(objM22097O);
                                                    }
                                                    dn7.m10494c((ui3) objM22097O, e16VarM21609V, jM4212e, 0L, 0, f, null, tj3Var5, 0, 88);
                                                    tj3Var5.m22139q(true);
                                                    b16Var2 = b16Var3;
                                                    z = true;
                                                    i7 = 0;
                                                    tj3Var4 = tj3Var5;
                                                    it = it2;
                                                }
                                                tj3 tj3Var6 = tj3Var4;
                                                tj3Var6.m22139q(i7);
                                                tj3Var6.m22139q(z);
                                            }
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            }, tj3Var2), tj3Var2, 384);
                        }
                        break;
                }
                return xfaVar;
            }
        }));
        final ComposeView composeView2 = qf3VarM9724A0.f57685b;
        composeView2.setContent(new C0282a(-2034534193, true, new zi3() { // from class: ji9
            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                int i3 = i2;
                xfa xfaVar = xfa.f68157a;
                C0411w c0411w = C0411w.f4868a;
                final StatsShareFragment statsShareFragment = this;
                ComposeView composeView3 = composeView2;
                final int i4 = 1;
                final int i5 = 0;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i3) {
                    case 0:
                        bh4[] bh4VarArr = StatsShareFragment.f33326U0;
                        tj3 tj3Var = (tj3) ye1Var;
                        if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            tj3Var.m22102U();
                        } else {
                            composeView3.setViewCompositionStrategy(c0411w);
                            fy9.m12246a(false, null, ci8.m4703P(-1812445981, new zi3() { // from class: ki9
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // p000.zi3
                                public final Object invoke(Object obj3, Object obj4) {
                                    int i6 = i5;
                                    xfa xfaVar2 = xfa.f68157a;
                                    int i7 = 0;
                                    boolean z = true;
                                    StatsShareFragment statsShareFragment2 = statsShareFragment;
                                    switch (i6) {
                                        case 0:
                                            ye1 ye1Var2 = (ye1) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            bh4[] bh4VarArr3 = StatsShareFragment.f33326U0;
                                            tj3 tj3Var3 = (tj3) ye1Var2;
                                            if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                tj3Var3.m22102U();
                                            } else {
                                                t66 t66VarM2513c = AbstractC0711a.m2513c(statsShareFragment2.m9725B0().f33473e, tj3Var3);
                                                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                                                int iHashCode = Long.hashCode(tj3Var3.f62385T);
                                                l77 l77VarM22132m = tj3Var3.m22132m();
                                                b16 b16Var = b16.f7762a;
                                                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, b16Var);
                                                se1.f60731q.getClass();
                                                ui3 ui3Var = C0352b.f4299b;
                                                tj3Var3.m22119f0();
                                                if (tj3Var3.f62384S) {
                                                    tj3Var3.m22130l(ui3Var);
                                                } else {
                                                    tj3Var3.m22137o0();
                                                }
                                                oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a);
                                                oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                                                oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                                                oha.m18000f(tj3Var3, C0352b.f4305h);
                                                oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                                                if (((uj9) t66VarM2513c.getValue()) instanceof tj9) {
                                                    tj3Var3.m22111b0(1185879993);
                                                    String strM2111m = statsShareFragment2.m2111m(R$string.stats_n_day_streak);
                                                    strM2111m.getClass();
                                                    uj9 uj9Var = (uj9) t66VarM2513c.getValue();
                                                    uj9Var.getClass();
                                                    lw9.m16554b(String.format(strM2111m, Arrays.copyOf(new Object[]{Integer.valueOf(((tj9) uj9Var).f62421a)}, 1)), AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38952a, 7), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262140);
                                                    r46.m20382g(null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51801c.f64857c, null, null, null, null, ci8.m4703P(1698313870, new oo1(3, t66VarM2513c), tj3Var3), tj3Var3, 1572864, 61);
                                                    tj3Var3.m22139q(false);
                                                } else {
                                                    tj3Var3.m22111b0(1186633417);
                                                    tj3Var3.m22139q(false);
                                                }
                                                tj3Var3.m22139q(true);
                                            }
                                            break;
                                        default:
                                            ye1 ye1Var3 = (ye1) obj3;
                                            int iIntValue3 = ((Integer) obj4).intValue();
                                            bh4[] bh4VarArr4 = StatsShareFragment.f33326U0;
                                            ec0 ec0Var = nj0.f52791J;
                                            C3587su c3587su = eh0.f37238d;
                                            tj3 tj3Var4 = (tj3) ye1Var3;
                                            if (!tj3Var4.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                tj3Var4.m22102U();
                                            } else {
                                                t66 t66VarM2513c2 = AbstractC0711a.m2513c(statsShareFragment2.m9725B0().f33479k, tj3Var4);
                                                bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var4, 0);
                                                int iHashCode2 = Long.hashCode(tj3Var4.f62385T);
                                                l77 l77VarM22132m2 = tj3Var4.m22132m();
                                                b16 b16Var2 = b16.f7762a;
                                                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var4, b16Var2);
                                                se1.f60731q.getClass();
                                                ui3 ui3Var2 = C0352b.f4299b;
                                                tj3Var4.m22119f0();
                                                if (tj3Var4.f62384S) {
                                                    tj3Var4.m22130l(ui3Var2);
                                                } else {
                                                    tj3Var4.m22137o0();
                                                }
                                                oha.m18001g(tj3Var4, C0352b.f4303f, bb1VarM230a2);
                                                oha.m18001g(tj3Var4, C0352b.f4302e, l77VarM22132m2);
                                                oha.m18001g(tj3Var4, C0352b.f4304g, Integer.valueOf(iHashCode2));
                                                oha.m18000f(tj3Var4, C0352b.f4305h);
                                                oha.m18001g(tj3Var4, C0352b.f4301d, e16VarM1322c2);
                                                tj3Var4.m22111b0(-1168396039);
                                                Iterator it = ((Iterable) ((Pair) t66VarM2513c2.getValue()).f47623a).iterator();
                                                while (it.hasNext()) {
                                                    yl4 yl4Var = (yl4) it.next();
                                                    e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var2, ge9.m12515a(tj3Var4).f38955d);
                                                    bb1 bb1VarM230a3 = ab1.m230a(c3587su, ec0Var, tj3Var4, i7);
                                                    int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
                                                    l77 l77VarM22132m3 = tj3Var4.m22132m();
                                                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, e16VarM21607T);
                                                    se1.f60731q.getClass();
                                                    ui3 ui3Var3 = C0352b.f4299b;
                                                    tj3Var4.m22119f0();
                                                    if (tj3Var4.f62384S) {
                                                        tj3Var4.m22130l(ui3Var3);
                                                    } else {
                                                        tj3Var4.m22137o0();
                                                    }
                                                    zi3 zi3Var = C0352b.f4303f;
                                                    oha.m18001g(tj3Var4, zi3Var, bb1VarM230a3);
                                                    zi3 zi3Var2 = C0352b.f4302e;
                                                    oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m3);
                                                    Integer numValueOf = Integer.valueOf(iHashCode3);
                                                    zi3 zi3Var3 = C0352b.f4304g;
                                                    oha.m18001g(tj3Var4, zi3Var3, numValueOf);
                                                    vi3 vi3Var = C0352b.f4305h;
                                                    oha.m18000f(tj3Var4, vi3Var);
                                                    zi3 zi3Var4 = C0352b.f4301d;
                                                    oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c3);
                                                    e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
                                                    Iterator it2 = it;
                                                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var4, i7);
                                                    int iHashCode4 = Long.hashCode(tj3Var4.f62385T);
                                                    l77 l77VarM22132m4 = tj3Var4.m22132m();
                                                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var4, e16VarM4412e);
                                                    tj3Var4.m22119f0();
                                                    if (tj3Var4.f62384S) {
                                                        tj3Var4.m22130l(ui3Var3);
                                                    } else {
                                                        tj3Var4.m22137o0();
                                                    }
                                                    oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a);
                                                    oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m4);
                                                    AbstractC3393o1.m17747v(iHashCode4, tj3Var4, zi3Var3, tj3Var4, vi3Var);
                                                    oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c4);
                                                    e16 e16VarMo3161g = c99.m4430w(b16Var2, null, 3).mo3161g(new f7b(AbstractC0334a.f4179a));
                                                    LanguageProgressMetric languageProgressMetric = yl4Var.f69988a;
                                                    String strM23620a0 = vz1.m23620a0(tj3Var4, AbstractC3423or.m18223H(languageProgressMetric));
                                                    vx9 vx9Var = p58.m18902j(tj3Var4).f71408l;
                                                    tj3 tj3Var5 = tj3Var4;
                                                    b16 b16Var3 = b16Var2;
                                                    lw9.m16554b(strM23620a0, e16VarMo3161g, p58.m18900f(tj3Var4).f55873q, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, 0, 0, null, vx9Var, tj3Var5, 0, 0, 130040);
                                                    if (1.0f <= 0.0d) {
                                                        g54.m12362a("invalid weight; must be greater than zero");
                                                    }
                                                    e16 e16VarMo3161g2 = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).mo3161g(new f7b(AbstractC0334a.f4179a));
                                                    boolean zM21391a = shd.m21391a(languageProgressMetric);
                                                    double d = yl4Var.f69989b;
                                                    lw9.m16554b(String.valueOf(zM21391a ? Integer.valueOf((int) d) : Double.valueOf(nob.m17572a(2, d))), e16VarMo3161g2, p58.m18900f(tj3Var5).f55873q, new m20(vs9.f65864a, p58.m18902j(tj3Var5).f71404h.f66065a.f42265b, d32.m10018P(1)), 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 1, 0, null, p58.m18902j(tj3Var5).f71404h, tj3Var5, 0, 24576, 113648);
                                                    e16 e16VarMo3161g3 = c99.m4430w(b16Var3, null, 3).mo3161g(new f7b(AbstractC0334a.f4179a));
                                                    boolean zM21391a2 = shd.m21391a(languageProgressMetric);
                                                    double d2 = yl4Var.f69990c;
                                                    lw9.m16554b("/" + (zM21391a2 ? Integer.valueOf((int) d2) : Double.valueOf(nob.m17572a(2, d2))), e16VarMo3161g3, p58.m18900f(tj3Var5).f55873q, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var5).f71407k, tj3Var5, 0, 0, 130040);
                                                    tj3Var5.m22139q(true);
                                                    e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4415h(c99.m4412e(b16Var3, 1.0f), 24.0f, 48.0f), 0.0f, ge9.m12515a(tj3Var5).f38956e, 1);
                                                    float f = ge9.m12515a(tj3Var5).f38955d;
                                                    long jM4212e = cx2.m9917a(tj3Var5).m4212e();
                                                    boolean zM22120g = tj3Var5.m22120g(yl4Var);
                                                    Object objM22097O = tj3Var5.m22097O();
                                                    if (zM22120g || objM22097O == we1.f66679a) {
                                                        objM22097O = new br8(yl4Var, 4);
                                                        tj3Var5.m22131l0(objM22097O);
                                                    }
                                                    dn7.m10494c((ui3) objM22097O, e16VarM21609V, jM4212e, 0L, 0, f, null, tj3Var5, 0, 88);
                                                    tj3Var5.m22139q(true);
                                                    b16Var2 = b16Var3;
                                                    z = true;
                                                    i7 = 0;
                                                    tj3Var4 = tj3Var5;
                                                    it = it2;
                                                }
                                                tj3 tj3Var6 = tj3Var4;
                                                tj3Var6.m22139q(i7);
                                                tj3Var6.m22139q(z);
                                            }
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            }, tj3Var), tj3Var, 384);
                        }
                        break;
                    default:
                        bh4[] bh4VarArr2 = StatsShareFragment.f33326U0;
                        tj3 tj3Var2 = (tj3) ye1Var;
                        if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            tj3Var2.m22102U();
                        } else {
                            composeView3.setViewCompositionStrategy(c0411w);
                            fy9.m12246a(false, null, ci8.m4703P(-957295412, new zi3() { // from class: ki9
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // p000.zi3
                                public final Object invoke(Object obj3, Object obj4) {
                                    int i6 = i4;
                                    xfa xfaVar2 = xfa.f68157a;
                                    int i7 = 0;
                                    boolean z = true;
                                    StatsShareFragment statsShareFragment2 = statsShareFragment;
                                    switch (i6) {
                                        case 0:
                                            ye1 ye1Var2 = (ye1) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            bh4[] bh4VarArr3 = StatsShareFragment.f33326U0;
                                            tj3 tj3Var3 = (tj3) ye1Var2;
                                            if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                tj3Var3.m22102U();
                                            } else {
                                                t66 t66VarM2513c = AbstractC0711a.m2513c(statsShareFragment2.m9725B0().f33473e, tj3Var3);
                                                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                                                int iHashCode = Long.hashCode(tj3Var3.f62385T);
                                                l77 l77VarM22132m = tj3Var3.m22132m();
                                                b16 b16Var = b16.f7762a;
                                                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, b16Var);
                                                se1.f60731q.getClass();
                                                ui3 ui3Var = C0352b.f4299b;
                                                tj3Var3.m22119f0();
                                                if (tj3Var3.f62384S) {
                                                    tj3Var3.m22130l(ui3Var);
                                                } else {
                                                    tj3Var3.m22137o0();
                                                }
                                                oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a);
                                                oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                                                oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                                                oha.m18000f(tj3Var3, C0352b.f4305h);
                                                oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                                                if (((uj9) t66VarM2513c.getValue()) instanceof tj9) {
                                                    tj3Var3.m22111b0(1185879993);
                                                    String strM2111m = statsShareFragment2.m2111m(R$string.stats_n_day_streak);
                                                    strM2111m.getClass();
                                                    uj9 uj9Var = (uj9) t66VarM2513c.getValue();
                                                    uj9Var.getClass();
                                                    lw9.m16554b(String.format(strM2111m, Arrays.copyOf(new Object[]{Integer.valueOf(((tj9) uj9Var).f62421a)}, 1)), AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38952a, 7), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262140);
                                                    r46.m20382g(null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51801c.f64857c, null, null, null, null, ci8.m4703P(1698313870, new oo1(3, t66VarM2513c), tj3Var3), tj3Var3, 1572864, 61);
                                                    tj3Var3.m22139q(false);
                                                } else {
                                                    tj3Var3.m22111b0(1186633417);
                                                    tj3Var3.m22139q(false);
                                                }
                                                tj3Var3.m22139q(true);
                                            }
                                            break;
                                        default:
                                            ye1 ye1Var3 = (ye1) obj3;
                                            int iIntValue3 = ((Integer) obj4).intValue();
                                            bh4[] bh4VarArr4 = StatsShareFragment.f33326U0;
                                            ec0 ec0Var = nj0.f52791J;
                                            C3587su c3587su = eh0.f37238d;
                                            tj3 tj3Var4 = (tj3) ye1Var3;
                                            if (!tj3Var4.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                tj3Var4.m22102U();
                                            } else {
                                                t66 t66VarM2513c2 = AbstractC0711a.m2513c(statsShareFragment2.m9725B0().f33479k, tj3Var4);
                                                bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var4, 0);
                                                int iHashCode2 = Long.hashCode(tj3Var4.f62385T);
                                                l77 l77VarM22132m2 = tj3Var4.m22132m();
                                                b16 b16Var2 = b16.f7762a;
                                                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var4, b16Var2);
                                                se1.f60731q.getClass();
                                                ui3 ui3Var2 = C0352b.f4299b;
                                                tj3Var4.m22119f0();
                                                if (tj3Var4.f62384S) {
                                                    tj3Var4.m22130l(ui3Var2);
                                                } else {
                                                    tj3Var4.m22137o0();
                                                }
                                                oha.m18001g(tj3Var4, C0352b.f4303f, bb1VarM230a2);
                                                oha.m18001g(tj3Var4, C0352b.f4302e, l77VarM22132m2);
                                                oha.m18001g(tj3Var4, C0352b.f4304g, Integer.valueOf(iHashCode2));
                                                oha.m18000f(tj3Var4, C0352b.f4305h);
                                                oha.m18001g(tj3Var4, C0352b.f4301d, e16VarM1322c2);
                                                tj3Var4.m22111b0(-1168396039);
                                                Iterator it = ((Iterable) ((Pair) t66VarM2513c2.getValue()).f47623a).iterator();
                                                while (it.hasNext()) {
                                                    yl4 yl4Var = (yl4) it.next();
                                                    e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var2, ge9.m12515a(tj3Var4).f38955d);
                                                    bb1 bb1VarM230a3 = ab1.m230a(c3587su, ec0Var, tj3Var4, i7);
                                                    int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
                                                    l77 l77VarM22132m3 = tj3Var4.m22132m();
                                                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, e16VarM21607T);
                                                    se1.f60731q.getClass();
                                                    ui3 ui3Var3 = C0352b.f4299b;
                                                    tj3Var4.m22119f0();
                                                    if (tj3Var4.f62384S) {
                                                        tj3Var4.m22130l(ui3Var3);
                                                    } else {
                                                        tj3Var4.m22137o0();
                                                    }
                                                    zi3 zi3Var = C0352b.f4303f;
                                                    oha.m18001g(tj3Var4, zi3Var, bb1VarM230a3);
                                                    zi3 zi3Var2 = C0352b.f4302e;
                                                    oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m3);
                                                    Integer numValueOf = Integer.valueOf(iHashCode3);
                                                    zi3 zi3Var3 = C0352b.f4304g;
                                                    oha.m18001g(tj3Var4, zi3Var3, numValueOf);
                                                    vi3 vi3Var = C0352b.f4305h;
                                                    oha.m18000f(tj3Var4, vi3Var);
                                                    zi3 zi3Var4 = C0352b.f4301d;
                                                    oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c3);
                                                    e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
                                                    Iterator it2 = it;
                                                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var4, i7);
                                                    int iHashCode4 = Long.hashCode(tj3Var4.f62385T);
                                                    l77 l77VarM22132m4 = tj3Var4.m22132m();
                                                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var4, e16VarM4412e);
                                                    tj3Var4.m22119f0();
                                                    if (tj3Var4.f62384S) {
                                                        tj3Var4.m22130l(ui3Var3);
                                                    } else {
                                                        tj3Var4.m22137o0();
                                                    }
                                                    oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a);
                                                    oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m4);
                                                    AbstractC3393o1.m17747v(iHashCode4, tj3Var4, zi3Var3, tj3Var4, vi3Var);
                                                    oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c4);
                                                    e16 e16VarMo3161g = c99.m4430w(b16Var2, null, 3).mo3161g(new f7b(AbstractC0334a.f4179a));
                                                    LanguageProgressMetric languageProgressMetric = yl4Var.f69988a;
                                                    String strM23620a0 = vz1.m23620a0(tj3Var4, AbstractC3423or.m18223H(languageProgressMetric));
                                                    vx9 vx9Var = p58.m18902j(tj3Var4).f71408l;
                                                    tj3 tj3Var5 = tj3Var4;
                                                    b16 b16Var3 = b16Var2;
                                                    lw9.m16554b(strM23620a0, e16VarMo3161g, p58.m18900f(tj3Var4).f55873q, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, 0, 0, null, vx9Var, tj3Var5, 0, 0, 130040);
                                                    if (1.0f <= 0.0d) {
                                                        g54.m12362a("invalid weight; must be greater than zero");
                                                    }
                                                    e16 e16VarMo3161g2 = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).mo3161g(new f7b(AbstractC0334a.f4179a));
                                                    boolean zM21391a = shd.m21391a(languageProgressMetric);
                                                    double d = yl4Var.f69989b;
                                                    lw9.m16554b(String.valueOf(zM21391a ? Integer.valueOf((int) d) : Double.valueOf(nob.m17572a(2, d))), e16VarMo3161g2, p58.m18900f(tj3Var5).f55873q, new m20(vs9.f65864a, p58.m18902j(tj3Var5).f71404h.f66065a.f42265b, d32.m10018P(1)), 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 1, 0, null, p58.m18902j(tj3Var5).f71404h, tj3Var5, 0, 24576, 113648);
                                                    e16 e16VarMo3161g3 = c99.m4430w(b16Var3, null, 3).mo3161g(new f7b(AbstractC0334a.f4179a));
                                                    boolean zM21391a2 = shd.m21391a(languageProgressMetric);
                                                    double d2 = yl4Var.f69990c;
                                                    lw9.m16554b("/" + (zM21391a2 ? Integer.valueOf((int) d2) : Double.valueOf(nob.m17572a(2, d2))), e16VarMo3161g3, p58.m18900f(tj3Var5).f55873q, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var5).f71407k, tj3Var5, 0, 0, 130040);
                                                    tj3Var5.m22139q(true);
                                                    e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4415h(c99.m4412e(b16Var3, 1.0f), 24.0f, 48.0f), 0.0f, ge9.m12515a(tj3Var5).f38956e, 1);
                                                    float f = ge9.m12515a(tj3Var5).f38955d;
                                                    long jM4212e = cx2.m9917a(tj3Var5).m4212e();
                                                    boolean zM22120g = tj3Var5.m22120g(yl4Var);
                                                    Object objM22097O = tj3Var5.m22097O();
                                                    if (zM22120g || objM22097O == we1.f66679a) {
                                                        objM22097O = new br8(yl4Var, 4);
                                                        tj3Var5.m22131l0(objM22097O);
                                                    }
                                                    dn7.m10494c((ui3) objM22097O, e16VarM21609V, jM4212e, 0L, 0, f, null, tj3Var5, 0, 88);
                                                    tj3Var5.m22139q(true);
                                                    b16Var2 = b16Var3;
                                                    z = true;
                                                    i7 = 0;
                                                    tj3Var4 = tj3Var5;
                                                    it = it2;
                                                }
                                                tj3 tj3Var6 = tj3Var4;
                                                tj3Var6.m22139q(i7);
                                                tj3Var6.m22139q(z);
                                            }
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            }, tj3Var2), tj3Var2, 384);
                        }
                        break;
                }
                return xfaVar;
            }
        }));
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2806xaefdbe53(this, Lifecycle$State.STARTED, null, this), 3);
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: g0 */
    public final int mo3661g0() {
        return R$style.AppTheme_BottomSheetDialog;
    }
}
