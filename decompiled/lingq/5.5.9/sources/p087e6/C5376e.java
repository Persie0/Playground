package p087e6;

import ae.C0062b;
import android.graphics.Bitmap;
import com.bumptech.glide.C2085g;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import java.security.MessageDigest;
import p007a6.C0028g;
import p356r5.InterfaceC8738h;
import p392t5.InterfaceC9207m;

/* JADX INFO: renamed from: e6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5376e implements InterfaceC8738h<C5374c> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC8738h<Bitmap> f33768b;

    public C5376e(InterfaceC8738h<Bitmap> interfaceC8738h) {
        C0062b.m345f0(interfaceC8738h);
        this.f33768b = interfaceC8738h;
    }

    @Override // p356r5.InterfaceC8738h
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m mo160a(C2085g c2085g, InterfaceC9207m interfaceC9207m, int i10, int i11) {
        C5374c c5374c = (C5374c) interfaceC9207m.get();
        C0028g c0028g = new C0028g(c5374c.f33757a.f33767a.f33780l, ComponentCallbacks2C2080b.m6235a(c2085g).f10550a);
        InterfaceC8738h<Bitmap> interfaceC8738h = this.f33768b;
        InterfaceC9207m interfaceC9207mMo160a = interfaceC8738h.mo160a(c2085g, c0028g, i10, i11);
        if (!c0028g.equals(interfaceC9207mMo160a)) {
            c0028g.mo157b();
        }
        c5374c.f33757a.f33767a.m11550c(interfaceC8738h, (Bitmap) interfaceC9207mMo160a.get());
        return interfaceC9207m;
    }

    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        this.f33768b.mo162b(messageDigest);
    }

    @Override // p356r5.InterfaceC8732b
    public final boolean equals(Object obj) {
        if (obj instanceof C5376e) {
            return this.f33768b.equals(((C5376e) obj).f33768b);
        }
        return false;
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        return this.f33768b.hashCode();
    }
}
