package p000;

import com.lingq.feature.review.views.speaking.SpeechRecognitionState;

/* JADX INFO: renamed from: qy */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3515qy {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f58359a;

    static {
        int[] iArr = new int[SpeechRecognitionState.values().length];
        try {
            iArr[SpeechRecognitionState.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SpeechRecognitionState.LISTENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SpeechRecognitionState.STOPPED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SpeechRecognitionState.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f58359a = iArr;
    }
}
