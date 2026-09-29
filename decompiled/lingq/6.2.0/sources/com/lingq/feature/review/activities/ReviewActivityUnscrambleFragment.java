package com.lingq.feature.review.activities;

import android.view.View;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.material.R$attr;
import com.lingq.feature.review.C2758f;
import com.lingq.feature.review.R$layout;
import com.lingq.feature.review.data.ReviewActivityShow;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.AbstractC3184kh;
import p000.C3309ls;
import p000.ac8;
import p000.bh4;
import p000.cs4;
import p000.dua;
import p000.gf3;
import p000.gr3;
import p000.hz4;
import p000.jc8;
import p000.jfa;
import p000.or1;
import p000.r46;
import p000.rt3;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewActivityUnscrambleFragment extends rt3 {

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ bh4[] f32209F0 = {new PropertyReference1Impl(ReviewActivityUnscrambleFragment.class, "binding", "getBinding()Lcom/lingq/feature/review/databinding/FragmentReviewActivityUnscrambleBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f32210C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f32211D0;

    /* JADX INFO: renamed from: E0 */
    public final w41 f32212E0;

    public ReviewActivityUnscrambleFragment() {
        super(R$layout.fragment_review_activity_unscramble, 19);
        this.f32210C0 = jfa.m14432o(this, ReviewActivityUnscrambleFragment$binding$2.f32213i);
        final C2727xe4e7f7a4 c2727xe4e7f7a4 = new C2727xe4e7f7a4(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) c2727xe4e7f7a4.mo0a();
            }
        });
        this.f32211D0 = new w41(y38.m24933a(C2749d.class), new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f32246b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$4
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
        final hz4 hz4Var = new hz4(this, 26);
        final cs4 cs4VarM15357b2 = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) hz4Var.mo0a();
            }
        });
        this.f32212E0 = new w41(y38.m24933a(C2758f.class), new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b2.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$9
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f32251b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$8
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

    /* JADX INFO: renamed from: R0 */
    public static final void m9551R0(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment) {
        reviewActivityUnscrambleFragment.m9553T0().m9616j3();
        reviewActivityUnscrambleFragment.m9553T0().m9614h3();
        wfb.m23926u(AbstractC0708b.m2508a(reviewActivityUnscrambleFragment.m2112n()), null, null, new ReviewActivityUnscrambleFragment$onSuccessUnscrambled$1(reviewActivityUnscrambleFragment, null), 3);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        vz1.m23638j0(r46.m20364G(m2090R(), R$attr.motionDurationLong2, 500), this);
        m9553T0().m9606Z2(new jc8(ReviewActivityShow.SubmitSkipDisabled));
        m9552S0().f40702b.setIsRTL(AbstractC3184kh.m15194A(m9554U0().f32350b.mo4589b2()));
        m9552S0().f40702b.setListener(new ac8(this, 0));
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2720x464d1e0(this, Lifecycle$State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: S0 */
    public final gf3 m9552S0() {
        return (gf3) this.f32210C0.getValue(this, f32209F0[0]);
    }

    /* JADX INFO: renamed from: T0 */
    public final C2758f m9553T0() {
        return (C2758f) this.f32212E0.getValue();
    }

    /* JADX INFO: renamed from: U0 */
    public final C2749d m9554U0() {
        return (C2749d) this.f32211D0.getValue();
    }
}
