package p000;

import androidx.compose.p002ui.state.ToggleableState;

/* JADX INFO: renamed from: ng */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3371ng {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f52693a;

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
        f52693a = iArr;
    }
}
