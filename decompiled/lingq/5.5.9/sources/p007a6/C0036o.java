package p007a6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C2085g;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import java.security.MessageDigest;
import p356r5.InterfaceC8738h;
import p392t5.InterfaceC9207m;
import p407u5.InterfaceC9452c;

/* JADX INFO: renamed from: a6.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0036o implements InterfaceC8738h<Drawable> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC8738h<Bitmap> f32b;

    /* JADX INFO: renamed from: c */
    public final boolean f33c;

    public C0036o(InterfaceC8738h<Bitmap> interfaceC8738h, boolean z10) {
        this.f32b = interfaceC8738h;
        this.f33c = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p356r5.InterfaceC8738h
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m mo160a(C2085g c2085g, InterfaceC9207m interfaceC9207m, int i10, int i11) {
        InterfaceC9452c interfaceC9452c = ComponentCallbacks2C2080b.m6235a(c2085g).f10550a;
        Drawable drawable = (Drawable) interfaceC9207m.get();
        C0028g c0028gM163a = C0035n.m163a(interfaceC9452c, drawable, i10, i11);
        if (c0028gM163a != null) {
            InterfaceC9207m interfaceC9207mMo160a = this.f32b.mo160a(c2085g, c0028gM163a, i10, i11);
            if (!interfaceC9207mMo160a.equals(c0028gM163a)) {
                return new C0028g(c2085g.getResources(), interfaceC9207mMo160a);
            }
            interfaceC9207mMo160a.mo157b();
            return interfaceC9207m;
        }
        if (!this.f33c) {
            return interfaceC9207m;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        this.f32b.mo162b(messageDigest);
    }

    @Override // p356r5.InterfaceC8732b
    public final boolean equals(Object obj) {
        if (obj instanceof C0036o) {
            return this.f32b.equals(((C0036o) obj).f32b);
        }
        return false;
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        return this.f32b.hashCode();
    }
}
