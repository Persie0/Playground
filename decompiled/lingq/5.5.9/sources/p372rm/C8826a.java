package p372rm;

import co.InterfaceC2076h;
import dm.C5207g;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7648e;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import p543do.InterfaceC5240k0;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: rm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8826a implements InterfaceC8847k0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8847k0 f46727a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8838g f46728b;

    /* JADX INFO: renamed from: c */
    public final int f46729c;

    public C8826a(InterfaceC8847k0 interfaceC8847k0, InterfaceC8838g interfaceC8838g, int i10) {
        C5207g.m11111f(interfaceC8838g, "declarationDescriptor");
        this.f46727a = interfaceC8847k0;
        this.f46728b = interfaceC8838g;
        this.f46729c = i10;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return (R) this.f46727a.mo11871C(interfaceC8842i, d10);
    }

    @Override // p372rm.InterfaceC8847k0
    /* JADX INFO: renamed from: L */
    public final boolean mo17087L() {
        return this.f46727a.mo17087L();
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: a */
    public final C7648e mo11874a() {
        return this.f46727a.mo11874a();
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8847k0 mo18004P0() {
        InterfaceC8847k0 interfaceC8847k0Mo18004P0 = this.f46727a.mo18004P0();
        C5207g.m11110e(interfaceC8847k0Mo18004P0, "originalDescriptor.original");
        return interfaceC8847k0Mo18004P0;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC8838g mo11876g() {
        return this.f46728b;
    }

    @Override // p372rm.InterfaceC8847k0
    public final int getIndex() {
        return this.f46727a.getIndex() + this.f46729c;
    }

    @Override // p372rm.InterfaceC8847k0
    public final List<AbstractC5257t> getUpperBounds() {
        return this.f46727a.getUpperBounds();
    }

    @Override // p372rm.InterfaceC8844j
    /* JADX INFO: renamed from: j */
    public final InterfaceC8837f0 mo11890j() {
        return this.f46727a.mo11890j();
    }

    @Override // p372rm.InterfaceC8847k0, p372rm.InterfaceC8834e
    /* JADX INFO: renamed from: k */
    public final InterfaceC5240k0 mo13600k() {
        return this.f46727a.mo13600k();
    }

    @Override // p372rm.InterfaceC8847k0
    /* JADX INFO: renamed from: n */
    public final Variance mo17088n() {
        return this.f46727a.mo17088n();
    }

    @Override // p372rm.InterfaceC8847k0
    /* JADX INFO: renamed from: o0 */
    public final InterfaceC2076h mo17089o0() {
        return this.f46727a.mo17089o0();
    }

    public final String toString() {
        return this.f46727a + "[inner-copy]";
    }

    @Override // p372rm.InterfaceC8834e
    /* JADX INFO: renamed from: v */
    public final AbstractC5265x mo5316v() {
        return this.f46727a.mo5316v();
    }

    @Override // p372rm.InterfaceC8847k0
    /* JADX INFO: renamed from: v0 */
    public final boolean mo17090v0() {
        return true;
    }

    @Override // sm.InterfaceC9073a
    /* JADX INFO: renamed from: w */
    public final InterfaceC9077e mo11289w() {
        return this.f46727a.mo11289w();
    }
}
