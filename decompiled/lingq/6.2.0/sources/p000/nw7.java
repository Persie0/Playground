package p000;

import com.lingq.core.domain.model.onboarding.TooltipStep;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class nw7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f53329a;

    static {
        int[] iArr = new int[TooltipStep.values().length];
        try {
            iArr[TooltipStep.ReviewMenuHighlight.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TooltipStep.PlayAudioHighlight.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TooltipStep.PlayAudio.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TooltipStep.SentenceModeHighlight.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TooltipStep.SentenceMode.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TooltipStep.SwipePageHighlight.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f53329a = iArr;
    }
}
