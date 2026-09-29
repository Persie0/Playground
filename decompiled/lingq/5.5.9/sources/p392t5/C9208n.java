package p392t5;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p258m6.C7489i;
import p258m6.C7492l;
import p356r5.C8735e;
import p356r5.InterfaceC8732b;
import p356r5.InterfaceC8738h;
import p407u5.InterfaceC9451b;

/* JADX INFO: renamed from: t5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9208n implements InterfaceC8732b {

    /* JADX INFO: renamed from: j */
    public static final C7489i<Class<?>, byte[]> f47769j = new C7489i<>(50);

    /* JADX INFO: renamed from: b */
    public final InterfaceC9451b f47770b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8732b f47771c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8732b f47772d;

    /* JADX INFO: renamed from: e */
    public final int f47773e;

    /* JADX INFO: renamed from: f */
    public final int f47774f;

    /* JADX INFO: renamed from: g */
    public final Class<?> f47775g;

    /* JADX INFO: renamed from: h */
    public final C8735e f47776h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC8738h<?> f47777i;

    public C9208n(InterfaceC9451b interfaceC9451b, InterfaceC8732b interfaceC8732b, InterfaceC8732b interfaceC8732b2, int i10, int i11, InterfaceC8738h<?> interfaceC8738h, Class<?> cls, C8735e c8735e) {
        this.f47770b = interfaceC9451b;
        this.f47771c = interfaceC8732b;
        this.f47772d = interfaceC8732b2;
        this.f47773e = i10;
        this.f47774f = i11;
        this.f47777i = interfaceC8738h;
        this.f47775g = cls;
        this.f47776h = c8735e;
    }

    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        InterfaceC9451b interfaceC9451b = this.f47770b;
        byte[] bArr = (byte[]) interfaceC9451b.mo17853e();
        ByteBuffer.wrap(bArr).putInt(this.f47773e).putInt(this.f47774f).array();
        this.f47772d.mo162b(messageDigest);
        this.f47771c.mo162b(messageDigest);
        messageDigest.update(bArr);
        InterfaceC8738h<?> interfaceC8738h = this.f47777i;
        if (interfaceC8738h != null) {
            interfaceC8738h.mo162b(messageDigest);
        }
        this.f47776h.mo162b(messageDigest);
        C7489i<Class<?>, byte[]> c7489i = f47769j;
        Class<?> cls = this.f47775g;
        byte[] bArrM14873a = c7489i.m14873a(cls);
        if (bArrM14873a == null) {
            bArrM14873a = cls.getName().getBytes(InterfaceC8732b.f46324a);
            c7489i.m14876d(cls, bArrM14873a);
        }
        messageDigest.update(bArrM14873a);
        interfaceC9451b.mo17851c(bArr);
    }

    @Override // p356r5.InterfaceC8732b
    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof C9208n) {
            C9208n c9208n = (C9208n) obj;
            if (this.f47774f == c9208n.f47774f && this.f47773e == c9208n.f47773e && C7492l.m14881b(this.f47777i, c9208n.f47777i) && this.f47775g.equals(c9208n.f47775g) && this.f47771c.equals(c9208n.f47771c) && this.f47772d.equals(c9208n.f47772d) && this.f47776h.equals(c9208n.f47776h)) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        int iHashCode = ((((this.f47772d.hashCode() + (this.f47771c.hashCode() * 31)) * 31) + this.f47773e) * 31) + this.f47774f;
        InterfaceC8738h<?> interfaceC8738h = this.f47777i;
        if (interfaceC8738h != null) {
            iHashCode = (iHashCode * 31) + interfaceC8738h.hashCode();
        }
        return this.f47776h.hashCode() + ((this.f47775g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f47771c + ", signature=" + this.f47772d + ", width=" + this.f47773e + ", height=" + this.f47774f + ", decodedResourceClass=" + this.f47775g + ", transformation='" + this.f47777i + "', options=" + this.f47776h + '}';
    }
}
