package p000;

import androidx.compose.p002ui.node.Invalidation;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ac2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f481a;

    static {
        int[] iArr = new int[Invalidation.values().length];
        try {
            iArr[Invalidation.LookaheadMeasurement.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Invalidation.LookaheadPlacement.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Invalidation.Measurement.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Invalidation.Placement.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f481a = iArr;
    }
}
