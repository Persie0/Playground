package androidx.view;

import androidx.view.AbstractC1036h0;
import cm.InterfaceC2041a;
import dm.C5206f;
import dm.C5207g;
import km.InterfaceC6719b;
import p427v3.AbstractC9634a;
import sl.InterfaceC9070c;

/* JADX INFO: renamed from: androidx.lifecycle.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1038i0<VM extends AbstractC1036h0> implements InterfaceC9070c<VM> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6719b<VM> f6658a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2041a<C1046m0> f6659b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2041a<C1042k0.b> f6660c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2041a<AbstractC9634a> f6661d;

    /* JADX INFO: renamed from: e */
    public VM f6662e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1038i0(InterfaceC6719b<VM> interfaceC6719b, InterfaceC2041a<? extends C1046m0> interfaceC2041a, InterfaceC2041a<? extends C1042k0.b> interfaceC2041a2, InterfaceC2041a<? extends AbstractC9634a> interfaceC2041a3) {
        C5207g.m11111f(interfaceC6719b, "viewModelClass");
        this.f6658a = interfaceC6719b;
        this.f6659b = interfaceC2041a;
        this.f6660c = interfaceC2041a2;
        this.f6661d = interfaceC2041a3;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // sl.InterfaceC9070c
    /* JADX INFO: renamed from: b */
    public final boolean mo3942b() {
        throw null;
    }

    @Override // sl.InterfaceC9070c
    public final Object getValue() {
        VM vm2 = this.f6662e;
        if (vm2 == null) {
            vm2 = (VM) new C1042k0(this.f6659b.mo807E(), this.f6660c.mo807E(), this.f6661d.mo807E()).m3947a(C5206f.m10998T0(this.f6658a));
            this.f6662e = vm2;
        }
        return vm2;
    }
}
