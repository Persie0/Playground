package p000;

import com.airbnb.lottie.model.content.Mask$MaskMode;
import com.airbnb.lottie.model.layer.Layer$LayerType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class n90 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f52500a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f52501b;

    static {
        int[] iArr = new int[Mask$MaskMode.values().length];
        f52501b = iArr;
        try {
            iArr[Mask$MaskMode.MASK_MODE_NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f52501b[Mask$MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f52501b[Mask$MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f52501b[Mask$MaskMode.MASK_MODE_ADD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[Layer$LayerType.values().length];
        f52500a = iArr2;
        try {
            iArr2[Layer$LayerType.SHAPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f52500a[Layer$LayerType.PRE_COMP.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f52500a[Layer$LayerType.SOLID.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f52500a[Layer$LayerType.IMAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f52500a[Layer$LayerType.NULL.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f52500a[Layer$LayerType.TEXT.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f52500a[Layer$LayerType.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
