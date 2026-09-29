package com.lingq.feature.review.activities;

import android.content.Intent;
import android.speech.SpeechRecognizer;
import android.widget.Toast;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.AbstractC0708b;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.token.TokenPopupData;
import com.lingq.feature.review.C2758f;
import com.lingq.feature.review.views.speaking.SpeechRecognitionState;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.bh4;
import p000.do7;
import p000.fa4;
import p000.lda;
import p000.sca;
import p000.uta;
import p000.ve9;
import p000.vz1;
import p000.wfb;
import p000.wq5;
import p000.xe9;
import p000.xz7;

/* JADX INFO: renamed from: com.lingq.feature.review.activities.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2746a implements uta, wq5, ve9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32317a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractComponentCallbacksC0635c f32318b;

    public /* synthetic */ C2746a(int i, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        this.f32317a = i;
        this.f32318b = abstractComponentCallbacksC0635c;
    }

    @Override // p000.ve9
    /* JADX INFO: renamed from: a */
    public void mo4445a(xz7 xz7Var) {
        ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = (ReviewActivitySpeakingFragment) this.f32318b;
        bh4[] bh4VarArr = ReviewActivitySpeakingFragment.f32136H0;
        C2758f c2758fM9549R0 = reviewActivitySpeakingFragment.m9549R0();
        String str = xz7Var.f69008e;
        TokenPopupData tokenPopupData = new TokenPopupData(str, vz1.m23609O(str, reviewActivitySpeakingFragment.m9550S0().f32329b.mo4589b2()), xz7Var.f69014k == TextTokenType.WORD ? TokenType.WordType : TokenType.CardType, 0, 0, null, null, TokenControllerType.ReviewSentence, null, 0, null, false, xz7Var.f69010g, xz7Var.f69011h, xz7Var.f69017n, 0, 0, 0, 0, false, null, null, false, 8359800, null);
        c2758fM9549R0.getClass();
        c2758fM9549R0.f32507c.mo8738E1(tokenPopupData);
    }

    @Override // p000.wq5
    /* JADX INFO: renamed from: b */
    public void mo9555b(String str) {
        str.getClass();
        sca.m21224J0((C2747b) ((ReviewActivityMatchingFragment) this.f32318b).f31971D0.getValue(), str, false, 14);
    }

    @Override // p000.uta
    /* JADX INFO: renamed from: c */
    public void mo9556c(int i) {
        int i2 = this.f32317a;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f32318b;
        switch (i2) {
            case 0:
                bh4[] bh4VarArr = ReviewActivityFlashcardFragment.f31913H0;
                C2750e c2750eM9539U0 = ((ReviewActivityFlashcardFragment) abstractComponentCallbacksC0635c).m9539U0();
                wfb.m23926u(lda.m16103C(c2750eM9539U0), null, null, new ReviewActivityViewModel$updateCardStatus$1(c2750eM9539U0, i, null), 3);
                break;
            default:
                bh4[] bh4VarArr2 = ReviewActivityResultFragment.f32067H0;
                C2750e c2750eM9548U0 = ((ReviewActivityResultFragment) abstractComponentCallbacksC0635c).m9548U0();
                wfb.m23926u(lda.m16103C(c2750eM9548U0), null, null, new ReviewActivityViewModel$updateCardStatus$1(c2750eM9548U0, i, null), 3);
                break;
        }
    }

    @Override // p000.ve9
    /* JADX INFO: renamed from: d */
    public void mo4448d() {
        ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = (ReviewActivitySpeakingFragment) this.f32318b;
        if (do7.m10532h(reviewActivitySpeakingFragment.m2090R(), "android.permission.RECORD_AUDIO") != 0) {
            reviewActivitySpeakingFragment.m9550S0().m9558V2(SpeechRecognitionState.ERROR);
            return;
        }
        try {
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
            intent.putExtra("android.speech.extra.LANGUAGE", AbstractC3184kh.m15226t(reviewActivitySpeakingFragment.m9550S0().f32329b.mo4589b2()));
            intent.putExtra("android.speech.extra.PROMPT", ((xe9) ((C3244l) reviewActivitySpeakingFragment.m9550S0().f32344q.f9311a).getValue()).f68136c);
            if (do7.m10532h(reviewActivitySpeakingFragment.m2090R(), "android.permission.RECORD_AUDIO") != 0) {
                reviewActivitySpeakingFragment.m9550S0().m9558V2(SpeechRecognitionState.ERROR);
                SpeechRecognizer speechRecognizer = reviewActivitySpeakingFragment.f32141G0;
                if (speechRecognizer != null) {
                    speechRecognizer.cancel();
                    return;
                } else {
                    fa4.m11636J("speechRecognizer");
                    throw null;
                }
            }
            SpeechRecognitionState speechRecognitionState = ((xe9) ((C3244l) reviewActivitySpeakingFragment.m9550S0().f32344q.f9311a).getValue()).f68138e;
            SpeechRecognitionState speechRecognitionState2 = SpeechRecognitionState.LISTENING;
            if (speechRecognitionState == speechRecognitionState2) {
                SpeechRecognizer speechRecognizer2 = reviewActivitySpeakingFragment.f32141G0;
                if (speechRecognizer2 == null) {
                    fa4.m11636J("speechRecognizer");
                    throw null;
                }
                speechRecognizer2.stopListening();
                speechRecognitionState2 = SpeechRecognitionState.STOPPED;
            } else {
                reviewActivitySpeakingFragment.m9550S0().m9559W2("");
                reviewActivitySpeakingFragment.m9550S0().f32334g.mo8482P();
                SpeechRecognizer speechRecognizer3 = reviewActivitySpeakingFragment.f32141G0;
                if (speechRecognizer3 == null) {
                    fa4.m11636J("speechRecognizer");
                    throw null;
                }
                speechRecognizer3.startListening(intent);
            }
            reviewActivitySpeakingFragment.m9550S0().m9558V2(speechRecognitionState2);
        } catch (Exception unused) {
            Toast.makeText(reviewActivitySpeakingFragment.m2090R(), "Speech recognizer not available in your device.", 1).show();
        }
    }

    @Override // p000.ve9
    /* JADX INFO: renamed from: e */
    public void mo4449e() {
        ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = (ReviewActivitySpeakingFragment) this.f32318b;
        bh4[] bh4VarArr = ReviewActivitySpeakingFragment.f32136H0;
        C2748c c2748cM9550S0 = reviewActivitySpeakingFragment.m9550S0();
        c2748cM9550S0.getClass();
        wfb.m23926u(lda.m16103C(c2748cM9550S0), null, null, new ReviewActivitySpeakingViewModel$speakSentence$1(c2748cM9550S0, null), 3);
    }

    @Override // p000.wq5
    /* JADX INFO: renamed from: k */
    public void mo9557k(int i) {
        ReviewActivityMatchingFragment reviewActivityMatchingFragment = (ReviewActivityMatchingFragment) this.f32318b;
        if (i == 3) {
            bh4[] bh4VarArr = ReviewActivityMatchingFragment.f31969F0;
            reviewActivityMatchingFragment.m9540R0().m9616j3();
            reviewActivityMatchingFragment.m9540R0().m9614h3();
            wfb.m23926u(AbstractC0708b.m2508a(reviewActivityMatchingFragment.m2112n()), null, null, new ReviewActivityMatchingFragment$onViewCreated$1$onScoreUpdated$1(reviewActivityMatchingFragment, null), 3);
        }
    }
}
