package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: ki */
/* JADX INFO: loaded from: classes.dex */
public final class C3185ki {

    /* JADX INFO: renamed from: a */
    public final Bitmap f47311a;

    public C3185ki(Bitmap bitmap) {
        this.f47311a = bitmap;
    }

    /* JADX INFO: renamed from: a */
    public final int m15259a() {
        Bitmap.Config config = this.f47311a.getConfig();
        config.getClass();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }
}
