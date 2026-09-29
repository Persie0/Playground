package p000;

import com.lingq.core.domain.model.onboarding.HighlightType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class j6a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f45124a;

    static {
        int[] iArr = new int[HighlightType.values().length];
        try {
            iArr[HighlightType.Focus.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HighlightType.Hand.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HighlightType.HandCentered.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[HighlightType.HandSwipe.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[HighlightType.HandSwipeTopDown.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[HighlightType.Incentive.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[HighlightType.Indicator.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[HighlightType.Nothing.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f45124a = iArr;
    }
}
