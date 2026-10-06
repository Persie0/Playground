package p021j$.nio.file;

import java.nio.file.PathMatcher;

/* JADX INFO: renamed from: j$.nio.file.z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0413z implements InterfaceC0313B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PathMatcher f32900a;

    private /* synthetic */ C0413z(PathMatcher pathMatcher) {
        this.f32900a = pathMatcher;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC0313B m12220b(PathMatcher pathMatcher) {
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof C0312A ? ((C0312A) pathMatcher).f32814a : new C0413z(pathMatcher);
    }

    @Override // p021j$.nio.file.InterfaceC0313B
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean mo11985a(Path path) {
        return this.f32900a.matches(C0407t.m12219a(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0413z) {
            obj = ((C0413z) obj).f32900a;
        }
        return this.f32900a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32900a.hashCode();
    }
}
