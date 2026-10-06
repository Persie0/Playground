package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwn extends bwl {

    /* JADX INFO: renamed from: b */
    private static final byte[] f4661b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f4192a);

    @Override // p000.bqn
    /* JADX INFO: renamed from: a */
    public final void mo2922a(MessageDigest messageDigest) {
        messageDigest.update(f4661b);
    }

    @Override // p000.bwl
    /* JADX INFO: renamed from: c */
    protected final Bitmap mo3132c(bti btiVar, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = bxq.f4715a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo3042a = btiVar.mo3042a(i, i2, bxq.m3168b(bitmap));
        bxq.m3172f(bitmap, bitmapMo3042a);
        bxq.m3170d(bitmap, bitmapMo3042a, matrix);
        return bitmapMo3042a;
    }

    @Override // p000.bqn
    public final boolean equals(Object obj) {
        return obj instanceof bwn;
    }

    @Override // p000.bqn
    public final int hashCode() {
        return -599754482;
    }
}
