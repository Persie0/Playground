package p021j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.List;

/* JADX INFO: renamed from: j$.nio.file.attribute.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0361b implements AclFileAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0362c f32855a;

    private /* synthetic */ C0361b(InterfaceC0362c interfaceC0362c) {
        this.f32855a = interfaceC0362c;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ AclFileAttributeView m12159a(InterfaceC0362c interfaceC0362c) {
        if (interfaceC0362c == null) {
            return null;
        }
        return interfaceC0362c instanceof C0360a ? ((C0360a) interfaceC0362c).f32854a : new C0361b(interfaceC0362c);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0362c interfaceC0362c = this.f32855a;
        if (obj instanceof C0361b) {
            obj = ((C0361b) obj).f32855a;
        }
        return interfaceC0362c.equals(obj);
    }

    @Override // java.nio.file.attribute.AclFileAttributeView
    public final /* synthetic */ List getAcl() {
        return ((C0360a) this.f32855a).m12157d();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return C0355U.m12149a(((C0360a) this.f32855a).getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f32855a.hashCode();
    }

    @Override // java.nio.file.attribute.AclFileAttributeView, java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((C0360a) this.f32855a).name();
    }

    @Override // java.nio.file.attribute.AclFileAttributeView
    public final /* synthetic */ void setAcl(List list) throws IOException {
        ((C0360a) this.f32855a).m12158e(list);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) throws IOException {
        ((C0360a) this.f32855a).mo12131b(C0354T.m12148a(userPrincipal));
    }
}
