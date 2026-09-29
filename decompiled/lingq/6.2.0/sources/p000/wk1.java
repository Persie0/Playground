package p000;

import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class wk1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f66960a;

    static {
        int[] iArr = new int[Orientation.values().length];
        try {
            iArr[Orientation.Vertical.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Orientation.Horizontal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f66960a = iArr;
    }
}
