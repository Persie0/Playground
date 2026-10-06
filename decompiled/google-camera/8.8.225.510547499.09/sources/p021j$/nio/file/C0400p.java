package p021j$.nio.file;

import java.nio.file.OpenOption;

/* JADX INFO: renamed from: j$.nio.file.p */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0400p implements OpenOption {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0401q f32886a;

    private /* synthetic */ C0400p(InterfaceC0401q interfaceC0401q) {
        this.f32886a = interfaceC0401q;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ OpenOption m12212a(InterfaceC0401q interfaceC0401q) {
        if (interfaceC0401q == null) {
            return null;
        }
        if (interfaceC0401q instanceof C0399o) {
            return ((C0399o) interfaceC0401q).f32885a;
        }
        if (interfaceC0401q instanceof LinkOption) {
            return AbstractC0335a.m12105d((LinkOption) interfaceC0401q);
        }
        return interfaceC0401q instanceof EnumC0315D ? AbstractC0335a.m12107f((EnumC0315D) interfaceC0401q) : new C0400p(interfaceC0401q);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0401q interfaceC0401q = this.f32886a;
        if (obj instanceof C0400p) {
            obj = ((C0400p) obj).f32886a;
        }
        return interfaceC0401q.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32886a.hashCode();
    }
}
