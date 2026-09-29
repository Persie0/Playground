package p000;

import com.lingq.feature.review.data.ReviewActivityResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class vb8 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f65168a;

    static {
        int[] iArr = new int[ReviewActivityResult.values().length];
        try {
            iArr[ReviewActivityResult.Correct.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReviewActivityResult.Incorrect.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReviewActivityResult.Almost.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ReviewActivityResult.None.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f65168a = iArr;
    }
}
