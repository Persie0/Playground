package p127g1;

import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.unit.LayoutDirection;
import dm.C5207g;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: g1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5646j implements InterfaceC0524e, InterfaceC10015c {

    /* JADX INFO: renamed from: a */
    public final LayoutDirection f34490a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC10015c f34491b;

    public C5646j(InterfaceC10015c interfaceC10015c, LayoutDirection layoutDirection) {
        C5207g.m11111f(interfaceC10015c, "density");
        C5207g.m11111f(layoutDirection, "layoutDirection");
        this.f34490a = layoutDirection;
        this.f34491b = interfaceC10015c;
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: A0 */
    public final float mo1459A0(long j10) {
        return this.f34491b.mo1459A0(j10);
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: W */
    public final float mo1460W(int i10) {
        return this.f34491b.mo1460W(i10);
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: c0 */
    public final float mo1462c0() {
        return this.f34491b.mo1462c0();
    }

    @Override // p470x1.InterfaceC10015c
    public final float getDensity() {
        return this.f34491b.getDensity();
    }

    @Override // p127g1.InterfaceC5645i
    public final LayoutDirection getLayoutDirection() {
        return this.f34490a;
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: i0 */
    public final float mo1463i0(float f3) {
        return this.f34491b.mo1463i0(f3);
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: s0 */
    public final int mo1464s0(float f3) {
        return this.f34491b.mo1464s0(f3);
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: z0 */
    public final long mo1466z0(long j10) {
        return this.f34491b.mo1466z0(j10);
    }
}
