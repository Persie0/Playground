package com.lingq.feature.onboarding;

import android.view.View;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import java.util.WeakHashMap;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.C3440oy;
import p000.C3509qs;
import p000.bh4;
import p000.cs4;
import p000.dta;
import p000.dua;
import p000.gr3;
import p000.hm5;
import p000.jfa;
import p000.or1;
import p000.rt3;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wa5;
import p000.wfb;
import p000.wsa;
import p000.x74;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class OnboardingEndFragment extends rt3 {

    /* JADX INFO: renamed from: H0 */
    public static final /* synthetic */ bh4[] f26907H0 = {new PropertyReference1Impl(OnboardingEndFragment.class, "binding", "getBinding()Lcom/lingq/feature/onboarding/databinding/FragmentOnboardingFinishBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final w41 f26908C0;

    /* JADX INFO: renamed from: D0 */
    public final C3309ls f26909D0;

    /* JADX INFO: renamed from: E0 */
    public hm5 f26910E0;

    /* JADX INFO: renamed from: F0 */
    public C3509qs f26911F0;

    /* JADX INFO: renamed from: G0 */
    public w41 f26912G0;

    public OnboardingEndFragment() {
        super(R$layout.fragment_onboarding_finish, 10);
        final OnboardingEndFragment$special$$inlined$viewModels$default$1 onboardingEndFragment$special$$inlined$viewModels$default$1 = new OnboardingEndFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.onboarding.OnboardingEndFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) onboardingEndFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f26908C0 = new w41(y38.m24933a(C2197b.class), new ui3() { // from class: com.lingq.feature.onboarding.OnboardingEndFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.onboarding.OnboardingEndFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f26928b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.onboarding.OnboardingEndFragment$special$$inlined$viewModels$default$4
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
        this.f26909D0 = jfa.m14432o(this, OnboardingEndFragment$binding$2.f26913i);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        x74.m24339F(this, "upgradeClosed", new wa5(13, view, this));
        C3440oy c3440oy = new C3440oy(this, 26);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(view, c3440oy);
        vz1.m23640l0(this);
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2170x4c944c53(this, Lifecycle$State.STARTED, null, this), 3);
    }
}
