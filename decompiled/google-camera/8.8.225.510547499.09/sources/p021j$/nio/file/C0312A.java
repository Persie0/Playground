package p021j$.nio.file;

import java.nio.file.Path;
import java.nio.file.PathMatcher;

/* JADX INFO: renamed from: j$.nio.file.A */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0312A implements PathMatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0313B f32814a;

    private /* synthetic */ C0312A(InterfaceC0313B interfaceC0313B) {
        this.f32814a = interfaceC0313B;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ PathMatcher m12075a(InterfaceC0313B interfaceC0313B) {
        if (interfaceC0313B == null) {
            return null;
        }
        return interfaceC0313B instanceof C0413z ? ((C0413z) interfaceC0313B).f32900a : new C0312A(interfaceC0313B);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0313B interfaceC0313B = this.f32814a;
        if (obj instanceof C0312A) {
            obj = ((C0312A) obj).f32814a;
        }
        return interfaceC0313B.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32814a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(Path path) {
        return this.f32814a.mo11985a(C0403s.m12213a(path));
    }
}
