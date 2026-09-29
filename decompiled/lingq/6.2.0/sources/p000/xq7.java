package p000;

import com.lingq.feature.reader.rating.p016ui.RatingContentType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class xq7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f68543a;

    static {
        int[] iArr = new int[RatingContentType.values().length];
        try {
            iArr[RatingContentType.Review.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RatingContentType.Feedback.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RatingContentType.Rate.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f68543a = iArr;
    }
}
