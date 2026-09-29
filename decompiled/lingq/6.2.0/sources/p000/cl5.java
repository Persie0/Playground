package p000;

import com.airbnb.lottie.compose.LottieCancellationBehavior;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class cl5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f10228a;

    static {
        int[] iArr = new int[LottieCancellationBehavior.values().length];
        try {
            iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LottieCancellationBehavior.Immediately.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f10228a = iArr;
    }
}
