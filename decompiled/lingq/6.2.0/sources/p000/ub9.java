package p000;

import androidx.compose.material3.SnackbarDuration;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ub9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f63673a;

    static {
        int[] iArr = new int[SnackbarDuration.values().length];
        try {
            iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SnackbarDuration.Long.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SnackbarDuration.Short.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f63673a = iArr;
    }
}
