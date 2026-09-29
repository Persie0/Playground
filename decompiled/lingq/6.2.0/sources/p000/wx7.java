package p000;

import com.lingq.core.domain.model.onboarding.TooltipStep;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class wx7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f67486a;

    static {
        int[] iArr = new int[TooltipStep.values().length];
        try {
            iArr[TooltipStep.SentenceModeAudio.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TooltipStep.FirstLingQ.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f67486a = iArr;
    }
}
