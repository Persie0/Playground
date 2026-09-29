package p000;

import com.airbnb.lottie.model.layer.Layer$MatteType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class vp4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f65759a;

    static {
        int[] iArr = new int[Layer$MatteType.values().length];
        f65759a = iArr;
        try {
            iArr[Layer$MatteType.LUMA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f65759a[Layer$MatteType.LUMA_INVERTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
