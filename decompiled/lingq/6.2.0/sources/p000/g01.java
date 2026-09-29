package p000;

import androidx.compose.p002ui.state.ToggleableState;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class g01 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f39993a;

    static {
        int[] iArr = new int[ToggleableState.values().length];
        try {
            iArr[ToggleableState.On.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ToggleableState.Indeterminate.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ToggleableState.Off.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f39993a = iArr;
    }
}
