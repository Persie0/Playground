package com.lingq.feature.review.activities;

import android.view.View;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$attr;
import com.lingq.feature.review.C2758f;
import com.lingq.feature.review.R$layout;
import com.lingq.feature.review.data.ReviewActivityShow;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.bf3;
import p000.bh4;
import p000.cs4;
import p000.dua;
import p000.dw6;
import p000.fa4;
import p000.gr3;
import p000.hz4;
import p000.ig8;
import p000.jc8;
import p000.jfa;
import p000.nb8;
import p000.nv3;
import p000.or1;
import p000.q41;
import p000.r46;
import p000.rt3;
import p000.te8;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewActivityFlashcardFragment extends rt3 {

    /* JADX INFO: renamed from: H0 */
    public static final /* synthetic */ bh4[] f31913H0 = {new PropertyReference1Impl(ReviewActivityFlashcardFragment.class, "binding", "getBinding()Lcom/lingq/feature/review/databinding/FragmentReviewActivityFlashcardBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f31914C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f31915D0;

    /* JADX INFO: renamed from: E0 */
    public final w41 f31916E0;

    /* JADX INFO: renamed from: F0 */
    public te8 f31917F0;

    /* JADX INFO: renamed from: G0 */
    public ig8 f31918G0;

    public ReviewActivityFlashcardFragment() {
        super(R$layout.fragment_review_activity_flashcard, 14);
        this.f31914C0 = jfa.m14432o(this, ReviewActivityFlashcardFragment$binding$2.f31919i);
        final C2644x5710ac50 c2644x5710ac50 = new C2644x5710ac50(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) c2644x5710ac50.mo0a();
            }
        });
        this.f31915D0 = new w41(y38.m24933a(C2750e.class), new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f31962b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$special$$inlined$viewModels$default$4
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
        final hz4 hz4Var = new hz4(this, 21);
        final cs4 cs4VarM15357b2 = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) hz4Var.mo0a();
            }
        });
        this.f31916E0 = new w41(y38.m24933a(C2758f.class), new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b2.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$special$$inlined$viewModels$default$9
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f31967b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$special$$inlined$viewModels$default$8
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
        vz1.m23638j0(r46.m20364G(m2090R(), R$attr.motionDurationMedium2, 300), this);
        m9537S0().m9606Z2(new jc8(ReviewActivityShow.FlipCard));
        nb8 nb8VarM9609c3 = m9537S0().m9609c3();
        bf3 bf3VarM9536R0 = m9536R0();
        m2090R();
        bf3VarM9536R0.f8454b.setLayoutManager(new LinearLayoutManager(0));
        RecyclerView recyclerView = bf3VarM9536R0.f8454b;
        recyclerView.m2741i(new nv3());
        te8 te8Var = new te8(new dw6(this, 6), new q41(11));
        this.f31917F0 = te8Var;
        recyclerView.setAdapter(te8Var);
        recyclerView.setItemAnimator(null);
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2637x18e50c8c(this, Lifecycle$State.STARTED, null, this, nb8VarM9609c3), 3);
    }

    /* JADX INFO: renamed from: R0 */
    public final bf3 m9536R0() {
        return (bf3) this.f31914C0.getValue(this, f31913H0[0]);
    }

    /* JADX INFO: renamed from: S0 */
    public final C2758f m9537S0() {
        return (C2758f) this.f31916E0.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final ig8 m9538T0() {
        ig8 ig8Var = this.f31918G0;
        if (ig8Var != null) {
            return ig8Var;
        }
        fa4.m11636J("reviewStore");
        throw null;
    }

    /* JADX INFO: renamed from: U0 */
    public final C2750e m9539U0() {
        return (C2750e) this.f31915D0.getValue();
    }
}
