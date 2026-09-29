package p000;

import com.lingq.feature.review.views.result.ReviewResultType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class he8 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f42263a;

    static {
        int[] iArr = new int[ReviewResultType.values().length];
        try {
            iArr[ReviewResultType.CORRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReviewResultType.ALMOST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReviewResultType.INCORRECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f42263a = iArr;
    }
}
