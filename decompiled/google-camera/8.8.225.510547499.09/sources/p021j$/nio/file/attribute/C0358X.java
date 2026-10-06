package p021j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

/* JADX INFO: renamed from: j$.nio.file.attribute.X */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0358X extends UserPrincipalLookupService {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0359Y f32853a;

    private /* synthetic */ C0358X(AbstractC0359Y abstractC0359Y) {
        this.f32853a = abstractC0359Y;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ UserPrincipalLookupService m12153a(AbstractC0359Y abstractC0359Y) {
        if (abstractC0359Y == null) {
            return null;
        }
        return abstractC0359Y instanceof C0357W ? ((C0357W) abstractC0359Y).f32852a : new C0358X(abstractC0359Y);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0359Y abstractC0359Y = this.f32853a;
        if (obj instanceof C0358X) {
            obj = ((C0358X) obj).f32853a;
        }
        return abstractC0359Y.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32853a.hashCode();
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ GroupPrincipal lookupPrincipalByGroupName(String str) {
        return C0342G.m12129a(this.f32853a.mo12151a(str));
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ UserPrincipal lookupPrincipalByName(String str) {
        return C0355U.m12149a(this.f32853a.mo12152b(str));
    }
}
