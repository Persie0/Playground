package p000;

import android.os.Bundle;
import android.speech.RecognitionListener;
import com.lingq.feature.review.activities.ReviewActivitySpeakingFragment;
import com.lingq.feature.review.views.speaking.SpeechRecognitionState;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class yb8 implements RecognitionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69604a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f69605b;

    public /* synthetic */ yb8(Object obj, int i) {
        this.f69604a = i;
        this.f69605b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m25026a() {
    }

    /* JADX INFO: renamed from: b */
    private final void m25027b(byte[] bArr) {
    }

    /* JADX INFO: renamed from: c */
    private final void m25028c() {
    }

    /* JADX INFO: renamed from: d */
    private final void m25029d() {
    }

    /* JADX INFO: renamed from: e */
    private final void m25030e(int i, Bundle bundle) {
    }

    /* JADX INFO: renamed from: f */
    private final void m25031f(Bundle bundle) {
    }

    /* JADX INFO: renamed from: g */
    private final void m25032g(float f) {
    }

    /* JADX INFO: renamed from: h */
    private final void m25033h(float f) {
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
        switch (this.f69604a) {
            case 0:
                ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = (ReviewActivitySpeakingFragment) this.f69605b;
                bh4[] bh4VarArr = ReviewActivitySpeakingFragment.f32136H0;
                reviewActivitySpeakingFragment.m9550S0().m9558V2(SpeechRecognitionState.LISTENING);
                break;
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
        switch (this.f69604a) {
            case 0:
                bArr.getClass();
                break;
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        int i = this.f69604a;
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        int i2 = this.f69604a;
        Object obj = this.f69605b;
        switch (i2) {
            case 0:
                if (i != 7) {
                    bh4[] bh4VarArr = ReviewActivitySpeakingFragment.f32136H0;
                    ((ReviewActivitySpeakingFragment) obj).m9550S0().m9558V2(SpeechRecognitionState.ERROR);
                }
                break;
            default:
                if (i != 7) {
                    ((vi3) obj).invoke(ra8.f58974a);
                }
                break;
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, Bundle bundle) {
        switch (this.f69604a) {
            case 0:
                bundle.getClass();
                break;
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        ArrayList<String> stringArrayList;
        int i = this.f69604a;
        Object obj = this.f69605b;
        switch (i) {
            case 0:
                bundle.getClass();
                try {
                    String strM4839V = cl9.m4839V(cl9.m4839V(String.valueOf(bundle.getStringArrayList("results_recognition")), "[", ""), "]", "");
                    bh4[] bh4VarArr = ReviewActivitySpeakingFragment.f32136H0;
                    ((ReviewActivitySpeakingFragment) obj).m9550S0().m9559W2(strM4839V);
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
            default:
                String str = (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null) ? null : (String) u91.m22591I0(stringArrayList);
                ((vi3) obj).invoke(new sa8(str != null ? str : "", false));
                break;
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        switch (this.f69604a) {
            case 0:
                bundle.getClass();
                ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = (ReviewActivitySpeakingFragment) this.f69605b;
                bh4[] bh4VarArr = ReviewActivitySpeakingFragment.f32136H0;
                reviewActivitySpeakingFragment.m9550S0().m9558V2(SpeechRecognitionState.LISTENING);
                break;
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        String str;
        ArrayList<String> stringArrayList;
        int i = this.f69604a;
        Object obj = this.f69605b;
        String str2 = "";
        switch (i) {
            case 0:
                ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = (ReviewActivitySpeakingFragment) obj;
                bundle.getClass();
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("results_recognition");
                if (stringArrayList2 != null && (str = (String) u91.m22591I0(stringArrayList2)) != null) {
                    str2 = str;
                }
                bh4[] bh4VarArr = ReviewActivitySpeakingFragment.f32136H0;
                reviewActivitySpeakingFragment.m9550S0().m9559W2(str2);
                reviewActivitySpeakingFragment.m9550S0().m9558V2(SpeechRecognitionState.STOPPED);
                break;
            default:
                String str3 = (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null) ? null : (String) u91.m22591I0(stringArrayList);
                ((vi3) obj).invoke(new sa8(str3 != null ? str3 : "", true));
                break;
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
        int i = this.f69604a;
    }
}
