package p021j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;

/* JADX INFO: renamed from: j$.nio.file.attribute.m */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0372m implements InterfaceC0374o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DosFileAttributes f32862a;

    private /* synthetic */ C0372m(DosFileAttributes dosFileAttributes) {
        this.f32862a = dosFileAttributes;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0374o m12171a(DosFileAttributes dosFileAttributes) {
        if (dosFileAttributes == null) {
            return null;
        }
        return dosFileAttributes instanceof C0373n ? ((C0373n) dosFileAttributes).f32863a : new C0372m(dosFileAttributes);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean m12172b() {
        return this.f32862a.isArchive();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean m12173c() {
        return this.f32862a.isHidden();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ C0340E creationTime() {
        return AbstractC0379t.m12180b(this.f32862a.creationTime());
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean m12174d() {
        return this.f32862a.isReadOnly();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m12175e() {
        return this.f32862a.isSystem();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0372m) {
            obj = ((C0372m) obj).f32862a;
        }
        return this.f32862a.equals(obj);
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f32862a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f32862a.hashCode();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f32862a.isDirectory();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f32862a.isOther();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f32862a.isRegularFile();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f32862a.isSymbolicLink();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ C0340E lastAccessTime() {
        return AbstractC0379t.m12180b(this.f32862a.lastAccessTime());
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ C0340E lastModifiedTime() {
        return AbstractC0379t.m12180b(this.f32862a.lastModifiedTime());
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f32862a.size();
    }
}
