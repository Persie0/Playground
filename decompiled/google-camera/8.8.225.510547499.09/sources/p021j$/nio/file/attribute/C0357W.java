package p021j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;

/* JADX INFO: renamed from: j$.nio.file.attribute.W */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0357W extends AbstractC0359Y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UserPrincipalLookupService f32852a;

    private /* synthetic */ C0357W(UserPrincipalLookupService userPrincipalLookupService) {
        this.f32852a = userPrincipalLookupService;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ AbstractC0359Y m12150e(UserPrincipalLookupService userPrincipalLookupService) {
        if (userPrincipalLookupService == null) {
            return null;
        }
        return userPrincipalLookupService instanceof C0358X ? ((C0358X) userPrincipalLookupService).f32853a : new C0357W(userPrincipalLookupService);
    }

    @Override // p021j$.nio.file.attribute.AbstractC0359Y
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0343H mo12151a(String str) {
        return C0341F.m12128a(this.f32852a.lookupPrincipalByGroupName(str));
    }

    @Override // p021j$.nio.file.attribute.AbstractC0359Y
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0356V mo12152b(String str) {
        return C0354T.m12148a(this.f32852a.lookupPrincipalByName(str));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0357W) {
            obj = ((C0357W) obj).f32852a;
        }
        return this.f32852a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32852a.hashCode();
    }
}
