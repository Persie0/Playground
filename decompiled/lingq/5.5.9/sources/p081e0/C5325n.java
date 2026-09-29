package p081e0;

import cm.InterfaceC2052l;
import dm.C5207g;

/* JADX INFO: renamed from: e0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C5325n implements InterfaceC5338t0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<C5329p, InterfaceC5327o> f33596a;

    /* JADX INFO: renamed from: b */
    public InterfaceC5327o f33597b;

    /* JADX WARN: Multi-variable type inference failed */
    public C5325n(InterfaceC2052l<? super C5329p, ? extends InterfaceC5327o> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "effect");
        this.f33596a = interfaceC2052l;
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: a */
    public final void mo1536a() {
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: b */
    public final void mo1537b() {
        InterfaceC5327o interfaceC5327o = this.f33597b;
        if (interfaceC5327o != null) {
            interfaceC5327o.mo2504a();
        }
        this.f33597b = null;
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: c */
    public final void mo1538c() {
        this.f33597b = this.f33596a.mo528n(C5333r.f33609a);
    }
}
