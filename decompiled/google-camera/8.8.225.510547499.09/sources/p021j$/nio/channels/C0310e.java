package p021j$.nio.channels;

import java.nio.channels.CompletionHandler;

/* JADX INFO: renamed from: j$.nio.channels.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0310e implements CompletionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0311f f32813a;

    private /* synthetic */ C0310e(InterfaceC0311f interfaceC0311f) {
        this.f32813a = interfaceC0311f;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ CompletionHandler m12074a(InterfaceC0311f interfaceC0311f) {
        if (interfaceC0311f == null) {
            return null;
        }
        return interfaceC0311f instanceof C0309d ? ((C0309d) interfaceC0311f).f32812a : new C0310e(interfaceC0311f);
    }

    @Override // java.nio.channels.CompletionHandler
    public final /* synthetic */ void completed(Object obj, Object obj2) {
        ((C0309d) this.f32813a).m12072a(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0311f interfaceC0311f = this.f32813a;
        if (obj instanceof C0310e) {
            obj = ((C0310e) obj).f32813a;
        }
        return interfaceC0311f.equals(obj);
    }

    @Override // java.nio.channels.CompletionHandler
    public final /* synthetic */ void failed(Throwable th, Object obj) {
        ((C0309d) this.f32813a).m12073c(th, obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32813a.hashCode();
    }
}
