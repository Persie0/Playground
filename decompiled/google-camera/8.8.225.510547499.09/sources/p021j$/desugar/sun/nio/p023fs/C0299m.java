package p021j$.desugar.sun.nio.p023fs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p021j$.nio.channels.AbstractC0308c;
import p021j$.nio.channels.DesugarChannels;
import p021j$.nio.file.AbstractC0392h;
import p021j$.nio.file.AbstractC0395k;
import p021j$.nio.file.EnumC0314C;
import p021j$.nio.file.EnumC0315D;
import p021j$.nio.file.EnumC0386b;
import p021j$.nio.file.Files;
import p021j$.nio.file.InterfaceC0389e;
import p021j$.nio.file.InterfaceC0401q;
import p021j$.nio.file.LinkOption;
import p021j$.nio.file.Path;
import p021j$.nio.file.attribute.BasicFileAttributes;
import p021j$.nio.file.attribute.C0340E;
import p021j$.nio.file.attribute.FileAttribute;
import p021j$.nio.file.attribute.InterfaceC0366g;
import p021j$.nio.file.attribute.InterfaceC0382w;
import p021j$.nio.file.spi.AbstractC0406c;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C0299m extends AbstractC0406c {

    /* JADX INFO: renamed from: b */
    private final String f32792b;

    /* JADX INFO: renamed from: c */
    private final String f32793c = "/";

    /* JADX INFO: renamed from: d */
    private volatile C0295i f32794d;

    C0299m(String str) {
        this.f32792b = str;
    }

    /* JADX INFO: renamed from: E */
    private static void m12000E(URI uri) {
        if (!uri.getScheme().equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI does not match this provider");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("Authority component present");
        }
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Path component is undefined");
        }
        if (!path.equals("/")) {
            throw new IllegalArgumentException("Path component should be '/'");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("Query component present");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("Fragment component present");
        }
    }

    /* JADX INFO: renamed from: F */
    private static boolean m12001F(InterfaceC0389e[] interfaceC0389eArr, EnumC0314C enumC0314C) {
        for (InterfaceC0389e interfaceC0389e : interfaceC0389eArr) {
            if (interfaceC0389e == enumC0314C) {
                return true;
            }
        }
        return false;
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: A */
    public final void mo12002A(Path path, String str, Object obj, LinkOption... linkOptionArr) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException(String.format("Requested attribute type for: %s is not available.", strSubstring));
            }
            str = str.substring(iIndexOf + 1);
        }
        C0288b c0288b = new C0288b(path);
        if (str.equals("lastModifiedTime")) {
            c0288b.mo11974a((C0340E) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            c0288b.mo11974a(null, (C0340E) obj, null);
        } else {
            if (str.equals("creationTime")) {
                c0288b.mo11974a(null, null, (C0340E) obj);
                return;
            }
            throw new IllegalArgumentException("'basic:" + str + "' not recognized");
        }
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: a */
    public final void mo12003a(Path path, EnumC0386b... enumC0386bArr) throws IOException {
        File file = path.toFile();
        if (!file.exists()) {
            throw new NoSuchFileException(path.toString());
        }
        boolean zCanRead = true;
        for (EnumC0386b enumC0386b : enumC0386bArr) {
            int i = AbstractC0296j.f32786a[enumC0386b.ordinal()];
            if (i == 1) {
                zCanRead &= file.canRead();
            } else if (i == 2) {
                zCanRead &= file.canWrite();
            } else if (i == 3) {
                zCanRead &= file.canExecute();
            }
        }
        if (!zCanRead) {
            throw new IOException(String.format("Unable to access file %s", path));
        }
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: b */
    public final void mo12004b(Path path, Path path2, InterfaceC0389e... interfaceC0389eArr) throws IllegalAccessException, IOException, InvocationTargetException {
        if (!m12001F(interfaceC0389eArr, EnumC0314C.REPLACE_EXISTING) && Files.m12078b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (m12001F(interfaceC0389eArr, EnumC0314C.ATOMIC_MOVE)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path2.toFile());
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr, 0, 8192);
                    if (i < 0) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                    try {
                        fileInputStream.close();
                    } catch (Throwable th) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            fileInputStream.close();
            throw th4;
        }
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: c */
    public final void mo12005c(Path path, FileAttribute... fileAttributeArr) throws NoSuchFileException, FileAlreadyExistsException {
        if (path.getParent() != null && !Files.m12078b(path.getParent(), new LinkOption[0])) {
            throw new NoSuchFileException(path.toString());
        }
        if (!path.toFile().mkdirs()) {
            throw new FileAlreadyExistsException(path.toString());
        }
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: d */
    public final void mo12006d(Path path, Path path2) {
        throw new UnsupportedOperationException();
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: e */
    public final void mo12007e(Path path, Path path2, FileAttribute... fileAttributeArr) {
        throw new UnsupportedOperationException();
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: f */
    public final void mo12008f(Path path) throws NoSuchFileException {
        boolean z = false;
        try {
            mo12003a(path, new EnumC0386b[0]);
            z = true;
        } catch (IOException unused) {
        }
        if (!z) {
            throw new NoSuchFileException(path.toString());
        }
        path.toFile().delete();
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: g */
    public final boolean mo12009g(Path path) {
        return path.toFile().delete();
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: h */
    public final InterfaceC0382w mo12010h(Path path, Class cls, LinkOption... linkOptionArr) {
        cls.getClass();
        if (cls == InterfaceC0366g.class) {
            return (InterfaceC0382w) cls.cast(new C0288b(path));
        }
        return null;
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: i */
    public final AbstractC0392h mo12011i(Path path) {
        throw new SecurityException("getFileStore");
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: j */
    public final AbstractC0395k mo12012j(URI uri) {
        m12000E(uri);
        C0295i c0295i = this.f32794d;
        if (c0295i == null) {
            synchronized (this) {
                c0295i = this.f32794d;
                if (c0295i == null) {
                    c0295i = new C0295i(this, this.f32792b, this.f32793c);
                    this.f32794d = c0295i;
                }
            }
        }
        return c0295i;
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: k */
    public final Path mo12013k(URI uri) {
        return AbstractC0302p.m12043b(this.f32794d, uri, this.f32792b, this.f32793c);
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: l */
    public final String mo12014l() {
        return "file";
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: m */
    public final boolean mo12015m(Path path) {
        return path.toFile().isHidden();
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: n */
    public final boolean mo12016n(Path path, Path path2) throws IOException {
        if (path.equals(path2)) {
            return true;
        }
        mo12003a(path, new EnumC0386b[0]);
        mo12003a(path2, new EnumC0386b[0]);
        return path.toFile().equals(path2.toFile());
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: o */
    public final void mo12017o(Path path, Path path2, InterfaceC0389e... interfaceC0389eArr) throws FileAlreadyExistsException {
        if (!m12001F(interfaceC0389eArr, EnumC0314C.REPLACE_EXISTING) && Files.m12078b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (m12001F(interfaceC0389eArr, EnumC0314C.COPY_ATTRIBUTES)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        path.toFile().renameTo(path2.toFile());
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: p */
    public final AbstractC0308c mo12018p(Path path, Set set, ExecutorService executorService, FileAttribute... fileAttributeArr) {
        throw new UnsupportedOperationException();
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: q */
    public final SeekableByteChannel mo12019q(Path path, Set set, FileAttribute... fileAttributeArr) {
        return mo12021s(path, set, fileAttributeArr);
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: r */
    public final DirectoryStream mo12020r(Path path, DirectoryStream.Filter filter) {
        return new C0297k(this, path, filter);
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: s */
    public final FileChannel mo12021s(Path path, Set set, FileAttribute... fileAttributeArr) throws IOException {
        String str;
        if (path.toFile().isDirectory()) {
            throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: ".concat(String.valueOf(path)));
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC0401q) it.next()).getClass();
        }
        if (path.toFile().exists()) {
            if (set.contains(EnumC0315D.CREATE_NEW) && set.contains(EnumC0315D.WRITE)) {
                throw new FileAlreadyExistsException(path.toString());
            }
        } else if (!set.contains(EnumC0315D.CREATE) && !set.contains(EnumC0315D.CREATE_NEW)) {
            throw new NoSuchFileException(path.toString());
        }
        if (set.contains(EnumC0315D.READ) && set.contains(EnumC0315D.APPEND)) {
            throw new IllegalArgumentException("READ + APPEND not allowed");
        }
        EnumC0315D enumC0315D = EnumC0315D.APPEND;
        if (set.contains(enumC0315D) && set.contains(EnumC0315D.TRUNCATE_EXISTING)) {
            throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
        }
        File file = path.toFile();
        EnumC0315D enumC0315D2 = EnumC0315D.WRITE;
        if (!set.contains(enumC0315D2) && !set.contains(enumC0315D)) {
            str = "r";
        } else if (set.contains(EnumC0315D.SYNC)) {
            str = "rws";
        } else {
            str = set.contains(EnumC0315D.DSYNC) ? "rwd" : "rw";
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, str);
        if (set.contains(EnumC0315D.TRUNCATE_EXISTING) && set.contains(enumC0315D2)) {
            randomAccessFile.setLength(0L);
        }
        return (set.contains(enumC0315D) || set.contains(EnumC0315D.DELETE_ON_CLOSE)) ? C0291e.m11976b(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()), set, path) : DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: u */
    public final AbstractC0395k mo12022u(URI uri, Map map) {
        m12000E(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: x */
    public final BasicFileAttributes mo12023x(Path path, Class cls, LinkOption... linkOptionArr) {
        if (cls == BasicFileAttributes.class) {
            return (BasicFileAttributes) cls.cast(((InterfaceC0366g) mo12010h(path, InterfaceC0366g.class, linkOptionArr)).readAttributes());
        }
        throw new UnsupportedOperationException();
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: y */
    public final Map mo12024y(Path path, String str, LinkOption... linkOptionArr) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException(String.format("Requested attribute type for: %s is not available.", strSubstring));
            }
            str = str.substring(iIndexOf + 1);
        }
        String[] strArrSplit = str.split(",");
        C0288b c0288b = new C0288b(path);
        C0287a c0287aM11970b = C0287a.m11970b(C0288b.f32765b, strArrSplit);
        BasicFileAttributes attributes = c0288b.readAttributes();
        if (c0287aM11970b.m11972c("size")) {
            c0287aM11970b.m11971a(Long.valueOf(((C0289c) attributes).size()), "size");
        }
        if (c0287aM11970b.m11972c("creationTime")) {
            c0287aM11970b.m11971a(((C0289c) attributes).creationTime(), "creationTime");
        }
        if (c0287aM11970b.m11972c("lastAccessTime")) {
            c0287aM11970b.m11971a(((C0289c) attributes).lastAccessTime(), "lastAccessTime");
        }
        if (c0287aM11970b.m11972c("lastModifiedTime")) {
            c0287aM11970b.m11971a(((C0289c) attributes).lastModifiedTime(), "lastModifiedTime");
        }
        if (c0287aM11970b.m11972c("fileKey")) {
            c0287aM11970b.m11971a(((C0289c) attributes).fileKey(), "fileKey");
        }
        if (c0287aM11970b.m11972c("isDirectory")) {
            c0287aM11970b.m11971a(Boolean.valueOf(((C0289c) attributes).isDirectory()), "isDirectory");
        }
        if (c0287aM11970b.m11972c("isRegularFile")) {
            c0287aM11970b.m11971a(Boolean.valueOf(((C0289c) attributes).isRegularFile()), "isRegularFile");
        }
        if (c0287aM11970b.m11972c("isSymbolicLink")) {
            c0287aM11970b.m11971a(Boolean.valueOf(((C0289c) attributes).isSymbolicLink()), "isSymbolicLink");
        }
        if (c0287aM11970b.m11972c("isOther")) {
            c0287aM11970b.m11971a(Boolean.valueOf(((C0289c) attributes).isOther()), "isOther");
        }
        return c0287aM11970b.m11973d();
    }

    @Override // p021j$.nio.file.spi.AbstractC0406c
    /* JADX INFO: renamed from: z */
    public final Path mo12025z(Path path) {
        return new C0301o(this.f32794d, path.toFile().getCanonicalPath(), this.f32792b, this.f32793c);
    }
}
