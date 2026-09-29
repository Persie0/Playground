package p007a6;

import ae.C0062b;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import p258m6.C7492l;
import p356r5.InterfaceC8732b;
import p407u5.InterfaceC9452c;

/* JADX INFO: renamed from: a6.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0042u extends AbstractC0029h {

    /* JADX INFO: renamed from: c */
    public static final byte[] f49c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC8732b.f46324a);

    /* JADX INFO: renamed from: b */
    public final int f50b;

    public C0042u(int i10) {
        C0062b.m339d0("roundingRadius must be greater than 0.", i10 > 0);
        this.f50b = i10;
    }

    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        messageDigest.update(f49c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f50b).array());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p007a6.AbstractC0029h
    /* JADX INFO: renamed from: c */
    public final Bitmap mo161c(InterfaceC9452c interfaceC9452c, Bitmap bitmap, int i10, int i11) {
        Paint paint = C0043v.f51a;
        int i12 = this.f50b;
        C0062b.m339d0("roundingRadius must be greater than 0.", i12 > 0);
        Bitmap.Config configM173d = C0043v.m173d(bitmap);
        Bitmap bitmapM172c = C0043v.m172c(bitmap, interfaceC9452c);
        Bitmap bitmapMo17857e = interfaceC9452c.mo17857e(bitmapM172c.getWidth(), bitmapM172c.getHeight(), configM173d);
        bitmapMo17857e.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapM172c, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapMo17857e.getWidth(), bitmapMo17857e.getHeight());
        Lock lock = C0043v.f54d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo17857e);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f3 = i12;
            canvas.drawRoundRect(rectF, f3, f3, paint2);
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
        boolean z10 = false;
        if ((obj instanceof C0042u) && this.f50b == ((C0042u) obj).f50b) {
            z10 = true;
        }
        return z10;
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        char[] cArr = C7492l.f41383a;
        return ((this.f50b + 527) * 31) - 569625254;
    }
}
