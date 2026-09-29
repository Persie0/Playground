package p000;

import com.lingq.core.domain.model.onboarding.HighlightType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class p5a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f55621a;

    static {
        int[] iArr = new int[HighlightType.values().length];
        try {
            iArr[HighlightType.Hand.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HighlightType.HandCentered.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HighlightType.Focus.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[HighlightType.Incentive.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[HighlightType.Indicator.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[HighlightType.HandSwipe.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[HighlightType.HandSwipeTopDown.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[HighlightType.Nothing.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f55621a = iArr;
    }
}
