package p021j$.nio.file;

import java.nio.file.OpenOption;

/* JADX INFO: renamed from: j$.nio.file.o */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0399o implements InterfaceC0401q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ OpenOption f32885a;

    private /* synthetic */ C0399o(OpenOption openOption) {
        this.f32885a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.q, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.q, java.nio.file.LinkOption] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0401q m12211a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof C0400p) {
            return ((C0400p) openOption).f32886a;
        }
        if (openOption instanceof LinkOption) {
            return AbstractC0335a.m12105d((LinkOption) openOption);
        }
        return openOption instanceof EnumC0315D ? AbstractC0335a.m12107f((EnumC0315D) openOption) : new C0399o(openOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0399o) {
            obj = ((C0399o) obj).f32885a;
        }
        return this.f32885a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32885a.hashCode();
    }
}
