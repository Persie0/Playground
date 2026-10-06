package p021j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;
import p021j$.nio.file.AbstractC0335a;

/* JADX INFO: renamed from: j$.nio.file.attribute.J */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0345J implements PosixFileAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0346K f32844a;

    private /* synthetic */ C0345J(InterfaceC0346K interfaceC0346K) {
        this.f32844a = interfaceC0346K;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ PosixFileAttributeView m12135a(InterfaceC0346K interfaceC0346K) {
        if (interfaceC0346K == null) {
            return null;
        }
        return interfaceC0346K instanceof C0344I ? ((C0344I) interfaceC0346K).f32843a : new C0345J(interfaceC0346K);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0346K interfaceC0346K = this.f32844a;
        if (obj instanceof C0345J) {
            obj = ((C0345J) obj).f32844a;
        }
        return interfaceC0346K.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return C0355U.m12149a(((C0344I) this.f32844a).getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f32844a.hashCode();
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView, java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ String name() {
        return ((C0344I) this.f32844a).name();
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0368i.m12163a(((C0344I) this.f32844a).readAttributes());
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView
    public final /* synthetic */ void setGroup(GroupPrincipal groupPrincipal) throws IOException {
        ((C0344I) this.f32844a).m12133e(C0341F.m12128a(groupPrincipal));
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) throws IOException {
        ((C0344I) this.f32844a).mo12131b(C0354T.m12148a(userPrincipal));
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView
    public final /* synthetic */ void setPermissions(Set set) throws IOException {
        ((C0344I) this.f32844a).m12134f(AbstractC0335a.m12115n(set));
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        ((C0344I) this.f32844a).mo11974a(AbstractC0379t.m12180b(fileTime), AbstractC0379t.m12180b(fileTime2), AbstractC0379t.m12180b(fileTime3));
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ PosixFileAttributes readAttributes() {
        return C0348M.m12140a(((C0344I) this.f32844a).m12132d());
    }
}
