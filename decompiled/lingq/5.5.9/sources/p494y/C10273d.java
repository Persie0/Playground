package p494y;

import dm.C5207g;
import p375s0.C8944f;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: y.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10273d implements InterfaceC10271b {

    /* JADX INFO: renamed from: a */
    public final float f51718a;

    public C10273d(float f3) {
        this.f51718a = f3;
        if (f3 < 0.0f || f3 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // p494y.InterfaceC10271b
    /* JADX INFO: renamed from: a */
    public final float mo19243a(long j10, InterfaceC10015c interfaceC10015c) {
        C5207g.m11111f(interfaceC10015c, "density");
        return (this.f51718a / 100.0f) * C8944f.m17176c(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10273d) && Float.compare(this.f51718a, ((C10273d) obj).f51718a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f51718a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f51718a + "%)";
    }
}
