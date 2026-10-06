package p021j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: j$.nio.file.G */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0318G implements WatchEvent.Kind {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0319H f32822a;

    private /* synthetic */ C0318G(InterfaceC0319H interfaceC0319H) {
        this.f32822a = interfaceC0319H;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WatchEvent.Kind m12079a(InterfaceC0319H interfaceC0319H) {
        if (interfaceC0319H == null) {
            return null;
        }
        return interfaceC0319H instanceof C0317F ? ((C0317F) interfaceC0319H).f32819a : new C0318G(interfaceC0319H);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0319H interfaceC0319H = this.f32822a;
        if (obj instanceof C0318G) {
            obj = ((C0318G) obj).f32822a;
        }
        return interfaceC0319H.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32822a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ String name() {
        return this.f32822a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ Class type() {
        return this.f32822a.type();
    }
}
