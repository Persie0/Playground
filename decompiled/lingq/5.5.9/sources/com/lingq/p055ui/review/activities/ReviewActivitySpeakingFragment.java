package com.lingq.p055ui.review.activities;

import android.content.Intent;
import android.os.Bundle;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.Toast;
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
import com.lingq.p055ui.lesson.page.data.TextTokenType;
import com.lingq.p055ui.review.ReviewViewModel;
import com.lingq.p055ui.review.data.ReviewActivityShow;
import com.lingq.p055ui.review.views.speaking.SpeechRecognitionState;
import com.lingq.p055ui.token.TokenControllerType;
import com.lingq.p055ui.token.TokenData;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p096ei.C5408a;
import p155he.C6041e;
import p232l2.C7222a;
import p254m2.C7472a;
import p260m8.C7499b;
import p265mj.C7570d;
import p322pd.C8228i;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p438vj.AbstractC9745e;
import p438vj.C9752l;
import p462wj.C9955c;
import p513yj.C10408j;
import p513yj.InterfaceC10407i;
import ph.C8323m1;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/review/activities/ReviewActivitySpeakingFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ReviewActivitySpeakingFragment extends AbstractC9745e {

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f29988F0 = {C0204c.m857q(ReviewActivitySpeakingFragment.class, "getBinding()Lcom/lingq/databinding/FragmentReviewActivitySpeakingBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f29989A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f29990B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f29991C0;

    /* JADX INFO: renamed from: D0 */
    public final int f29992D0;

    /* JADX INFO: renamed from: E0 */
    public SpeechRecognizer f29993E0;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$a */
    public static final class C4620a implements InterfaceC10407i {
        public C4620a() {
        }

        @Override // p513yj.InterfaceC10407i
        /* JADX INFO: renamed from: a */
        public final void mo10282a(C7570d c7570d) {
            C5207g.m11111f(c7570d, "token");
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivitySpeakingFragment.f29988F0;
            ReviewActivitySpeakingFragment.this.m10280n0().f29608H.mo10048f2(new TokenData(c7570d.f41725e, c7570d.f41731k == TextTokenType.WORD ? TokenType.WordType : TokenType.CardType, 0, 0, null, null, TokenControllerType.Review, null, 0, null, 956));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p513yj.InterfaceC10407i
        /* JADX INFO: renamed from: b */
        public final void mo10283b() {
            String languageTag;
            ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = ReviewActivitySpeakingFragment.this;
            if (C7472a.m14841a(reviewActivitySpeakingFragment.m3578a0(), "android.permission.RECORD_AUDIO") != 0) {
                reviewActivitySpeakingFragment.m10281o0().m10285l2(SpeechRecognitionState.ERROR);
                return;
            }
            try {
                Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
                String strMo498E1 = reviewActivitySpeakingFragment.m10281o0().mo498E1();
                if (C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.English))) {
                    languageTag = Locale.US.toLanguageTag();
                } else if (C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Portuguese))) {
                    languageTag = new Locale("pt", "BR").toLanguageTag();
                } else {
                    languageTag = C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Spanish)) ? new Locale("es", "ES").toLanguageTag() : Locale.forLanguageTag(strMo498E1).toLanguageTag();
                }
                intent.putExtra("android.speech.extra.LANGUAGE", languageTag);
                intent.putExtra("android.speech.extra.PROMPT", ((C10408j) reviewActivitySpeakingFragment.m10281o0().f30022J.getValue()).f52211c);
                if (C7472a.m14841a(reviewActivitySpeakingFragment.m3578a0(), "android.permission.RECORD_AUDIO") != 0) {
                    reviewActivitySpeakingFragment.m10281o0().m10285l2(SpeechRecognitionState.ERROR);
                    SpeechRecognizer speechRecognizer = reviewActivitySpeakingFragment.f29993E0;
                    if (speechRecognizer != null) {
                        speechRecognizer.cancel();
                        return;
                    } else {
                        C5207g.m11117l("speechRecognizer");
                        throw null;
                    }
                }
                SpeechRecognitionState speechRecognitionState = ((C10408j) reviewActivitySpeakingFragment.m10281o0().f30022J.getValue()).f52213e;
                SpeechRecognitionState speechRecognitionState2 = SpeechRecognitionState.LISTENING;
                if (speechRecognitionState == speechRecognitionState2) {
                    SpeechRecognizer speechRecognizer2 = reviewActivitySpeakingFragment.f29993E0;
                    if (speechRecognizer2 == null) {
                        C5207g.m11117l("speechRecognizer");
                        throw null;
                    }
                    speechRecognizer2.stopListening();
                    speechRecognitionState2 = SpeechRecognitionState.STOPPED;
                } else {
                    reviewActivitySpeakingFragment.m10281o0().m10286m2("");
                    reviewActivitySpeakingFragment.m10281o0().f30027f.mo9336K();
                    SpeechRecognizer speechRecognizer3 = reviewActivitySpeakingFragment.f29993E0;
                    if (speechRecognizer3 == null) {
                        C5207g.m11117l("speechRecognizer");
                        throw null;
                    }
                    speechRecognizer3.startListening(intent);
                }
                reviewActivitySpeakingFragment.m10281o0().m10285l2(speechRecognitionState2);
            } catch (Exception e10) {
                Toast.makeText(reviewActivitySpeakingFragment.m3578a0(), "Speech recognizer not available in your device.", 1).show();
                C6041e.m12476a().m12477b(e10);
            }
        }

        @Override // p513yj.InterfaceC10407i
        /* JADX INFO: renamed from: c */
        public final void mo10284c() {
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivitySpeakingFragment.f29988F0;
            ReviewActivitySpeakingViewModel reviewActivitySpeakingViewModelM10281o0 = ReviewActivitySpeakingFragment.this.m10281o0();
            C7828f.m15570d(C8573r0.m16767w0(reviewActivitySpeakingViewModelM10281o0), null, null, new ReviewActivitySpeakingViewModel$speakSentence$1(reviewActivitySpeakingViewModelM10281o0, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$1] */
    public ReviewActivitySpeakingFragment() {
        super(R.layout.fragment_review_activity_speaking);
        this.f29989A0 = C4924a.m10477o0(this, ReviewActivitySpeakingFragment$binding$2.f29995j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$2
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
        this.f29990B0 = C8573r0.m16711Z(this, C5209i.m11118a(ReviewActivitySpeakingViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$parentViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f30008b.m3579b0().m3579b0();
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f29991C0 = C8573r0.m16711Z(this, C5209i.m11118a(ReviewViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$8
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
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$special$$inlined$viewModels$default$9
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
        this.f29992D0 = 1;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: J */
    public final void mo3562J() {
        this.f6090a0 = true;
        try {
            SpeechRecognizer speechRecognizer = this.f29993E0;
            if (speechRecognizer != null) {
                speechRecognizer.destroy();
            } else {
                C5207g.m11117l("speechRecognizer");
                throw null;
            }
        } catch (Exception e10) {
            C6041e.m12476a().m12477b(e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: O */
    public final void mo3566O() {
        this.f6090a0 = true;
        m10281o0().f30027f.mo9336K();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 2, true);
        c8228iM29r.f48293c = 300L;
        m3585f0(c8228iM29r);
        m10280n0().f29660k0.setValue(new C9955c(ReviewActivityShow.DoNotKnow));
        if (C7472a.m14841a(m3578a0(), "android.permission.RECORD_AUDIO") != 0) {
            C7222a.m14545c(m3576Y(), new String[]{"android.permission.RECORD_AUDIO"}, this.f29992D0);
        }
        SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(m3578a0());
        C5207g.m11110e(speechRecognizerCreateSpeechRecognizer, "createSpeechRecognizer(requireContext())");
        this.f29993E0 = speechRecognizerCreateSpeechRecognizer;
        speechRecognizerCreateSpeechRecognizer.setRecognitionListener(new C9752l(this));
        ((C8323m1) this.f29989A0.m10489a(this, f29988F0[0])).f45026a.setInteraction(new C4620a());
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4621x6a68798a(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final ReviewViewModel m10280n0() {
        return (ReviewViewModel) this.f29991C0.getValue();
    }

    /* JADX INFO: renamed from: o0 */
    public final ReviewActivitySpeakingViewModel m10281o0() {
        return (ReviewActivitySpeakingViewModel) this.f29990B0.getValue();
    }
}
