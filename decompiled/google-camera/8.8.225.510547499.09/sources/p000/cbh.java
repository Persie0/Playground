package p000;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class cbh {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f4954a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f4954a = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f4954a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f4954a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f4954a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f4954a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
