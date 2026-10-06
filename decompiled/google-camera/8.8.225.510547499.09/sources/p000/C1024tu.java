package p000;

/* JADX INFO: renamed from: tu */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1024tu {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1015tl f47696a;

    /* JADX INFO: renamed from: b */
    public final C1091wg f47697b;

    public C1024tu(InterfaceC1015tl interfaceC1015tl, C1091wg c1091wg) {
        this.f47696a = interfaceC1015tl;
        this.f47697b = c1091wg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1024tu)) {
            return false;
        }
        C1024tu c1024tu = (C1024tu) obj;
        return ooc.m18737c(this.f47696a, c1024tu.f47696a) && ooc.m18737c(this.f47697b, c1024tu.f47697b);
    }

    public final int hashCode() {
        return (this.f47696a.hashCode() * 31) + this.f47697b.hashCode();
    }

    public final String toString() {
        return "ConfiguredCameraCaptureSession(session=" + this.f47696a + ", processor=" + this.f47697b + ')';
    }
}
