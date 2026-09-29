package jp;

import dm.C5207g;
import no.C7843k;
import no.InterfaceC7840j;
import p260m8.C7499b;

/* JADX INFO: renamed from: jp.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C6544l implements InterfaceC6536d<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7840j f37223a;

    public C6544l(C7843k c7843k) {
        this.f37223a = c7843k;
    }

    @Override // jp.InterfaceC6536d
    /* JADX INFO: renamed from: a */
    public final void mo13129a(InterfaceC6534b<Object> interfaceC6534b, Throwable th2) {
        C5207g.m11112g(interfaceC6534b, "call");
        C5207g.m11112g(th2, "t");
        this.f37223a.mo2031y(C7499b.m14967u(th2));
    }

    @Override // jp.InterfaceC6536d
    /* JADX INFO: renamed from: b */
    public final void mo13130b(InterfaceC6534b<Object> interfaceC6534b, C6553u<Object> c6553u) {
        C5207g.m11112g(interfaceC6534b, "call");
        C5207g.m11112g(c6553u, "response");
        this.f37223a.mo2031y(c6553u);
    }
}
