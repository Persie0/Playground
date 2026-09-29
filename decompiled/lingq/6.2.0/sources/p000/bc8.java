package p000;

import com.lingq.feature.review.views.result.ReviewResultType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class bc8 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f8336a;

    static {
        int[] iArr = new int[ReviewResultType.values().length];
        try {
            iArr[ReviewResultType.CORRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReviewResultType.INCORRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReviewResultType.ALMOST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f8336a = iArr;
    }
}
