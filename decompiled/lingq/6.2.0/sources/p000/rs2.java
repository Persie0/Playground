package p000;

import androidx.compose.animation.EnterExitState;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class rs2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f59752a;

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
        f59752a = iArr;
    }
}
