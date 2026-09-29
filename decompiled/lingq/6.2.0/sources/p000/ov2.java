package p000;

import coil.decode.ExifOrientationPolicy;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ov2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f55030a;

    static {
        int[] iArr = new int[ExifOrientationPolicy.values().length];
        try {
            iArr[ExifOrientationPolicy.RESPECT_PERFORMANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExifOrientationPolicy.IGNORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExifOrientationPolicy.RESPECT_ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f55030a = iArr;
    }
}
