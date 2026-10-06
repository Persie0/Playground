package p021j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: j$.nio.file.J */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0321J implements WatchEvent.Modifier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0322K f32824a;

    private /* synthetic */ C0321J(InterfaceC0322K interfaceC0322K) {
        this.f32824a = interfaceC0322K;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WatchEvent.Modifier m12082a(InterfaceC0322K interfaceC0322K) {
        if (interfaceC0322K == null) {
            return null;
        }
        return interfaceC0322K instanceof C0320I ? ((C0320I) interfaceC0322K).f32823a : new C0321J(interfaceC0322K);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0322K interfaceC0322K = this.f32824a;
        if (obj instanceof C0321J) {
            obj = ((C0321J) obj).f32824a;
        }
        return interfaceC0322K.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32824a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Modifier
    public final /* synthetic */ String name() {
        return ((C0320I) this.f32824a).m12081b();
    }
}
