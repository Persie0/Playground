package com.lingq.feature.review.activities;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.feature.review.C2758f;
import com.lingq.feature.review.R$layout;
import com.lingq.feature.review.data.ReviewActivityResult;
import com.lingq.feature.review.data.ReviewActivityShow;
import java.io.Serializable;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.bh4;
import p000.cs4;
import p000.dua;
import p000.dw6;
import p000.ef3;
import p000.fa4;
import p000.gb8;
import p000.gr3;
import p000.hb8;
import p000.hz4;
import p000.ig8;
import p000.j13;
import p000.jc8;
import p000.jfa;
import p000.nb8;
import p000.nv3;
import p000.or1;
import p000.qj0;
import p000.rt3;
import p000.te8;
import p000.ui3;
import p000.v63;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewActivityResultFragment extends rt3 {

    /* JADX INFO: renamed from: H0 */
    public static final /* synthetic */ bh4[] f32067H0 = {new PropertyReference1Impl(ReviewActivityResultFragment.class, "binding", "getBinding()Lcom/lingq/feature/review/databinding/FragmentReviewActivityResultBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f32068C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f32069D0;

    /* JADX INFO: renamed from: E0 */
    public final w41 f32070E0;

    /* JADX INFO: renamed from: F0 */
    public te8 f32071F0;

    /* JADX INFO: renamed from: G0 */
    public ig8 f32072G0;

    public ReviewActivityResultFragment() {
        super(R$layout.fragment_review_activity_result, 17);
        this.f32068C0 = jfa.m14432o(this, ReviewActivityResultFragment$binding$2.f32073i);
        final C2691xb4aff29b c2691xb4aff29b = new C2691xb4aff29b(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) c2691xb4aff29b.mo0a();
            }
        });
        this.f32069D0 = new w41(y38.m24933a(C2750e.class), new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f32129b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$4
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
        final hz4 hz4Var = new hz4(this, 24);
        final cs4 cs4VarM15357b2 = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) hz4Var.mo0a();
            }
        });
        this.f32070E0 = new w41(y38.m24933a(C2758f.class), new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b2.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$9
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f32134b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$8
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
        Serializable serializable;
        view.getClass();
        Bundle bundle = this.f5695f;
        if (bundle == null) {
            v63.m23148z("Fragment ", this, " does not have any arguments.");
            return;
        }
        String string = bundle.getString("answer");
        Bundle bundle2 = this.f5695f;
        if (bundle2 == null) {
            v63.m23148z("Fragment ", this, " does not have any arguments.");
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            serializable = qj0.m19998d(bundle2);
        } else {
            serializable = bundle2.getSerializable("result");
            if (!ReviewActivityResult.class.isInstance(serializable)) {
                serializable = null;
            }
        }
        ReviewActivityResult reviewActivityResult = (ReviewActivityResult) serializable;
        if (reviewActivityResult == null) {
            return;
        }
        nb8 nb8VarM9609c3 = m9546S0().m9609c3();
        m9546S0().m9606Z2(((nb8VarM9609c3 instanceof gb8) || (nb8VarM9609c3 instanceof hb8)) ? new jc8(ReviewActivityShow.FlashCardResult) : new jc8(ReviewActivityShow.ResultNext));
        m9546S0().m9615i3();
        ef3 ef3VarM9545R0 = m9545R0();
        m2090R();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        RecyclerView recyclerView = ef3VarM9545R0.f37170c;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.m2741i(new nv3());
        te8 te8Var = new te8(new dw6(this, 7), new j13());
        this.f32071F0 = te8Var;
        recyclerView.setAdapter(te8Var);
        recyclerView.setItemAnimator(null);
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2683xd4e74457(this, Lifecycle$State.STARTED, null, this, nb8VarM9609c3, reviewActivityResult, string), 3);
    }

    /* JADX INFO: renamed from: R0 */
    public final ef3 m9545R0() {
        return (ef3) this.f32068C0.getValue(this, f32067H0[0]);
    }

    /* JADX INFO: renamed from: S0 */
    public final C2758f m9546S0() {
        return (C2758f) this.f32070E0.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final ig8 m9547T0() {
        ig8 ig8Var = this.f32072G0;
        if (ig8Var != null) {
            return ig8Var;
        }
        fa4.m11636J("reviewStore");
        throw null;
    }

    /* JADX INFO: renamed from: U0 */
    public final C2750e m9548U0() {
        return (C2750e) this.f32069D0.getValue();
    }
}
