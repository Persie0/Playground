package p494y;

import androidx.compose.p017ui.unit.LayoutDirection;
import dm.C5207g;
import dm.C5212l;
import p338qd.C8573r0;
import p375s0.C8941c;
import p375s0.C8942d;
import p375s0.C8943e;
import p387t0.AbstractC9134a0;

/* JADX INFO: renamed from: y.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10274e extends AbstractC10270a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10274e(InterfaceC10271b interfaceC10271b, InterfaceC10271b interfaceC10271b2, InterfaceC10271b interfaceC10271b3, InterfaceC10271b interfaceC10271b4) {
        super(interfaceC10271b, interfaceC10271b2, interfaceC10271b3, interfaceC10271b4);
        C5207g.m11111f(interfaceC10271b, "topStart");
        C5207g.m11111f(interfaceC10271b2, "topEnd");
        C5207g.m11111f(interfaceC10271b3, "bottomEnd");
        C5207g.m11111f(interfaceC10271b4, "bottomStart");
    }

    @Override // p494y.AbstractC10270a
    /* JADX INFO: renamed from: b */
    public final C10274e mo19241b(InterfaceC10271b interfaceC10271b, InterfaceC10271b interfaceC10271b2, InterfaceC10271b interfaceC10271b3, InterfaceC10271b interfaceC10271b4) {
        C5207g.m11111f(interfaceC10271b, "topStart");
        C5207g.m11111f(interfaceC10271b2, "topEnd");
        C5207g.m11111f(interfaceC10271b3, "bottomEnd");
        C5207g.m11111f(interfaceC10271b4, "bottomStart");
        return new C10274e(interfaceC10271b, interfaceC10271b2, interfaceC10271b3, interfaceC10271b4);
    }

    @Override // p494y.AbstractC10270a
    /* JADX INFO: renamed from: d */
    public final AbstractC9134a0 mo19242d(long j10, float f3, float f10, float f11, float f12, LayoutDirection layoutDirection) {
        C5207g.m11111f(layoutDirection, "layoutDirection");
        if (((f3 + f10) + f11) + f12 == 0.0f) {
            return new AbstractC9134a0.b(C5212l.m11165l(C8941c.f46888b, j10));
        }
        C8942d c8942dM11165l = C5212l.m11165l(C8941c.f46888b, j10);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f13 = layoutDirection == layoutDirection2 ? f3 : f10;
        long jM16741n = C8573r0.m16741n(f13, f13);
        float f14 = layoutDirection == layoutDirection2 ? f10 : f3;
        long jM16741n2 = C8573r0.m16741n(f14, f14);
        float f15 = layoutDirection == layoutDirection2 ? f11 : f12;
        long jM16741n3 = C8573r0.m16741n(f15, f15);
        float f16 = layoutDirection == layoutDirection2 ? f12 : f11;
        return new AbstractC9134a0.c(new C8943e(c8942dM11165l.f46894a, c8942dM11165l.f46895b, c8942dM11165l.f46896c, c8942dM11165l.f46897d, jM16741n, jM16741n2, jM16741n3, C8573r0.m16741n(f16, f16)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10274e)) {
            return false;
        }
        C10274e c10274e = (C10274e) obj;
        if (!C5207g.m11106a(this.f51713a, c10274e.f51713a)) {
            return false;
        }
        if (!C5207g.m11106a(this.f51714b, c10274e.f51714b)) {
            return false;
        }
        if (C5207g.m11106a(this.f51715c, c10274e.f51715c)) {
            return C5207g.m11106a(this.f51716d, c10274e.f51716d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51716d.hashCode() + ((this.f51715c.hashCode() + ((this.f51714b.hashCode() + (this.f51713a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f51713a + ", topEnd = " + this.f51714b + ", bottomEnd = " + this.f51715c + ", bottomStart = " + this.f51716d + ')';
    }
}
