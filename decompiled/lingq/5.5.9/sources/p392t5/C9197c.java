package p392t5;

import java.security.MessageDigest;
import p356r5.InterfaceC8732b;

/* JADX INFO: renamed from: t5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9197c implements InterfaceC8732b {

    /* JADX INFO: renamed from: b */
    public final InterfaceC8732b f47738b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8732b f47739c;

    public C9197c(InterfaceC8732b interfaceC8732b, InterfaceC8732b interfaceC8732b2) {
        this.f47738b = interfaceC8732b;
        this.f47739c = interfaceC8732b2;
    }

    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        this.f47738b.mo162b(messageDigest);
        this.f47739c.mo162b(messageDigest);
    }

    @Override // p356r5.InterfaceC8732b
    public final boolean equals(Object obj) {
        if (!(obj instanceof C9197c)) {
            return false;
        }
        C9197c c9197c = (C9197c) obj;
        return this.f47738b.equals(c9197c.f47738b) && this.f47739c.equals(c9197c.f47739c);
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        return this.f47739c.hashCode() + (this.f47738b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f47738b + ", signature=" + this.f47739c + '}';
    }
}
