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
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.review.ReviewViewModel;
import com.lingq.p055ui.review.data.ReviewActivityShow;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.ArrayList;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mo.C7661i;
import no.C7828f;
import p003a2.C0009a;
import p096ei.C5408a;
import p260m8.C7499b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p438vj.AbstractC9746f;
import p462wj.C9955c;
import p538zj.C10509b;
import p538zj.InterfaceC10508a;
import ph.C8329n1;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/review/activities/ReviewActivityUnscrambleFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ReviewActivityUnscrambleFragment extends AbstractC9746f {

    /* JADX INFO: renamed from: D0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f30068D0 = {C0204c.m857q(ReviewActivityUnscrambleFragment.class, "getBinding()Lcom/lingq/databinding/FragmentReviewActivityUnscrambleBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f30069A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f30070B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f30071C0;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$a */
    public static final class C4638a implements InterfaceC10508a {
        public C4638a() {
        }

        @Override // p538zj.InterfaceC10508a
        /* JADX INFO: renamed from: a */
        public final void mo10291a(String str) {
            C5207g.m11111f(str, "sentence");
            C9955c c9955c = C7661i.m15250P2(str) ? new C9955c(ReviewActivityShow.SubmitSkipDisabled) : new C9955c(ReviewActivityShow.SubmitSkip);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityUnscrambleFragment.f30068D0;
            ReviewActivityUnscrambleFragment.this.m10289p0().m10256o2(c9955c);
        }

        @Override // p538zj.InterfaceC10508a
        /* JADX INFO: renamed from: b */
        public final void mo10292b() {
            ReviewActivityUnscrambleFragment.m10287n0(ReviewActivityUnscrambleFragment.this);
        }

        @Override // p538zj.InterfaceC10508a
        /* JADX INFO: renamed from: c */
        public final void mo10293c(ArrayList arrayList) {
        }

        @Override // p538zj.InterfaceC10508a
        /* JADX INFO: renamed from: d */
        public final void mo10294d(C10509b c10509b) {
            C5207g.m11111f(c10509b, "sentenceWord");
        }

        @Override // p538zj.InterfaceC10508a
        /* JADX INFO: renamed from: e */
        public final void mo10295e(C10509b c10509b) {
            C5207g.m11111f(c10509b, "sentenceWord");
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityUnscrambleFragment.f30068D0;
            ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = ReviewActivityUnscrambleFragment.this;
            InterfaceC3275c.a.m9347b(reviewActivityUnscrambleFragment.m10290q0(), reviewActivityUnscrambleFragment.m10290q0().mo498E1(), c10509b.f52463a, true, 0.0f, 8);
        }

        @Override // p538zj.InterfaceC10508a
        /* JADX INFO: renamed from: f */
        public final void mo10296f(C10509b c10509b) {
            C5207g.m11111f(c10509b, "sentenceWord");
        }

        @Override // p538zj.InterfaceC10508a
        /* JADX INFO: renamed from: g */
        public final void mo10297g(String str) {
            C5207g.m11111f(str, "word");
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$1] */
    public ReviewActivityUnscrambleFragment() {
        super(R.layout.fragment_review_activity_unscramble);
        this.f30069A0 = C4924a.m10477o0(this, ReviewActivityUnscrambleFragment$binding$2.f30073j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$2
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
        this.f30070B0 = C8573r0.m16711Z(this, C5209i.m11118a(ReviewActivityUnscrambleViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$parentViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f30105b.m3579b0().m3579b0();
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f30071C0 = C8573r0.m16711Z(this, C5209i.m11118a(ReviewViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$special$$inlined$viewModels$default$9
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
    public static final void m10287n0(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment) {
        reviewActivityUnscrambleFragment.m10289p0().m10252C2();
        reviewActivityUnscrambleFragment.m10289p0().m10250A2();
        C7828f.m15570d(C7499b.m14906H(reviewActivityUnscrambleFragment.m3601v()), null, null, new ReviewActivityUnscrambleFragment$onSuccessUnscrambled$1(reviewActivityUnscrambleFragment, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 2, true);
        c8228iM29r.f48293c = 300L;
        m3585f0(c8228iM29r);
        m10289p0().f29660k0.setValue(new C9955c(ReviewActivityShow.SubmitSkipDisabled));
        m10288o0().f45084b.setIsRTL(C5408a.m11572e(m10290q0().mo498E1()));
        m10288o0().f45084b.setListener(new C4638a());
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4639x464d1e0(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public final C8329n1 m10288o0() {
        return (C8329n1) this.f30069A0.m10489a(this, f30068D0[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public final ReviewViewModel m10289p0() {
        return (ReviewViewModel) this.f30071C0.getValue();
    }

    /* JADX INFO: renamed from: q0 */
    public final ReviewActivityUnscrambleViewModel m10290q0() {
        return (ReviewActivityUnscrambleViewModel) this.f30070B0.getValue();
    }
}
