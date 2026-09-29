package p001a0;

import p387t0.C9169u;

/* JADX INFO: renamed from: a0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0005d {

    /* JADX INFO: renamed from: a */
    public final long f2a;

    /* JADX INFO: renamed from: b */
    public final long f3b;

    public C0005d(long j10, long j11) {
        this.f2a = j10;
        this.f3b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0005d)) {
            return false;
        }
        C0005d c0005d = (C0005d) obj;
        return C9169u.m17497c(this.f2a, c0005d.f2a) && C9169u.m17497c(this.f3b, c0005d.f3b);
    }

    public final int hashCode() {
        int i10 = C9169u.f47704g;
        return Long.hashCode(this.f3b) + (Long.hashCode(this.f2a) * 31);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) C9169u.m17503i(this.f2a)) + ", selectionBackgroundColor=" + ((Object) C9169u.m17503i(this.f3b)) + ')';
    }
}
