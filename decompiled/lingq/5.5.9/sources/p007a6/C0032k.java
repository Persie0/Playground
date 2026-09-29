package p007a6;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import p356r5.InterfaceC8732b;
import p407u5.InterfaceC9452c;

/* JADX INFO: renamed from: a6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0032k extends AbstractC0029h {

    /* JADX INFO: renamed from: b */
    public static final byte[] f28b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC8732b.f46324a);

    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        messageDigest.update(f28b);
    }

    @Override // p007a6.AbstractC0029h
    /* JADX INFO: renamed from: c */
    public final Bitmap mo161c(InterfaceC9452c interfaceC9452c, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        Paint paint = C0043v.f51a;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            width2 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo17857e = interfaceC9452c.mo17857e(i10, i11, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo17857e.setHasAlpha(bitmap.hasAlpha());
        C0043v.m170a(bitmap, bitmapMo17857e, matrix);
        return bitmapMo17857e;
    }

    @Override // p356r5.InterfaceC8732b
    public final boolean equals(Object obj) {
        return obj instanceof C0032k;
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        return -599754482;
    }
}
