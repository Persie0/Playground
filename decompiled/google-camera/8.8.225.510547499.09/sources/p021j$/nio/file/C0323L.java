package p021j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: j$.nio.file.L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0323L implements InterfaceC0325N {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WatchEvent f32825a;

    private /* synthetic */ C0323L(WatchEvent watchEvent) {
        this.f32825a = watchEvent;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC0325N m12083b(WatchEvent watchEvent) {
        if (watchEvent == null) {
            return null;
        }
        return watchEvent instanceof C0324M ? ((C0324M) watchEvent).f32827a : new C0323L(watchEvent);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object m12084a() {
        return AbstractC0335a.m12109h(this.f32825a.context());
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int m12085c() {
        return this.f32825a.count();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0319H m12086d() {
        return AbstractC0335a.m12103b(this.f32825a.kind());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0323L) {
            obj = ((C0323L) obj).f32825a;
        }
        return this.f32825a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32825a.hashCode();
    }
}
