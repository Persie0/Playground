package p007a6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import p356r5.InterfaceC8732b;
import p407u5.InterfaceC9452c;

/* JADX INFO: renamed from: a6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0034m extends AbstractC0029h {

    /* JADX INFO: renamed from: b */
    public static final byte[] f30b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(InterfaceC8732b.f46324a);

    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        messageDigest.update(f30b);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p007a6.AbstractC0029h
    /* JADX INFO: renamed from: c */
    public final Bitmap mo161c(InterfaceC9452c interfaceC9452c, Bitmap bitmap, int i10, int i11) {
        Paint paint = C0043v.f51a;
        int iMin = Math.min(i10, i11);
        float f3 = iMin;
        float f10 = f3 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f3 / width, f3 / height);
        float f11 = width * fMax;
        float f12 = fMax * height;
        float f13 = (f3 - f11) / 2.0f;
        float f14 = (f3 - f12) / 2.0f;
        RectF rectF = new RectF(f13, f14, f11 + f13, f12 + f14);
        Bitmap bitmapM172c = C0043v.m172c(bitmap, interfaceC9452c);
        Bitmap bitmapMo17857e = interfaceC9452c.mo17857e(iMin, iMin, C0043v.m173d(bitmap));
        bitmapMo17857e.setHasAlpha(true);
        Lock lock = C0043v.f54d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo17857e);
            canvas.drawCircle(f10, f10, f10, C0043v.f52b);
            canvas.drawBitmap(bitmapM172c, (Rect) null, rectF, C0043v.f53c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapM172c.equals(bitmap)) {
                interfaceC9452c.mo164d(bitmapM172c);
            }
            return bitmapMo17857e;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // p356r5.InterfaceC8732b
    public final boolean equals(Object obj) {
        return obj instanceof C0034m;
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        return 1101716364;
    }
}
