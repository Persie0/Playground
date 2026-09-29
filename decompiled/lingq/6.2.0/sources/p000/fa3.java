package p000;

import androidx.compose.p002ui.focus.FocusStateImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class fa3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f38702a;

    static {
        int[] iArr = new int[FocusStateImpl.values().length];
        try {
            iArr[FocusStateImpl.Captured.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FocusStateImpl.Active.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FocusStateImpl.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f38702a = iArr;
    }
}
