package p000;

import com.airbnb.lottie.utils.OffscreenLayer$RenderStrategy;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class eq6 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f37709a;

    static {
        int[] iArr = new int[OffscreenLayer$RenderStrategy.values().length];
        f37709a = iArr;
        try {
            iArr[OffscreenLayer$RenderStrategy.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f37709a[OffscreenLayer$RenderStrategy.SAVE_LAYER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f37709a[OffscreenLayer$RenderStrategy.BITMAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f37709a[OffscreenLayer$RenderStrategy.RENDER_NODE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
