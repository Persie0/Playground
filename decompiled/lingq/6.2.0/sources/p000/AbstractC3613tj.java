package p000;

import androidx.compose.p002ui.graphics.Path$Direction;

/* JADX INFO: renamed from: tj */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3613tj {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f62362a;

    static {
        int[] iArr = new int[Path$Direction.values().length];
        try {
            iArr[Path$Direction.CounterClockwise.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Path$Direction.Clockwise.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f62362a = iArr;
    }
}
