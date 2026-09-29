package p350r;

import cm.InterfaceC2052l;
import dm.C5207g;
import p284o0.InterfaceC7885a;
import p374s.InterfaceC8929r;
import p470x1.C10022j;

/* JADX INFO: renamed from: r.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8669c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7885a f46251a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<C10022j, C10022j> f46252b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8929r<C10022j> f46253c;

    /* JADX INFO: renamed from: d */
    public final boolean f46254d;

    public C8669c(InterfaceC8929r interfaceC8929r, InterfaceC7885a interfaceC7885a, InterfaceC2052l interfaceC2052l, boolean z10) {
        this.f46251a = interfaceC7885a;
        this.f46252b = interfaceC2052l;
        this.f46253c = interfaceC8929r;
        this.f46254d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8669c)) {
            return false;
        }
        C8669c c8669c = (C8669c) obj;
        if (C5207g.m11106a(this.f46251a, c8669c.f46251a) && C5207g.m11106a(this.f46252b, c8669c.f46252b) && C5207g.m11106a(this.f46253c, c8669c.f46253c) && this.f46254d == c8669c.f46254d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = (this.f46253c.hashCode() + ((this.f46252b.hashCode() + (this.f46251a.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.f46254d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f46251a + ", size=" + this.f46252b + ", animationSpec=" + this.f46253c + ", clip=" + this.f46254d + ')';
    }
}
