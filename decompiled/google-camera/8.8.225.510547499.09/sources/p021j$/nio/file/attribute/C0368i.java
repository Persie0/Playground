package p021j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: j$.nio.file.attribute.i */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0368i implements BasicFileAttributes {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BasicFileAttributes f32859a;

    private /* synthetic */ C0368i(BasicFileAttributes basicFileAttributes) {
        this.f32859a = basicFileAttributes;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BasicFileAttributes m12163a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof C0367h) {
            return ((C0367h) basicFileAttributes).f32858a;
        }
        if (basicFileAttributes instanceof InterfaceC0374o) {
            return C0373n.m12176a((InterfaceC0374o) basicFileAttributes);
        }
        return basicFileAttributes instanceof InterfaceC0349N ? C0348M.m12140a((InterfaceC0349N) basicFileAttributes) : new C0368i(basicFileAttributes);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC0379t.m12182d(this.f32859a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.f32859a;
        if (obj instanceof C0368i) {
            obj = ((C0368i) obj).f32859a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f32859a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f32859a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f32859a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f32859a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f32859a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f32859a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return AbstractC0379t.m12182d(this.f32859a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return AbstractC0379t.m12182d(this.f32859a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f32859a.size();
    }
}
