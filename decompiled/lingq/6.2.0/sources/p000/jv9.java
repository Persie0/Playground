package p000;

import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class jv9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f46236a;

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
        f46236a = iArr;
    }
}
