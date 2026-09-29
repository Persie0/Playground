package com.lingq.feature.review;

import android.view.View;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.feature.review.data.ReviewActivityShow;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.bh4;
import p000.cs4;
import p000.dua;
import p000.fg2;
import p000.gr3;
import p000.hf3;
import p000.hz4;
import p000.jc8;
import p000.jfa;
import p000.or1;
import p000.rt3;
import p000.te8;
import p000.ue8;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewSessionCompleteFragment extends rt3 {

    /* JADX INFO: renamed from: G0 */
    public static final /* synthetic */ bh4[] f31753G0 = {new PropertyReference1Impl(ReviewSessionCompleteFragment.class, "binding", "getBinding()Lcom/lingq/feature/review/databinding/FragmentReviewSessionCompleteBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f31754C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f31755D0;

    /* JADX INFO: renamed from: E0 */
    public final w41 f31756E0;

    /* JADX INFO: renamed from: F0 */
    public te8 f31757F0;

    public ReviewSessionCompleteFragment() {
        super(R$layout.fragment_review_session_complete, 20);
        this.f31754C0 = jfa.m14432o(this, ReviewSessionCompleteFragment$binding$2.f31758i);
        final C2615xcceb6b0e c2615xcceb6b0e = new C2615xcceb6b0e(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) c2615xcceb6b0e.mo0a();
            }
        });
        this.f31755D0 = new w41(y38.m24933a(C2757e.class), new ui3() { // from class: com.lingq.feature.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f31786b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$4
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
        final hz4 hz4Var = new hz4(this, 27);
        final cs4 cs4VarM15357b2 = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) hz4Var.mo0a();
            }
        });
        this.f31756E0 = new w41(y38.m24933a(C2758f.class), new ui3() { // from class: com.lingq.feature.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b2.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$9
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f31791b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$8
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
        vz1.m23641m0(this);
        m9533R0().m9606Z2(new jc8(ReviewActivityShow.SessionComplete));
        te8 te8Var = new te8(new ue8(this), new ue8(this));
        hf3 hf3Var = (hf3) this.f31754C0.getValue(this, f31753G0[0]);
        if (vz1.m23653w(this)) {
            RecyclerView recyclerView = hf3Var.f42299b;
            if (recyclerView != null) {
                m2090R();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
            }
            te8 te8Var2 = new te8(new fg2(14), (ue8) null);
            this.f31757F0 = te8Var2;
            RecyclerView recyclerView2 = hf3Var.f42299b;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(te8Var2);
            }
        }
        RecyclerView recyclerView3 = hf3Var.f42298a;
        m2090R();
        recyclerView3.setLayoutManager(new LinearLayoutManager(1));
        hf3Var.f42298a.setAdapter(te8Var);
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2611x98a2624a(this, Lifecycle$State.STARTED, null, this, te8Var), 3);
    }

    /* JADX INFO: renamed from: R0 */
    public final C2758f m9533R0() {
        return (C2758f) this.f31756E0.getValue();
    }

    /* JADX INFO: renamed from: S0 */
    public final C2757e m9534S0() {
        return (C2757e) this.f31755D0.getValue();
    }
}
