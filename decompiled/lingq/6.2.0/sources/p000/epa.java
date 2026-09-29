package p000;

import androidx.compose.p002ui.input.pointer.util.VelocityTracker1D$Strategy;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class epa {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f37693a;

    static {
        int[] iArr = new int[VelocityTracker1D$Strategy.values().length];
        try {
            iArr[VelocityTracker1D$Strategy.Impulse.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VelocityTracker1D$Strategy.Lsq2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f37693a = iArr;
    }
}
