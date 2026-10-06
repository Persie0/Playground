package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxg extends bwl {

    /* JADX INFO: renamed from: b */
    private static final byte[] f4691b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(f4192a);

    @Override // p000.bqn
    /* JADX INFO: renamed from: a */
    public final void mo2922a(MessageDigest messageDigest) {
        messageDigest.update(f4691b);
    }

    @Override // p000.bwl
    /* JADX INFO: renamed from: c */
    protected final Bitmap mo3132c(bti btiVar, Bitmap bitmap, int i, int i2) {
        return bxq.m3169c(btiVar, bitmap, i, i2);
    }

    @Override // p000.bqn
    public final boolean equals(Object obj) {
        return obj instanceof bxg;
    }

    @Override // p000.bqn
    public final int hashCode() {
        return 1572326941;
    }
}
