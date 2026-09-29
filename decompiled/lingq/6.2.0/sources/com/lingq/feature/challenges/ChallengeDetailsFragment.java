package com.lingq.feature.challenges;

import android.view.View;
import androidx.compose.p002ui.platform.C0411w;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.material.R$attr;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.bh4;
import p000.cl9;
import p000.cs4;
import p000.dua;
import p000.fa4;
import p000.gr3;
import p000.is5;
import p000.jfa;
import p000.nd3;
import p000.or1;
import p000.qz2;
import p000.r46;
import p000.rt3;
import p000.sq0;
import p000.sq5;
import p000.tq0;
import p000.u96;
import p000.ui3;
import p000.uq0;
import p000.w41;
import p000.wfb;
import p000.wq0;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class ChallengeDetailsFragment extends rt3 {

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f24347C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f24348D0;

    /* JADX INFO: renamed from: E0 */
    public final sq5 f24349E0;

    /* JADX INFO: renamed from: F0 */
    public w41 f24350F0;

    /* JADX INFO: renamed from: G0 */
    public static final /* synthetic */ bh4[] f24346G0 = {new PropertyReference1Impl(ChallengeDetailsFragment.class, "binding", "getBinding()Lcom/lingq/feature/challenges/databinding/FragmentChallengesDetailsBinding;")};
    private static final tq0 Companion = new tq0();

    public ChallengeDetailsFragment() {
        super(R$layout.fragment_challenges_details, 0);
        this.f24347C0 = jfa.m14432o(this, ChallengeDetailsFragment$binding$2.f24351i);
        final ChallengeDetailsFragment$special$$inlined$viewModels$default$1 challengeDetailsFragment$special$$inlined$viewModels$default$1 = new ChallengeDetailsFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.challenges.ChallengeDetailsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) challengeDetailsFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f24348D0 = new w41(y38.m24933a(C1962b.class), new ui3() { // from class: com.lingq.feature.challenges.ChallengeDetailsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.challenges.ChallengeDetailsFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f24369b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.challenges.ChallengeDetailsFragment$special$$inlined$viewModels$default$4
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
        this.f24349E0 = new sq5(3, y38.m24933a(wq0.class), new uq0(this, 0));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: H */
    public final void mo2081H() {
        this.f5688b0 = true;
        m8806R0().m8808V2();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        int i = 0;
        if (cl9.m4842Y(((wq0) this.f24349E0.getValue()).f67168a, "language_cup_", false)) {
            w41 w41Var = this.f24350F0;
            if (w41Var != null) {
                w41Var.m23737z(new u96(false));
                return;
            } else {
                fa4.m11636J("navGraphController");
                throw null;
            }
        }
        is5 is5Var = new is5(1, true);
        is5Var.f35332d = r46.m20365H(m2090R(), R$attr.motionEasingEmphasizedDecelerateInterpolator, new qz2(1));
        is5Var.f35331c = r46.m20364G(m2090R(), R$attr.motionDurationLong2, 500);
        m2096X(is5Var);
        ComposeView composeView = ((nd3) this.f24347C0.getValue(this, f24346G0[0])).f52620a;
        composeView.setViewCompositionStrategy(C0411w.f4868a);
        composeView.setContent(new C0282a(312350907, true, new sq0(this, i)));
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C1944xf6036572(this, Lifecycle$State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: R0 */
    public final C1962b m8806R0() {
        return (C1962b) this.f24348D0.getValue();
    }
}
