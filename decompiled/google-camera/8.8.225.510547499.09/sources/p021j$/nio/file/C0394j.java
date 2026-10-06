package p021j$.nio.file;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;
import p021j$.nio.file.attribute.C0358X;
import p021j$.nio.file.spi.C0405b;

/* JADX INFO: renamed from: j$.nio.file.j */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0394j extends FileSystem {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0395k f32882a;

    private /* synthetic */ C0394j(AbstractC0395k abstractC0395k) {
        this.f32882a = abstractC0395k;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ FileSystem m12210b(AbstractC0395k abstractC0395k) {
        if (abstractC0395k == null) {
            return null;
        }
        return abstractC0395k instanceof C0393i ? ((C0393i) abstractC0395k).f32881a : new C0394j(abstractC0395k);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f32882a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0395k abstractC0395k = this.f32882a;
        if (obj instanceof C0394j) {
            obj = ((C0394j) obj).f32882a;
        }
        return abstractC0395k.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.f32882a.mo11986b();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Path getPath(String str, String[] strArr) {
        return C0407t.m12219a(this.f32882a.mo11987c(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        return C0312A.m12075a(this.f32882a.mo11988d(str));
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new C0411x(this.f32882a.mo11989e());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.f32882a.mo11990f();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        return C0358X.m12153a(this.f32882a.mo11991g());
    }

    public final /* synthetic */ int hashCode() {
        return this.f32882a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.f32882a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.f32882a.mo11992h();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        return C0330T.m12099b(this.f32882a.mo11993i());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        return C0405b.m12218a(this.f32882a.mo11994j());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.f32882a.mo11995k();
    }
}
