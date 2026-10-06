package p000;

import android.graphics.Bitmap;
import android.graphics.Paint;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwo extends bwl {

    /* JADX INFO: renamed from: b */
    private static final byte[] f4662b = hiCTUJiAxf.HSzPf.getBytes(f4192a);

    @Override // p000.bqn
    /* JADX INFO: renamed from: a */
    public final void mo2922a(MessageDigest messageDigest) {
        messageDigest.update(f4662b);
    }

    @Override // p000.bwl
    /* JADX INFO: renamed from: c */
    protected final Bitmap mo3132c(bti btiVar, Bitmap bitmap, int i, int i2) {
        Paint paint = bxq.f4715a;
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? bxq.m3169c(btiVar, bitmap, i, i2) : bitmap;
    }

    @Override // p000.bqn
    public final boolean equals(Object obj) {
        return obj instanceof bwo;
    }

    @Override // p000.bqn
    public final int hashCode() {
        return -670243078;
    }
}
