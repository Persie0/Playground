package p021j$.nio.file.spi;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.OpenOption;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p021j$.nio.channels.AbstractC0308c;
import p021j$.nio.channels.C0306a;
import p021j$.nio.file.AbstractC0335a;
import p021j$.nio.file.AbstractC0392h;
import p021j$.nio.file.AbstractC0395k;
import p021j$.nio.file.C0388d;
import p021j$.nio.file.C0390f;
import p021j$.nio.file.C0393i;
import p021j$.nio.file.C0400p;
import p021j$.nio.file.C0403s;
import p021j$.nio.file.C0407t;
import p021j$.nio.file.C0408u;
import p021j$.nio.file.C0410w;
import p021j$.nio.file.EnumC0386b;
import p021j$.nio.file.InterfaceC0389e;
import p021j$.nio.file.InterfaceC0401q;
import p021j$.nio.file.LinkOption;
import p021j$.nio.file.Path;
import p021j$.nio.file.attribute.BasicFileAttributes;
import p021j$.nio.file.attribute.C0367h;
import p021j$.nio.file.attribute.C0380u;
import p021j$.nio.file.attribute.FileAttribute;
import p021j$.nio.file.attribute.InterfaceC0382w;
import p021j$.p024io.AbstractC0304a;

/* JADX INFO: renamed from: j$.nio.file.spi.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0404a extends AbstractC0406c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FileSystemProvider f32890b;

    private /* synthetic */ C0404a(FileSystemProvider fileSystemProvider) {
        this.f32890b = fileSystemProvider;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ AbstractC0406c m12214B(FileSystemProvider fileSystemProvider) {
        if (fileSystemProvider == null) {
            return null;
        }
        return fileSystemProvider instanceof C0405b ? ((C0405b) fileSystemProvider).f32891a : new C0404a(fileSystemProvider);
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void mo12002A(Path path, String str, Object obj, LinkOption[] linkOptionArr) throws IOException {
        this.f32890b.setAttribute(C0407t.m12219a(path), str, AbstractC0335a.m12113l(obj), AbstractC0392h.m12207l(linkOptionArr));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo12003a(Path path, EnumC0386b[] enumC0386bArr) throws IOException {
        AccessMode[] accessModeArr;
        java.nio.file.Path pathM12219a = C0407t.m12219a(path);
        if (enumC0386bArr == null) {
            accessModeArr = null;
        } else {
            int length = enumC0386bArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                accessModeArr2[i] = AbstractC0335a.m12104c(enumC0386bArr[i]);
            }
            accessModeArr = accessModeArr2;
        }
        this.f32890b.checkAccess(pathM12219a, accessModeArr);
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo12004b(Path path, Path path2, InterfaceC0389e[] interfaceC0389eArr) throws IOException {
        CopyOption[] copyOptionArr;
        java.nio.file.Path pathM12219a = C0407t.m12219a(path);
        java.nio.file.Path pathM12219a2 = C0407t.m12219a(path2);
        if (interfaceC0389eArr == null) {
            copyOptionArr = null;
        } else {
            int length = interfaceC0389eArr.length;
            CopyOption[] copyOptionArr2 = new CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr2[i] = C0388d.m12189a(interfaceC0389eArr[i]);
            }
            copyOptionArr = copyOptionArr2;
        }
        this.f32890b.copy(pathM12219a, pathM12219a2, copyOptionArr);
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo12005c(Path path, FileAttribute[] fileAttributeArr) throws IOException {
        this.f32890b.createDirectory(C0407t.m12219a(path), AbstractC0304a.m12054f(fileAttributeArr));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo12006d(Path path, Path path2) throws IOException {
        this.f32890b.createLink(C0407t.m12219a(path), C0407t.m12219a(path2));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo12007e(Path path, Path path2, FileAttribute[] fileAttributeArr) throws IOException {
        this.f32890b.createSymbolicLink(C0407t.m12219a(path), C0407t.m12219a(path2), AbstractC0304a.m12054f(fileAttributeArr));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0404a) {
            obj = ((C0404a) obj).f32890b;
        }
        return this.f32890b.equals(obj);
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo12008f(Path path) throws IOException {
        this.f32890b.delete(C0407t.m12219a(path));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean mo12009g(Path path) {
        return this.f32890b.deleteIfExists(C0407t.m12219a(path));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0382w mo12010h(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C0380u.m12184c(this.f32890b.getFileAttributeView(C0407t.m12219a(path), AbstractC0335a.m12110i(cls), AbstractC0392h.m12207l(linkOptionArr)));
    }

    public final /* synthetic */ int hashCode() {
        return this.f32890b.hashCode();
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC0392h mo12011i(Path path) {
        return C0390f.m12190r(this.f32890b.getFileStore(C0407t.m12219a(path)));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC0395k mo12012j(URI uri) {
        return C0393i.m12209l(this.f32890b.getFileSystem(uri));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Path mo12013k(URI uri) {
        return C0403s.m12213a(this.f32890b.getPath(uri));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String mo12014l() {
        return this.f32890b.getScheme();
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean mo12015m(Path path) {
        return this.f32890b.isHidden(C0407t.m12219a(path));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo12016n(Path path, Path path2) {
        return this.f32890b.isSameFile(C0407t.m12219a(path), C0407t.m12219a(path2));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo12017o(Path path, Path path2, InterfaceC0389e[] interfaceC0389eArr) throws IOException {
        CopyOption[] copyOptionArr;
        java.nio.file.Path pathM12219a = C0407t.m12219a(path);
        java.nio.file.Path pathM12219a2 = C0407t.m12219a(path2);
        if (interfaceC0389eArr == null) {
            copyOptionArr = null;
        } else {
            int length = interfaceC0389eArr.length;
            CopyOption[] copyOptionArr2 = new CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr2[i] = C0388d.m12189a(interfaceC0389eArr[i]);
            }
            copyOptionArr = copyOptionArr2;
        }
        this.f32890b.move(pathM12219a, pathM12219a2, copyOptionArr);
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ AbstractC0308c mo12018p(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        return C0306a.m12060k(this.f32890b.newAsynchronousFileChannel(C0407t.m12219a(path), AbstractC0335a.m12114m(set), executorService, AbstractC0304a.m12054f(fileAttributeArr)));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ SeekableByteChannel mo12019q(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.f32890b.newByteChannel(C0407t.m12219a(path), AbstractC0335a.m12114m(set), AbstractC0304a.m12054f(fileAttributeArr));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: r */
    public final DirectoryStream mo12020r(Path path, DirectoryStream.Filter filter) {
        return new C0410w(this.f32890b.newDirectoryStream(C0407t.m12219a(path), new C0408u(filter)));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ FileChannel mo12021s(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.f32890b.newFileChannel(C0407t.m12219a(path), AbstractC0335a.m12114m(set), AbstractC0304a.m12054f(fileAttributeArr));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: t */
    public final /* synthetic */ AbstractC0395k mo12215t(Path path, Map map) {
        return C0393i.m12209l(this.f32890b.newFileSystem(C0407t.m12219a(path), (Map<String, ?>) map));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ AbstractC0395k mo12022u(URI uri, Map map) {
        return C0393i.m12209l(this.f32890b.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InputStream mo12216v(Path path, InterfaceC0401q[] interfaceC0401qArr) {
        OpenOption[] openOptionArr;
        java.nio.file.Path pathM12219a = C0407t.m12219a(path);
        if (interfaceC0401qArr == null) {
            openOptionArr = null;
        } else {
            int length = interfaceC0401qArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = C0400p.m12212a(interfaceC0401qArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return this.f32890b.newInputStream(pathM12219a, openOptionArr);
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ OutputStream mo12217w(Path path, InterfaceC0401q[] interfaceC0401qArr) {
        OpenOption[] openOptionArr;
        java.nio.file.Path pathM12219a = C0407t.m12219a(path);
        if (interfaceC0401qArr == null) {
            openOptionArr = null;
        } else {
            int length = interfaceC0401qArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = C0400p.m12212a(interfaceC0401qArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return this.f32890b.newOutputStream(pathM12219a, openOptionArr);
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ BasicFileAttributes mo12023x(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C0367h.m12162a(this.f32890b.readAttributes(C0407t.m12219a(path), AbstractC0335a.m12111j(cls), AbstractC0392h.m12207l(linkOptionArr)));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Map mo12024y(Path path, String str, LinkOption[] linkOptionArr) {
        return AbstractC0335a.m12112k(this.f32890b.readAttributes(C0407t.m12219a(path), str, AbstractC0392h.m12207l(linkOptionArr)));
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Path mo12025z(Path path) {
        return C0403s.m12213a(this.f32890b.readSymbolicLink(C0407t.m12219a(path)));
    }
}
