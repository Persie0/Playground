package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w */
/* JADX INFO: loaded from: classes.dex */
public class C0875w {

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC0848i0 f5943a;

    /* JADX INFO: renamed from: b */
    public volatile ByteString f5944b;

    static {
        C0855m.m3406a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final InterfaceC0848i0 m3445a(InterfaceC0848i0 interfaceC0848i0) {
        if (this.f5943a == null) {
            synchronized (this) {
                if (this.f5943a == null) {
                    try {
                        this.f5943a = interfaceC0848i0;
                        this.f5944b = ByteString.f5793b;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f5943a = interfaceC0848i0;
                        this.f5944b = ByteString.f5793b;
                    }
                }
            }
        }
        return this.f5943a;
    }

    /* JADX INFO: renamed from: b */
    public final ByteString m3446b() {
        if (this.f5944b != null) {
            return this.f5944b;
        }
        synchronized (this) {
            if (this.f5944b != null) {
                return this.f5944b;
            }
            if (this.f5943a == null) {
                this.f5944b = ByteString.f5793b;
            } else {
                this.f5944b = this.f5943a.mo3163g();
            }
            return this.f5944b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0875w)) {
            return false;
        }
        C0875w c0875w = (C0875w) obj;
        InterfaceC0848i0 interfaceC0848i0 = this.f5943a;
        InterfaceC0848i0 interfaceC0848i1 = c0875w.f5943a;
        if (interfaceC0848i0 == null && interfaceC0848i1 == null) {
            return m3446b().equals(c0875w.m3446b());
        }
        if (interfaceC0848i0 == null || interfaceC0848i1 == null) {
            return interfaceC0848i0 != null ? interfaceC0848i0.equals(c0875w.m3445a(interfaceC0848i0.mo3132f())) : m3445a(interfaceC0848i1.mo3132f()).equals(interfaceC0848i1);
        }
        return interfaceC0848i0.equals(interfaceC0848i1);
    }

    public int hashCode() {
        return 1;
    }
}
