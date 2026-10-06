package p021j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.List;

/* JADX INFO: renamed from: j$.nio.file.attribute.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0360a implements InterfaceC0362c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AclFileAttributeView f32854a;

    private /* synthetic */ C0360a(AclFileAttributeView aclFileAttributeView) {
        this.f32854a = aclFileAttributeView;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC0362c m12156c(AclFileAttributeView aclFileAttributeView) {
        if (aclFileAttributeView == null) {
            return null;
        }
        return aclFileAttributeView instanceof C0361b ? ((C0361b) aclFileAttributeView).f32855a : new C0360a(aclFileAttributeView);
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0385z
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo12131b(InterfaceC0356V interfaceC0356V) throws IOException {
        this.f32854a.setOwner(C0355U.m12149a(interfaceC0356V));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List m12157d() {
        return this.f32854a.getAcl();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m12158e(List list) throws IOException {
        this.f32854a.setAcl(list);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0360a) {
            obj = ((C0360a) obj).f32854a;
        }
        return this.f32854a.equals(obj);
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0385z
    public final /* synthetic */ InterfaceC0356V getOwner() {
        return C0354T.m12148a(this.f32854a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f32854a.hashCode();
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0363d
    public final /* synthetic */ String name() {
        return this.f32854a.name();
    }
}
