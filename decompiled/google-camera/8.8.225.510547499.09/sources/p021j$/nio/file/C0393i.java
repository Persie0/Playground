package p021j$.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.Set;
import p021j$.nio.file.attribute.AbstractC0359Y;
import p021j$.nio.file.attribute.C0357W;
import p021j$.nio.file.spi.AbstractC0406c;
import p021j$.nio.file.spi.C0404a;

/* JADX INFO: renamed from: j$.nio.file.i */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0393i extends AbstractC0395k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileSystem f32881a;

    private /* synthetic */ C0393i(FileSystem fileSystem) {
        this.f32881a = fileSystem;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ AbstractC0395k m12209l(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C0394j ? ((C0394j) fileSystem).f32882a : new C0393i(fileSystem);
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Iterable mo11986b() {
        return this.f32881a.getFileStores();
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Path mo11987c(String str, String[] strArr) {
        return C0403s.m12213a(this.f32881a.getPath(str, strArr));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f32881a.close();
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0313B mo11988d(String str) {
        return C0413z.m12220b(this.f32881a.getPathMatcher(str));
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: e */
    public final Iterable mo11989e() {
        return new C0411x(this.f32881a.getRootDirectories());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0393i) {
            obj = ((C0393i) obj).f32881a;
        }
        return this.f32881a.equals(obj);
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String mo11990f() {
        return this.f32881a.getSeparator();
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC0359Y mo11991g() {
        return C0357W.m12150e(this.f32881a.getUserPrincipalLookupService());
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean mo11992h() {
        return this.f32881a.isReadOnly();
    }

    public final /* synthetic */ int hashCode() {
        return this.f32881a.hashCode();
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC0331U mo11993i() {
        return C0329S.m12095b(this.f32881a.newWatchService());
    }

    @Override // p021j$.nio.file.AbstractC0395k
    public final /* synthetic */ boolean isOpen() {
        return this.f32881a.isOpen();
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC0406c mo11994j() {
        return C0404a.m12214B(this.f32881a.provider());
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Set mo11995k() {
        return this.f32881a.supportedFileAttributeViews();
    }
}
