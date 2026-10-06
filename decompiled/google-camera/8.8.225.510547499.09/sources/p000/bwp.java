package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwp extends bwl {

    /* JADX INFO: renamed from: b */
    private static final byte[] f4663b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(f4192a);

    @Override // p000.bqn
    /* JADX INFO: renamed from: a */
    public final void mo2922a(MessageDigest messageDigest) {
        messageDigest.update(f4663b);
    }

    @Override // p000.bwl
    /* JADX INFO: renamed from: c */
    protected final Bitmap mo3132c(bti btiVar, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapMo3042a;
        int iMin = Math.min(i, i2);
        float f = iMin;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f2 = width * fMax;
        float f3 = fMax * height;
        float f4 = (f - f2) / 2.0f;
        float f5 = (f - f3) / 2.0f;
        RectF rectF = new RectF(f4, f5, f2 + f4, f3 + f5);
        Bitmap.Config configM3167a = bxq.m3167a(bitmap);
        float f6 = f / 2.0f;
        if (configM3167a.equals(bitmap.getConfig())) {
            bitmapMo3042a = bitmap;
        } else {
            bitmapMo3042a = btiVar.mo3042a(bitmap.getWidth(), bitmap.getHeight(), configM3167a);
            new Canvas(bitmapMo3042a).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapMo3042a2 = btiVar.mo3042a(iMin, iMin, bxq.m3167a(bitmap));
        bitmapMo3042a2.setHasAlpha(true);
        bxq.f4717c.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo3042a2);
            canvas.drawCircle(f6, f6, f6, bxq.f4715a);
            canvas.drawBitmap(bitmapMo3042a, (Rect) null, rectF, bxq.f4716b);
            bxq.m3171e(canvas);
            bxq.f4717c.unlock();
            if (!bitmapMo3042a.equals(bitmap)) {
                btiVar.mo3045d(bitmapMo3042a);
            }
            return bitmapMo3042a2;
        } catch (Throwable th) {
            bxq.f4717c.unlock();
            throw th;
        }
    }

    @Override // p000.bqn
    public final boolean equals(Object obj) {
        return obj instanceof bwp;
    }

    @Override // p000.bqn
    public final int hashCode() {
        return 1101716364;
    }
}
