package p021j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: j$.nio.file.I */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0320I implements InterfaceC0322K {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WatchEvent.Modifier f32823a;

    private /* synthetic */ C0320I(WatchEvent.Modifier modifier) {
        this.f32823a = modifier;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0322K m12080a(WatchEvent.Modifier modifier) {
        if (modifier == null) {
            return null;
        }
        return modifier instanceof C0321J ? ((C0321J) modifier).f32824a : new C0320I(modifier);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String m12081b() {
        return this.f32823a.name();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0320I) {
            obj = ((C0320I) obj).f32823a;
        }
        return this.f32823a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32823a.hashCode();
    }
}
