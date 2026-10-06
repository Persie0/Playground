package p021j$.nio.file.spi;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p021j$.nio.channels.C0307b;
import p021j$.nio.file.AbstractC0335a;
import p021j$.nio.file.AbstractC0392h;
import p021j$.nio.file.C0387c;
import p021j$.nio.file.C0391g;
import p021j$.nio.file.C0394j;
import p021j$.nio.file.C0399o;
import p021j$.nio.file.C0403s;
import p021j$.nio.file.C0407t;
import p021j$.nio.file.C0408u;
import p021j$.nio.file.C0410w;
import p021j$.nio.file.EnumC0386b;
import p021j$.nio.file.InterfaceC0389e;
import p021j$.nio.file.InterfaceC0401q;
import p021j$.nio.file.attribute.C0368i;
import p021j$.nio.file.attribute.C0381v;
import p021j$.p024io.AbstractC0304a;

/* JADX INFO: renamed from: j$.nio.file.spi.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0405b extends FileSystemProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0406c f32891a;

    private /* synthetic */ C0405b(AbstractC0406c abstractC0406c) {
        this.f32891a = abstractC0406c;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ FileSystemProvider m12218a(AbstractC0406c abstractC0406c) {
        if (abstractC0406c == null) {
            return null;
        }
        return abstractC0406c instanceof C0404a ? ((C0404a) abstractC0406c).f32890b : new C0405b(abstractC0406c);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        EnumC0386b[] enumC0386bArr;
        AbstractC0406c abstractC0406c = this.f32891a;
        p021j$.nio.file.Path pathM12213a = C0403s.m12213a(path);
        if (accessModeArr == null) {
            enumC0386bArr = null;
        } else {
            int length = accessModeArr.length;
            EnumC0386b[] enumC0386bArr2 = new EnumC0386b[length];
            for (int i = 0; i < length; i++) {
                enumC0386bArr2[i] = AbstractC0335a.m12102a(accessModeArr[i]);
            }
            enumC0386bArr = enumC0386bArr2;
        }
        abstractC0406c.mo12003a(pathM12213a, enumC0386bArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        InterfaceC0389e[] interfaceC0389eArr;
        AbstractC0406c abstractC0406c = this.f32891a;
        p021j$.nio.file.Path pathM12213a = C0403s.m12213a(path);
        p021j$.nio.file.Path pathM12213a2 = C0403s.m12213a(path2);
        if (copyOptionArr == null) {
            interfaceC0389eArr = null;
        } else {
            int length = copyOptionArr.length;
            InterfaceC0389e[] interfaceC0389eArr2 = new InterfaceC0389e[length];
            for (int i = 0; i < length; i++) {
                interfaceC0389eArr2[i] = C0387c.m12188a(copyOptionArr[i]);
            }
            interfaceC0389eArr = interfaceC0389eArr2;
        }
        abstractC0406c.mo12004b(pathM12213a, pathM12213a2, interfaceC0389eArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.f32891a.mo12005c(C0403s.m12213a(path), AbstractC0304a.m12053e(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.f32891a.mo12006d(C0403s.m12213a(path), C0403s.m12213a(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.f32891a.mo12007e(C0403s.m12213a(path), C0403s.m12213a(path2), AbstractC0304a.m12053e(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.f32891a.mo12008f(C0403s.m12213a(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.f32891a.mo12009g(C0403s.m12213a(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0406c abstractC0406c = this.f32891a;
        if (obj instanceof C0405b) {
            obj = ((C0405b) obj).f32891a;
        }
        return abstractC0406c.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C0381v.m12185a(this.f32891a.mo12010h(C0403s.m12213a(path), AbstractC0335a.m12110i(cls), AbstractC0392h.m12205j(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        return C0391g.m12202a(this.f32891a.mo12011i(C0403s.m12213a(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C0394j.m12210b(this.f32891a.mo12012j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return C0407t.m12219a(this.f32891a.mo12013k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.f32891a.mo12014l();
    }

    public final /* synthetic */ int hashCode() {
        return this.f32891a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.f32891a.mo12015m(C0403s.m12213a(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.f32891a.mo12016n(C0403s.m12213a(path), C0403s.m12213a(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        InterfaceC0389e[] interfaceC0389eArr;
        AbstractC0406c abstractC0406c = this.f32891a;
        p021j$.nio.file.Path pathM12213a = C0403s.m12213a(path);
        p021j$.nio.file.Path pathM12213a2 = C0403s.m12213a(path2);
        if (copyOptionArr == null) {
            interfaceC0389eArr = null;
        } else {
            int length = copyOptionArr.length;
            InterfaceC0389e[] interfaceC0389eArr2 = new InterfaceC0389e[length];
            for (int i = 0; i < length; i++) {
                interfaceC0389eArr2[i] = C0387c.m12188a(copyOptionArr[i]);
            }
            interfaceC0389eArr = interfaceC0389eArr2;
        }
        abstractC0406c.mo12017o(pathM12213a, pathM12213a2, interfaceC0389eArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        return C0307b.m12070b(this.f32891a.mo12018p(C0403s.m12213a(path), AbstractC0335a.m12114m(set), executorService, AbstractC0304a.m12053e(fileAttributeArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.f32891a.mo12019q(C0403s.m12213a(path), AbstractC0335a.m12114m(set), AbstractC0304a.m12053e(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new C0410w(this.f32891a.mo12020r(C0403s.m12213a(path), new C0408u(filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.f32891a.mo12021s(C0403s.m12213a(path), AbstractC0335a.m12114m(set), AbstractC0304a.m12053e(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C0394j.m12210b(this.f32891a.mo12022u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC0401q[] interfaceC0401qArr;
        AbstractC0406c abstractC0406c = this.f32891a;
        p021j$.nio.file.Path pathM12213a = C0403s.m12213a(path);
        if (openOptionArr == null) {
            interfaceC0401qArr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC0401q[] interfaceC0401qArr2 = new InterfaceC0401q[length];
            for (int i = 0; i < length; i++) {
                interfaceC0401qArr2[i] = C0399o.m12211a(openOptionArr[i]);
            }
            interfaceC0401qArr = interfaceC0401qArr2;
        }
        return abstractC0406c.mo12216v(pathM12213a, interfaceC0401qArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC0401q[] interfaceC0401qArr;
        AbstractC0406c abstractC0406c = this.f32891a;
        p021j$.nio.file.Path pathM12213a = C0403s.m12213a(path);
        if (openOptionArr == null) {
            interfaceC0401qArr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC0401q[] interfaceC0401qArr2 = new InterfaceC0401q[length];
            for (int i = 0; i < length; i++) {
                interfaceC0401qArr2[i] = C0399o.m12211a(openOptionArr[i]);
            }
            interfaceC0401qArr = interfaceC0401qArr2;
        }
        return abstractC0406c.mo12217w(pathM12213a, interfaceC0401qArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C0368i.m12163a(this.f32891a.mo12023x(C0403s.m12213a(path), AbstractC0335a.m12111j(cls), AbstractC0392h.m12205j(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return C0407t.m12219a(this.f32891a.mo12025z(C0403s.m12213a(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.f32891a.mo12002A(C0403s.m12213a(path), str, AbstractC0335a.m12113l(obj), AbstractC0392h.m12205j(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C0394j.m12210b(this.f32891a.mo12215t(C0403s.m12213a(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return AbstractC0335a.m12112k(this.f32891a.mo12024y(C0403s.m12213a(path), str, AbstractC0392h.m12205j(linkOptionArr)));
    }
}
