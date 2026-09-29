package no;

import cm.InterfaceC2052l;
import sl.C9072e;

/* JADX INFO: renamed from: no.s0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7868s0 extends AbstractC7834h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<Throwable, C9072e> f42965a;

    /* JADX WARN: Multi-variable type inference failed */
    public C7868s0(InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l) {
        this.f42965a = interfaceC2052l;
    }

    @Override // no.AbstractC7837i
    /* JADX INFO: renamed from: a */
    public final void mo14353a(Throwable th2) {
        this.f42965a.mo528n(th2);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C9072e mo528n(Throwable th2) {
        mo14353a(th2);
        return C9072e.f47360a;
    }

    public final String toString() {
        return "InvokeOnCancel[" + this.f42965a.getClass().getSimpleName() + '@' + C7814a0.m15551c(this) + ']';
    }
}
