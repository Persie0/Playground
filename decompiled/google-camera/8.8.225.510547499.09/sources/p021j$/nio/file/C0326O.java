package p021j$.nio.file;

import java.nio.file.WatchKey;
import java.util.List;

/* JADX INFO: renamed from: j$.nio.file.O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0326O implements InterfaceC0328Q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WatchKey f32828a;

    private /* synthetic */ C0326O(WatchKey watchKey) {
        this.f32828a = watchKey;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC0328Q m12088b(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return watchKey instanceof C0327P ? ((C0327P) watchKey).f32829a : new C0326O(watchKey);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m12089a() {
        this.f32828a.cancel();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean m12090c() {
        return this.f32828a.isValid();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List m12091d() {
        return AbstractC0335a.m12116o(this.f32828a.pollEvents());
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m12092e() {
        return this.f32828a.reset();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0326O) {
            obj = ((C0326O) obj).f32828a;
        }
        return this.f32828a.equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0334X m12093f() {
        return C0332V.m12100a(this.f32828a.watchable());
    }

    public final /* synthetic */ int hashCode() {
        return this.f32828a.hashCode();
    }
}
