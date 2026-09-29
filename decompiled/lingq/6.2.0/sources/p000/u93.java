package p000;

import androidx.compose.p002ui.focus.CustomDestinationResult;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class u93 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f63610a;

    static {
        int[] iArr = new int[CustomDestinationResult.values().length];
        try {
            iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CustomDestinationResult.None.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f63610a = iArr;
    }
}
