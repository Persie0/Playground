package com.lingq.feature.challenges;

import android.view.View;
import androidx.compose.p002ui.platform.C0411w;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.AbstractC0708b;
import com.lingq.feature.challenges.cup.C1978e;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.C3368nd;
import p000.bh4;
import p000.cs4;
import p000.dua;
import p000.gr3;
import p000.jfa;
import p000.md3;
import p000.or1;
import p000.rt3;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class ChallengesFragment extends rt3 {

    /* JADX INFO: renamed from: G0 */
    public static final /* synthetic */ bh4[] f24437G0 = {new PropertyReference1Impl(ChallengesFragment.class, "binding", "getBinding()Lcom/lingq/feature/challenges/databinding/FragmentChallengesBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f24438C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f24439D0;

    /* JADX INFO: renamed from: E0 */
    public final w41 f24440E0;

    /* JADX INFO: renamed from: F0 */
    public w41 f24441F0;

    public ChallengesFragment() {
        super(R$layout.fragment_challenges, 1);
        this.f24438C0 = jfa.m14432o(this, ChallengesFragment$binding$2.f24442i);
        final ChallengesFragment$special$$inlined$viewModels$default$1 challengesFragment$special$$inlined$viewModels$default$1 = new ChallengesFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.challenges.ChallengesFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) challengesFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f24439D0 = new w41(y38.m24933a(C1986f.class), new ui3() { // from class: com.lingq.feature.challenges.ChallengesFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.challenges.ChallengesFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f24453b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.challenges.ChallengesFragment$special$$inlined$viewModels$default$4
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
        final ChallengesFragment$special$$inlined$viewModels$default$6 challengesFragment$special$$inlined$viewModels$default$6 = new ChallengesFragment$special$$inlined$viewModels$default$6(this);
        final cs4 cs4VarM15357b2 = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.challenges.ChallengesFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) challengesFragment$special$$inlined$viewModels$default$6.mo0a();
            }
        });
        this.f24440E0 = new w41(y38.m24933a(C1978e.class), new ui3() { // from class: com.lingq.feature.challenges.ChallengesFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b2.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.challenges.ChallengesFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                zta ztaVarMo2102d;
                dua duaVar = (dua) cs4VarM15357b2.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f24448b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.challenges.ChallengesFragment$special$$inlined$viewModels$default$9
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                dua duaVar = (dua) cs4VarM15357b2.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return gr3Var != null ? gr3Var.mo2103e() : or1.f54780b;
            }
        });
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        vz1.m23640l0(this);
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new ChallengesFragment$onViewCreated$1(this, null), 3);
        ComposeView composeView = ((md3) this.f24438C0.getValue(this, f24437G0[0])).f51102a;
        composeView.setViewCompositionStrategy(C0411w.f4868a);
        composeView.setContent(new C0282a(1699983913, true, new C3368nd(this, 3)));
    }

    /* JADX INFO: renamed from: R0 */
    public final C1978e m8807R0() {
        return (C1978e) this.f24440E0.getValue();
    }
}
