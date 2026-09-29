package p007a6;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p356r5.InterfaceC8732b;
import p407u5.InterfaceC9452c;

/* JADX INFO: renamed from: a6.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0038q extends AbstractC0029h {

    /* JADX INFO: renamed from: b */
    public static final byte[] f34b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC8732b.f46324a);

    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        messageDigest.update(f34b);
    }

    @Override // p007a6.AbstractC0029h
    /* JADX INFO: renamed from: c */
    public final Bitmap mo161c(InterfaceC9452c interfaceC9452c, Bitmap bitmap, int i10, int i11) {
        return C0043v.m171b(interfaceC9452c, bitmap, i10, i11);
    }

    @Override // p356r5.InterfaceC8732b
    public final boolean equals(Object obj) {
        return obj instanceof C0038q;
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        return 1572326941;
    }
}
