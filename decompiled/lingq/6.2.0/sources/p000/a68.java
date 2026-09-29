package p000;

import com.airbnb.lottie.RenderMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a68 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f297a;

    static {
        int[] iArr = new int[RenderMode.values().length];
        f297a = iArr;
        try {
            iArr[RenderMode.HARDWARE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f297a[RenderMode.SOFTWARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f297a[RenderMode.AUTOMATIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
