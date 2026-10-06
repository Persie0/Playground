package p021j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: j$.nio.file.attribute.T */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0354T implements InterfaceC0356V {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UserPrincipal f32850a;

    private /* synthetic */ C0354T(UserPrincipal userPrincipal) {
        this.f32850a = userPrincipal;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0356V m12148a(UserPrincipal userPrincipal) {
        if (userPrincipal == null) {
            return null;
        }
        if (userPrincipal instanceof C0355U) {
            return ((C0355U) userPrincipal).f32851a;
        }
        return userPrincipal instanceof GroupPrincipal ? C0341F.m12128a((GroupPrincipal) userPrincipal) : new C0354T(userPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0354T) {
            obj = ((C0354T) obj).f32850a;
        }
        return this.f32850a.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f32850a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f32850a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f32850a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f32850a.toString();
    }
}
