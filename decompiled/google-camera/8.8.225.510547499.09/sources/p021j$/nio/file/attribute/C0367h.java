package p021j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

/* JADX INFO: renamed from: j$.nio.file.attribute.h */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0367h implements BasicFileAttributes {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BasicFileAttributes f32858a;

    private /* synthetic */ C0367h(BasicFileAttributes basicFileAttributes) {
        this.f32858a = basicFileAttributes;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BasicFileAttributes m12162a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof C0368i) {
            return ((C0368i) basicFileAttributes).f32859a;
        }
        if (basicFileAttributes instanceof DosFileAttributes) {
            return C0372m.m12171a((DosFileAttributes) basicFileAttributes);
        }
        return basicFileAttributes instanceof PosixFileAttributes ? C0347L.m12136a((PosixFileAttributes) basicFileAttributes) : new C0367h(basicFileAttributes);
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ C0340E creationTime() {
        return AbstractC0379t.m12180b(this.f32858a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0367h) {
            obj = ((C0367h) obj).f32858a;
        }
        return this.f32858a.equals(obj);
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f32858a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f32858a.hashCode();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f32858a.isDirectory();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f32858a.isOther();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f32858a.isRegularFile();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f32858a.isSymbolicLink();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ C0340E lastAccessTime() {
        return AbstractC0379t.m12180b(this.f32858a.lastAccessTime());
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ C0340E lastModifiedTime() {
        return AbstractC0379t.m12180b(this.f32858a.lastModifiedTime());
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f32858a.size();
    }
}
