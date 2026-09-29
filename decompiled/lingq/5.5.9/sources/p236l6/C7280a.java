package p236l6;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p258m6.C7492l;
import p356r5.InterfaceC8732b;

/* JADX INFO: renamed from: l6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7280a implements InterfaceC8732b {

    /* JADX INFO: renamed from: b */
    public final int f40793b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8732b f40794c;

    public C7280a(int i10, InterfaceC8732b interfaceC8732b) {
        this.f40793b = i10;
        this.f40794c = interfaceC8732b;
    }

    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        this.f40794c.mo162b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f40793b).array());
    }

    @Override // p356r5.InterfaceC8732b
    public final boolean equals(Object obj) {
        if (!(obj instanceof C7280a)) {
            return false;
        }
        C7280a c7280a = (C7280a) obj;
        return this.f40793b == c7280a.f40793b && this.f40794c.equals(c7280a.f40794c);
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        return C7492l.m14885f(this.f40793b, this.f40794c);
    }
}
