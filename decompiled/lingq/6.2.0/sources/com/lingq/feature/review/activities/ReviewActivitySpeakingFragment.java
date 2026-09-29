package com.lingq.feature.review.activities;

import android.speech.SpeechRecognizer;
import android.view.View;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.material.R$attr;
import com.lingq.core.domain.model.language.AppUsageType;
import com.lingq.feature.review.C2758f;
import com.lingq.feature.review.R$layout;
import com.lingq.feature.review.data.ReviewActivityShow;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.bh4;
import p000.cs4;
import p000.do7;
import p000.dua;
import p000.fa4;
import p000.ff3;
import p000.gr3;
import p000.hz4;
import p000.jc8;
import p000.jfa;
import p000.lda;
import p000.or1;
import p000.r46;
import p000.rt3;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.y02;
import p000.y38;
import p000.yb8;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewActivitySpeakingFragment extends rt3 {

    /* JADX INFO: renamed from: H0 */
    public static final /* synthetic */ bh4[] f32136H0 = {new PropertyReference1Impl(ReviewActivitySpeakingFragment.class, "binding", "getBinding()Lcom/lingq/feature/review/databinding/FragmentReviewActivitySpeakingBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f32137C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f32138D0;

    /* JADX INFO: renamed from: E0 */
    public final w41 f32139E0;

    /* JADX INFO: renamed from: F0 */
    public final int f32140F0;

    /* JADX INFO: renamed from: G0 */
    public SpeechRecognizer f32141G0;

    public ReviewActivitySpeakingFragment() {
        super(R$layout.fragment_review_activity_speaking, 18);
        this.f32137C0 = jfa.m14432o(this, ReviewActivitySpeakingFragment$binding$2.f32142i);
        final C2703x6900e24e c2703x6900e24e = new C2703x6900e24e(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) c2703x6900e24e.mo0a();
            }
        });
        this.f32138D0 = new w41(y38.m24933a(C2748c.class), new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f32163b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$4
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
        final hz4 hz4Var = new hz4(this, 25);
        final cs4 cs4VarM15357b2 = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) hz4Var.mo0a();
            }
        });
        this.f32139E0 = new w41(y38.m24933a(C2758f.class), new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b2.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$9
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f32168b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$8
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
        this.f32140F0 = 1;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: B */
    public final void mo2075B() {
        this.f5688b0 = true;
        try {
            SpeechRecognizer speechRecognizer = this.f32141G0;
            if (speechRecognizer != null) {
                speechRecognizer.destroy();
            } else {
                fa4.m11636J("speechRecognizer");
                throw null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: G */
    public final void mo2080G() {
        this.f5688b0 = true;
        m9550S0().f32334g.mo8482P();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: H */
    public final void mo2081H() {
        this.f5688b0 = true;
        C2748c c2748cM9550S0 = m9550S0();
        AppUsageType appUsageType = AppUsageType.Speaking;
        Integer numValueOf = Integer.valueOf(m9549R0().f32516l.f43978a);
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        c2748cM9550S0.mo9033o1(appUsageType, numValueOf);
        C2748c c2748cM9550S1 = m9550S0();
        if (c2748cM9550S1.f32349v == null) {
            c2748cM9550S1.f32349v = Long.valueOf(y02.m24805c());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: L */
    public final void mo2084L() {
        this.f5688b0 = true;
        m9550S0().mo9034v0(AppUsageType.Speaking);
        C2748c c2748cM9550S0 = m9550S0();
        c2748cM9550S0.getClass();
        wfb.m23926u(lda.m16103C(c2748cM9550S0), c2748cM9550S0.f32337j, null, new ReviewActivitySpeakingViewModel$stopRecordSpeakingTime$1(c2748cM9550S0, null), 2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        vz1.m23638j0(r46.m20364G(m2090R(), R$attr.motionDurationLong2, 500), this);
        m9549R0().m9606Z2(new jc8(ReviewActivityShow.DoNotKnow));
        if (do7.m10532h(m2090R(), "android.permission.RECORD_AUDIO") != 0) {
            do7.m10515B(m2089Q(), new String[]{"android.permission.RECORD_AUDIO"}, this.f32140F0);
        }
        SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(m2090R());
        speechRecognizerCreateSpeechRecognizer.getClass();
        this.f32141G0 = speechRecognizerCreateSpeechRecognizer;
        speechRecognizerCreateSpeechRecognizer.setRecognitionListener(new yb8(this, 0));
        ((ff3) this.f32137C0.getValue(this, f32136H0[0])).f38994a.setInteraction(new C2746a(3, this));
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2700x6a68798a(this, Lifecycle$State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: R0 */
    public final C2758f m9549R0() {
        return (C2758f) this.f32139E0.getValue();
    }

    /* JADX INFO: renamed from: S0 */
    public final C2748c m9550S0() {
        return (C2748c) this.f32138D0.getValue();
    }
}
