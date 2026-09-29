package p000;

import androidx.compose.runtime.PausedCompositionState;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h67 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f41839a;

    static {
        int[] iArr = new int[PausedCompositionState.values().length];
        try {
            iArr[PausedCompositionState.InitialPending.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PausedCompositionState.RecomposePending.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PausedCompositionState.Recomposing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PausedCompositionState.ApplyPending.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PausedCompositionState.Applied.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PausedCompositionState.Cancelled.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PausedCompositionState.Invalid.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f41839a = iArr;
    }
}
