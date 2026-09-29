package p387t0;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: t0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9145g {
    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config m17439a(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i10 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i10 == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i10 == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i10 == 4) {
            z10 = true;
        }
        return z10 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }
}
