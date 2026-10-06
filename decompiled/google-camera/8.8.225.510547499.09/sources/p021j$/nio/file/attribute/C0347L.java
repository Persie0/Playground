package p021j$.nio.file.attribute;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.Set;
import p021j$.nio.file.AbstractC0335a;

/* JADX INFO: renamed from: j$.nio.file.attribute.L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0347L implements InterfaceC0349N {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PosixFileAttributes f32845a;

    private /* synthetic */ C0347L(PosixFileAttributes posixFileAttributes) {
        this.f32845a = posixFileAttributes;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0349N m12136a(PosixFileAttributes posixFileAttributes) {
        if (posixFileAttributes == null) {
            return null;
        }
        return posixFileAttributes instanceof C0348M ? ((C0348M) posixFileAttributes).f32846a : new C0347L(posixFileAttributes);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0343H m12137b() {
        return C0341F.m12128a(this.f32845a.group());
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0356V m12138c() {
        return C0354T.m12148a(this.f32845a.owner());
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ C0340E creationTime() {
        return AbstractC0379t.m12180b(this.f32845a.creationTime());
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Set m12139d() {
        return AbstractC0335a.m12115n(this.f32845a.permissions());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0347L) {
            obj = ((C0347L) obj).f32845a;
        }
        return this.f32845a.equals(obj);
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f32845a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f32845a.hashCode();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f32845a.isDirectory();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f32845a.isOther();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f32845a.isRegularFile();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f32845a.isSymbolicLink();
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ C0340E lastAccessTime() {
        return AbstractC0379t.m12180b(this.f32845a.lastAccessTime());
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ C0340E lastModifiedTime() {
        return AbstractC0379t.m12180b(this.f32845a.lastModifiedTime());
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f32845a.size();
    }
}
