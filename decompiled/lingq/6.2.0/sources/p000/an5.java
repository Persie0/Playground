package p000;

import androidx.compose.material3.SnackbarResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class an5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f878a;

    static {
        int[] iArr = new int[SnackbarResult.values().length];
        try {
            iArr[SnackbarResult.Dismissed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SnackbarResult.ActionPerformed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f878a = iArr;
    }
}
