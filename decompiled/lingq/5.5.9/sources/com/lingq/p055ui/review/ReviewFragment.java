package com.lingq.p055ui.review;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.compose.p017ui.platform.ComposeView;
import androidx.compose.p017ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.fragment.app.C0987y;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.C1084b;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import androidx.view.compose.C1026a;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.google.android.material.card.MaterialCardView;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.p055ui.lesson.ReviewType;
import com.lingq.p055ui.review.ReviewFragment;
import com.lingq.p055ui.review.data.ReviewActivityResult;
import com.lingq.p055ui.review.data.ReviewActivityShow;
import com.lingq.p055ui.review.views.result.ReviewActivityResultPopupKt;
import com.lingq.p055ui.review.views.result.ReviewUnscrambleResultPopupKt;
import com.lingq.p055ui.theme.ThemeKt;
import com.lingq.shared.uimodel.language.AppUsageType;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C7138s;
import ni.C7796d;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p040c4.C1690o;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p096ei.C5408a;
import p230l0.C7204a;
import p260m8.C7499b;
import p274n8.ViewOnClickListenerC7718c;
import p322pd.C8228i;
import p338qd.C8573r0;
import p402u0.C9370m;
import p418uj.AbstractC9541a;
import p418uj.C9544d;
import p418uj.C9545e;
import p418uj.C9548h;
import p418uj.ViewOnClickListenerC9547g;
import p427v3.AbstractC9634a;
import p462wj.InterfaceC9957e;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8335o1;
import ph.C8342p2;
import sl.C9072e;
import sl.InterfaceC9070c;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/review/ReviewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ReviewFragment extends AbstractC9541a {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f29431E0 = {C0204c.m857q(ReviewFragment.class, "getBinding()Lcom/lingq/databinding/FragmentReviewBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f29432A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f29433B0;

    /* JADX INFO: renamed from: C0 */
    public final C1681f f29434C0;

    /* JADX INFO: renamed from: D0 */
    public C7796d f29435D0;

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewFragment$a */
    public /* synthetic */ class C4509a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29436a;

        static {
            int[] iArr = new int[ReviewActivityShow.values().length];
            try {
                iArr[ReviewActivityShow.SubmitSkip.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReviewActivityShow.SubmitSkipDisabled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReviewActivityShow.FlipCard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReviewActivityShow.FlashCardResult.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReviewActivityShow.ResultNext.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReviewActivityShow.SessionComplete.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ReviewActivityShow.DoNotKnow.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ReviewActivityShow.Nothing.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f29436a = iArr;
        }
    }

    public ReviewFragment() {
        super(R.layout.fragment_review);
        this.f29432A0 = C4924a.m10477o0(this, ReviewFragment$binding$2.f29437j);
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.ReviewFragment$viewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f29518b;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.ReviewFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f29433B0 = C8573r0.m16711Z(this, C5209i.m11118a(ReviewViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.review.ReviewFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.review.ReviewFragment$special$$inlined$viewModels$default$3
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
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.review.ReviewFragment$special$$inlined$viewModels$default$4
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
        this.f29434C0 = new C1681f(C5209i.m11118a(C9548h.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.review.ReviewFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Bundle mo807E() {
                Fragment fragment = this;
                Bundle bundle = fragment.f6101g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException(C0166e.m764j("Fragment ", fragment, " has null arguments"));
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        m10240o0().mo9402N(AppUsageType.Review);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: T */
    public final void mo3571T() {
        this.f6090a0 = true;
        m10240o0().mo9421x(AppUsageType.Review);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.lingq.ui.review.ReviewFragment$onViewCreated$9$1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.lingq.ui.review.ReviewFragment$onViewCreated$8$1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C9370m c9370m = new C9370m(17, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c9370m);
        final int i10 = 1;
        C8228i c8228i = new C8228i(1, true);
        c8228i.f48293c = 300L;
        m3585f0(c8228i);
        final int i11 = 0;
        C8228i c8228i2 = new C8228i(1, false);
        c8228i2.f48293c = 250L;
        m3591j0(c8228i2);
        C1681f c1681f = this.f29434C0;
        boolean z10 = ((C9548h) c1681f.getValue()).f49121b == ReviewType.Integrated;
        if (z10) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("sentenceReviewed", ((C9548h) c1681f.getValue()).f49124e);
            C9072e c9072e = C9072e.f47360a;
            C0987y.m3824f(bundle2, this, "integratedReview");
        }
        if (((C9548h) c1681f.getValue()).f49123d) {
            C9548h c9548h = (C9548h) c1681f.getValue();
            C7796d c7796d = this.f29435D0;
            if (c7796d == null) {
                C5207g.m11117l("analytics");
                throw null;
            }
            c7796d.m15505b(null, c9548h.f49122c ? "review_lotd" : "review_vocabulary");
        } else {
            C7796d c7796d2 = this.f29435D0;
            if (c7796d2 == null) {
                C5207g.m11117l("analytics");
                throw null;
            }
            c7796d2.m15505b(null, "review_lesson");
        }
        m10239n0().f45103b.setOnClickListener(new View.OnClickListener(this) { // from class: uj.f

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ReviewFragment f49117b;

            {
                this.f49117b = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                ReviewFragment reviewFragment = this.f49117b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
                        C5207g.m11111f(reviewFragment, "this$0");
                        reviewFragment.m10240o0().f29617L0.setValue(Boolean.TRUE);
                        NavController navControllerM16725g0 = C8573r0.m16725g0(reviewFragment);
                        int iOrdinal = ViewKeys.ActivitiesSettings.ordinal();
                        NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToReviewSettings) != null) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt("viewKey", iOrdinal);
                            navControllerM16725g0.m3992m(R.id.actionToReviewSettings, bundle3, null);
                        }
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ReviewFragment.f29431E0;
                        C5207g.m11111f(reviewFragment, "this$0");
                        C8573r0.m16725g0(reviewFragment).m3995p();
                        break;
                }
            }
        });
        m10239n0().f45102a.setOnClickListener(new ViewOnClickListenerC2238x(25, this));
        MaterialCardView materialCardView = m10239n0().f45104c;
        C5207g.m11110e(materialCardView, "binding.cardView");
        C4924a.m10442U(materialCardView);
        m10239n0().f45105d.setIsTouchingEnabled(false);
        C8342p2 c8342p2 = m10239n0().f45107f;
        LinearLayout linearLayout = c8342p2.f45137a;
        C5207g.m11110e(linearLayout, "root");
        C4924a.m10457e0(linearLayout);
        TextView textView = c8342p2.f45144h;
        C5207g.m11110e(textView, "tvDoNotKnow");
        C4924a.m10442U(textView);
        Button button = c8342p2.f45143g;
        C5207g.m11110e(button, "btnSubmit");
        C4924a.m10442U(button);
        LinearLayout linearLayout2 = c8342p2.f45146j;
        C5207g.m11110e(linearLayout2, "viewFlipCard");
        C4924a.m10442U(linearLayout2);
        Button button2 = c8342p2.f45145i;
        C5207g.m11110e(button2, "tvFlip");
        C4924a.m10442U(button2);
        Button button3 = c8342p2.f45138b;
        C5207g.m11110e(button3, "btnContinue");
        C4924a.m10442U(button3);
        LinearLayout linearLayout3 = c8342p2.f45147k;
        C5207g.m11110e(linearLayout3, "viewSessionComplete");
        C4924a.m10442U(linearLayout3);
        C4924a.m10442U(button);
        textView.setOnClickListener(new ViewOnClickListenerC9547g(this, i11));
        button3.setOnClickListener(new ViewOnClickListenerC7718c(27, this));
        c8342p2.f45141e.setOnClickListener(new View.OnClickListener(this) { // from class: uj.f

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ReviewFragment f49117b;

            {
                this.f49117b = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                ReviewFragment reviewFragment = this.f49117b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
                        C5207g.m11111f(reviewFragment, "this$0");
                        reviewFragment.m10240o0().f29617L0.setValue(Boolean.TRUE);
                        NavController navControllerM16725g0 = C8573r0.m16725g0(reviewFragment);
                        int iOrdinal = ViewKeys.ActivitiesSettings.ordinal();
                        NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToReviewSettings) != null) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt("viewKey", iOrdinal);
                            navControllerM16725g0.m3992m(R.id.actionToReviewSettings, bundle3, null);
                        }
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ReviewFragment.f29431E0;
                        C5207g.m11111f(reviewFragment, "this$0");
                        C8573r0.m16725g0(reviewFragment).m3995p();
                        break;
                }
            }
        });
        Button button4 = c8342p2.f45142f;
        if (z10) {
            C5207g.m11110e(button4, "btnReviewAgain");
            C4924a.m10442U(button4);
        } else {
            button4.setOnClickListener(new ViewOnClickListenerC9734i(c8342p2, 11, this));
        }
        ComposeView composeView = m10239n0().f45108g;
        ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed disposeOnViewTreeLifecycleDestroyed = ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f4204a;
        composeView.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        composeView.setContent(C7204a.m14523c(1806326847, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.ReviewFragment$onViewCreated$8$1
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r9v5, types: [com.lingq.ui.review.ReviewFragment$onViewCreated$8$1$1, kotlin.jvm.internal.Lambda] */
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                if ((num.intValue() & 11) == 2 && interfaceC0476a2.mo1642m()) {
                    interfaceC0476a2.mo1650q();
                } else {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                    final ReviewFragment reviewFragment = this.f29505b;
                    ThemeKt.m10361a(false, C7204a.m14522b(interfaceC0476a2, -1075404485, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.ReviewFragment$onViewCreated$8$1.1
                        {
                            super(2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a3, Integer num2) {
                            InterfaceC0476a interfaceC0476a4 = interfaceC0476a3;
                            if ((num2.intValue() & 11) == 2 && interfaceC0476a4.mo1642m()) {
                                interfaceC0476a4.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                                InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
                                InterfaceC5312g0 interfaceC5312g0M3932a = C1026a.m3932a(reviewFragment.m10240o0().f29629R0, interfaceC0476a4);
                                ReviewActivityResultPopupKt.m10306a(((C9544d) interfaceC5312g0M3932a.getValue()).f49108a, ((C9544d) interfaceC5312g0M3932a.getValue()).f49109b, ((C9544d) interfaceC5312g0M3932a.getValue()).f49110c, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.ReviewFragment.onViewCreated.8.1.1.1
                                    @Override // cm.InterfaceC2041a
                                    /* JADX INFO: renamed from: E */
                                    public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                        return C9072e.f47360a;
                                    }
                                }, interfaceC0476a4, 3072, 0);
                            }
                            return C9072e.f47360a;
                        }
                    }), interfaceC0476a2, 48, 1);
                }
                return C9072e.f47360a;
            }
        }, true));
        ComposeView composeView2 = m10239n0().f45110i;
        composeView2.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        composeView2.setContent(C7204a.m14523c(1279212136, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.ReviewFragment$onViewCreated$9$1
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r8v5, types: [com.lingq.ui.review.ReviewFragment$onViewCreated$9$1$1, kotlin.jvm.internal.Lambda] */
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                if ((num.intValue() & 11) == 2 && interfaceC0476a2.mo1642m()) {
                    interfaceC0476a2.mo1650q();
                } else {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                    final ReviewFragment reviewFragment = this.f29508b;
                    ThemeKt.m10361a(false, C7204a.m14522b(interfaceC0476a2, -2105659292, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.ReviewFragment$onViewCreated$9$1.1
                        {
                            super(2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a3, Integer num2) {
                            InterfaceC0476a interfaceC0476a4 = interfaceC0476a3;
                            if ((num2.intValue() & 11) == 2 && interfaceC0476a4.mo1642m()) {
                                interfaceC0476a4.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                                InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
                                final ReviewFragment reviewFragment2 = reviewFragment;
                                InterfaceC5312g0 interfaceC5312g0M3932a = C1026a.m3932a(reviewFragment2.m10240o0().f29633T0, interfaceC0476a4);
                                ReviewUnscrambleResultPopupKt.m10307a(((C9545e) interfaceC5312g0M3932a.getValue()).f49111a, ((C9545e) interfaceC5312g0M3932a.getValue()).f49112b, ((C9545e) interfaceC5312g0M3932a.getValue()).f49113c, ((C9545e) interfaceC5312g0M3932a.getValue()).f49114d, ((C9545e) interfaceC5312g0M3932a.getValue()).f49115e, C5408a.m11572e(reviewFragment2.m10240o0().mo498E1()), new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.ReviewFragment.onViewCreated.9.1.1.1
                                    {
                                        super(0);
                                    }

                                    @Override // cm.InterfaceC2041a
                                    /* JADX INFO: renamed from: E */
                                    public final C9072e mo807E() {
                                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ReviewFragment.f29431E0;
                                        C7138s c7138s = reviewFragment2.m10240o0().f29635U0;
                                        C9072e c9072e2 = C9072e.f47360a;
                                        c7138s.mo14371k(c9072e2);
                                        return c9072e2;
                                    }
                                }, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.ReviewFragment.onViewCreated.9.1.1.2
                                    {
                                        super(0);
                                    }

                                    @Override // cm.InterfaceC2041a
                                    /* JADX INFO: renamed from: E */
                                    public final C9072e mo807E() {
                                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ReviewFragment.f29431E0;
                                        ReviewFragment reviewFragment3 = reviewFragment2;
                                        reviewFragment3.m10240o0().m10260s2();
                                        reviewFragment3.m10240o0().m10255F2();
                                        reviewFragment3.m10240o0().m10266z2();
                                        return C9072e.f47360a;
                                    }
                                }, interfaceC0476a4, 0, 0);
                            }
                            return C9072e.f47360a;
                        }
                    }), interfaceC0476a2, 48, 1);
                }
                return C9072e.f47360a;
            }
        }, true));
        C0987y.m3825g(this, "reviewSettingsClosed", new InterfaceC2056p<String, Bundle, C9072e>() { // from class: com.lingq.ui.review.ReviewFragment$onViewCreated$10
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(String str, Bundle bundle3) {
                C5207g.m11111f(str, "<anonymous parameter 0>");
                C5207g.m11111f(bundle3, "bundle");
                InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
                this.f29444b.m10240o0().f29617L0.setValue(Boolean.FALSE);
                return C9072e.f47360a;
            }
        });
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4510x9af7312b(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C8335o1 m10239n0() {
        return (C8335o1) this.f29432A0.m10489a(this, f29431E0[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final ReviewViewModel m10240o0() {
        return (ReviewViewModel) this.f29433B0.getValue();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p0 */
    public final void m10241p0(InterfaceC9957e interfaceC9957e, ReviewActivityResult reviewActivityResult, String str) {
        C7796d c7796d = this.f29435D0;
        if (c7796d == null) {
            C5207g.m11117l("analytics");
            throw null;
        }
        c7796d.m15505b(null, "reviewed_card");
        if (reviewActivityResult == ReviewActivityResult.Correct) {
            m10240o0().m10253D2();
            m10240o0().m10265y2(interfaceC9957e.mo18533a().f41692b);
        } else if (reviewActivityResult == ReviewActivityResult.Incorrect) {
            m10240o0().m10254E2(interfaceC9957e.mo18533a().f41692b);
        }
        Bundle bundle = new Bundle();
        bundle.putString("currentCard", interfaceC9957e.mo18533a().f41692b);
        bundle.putSerializable("result", reviewActivityResult);
        bundle.putString("answer", str);
        C1690o c1690o = new C1690o(false, false, -1, false, false, R.anim.card_flip_left_in, R.anim.card_flip_left_out, R.anim.card_flip_right_in, R.anim.card_flip_right_out);
        FragmentContainerView fragmentContainerView = m10239n0().f45106e;
        C5207g.m11110e(fragmentContainerView, "binding.navHostFragmentReview");
        C1084b.m4034a(fragmentContainerView).m3992m(R.id.fragment_review_result, bundle, c1690o);
    }
}
