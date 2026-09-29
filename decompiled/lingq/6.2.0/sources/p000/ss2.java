package p000;

import androidx.compose.animation.EnterExitState;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ss2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f61330a;

    static {
        int[] iArr = new int[EnterExitState.values().length];
        try {
            iArr[EnterExitState.Visible.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnterExitState.PostExit.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f61330a = iArr;
    }
}
