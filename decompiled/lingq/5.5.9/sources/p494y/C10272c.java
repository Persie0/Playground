package p494y;

import dm.C5207g;
import p470x1.C10017e;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: y.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10272c implements InterfaceC10271b {

    /* JADX INFO: renamed from: a */
    public final float f51717a;

    public C10272c(float f3) {
        this.f51717a = f3;
    }

    @Override // p494y.InterfaceC10271b
    /* JADX INFO: renamed from: a */
    public final float mo19243a(long j10, InterfaceC10015c interfaceC10015c) {
        C5207g.m11111f(interfaceC10015c, "density");
        return interfaceC10015c.mo1463i0(this.f51717a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10272c) && C10017e.m18618a(this.f51717a, ((C10272c) obj).f51717a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f51717a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f51717a + ".dp)";
    }
}
