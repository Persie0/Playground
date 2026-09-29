package p376s1;

import dm.C5207g;

/* JADX INFO: renamed from: s1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8947c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8949e f46914a;

    public C8947c(C8945a c8945a) {
        this.f46914a = c8945a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C8947c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C5207g.m11106a(this.f46914a.mo17180a(), ((C8947c) obj).f46914a.mo17180a());
    }

    public final int hashCode() {
        return this.f46914a.mo17180a().hashCode();
    }

    public final String toString() {
        return this.f46914a.mo17180a();
    }
}
