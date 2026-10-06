package p021j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: j$.nio.file.M */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0324M implements WatchEvent {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0325N f32827a;

    private /* synthetic */ C0324M(InterfaceC0325N interfaceC0325N) {
        this.f32827a = interfaceC0325N;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WatchEvent m12087a(InterfaceC0325N interfaceC0325N) {
        if (interfaceC0325N == null) {
            return null;
        }
        return interfaceC0325N instanceof C0323L ? ((C0323L) interfaceC0325N).f32825a : new C0324M(interfaceC0325N);
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ Object context() {
        return AbstractC0335a.m12109h(((C0323L) this.f32827a).m12084a());
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ int count() {
        return ((C0323L) this.f32827a).m12085c();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0325N interfaceC0325N = this.f32827a;
        if (obj instanceof C0324M) {
            obj = ((C0324M) obj).f32827a;
        }
        return interfaceC0325N.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32827a.hashCode();
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ WatchEvent.Kind kind() {
        return AbstractC0335a.m12108g(((C0323L) this.f32827a).m12086d());
    }
}
