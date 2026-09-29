package com.lingq.p055ui.review;

import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.review.data.ReviewActivityShow;
import com.lingq.p055ui.token.TokenControllerType;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenStatusMenuItem;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import fk.C5574p;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import li.C7374a;
import ni.C7796d;
import no.C7828f;
import p003a2.C0009a;
import p260m8.C7499b;
import p278nh.C7777d;
import p278nh.InterfaceC7774a;
import p322pd.C8228i;
import p338qd.C8573r0;
import p418uj.AbstractC9542b;
import p427v3.AbstractC9634a;
import p462wj.C9955c;
import ph.C8341p1;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/review/ReviewSessionCompleteFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ReviewSessionCompleteFragment extends AbstractC9542b {

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f29530F0 = {C0204c.m857q(ReviewSessionCompleteFragment.class, "getBinding()Lcom/lingq/databinding/FragmentReviewSessionCompleteBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f29531A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f29532B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f29533C0;

    /* JADX INFO: renamed from: D0 */
    public ReviewSessionCompleteAdapter f29534D0;

    /* JADX INFO: renamed from: E0 */
    public C7796d f29535E0;

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteFragment$a */
    public static final class C4534a implements InterfaceC7774a<C7374a> {

        /* JADX INFO: renamed from: a */
        public static final C4534a f29536a = new C4534a();

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(C7374a c7374a) {
            C5207g.m11111f(c7374a, "it");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteFragment$b */
    public static final class C4535b implements InterfaceC7774a<C7374a> {
        public C4535b() {
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(C7374a c7374a) {
            C7374a c7374a2 = c7374a;
            C5207g.m11111f(c7374a2, "it");
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewSessionCompleteFragment.f29530F0;
            ReviewViewModel reviewViewModelM10244o0 = ReviewSessionCompleteFragment.this.m10244o0();
            reviewViewModelM10244o0.f29608H.mo10048f2(new TokenData(c7374a2.f41142a, TokenType.CardType, 0, 0, null, null, null, null, 0, null, 1020));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$1] */
    public ReviewSessionCompleteFragment() {
        super(R.layout.fragment_review_session_complete);
        this.f29531A0 = C4924a.m10477o0(this, ReviewSessionCompleteFragment$binding$2.f29538j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$2
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
        this.f29532B0 = C8573r0.m16711Z(this, C5209i.m11118a(ReviewSessionCompleteViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.ReviewSessionCompleteFragment$parentViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f29566b.m3579b0().m3579b0();
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f29533C0 = C8573r0.m16711Z(this, C5209i.m11118a(ReviewViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$8
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.review.ReviewSessionCompleteFragment$special$$inlined$viewModels$default$9
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
    public static final ReviewSessionCompleteViewModel m10243n0(ReviewSessionCompleteFragment reviewSessionCompleteFragment) {
        return (ReviewSessionCompleteViewModel) reviewSessionCompleteFragment.f29532B0.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.lingq.ui.review.ReviewSessionCompleteFragment$onViewCreated$adapter$2] */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 0, true);
        c8228iM29r.f48293c = 300L;
        m3585f0(c8228iM29r);
        C7796d c7796d = this.f29535E0;
        if (c7796d == null) {
            C5207g.m11117l("analytics");
            throw null;
        }
        c7796d.m15505b(null, "finished_review");
        m10244o0().f29660k0.setValue(new C9955c(ReviewActivityShow.SessionComplete));
        ReviewSessionCompleteAdapter reviewSessionCompleteAdapter = new ReviewSessionCompleteAdapter(new C4535b(), new ReviewSessionCompleteAdapter.InterfaceC4533d() { // from class: com.lingq.ui.review.ReviewSessionCompleteFragment$onViewCreated$adapter$2
            @Override // com.lingq.p055ui.review.ReviewSessionCompleteAdapter.InterfaceC4533d
            /* JADX INFO: renamed from: a */
            public final void mo10242a(final C7374a c7374a, int i10, Integer num, View view2) {
                C5207g.m11111f(c7374a, "card");
                C5207g.m11111f(view2, "viewAsAnchor");
                TokenControllerType tokenControllerType = TokenControllerType.Review;
                final ReviewSessionCompleteFragment reviewSessionCompleteFragment = this.f29562a;
                new C5574p(view2, i10, num, tokenControllerType, new InterfaceC2052l<TokenStatusMenuItem, C9072e>() { // from class: com.lingq.ui.review.ReviewSessionCompleteFragment$onViewCreated$adapter$2$statusClicked$1

                    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteFragment$onViewCreated$adapter$2$statusClicked$1$a */
                    public /* synthetic */ class a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f29565a;

                        static {
                            int[] iArr = new int[TokenStatusMenuItem.values().length];
                            try {
                                iArr[TokenStatusMenuItem.Ignore.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.New.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.Recognized.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.Familiar.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.Learned.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.Known.ordinal()] = 6;
                            } catch (NoSuchFieldError unused6) {
                            }
                            f29565a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(TokenStatusMenuItem tokenStatusMenuItem) {
                        TokenStatusMenuItem tokenStatusMenuItem2 = tokenStatusMenuItem;
                        C5207g.m11111f(tokenStatusMenuItem2, "item");
                        int i11 = a.f29565a[tokenStatusMenuItem2.ordinal()];
                        C7374a c7374a2 = c7374a;
                        ReviewSessionCompleteFragment reviewSessionCompleteFragment2 = reviewSessionCompleteFragment;
                        switch (i11) {
                            case 1:
                                ReviewSessionCompleteFragment.m10243n0(reviewSessionCompleteFragment2).m10245l2(c7374a2, CardStatus.Ignored.getValue());
                                break;
                            case 2:
                                ReviewSessionCompleteFragment.m10243n0(reviewSessionCompleteFragment2).m10245l2(c7374a2, CardStatus.New.getValue());
                                break;
                            case 3:
                                ReviewSessionCompleteFragment.m10243n0(reviewSessionCompleteFragment2).m10245l2(c7374a2, CardStatus.Recognized.getValue());
                                break;
                            case 4:
                                ReviewSessionCompleteFragment.m10243n0(reviewSessionCompleteFragment2).m10245l2(c7374a2, CardStatus.Familiar.getValue());
                                break;
                            case 5:
                                ReviewSessionCompleteFragment.m10243n0(reviewSessionCompleteFragment2).m10245l2(c7374a2, CardStatus.Learned.getValue());
                                break;
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                ReviewSessionCompleteFragment.m10243n0(reviewSessionCompleteFragment2).m10245l2(c7374a2, CardStatus.Known.getValue());
                                break;
                        }
                        return C9072e.f47360a;
                    }
                });
            }
        });
        C8341p1 c8341p1 = (C8341p1) this.f29531A0.m10489a(this, f29530F0[0]);
        if (C7777d.m15481b(this)) {
            RecyclerView recyclerView = c8341p1.f45136b;
            if (recyclerView != null) {
                m3578a0();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
            }
            ReviewSessionCompleteAdapter reviewSessionCompleteAdapter2 = new ReviewSessionCompleteAdapter(C4534a.f29536a, null);
            this.f29534D0 = reviewSessionCompleteAdapter2;
            RecyclerView recyclerView2 = c8341p1.f45136b;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(reviewSessionCompleteAdapter2);
            }
        }
        RecyclerView recyclerView3 = c8341p1.f45135a;
        m3578a0();
        recyclerView3.setLayoutManager(new LinearLayoutManager(1));
        c8341p1.f45135a.setAdapter(reviewSessionCompleteAdapter);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4536x98a2624a(this, Lifecycle.State.STARTED, null, this, reviewSessionCompleteAdapter), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public final ReviewViewModel m10244o0() {
        return (ReviewViewModel) this.f29533C0.getValue();
    }
}
