package p007a6;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import p356r5.InterfaceC8732b;
import p407u5.InterfaceC9452c;

/* JADX INFO: renamed from: a6.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0033l extends AbstractC0029h {

    /* JADX INFO: renamed from: b */
    public static final byte[] f29b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC8732b.f46324a);

    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        messageDigest.update(f29b);
    }

    @Override // p007a6.AbstractC0029h
    /* JADX INFO: renamed from: c */
    public final Bitmap mo161c(InterfaceC9452c interfaceC9452c, Bitmap bitmap, int i10, int i11) {
        Paint paint = C0043v.f51a;
        if (bitmap.getWidth() <= i10 && bitmap.getHeight() <= i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        bitmap = C0043v.m171b(interfaceC9452c, bitmap, i10, i11);
        return bitmap;
    }

    @Override // p356r5.InterfaceC8732b
    public final boolean equals(Object obj) {
        return obj instanceof C0033l;
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        return -670243078;
    }
}
