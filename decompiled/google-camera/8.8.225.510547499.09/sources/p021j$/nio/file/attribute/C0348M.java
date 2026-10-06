package p021j$.nio.file.attribute;

import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;
import p021j$.nio.file.AbstractC0335a;

/* JADX INFO: renamed from: j$.nio.file.attribute.M */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0348M implements PosixFileAttributes {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0349N f32846a;

    private /* synthetic */ C0348M(InterfaceC0349N interfaceC0349N) {
        this.f32846a = interfaceC0349N;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ PosixFileAttributes m12140a(InterfaceC0349N interfaceC0349N) {
        if (interfaceC0349N == null) {
            return null;
        }
        return interfaceC0349N instanceof C0347L ? ((C0347L) interfaceC0349N).f32845a : new C0348M(interfaceC0349N);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC0379t.m12182d(((C0347L) this.f32846a).creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0349N interfaceC0349N = this.f32846a;
        if (obj instanceof C0348M) {
            obj = ((C0348M) obj).f32846a;
        }
        return interfaceC0349N.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return ((C0347L) this.f32846a).fileKey();
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ GroupPrincipal group() {
        return C0342G.m12129a(((C0347L) this.f32846a).m12137b());
    }

    public final /* synthetic */ int hashCode() {
        return this.f32846a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return ((C0347L) this.f32846a).isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return ((C0347L) this.f32846a).isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return ((C0347L) this.f32846a).isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return ((C0347L) this.f32846a).isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return AbstractC0379t.m12182d(((C0347L) this.f32846a).lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return AbstractC0379t.m12182d(((C0347L) this.f32846a).lastModifiedTime());
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ UserPrincipal owner() {
        return C0355U.m12149a(((C0347L) this.f32846a).m12138c());
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ Set permissions() {
        return AbstractC0335a.m12115n(((C0347L) this.f32846a).m12139d());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return ((C0347L) this.f32846a).size();
    }
}
