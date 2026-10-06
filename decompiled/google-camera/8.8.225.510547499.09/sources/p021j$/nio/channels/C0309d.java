package p021j$.nio.channels;

import java.nio.channels.CompletionHandler;

/* JADX INFO: renamed from: j$.nio.channels.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0309d implements InterfaceC0311f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f32812a;

    private /* synthetic */ C0309d(CompletionHandler completionHandler) {
        this.f32812a = completionHandler;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC0311f m12071b(CompletionHandler completionHandler) {
        if (completionHandler == null) {
            return null;
        }
        return completionHandler instanceof C0310e ? ((C0310e) completionHandler).f32813a : new C0309d(completionHandler);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m12072a(Object obj, Object obj2) {
        this.f32812a.completed(obj, obj2);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m12073c(Throwable th, Object obj) {
        this.f32812a.failed(th, obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0309d) {
            obj = ((C0309d) obj).f32812a;
        }
        return this.f32812a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32812a.hashCode();
    }
}
