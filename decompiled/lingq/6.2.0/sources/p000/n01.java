package p000;

import androidx.compose.p002ui.state.ToggleableState;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n01 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f52105a;

    static {
        int[] iArr = new int[ToggleableState.values().length];
        try {
            iArr[ToggleableState.On.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ToggleableState.Off.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f52105a = iArr;
    }
}
