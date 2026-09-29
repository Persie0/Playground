package p350r;

import cm.InterfaceC2052l;
import dm.C5207g;
import p374s.C8904e0;
import p374s.InterfaceC8929r;
import p470x1.C10020h;
import p470x1.C10022j;

/* JADX INFO: renamed from: r.l */
/* JADX INFO: loaded from: classes.dex */
public final class C8678l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<C10022j, C10020h> f46268a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8929r<C10020h> f46269b;

    public C8678l(C8904e0 c8904e0, InterfaceC2052l interfaceC2052l) {
        this.f46268a = interfaceC2052l;
        this.f46269b = c8904e0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8678l)) {
            return false;
        }
        C8678l c8678l = (C8678l) obj;
        if (C5207g.m11106a(this.f46268a, c8678l.f46268a) && C5207g.m11106a(this.f46269b, c8678l.f46269b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46269b.hashCode() + (this.f46268a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f46268a + ", animationSpec=" + this.f46269b + ')';
    }
}
