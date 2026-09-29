package p000;

import androidx.compose.runtime.Recomposer$State;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class mz8 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f52086a;

    static {
        int[] iArr = new int[Recomposer$State.values().length];
        try {
            iArr[Recomposer$State.Idle.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Recomposer$State.ShutDown.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f52086a = iArr;
    }
}
