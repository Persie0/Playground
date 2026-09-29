package p236l6;

import ae.C0062b;
import java.security.MessageDigest;
import p356r5.InterfaceC8732b;

/* JADX INFO: renamed from: l6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7283d implements InterfaceC8732b {

    /* JADX INFO: renamed from: b */
    public final Object f40797b;

    public C7283d(Object obj) {
        C0062b.m345f0(obj);
        this.f40797b = obj;
    }

    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        messageDigest.update(this.f40797b.toString().getBytes(InterfaceC8732b.f46324a));
    }

    @Override // p356r5.InterfaceC8732b
    public final boolean equals(Object obj) {
        if (obj instanceof C7283d) {
            return this.f40797b.equals(((C7283d) obj).f40797b);
        }
        return false;
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        return this.f40797b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f40797b + '}';
    }
}
