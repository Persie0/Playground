package p000;

import com.lingq.feature.review.data.ReviewActivityResult;
import com.lingq.feature.review.data.ReviewCardLayoutStyle;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class pc8 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f55949a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f55950b;

    static {
        int[] iArr = new int[ReviewCardLayoutStyle.values().length];
        try {
            iArr[ReviewCardLayoutStyle.FlashcardFront.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReviewCardLayoutStyle.FlashcardBack.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReviewCardLayoutStyle.QuizQuestion.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ReviewCardLayoutStyle.QuizResult.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f55949a = iArr;
        int[] iArr2 = new int[ReviewActivityResult.values().length];
        try {
            iArr2[ReviewActivityResult.Correct.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ReviewActivityResult.Incorrect.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ReviewActivityResult.Almost.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ReviewActivityResult.None.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f55950b = iArr2;
    }
}
