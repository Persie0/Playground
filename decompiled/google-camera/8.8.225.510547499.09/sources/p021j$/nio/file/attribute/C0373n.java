package p021j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: j$.nio.file.attribute.n */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0373n implements DosFileAttributes {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0374o f32863a;

    private /* synthetic */ C0373n(InterfaceC0374o interfaceC0374o) {
        this.f32863a = interfaceC0374o;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ DosFileAttributes m12176a(InterfaceC0374o interfaceC0374o) {
        if (interfaceC0374o == null) {
            return null;
        }
        return interfaceC0374o instanceof C0372m ? ((C0372m) interfaceC0374o).f32862a : new C0373n(interfaceC0374o);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC0379t.m12182d(((C0372m) this.f32863a).creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0374o interfaceC0374o = this.f32863a;
        if (obj instanceof C0373n) {
            obj = ((C0373n) obj).f32863a;
        }
        return interfaceC0374o.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return ((C0372m) this.f32863a).fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f32863a.hashCode();
    }

    @Override // java.nio.file.attribute.DosFileAttributes
    public final /* synthetic */ boolean isArchive() {
        return ((C0372m) this.f32863a).m12172b();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return ((C0372m) this.f32863a).isDirectory();
    }

    @Override // java.nio.file.attribute.DosFileAttributes
    public final /* synthetic */ boolean isHidden() {
        return ((C0372m) this.f32863a).m12173c();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return ((C0372m) this.f32863a).isOther();
    }

    @Override // java.nio.file.attribute.DosFileAttributes
    public final /* synthetic */ boolean isReadOnly() {
        return ((C0372m) this.f32863a).m12174d();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return ((C0372m) this.f32863a).isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return ((C0372m) this.f32863a).isSymbolicLink();
    }

    @Override // java.nio.file.attribute.DosFileAttributes
    public final /* synthetic */ boolean isSystem() {
        return ((C0372m) this.f32863a).m12175e();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return AbstractC0379t.m12182d(((C0372m) this.f32863a).lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return AbstractC0379t.m12182d(((C0372m) this.f32863a).lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return ((C0372m) this.f32863a).size();
    }
}
