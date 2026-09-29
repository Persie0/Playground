package com.lingq.p055ui.review.activities;

import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.review.ReviewViewModel;
import com.lingq.p055ui.review.data.ReviewActivityResult;
import com.lingq.p055ui.review.data.ReviewActivityShow;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.io.Serializable;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5181c;
import p260m8.C7499b;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p438vj.AbstractC9744d;
import p462wj.AbstractC9953a;
import p462wj.C9955c;
import ph.C8317l1;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/review/activities/ReviewActivityResultFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ReviewActivityResultFragment extends AbstractC9744d {

    /* JADX INFO: renamed from: G0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f29925G0 = {C0204c.m857q(ReviewActivityResultFragment.class, "getBinding()Lcom/lingq/databinding/FragmentReviewActivityResultBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f29926A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f29927B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f29928C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f29929D0;

    /* JADX INFO: renamed from: E0 */
    public InterfaceC5179a f29930E0;

    /* JADX INFO: renamed from: F0 */
    public InterfaceC5181c f29931F0;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$1] */
    public ReviewActivityResultFragment() {
        super(R.layout.fragment_review_activity_result);
        this.f29926A0 = C4924a.m10477o0(this, ReviewActivityResultFragment$binding$2.f29932j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) r10.mo807E();
            }
        });
        this.f29927B0 = C8573r0.m16711Z(this, C5209i.m11118a(ReviewActivityViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                AbstractC9634a abstractC9634aMo792j = null;
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i != null) {
                    abstractC9634aMo792j = interfaceC1037i.mo792j();
                }
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.activities.ReviewActivityResultFragment$parentViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f29976b.m3579b0().m3579b0();
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f29928C0 = C8573r0.m16711Z(this, C5209i.m11118a(ReviewViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.review.activities.ReviewActivityResultFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public static final C8317l1 m10276n0(ReviewActivityResultFragment reviewActivityResultFragment) {
        reviewActivityResultFragment.getClass();
        return (C8317l1) reviewActivityResultFragment.f29926A0.m10489a(reviewActivityResultFragment, f29925G0[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public static final ReviewActivityViewModel m10277o0(ReviewActivityResultFragment reviewActivityResultFragment) {
        return (ReviewActivityViewModel) reviewActivityResultFragment.f29927B0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        String string = m3577Z().getString("answer");
        Serializable serializable = m3577Z().getSerializable("result");
        C5207g.m11109d(serializable, "null cannot be cast to non-null type com.lingq.ui.review.data.ReviewActivityResult");
        ReviewActivityResult reviewActivityResult = (ReviewActivityResult) serializable;
        AbstractC9953a abstractC9953aM10261t2 = m10278p0().m10261t2();
        m10278p0().f29660k0.setValue(((abstractC9953aM10261t2 instanceof AbstractC9953a.d) || (abstractC9953aM10261t2 instanceof AbstractC9953a.e)) ? new C9955c(ReviewActivityShow.FlashCardResult) : new C9955c(ReviewActivityShow.ResultNext));
        m10278p0().m10251B2();
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4607xd4e74457(this, Lifecycle.State.STARTED, null, this, abstractC9953aM10261t2, reviewActivityResult, string), 3);
    }

    /* JADX INFO: renamed from: p0 */
    public final ReviewViewModel m10278p0() {
        return (ReviewViewModel) this.f29928C0.getValue();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC5181c m10279q0() {
        InterfaceC5181c interfaceC5181c = this.f29931F0;
        if (interfaceC5181c != null) {
            return interfaceC5181c;
        }
        C5207g.m11117l("reviewStore");
        throw null;
    }
}
