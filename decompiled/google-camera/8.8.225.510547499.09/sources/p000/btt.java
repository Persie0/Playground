package p000;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class btt {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f4453a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f4453a = iArr;
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f4453a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f4453a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f4453a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
