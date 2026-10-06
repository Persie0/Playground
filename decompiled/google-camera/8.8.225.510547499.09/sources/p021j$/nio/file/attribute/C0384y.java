package p021j$.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* JADX INFO: renamed from: j$.nio.file.attribute.y */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0384y implements FileOwnerAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0385z f32871a;

    private /* synthetic */ C0384y(InterfaceC0385z interfaceC0385z) {
        this.f32871a = interfaceC0385z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ FileOwnerAttributeView m12187a(InterfaceC0385z interfaceC0385z) {
        if (interfaceC0385z == null) {
            return null;
        }
        if (interfaceC0385z instanceof C0383x) {
            return ((C0383x) interfaceC0385z).f32870a;
        }
        if (interfaceC0385z instanceof InterfaceC0362c) {
            return C0361b.m12159a((InterfaceC0362c) interfaceC0385z);
        }
        return interfaceC0385z instanceof InterfaceC0346K ? C0345J.m12135a((InterfaceC0346K) interfaceC0385z) : new C0384y(interfaceC0385z);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0385z interfaceC0385z = this.f32871a;
        if (obj instanceof C0384y) {
            obj = ((C0384y) obj).f32871a;
        }
        return interfaceC0385z.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return C0355U.m12149a(this.f32871a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f32871a.hashCode();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f32871a.name();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) {
        this.f32871a.mo12131b(C0354T.m12148a(userPrincipal));
    }
}
