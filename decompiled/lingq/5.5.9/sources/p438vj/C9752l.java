package p438vj;

import android.os.Bundle;
import android.speech.RecognitionListener;
import com.lingq.p055ui.review.activities.ReviewActivitySpeakingFragment;
import com.lingq.p055ui.review.views.speaking.SpeechRecognitionState;
import dm.C5207g;
import java.util.ArrayList;
import km.InterfaceC6727j;
import kotlin.collections.C6752c;
import mo.C7661i;

/* JADX INFO: renamed from: vj.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C9752l implements RecognitionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReviewActivitySpeakingFragment f49809a;

    public C9752l(ReviewActivitySpeakingFragment reviewActivitySpeakingFragment) {
        this.f49809a = reviewActivitySpeakingFragment;
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
        InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivitySpeakingFragment.f29988F0;
        this.f49809a.m10281o0().m10285l2(SpeechRecognitionState.LISTENING);
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
        C5207g.m11111f(bArr, "bytes");
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i10) {
        if (i10 != 7) {
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivitySpeakingFragment.f29988F0;
            this.f49809a.m10281o0().m10285l2(SpeechRecognitionState.ERROR);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i10, Bundle bundle) {
        C5207g.m11111f(bundle, "bundle");
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        C5207g.m11111f(bundle, "partialResults");
        try {
            String strValueOf = String.valueOf(bundle.getStringArrayList("results_recognition"));
            ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = this.f49809a;
            String strM15254T2 = C7661i.m15254T2(C7661i.m15254T2(strValueOf, "[", ""), "]", "");
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivitySpeakingFragment.f29988F0;
            reviewActivitySpeakingFragment.m10281o0().m10286m2(strM15254T2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        C5207g.m11111f(bundle, "bundle");
        InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivitySpeakingFragment.f29988F0;
        this.f49809a.m10281o0().m10285l2(SpeechRecognitionState.LISTENING);
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        String str;
        C5207g.m11111f(bundle, "bundle");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || (str = (String) C6752c.m13425S(stringArrayList)) == null) {
            str = "";
        }
        InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivitySpeakingFragment.f29988F0;
        ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = this.f49809a;
        reviewActivitySpeakingFragment.m10281o0().m10286m2(str);
        reviewActivitySpeakingFragment.m10281o0().m10285l2(SpeechRecognitionState.STOPPED);
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f3) {
    }
}
