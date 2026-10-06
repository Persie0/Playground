package p021j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: j$.nio.file.attribute.U */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0355U implements UserPrincipal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0356V f32851a;

    private /* synthetic */ C0355U(InterfaceC0356V interfaceC0356V) {
        this.f32851a = interfaceC0356V;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ UserPrincipal m12149a(InterfaceC0356V interfaceC0356V) {
        if (interfaceC0356V == null) {
            return null;
        }
        if (interfaceC0356V instanceof C0354T) {
            return ((C0354T) interfaceC0356V).f32850a;
        }
        return interfaceC0356V instanceof InterfaceC0343H ? C0342G.m12129a((InterfaceC0343H) interfaceC0356V) : new C0355U(interfaceC0356V);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0356V interfaceC0356V = this.f32851a;
        if (obj instanceof C0355U) {
            obj = ((C0355U) obj).f32851a;
        }
        return interfaceC0356V.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f32851a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f32851a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f32851a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f32851a.toString();
    }
}
