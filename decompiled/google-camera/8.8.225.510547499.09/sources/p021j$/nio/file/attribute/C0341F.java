package p021j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: j$.nio.file.attribute.F */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0341F implements InterfaceC0343H {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GroupPrincipal f32841a;

    private /* synthetic */ C0341F(GroupPrincipal groupPrincipal) {
        this.f32841a = groupPrincipal;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0343H m12128a(GroupPrincipal groupPrincipal) {
        if (groupPrincipal == null) {
            return null;
        }
        return groupPrincipal instanceof C0342G ? ((C0342G) groupPrincipal).f32842a : new C0341F(groupPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0341F) {
            obj = ((C0341F) obj).f32841a;
        }
        return this.f32841a.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f32841a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f32841a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f32841a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f32841a.toString();
    }
}
