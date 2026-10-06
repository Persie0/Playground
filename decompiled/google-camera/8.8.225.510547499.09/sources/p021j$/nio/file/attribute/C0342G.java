package p021j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: j$.nio.file.attribute.G */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0342G implements GroupPrincipal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0343H f32842a;

    private /* synthetic */ C0342G(InterfaceC0343H interfaceC0343H) {
        this.f32842a = interfaceC0343H;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ GroupPrincipal m12129a(InterfaceC0343H interfaceC0343H) {
        if (interfaceC0343H == null) {
            return null;
        }
        return interfaceC0343H instanceof C0341F ? ((C0341F) interfaceC0343H).f32841a : new C0342G(interfaceC0343H);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0343H interfaceC0343H = this.f32842a;
        if (obj instanceof C0342G) {
            obj = ((C0342G) obj).f32842a;
        }
        return interfaceC0343H.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return ((C0341F) this.f32842a).getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f32842a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return ((C0341F) this.f32842a).implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return ((C0341F) this.f32842a).toString();
    }
}
