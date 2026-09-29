package jp;

import dm.C5207g;
import no.C7843k;
import no.InterfaceC7840j;
import p260m8.C7499b;
import retrofit2.HttpException;

/* JADX INFO: renamed from: jp.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C6543k implements InterfaceC6536d<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7840j f37222a;

    public C6543k(C7843k c7843k) {
        this.f37222a = c7843k;
    }

    @Override // jp.InterfaceC6536d
    /* JADX INFO: renamed from: a */
    public final void mo13129a(InterfaceC6534b<Object> interfaceC6534b, Throwable th2) {
        C5207g.m11112g(interfaceC6534b, "call");
        C5207g.m11112g(th2, "t");
        this.f37222a.mo2031y(C7499b.m14967u(th2));
    }

    @Override // jp.InterfaceC6536d
    /* JADX INFO: renamed from: b */
    public final void mo13130b(InterfaceC6534b<Object> interfaceC6534b, C6553u<Object> c6553u) {
        C5207g.m11112g(interfaceC6534b, "call");
        C5207g.m11112g(c6553u, "response");
        boolean zM17350l = c6553u.f37338a.m17350l();
        InterfaceC7840j interfaceC7840j = this.f37222a;
        if (zM17350l) {
            interfaceC7840j.mo2031y(c6553u.f37339b);
        } else {
            interfaceC7840j.mo2031y(C7499b.m14967u(new HttpException(c6553u)));
        }
    }
}
