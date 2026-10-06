package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acy {
    /* JADX INFO: renamed from: a */
    static Drawable m251a(Drawable drawable, Drawable drawable2) {
        return new AdaptiveIconDrawable(drawable, drawable2);
    }

    /* JADX INFO: renamed from: b */
    static Icon m252b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    /* JADX INFO: renamed from: c */
    public static long m253c(long j, long j2) {
        return (j * j2) / 1000000;
    }
}
