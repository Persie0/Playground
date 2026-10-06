package p021j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: j$.nio.file.F */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0317F implements InterfaceC0319H {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WatchEvent.Kind f32819a;

    private /* synthetic */ C0317F(WatchEvent.Kind kind) {
        this.f32819a = kind;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0319H m12076a(WatchEvent.Kind kind) {
        if (kind == null) {
            return null;
        }
        return kind instanceof C0318G ? ((C0318G) kind).f32822a : new C0317F(kind);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0317F) {
            obj = ((C0317F) obj).f32819a;
        }
        return this.f32819a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32819a.hashCode();
    }

    @Override // p021j$.nio.file.InterfaceC0319H
    public final /* synthetic */ String name() {
        return this.f32819a.name();
    }

    @Override // p021j$.nio.file.InterfaceC0319H
    public final /* synthetic */ Class type() {
        return this.f32819a.type();
    }
}
