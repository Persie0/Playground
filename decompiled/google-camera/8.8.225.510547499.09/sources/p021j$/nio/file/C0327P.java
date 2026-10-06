package p021j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* JADX INFO: renamed from: j$.nio.file.P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0327P implements WatchKey {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0328Q f32829a;

    private /* synthetic */ C0327P(InterfaceC0328Q interfaceC0328Q) {
        this.f32829a = interfaceC0328Q;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WatchKey m12094a(InterfaceC0328Q interfaceC0328Q) {
        if (interfaceC0328Q == null) {
            return null;
        }
        return interfaceC0328Q instanceof C0326O ? ((C0326O) interfaceC0328Q).f32828a : new C0327P(interfaceC0328Q);
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ void cancel() {
        ((C0326O) this.f32829a).m12089a();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0328Q interfaceC0328Q = this.f32829a;
        if (obj instanceof C0327P) {
            obj = ((C0327P) obj).f32829a;
        }
        return interfaceC0328Q.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32829a.hashCode();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean isValid() {
        return ((C0326O) this.f32829a).m12090c();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ List pollEvents() {
        return AbstractC0335a.m12116o(((C0326O) this.f32829a).m12091d());
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean reset() {
        return ((C0326O) this.f32829a).m12092e();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ Watchable watchable() {
        return C0333W.m12101a(((C0326O) this.f32829a).m12093f());
    }
}
