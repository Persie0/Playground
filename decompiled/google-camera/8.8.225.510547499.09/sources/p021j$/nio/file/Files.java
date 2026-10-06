package p021j$.nio.file;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;
import java.util.Iterator;
import java.util.Set;
import p021j$.desugar.sun.nio.p023fs.AbstractC0293g;
import p021j$.nio.file.attribute.BasicFileAttributes;
import p021j$.nio.file.attribute.FileAttribute;

/* JADX INFO: loaded from: classes3.dex */
public final class Files {

    /* JADX INFO: renamed from: a */
    private static final Set f32820a = AbstractC0293g.m11980c(new Object[]{EnumC0315D.CREATE_NEW, EnumC0315D.WRITE});

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f32821b = 0;

    /* JADX INFO: renamed from: a */
    private static void m12077a(Path path, FileAttribute... fileAttributeArr) throws FileAlreadyExistsException {
        try {
            path.getFileSystem().mo11994j().mo12005c(path, fileAttributeArr);
        } catch (FileAlreadyExistsException e) {
            boolean zIsDirectory = false;
            try {
                zIsDirectory = readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS).isDirectory();
            } catch (IOException unused) {
            }
            if (!zIsDirectory) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12078b(Path path, LinkOption... linkOptionArr) {
        if (linkOptionArr.length == 0) {
            path.getFileSystem().mo11994j();
        }
        try {
            int length = linkOptionArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                LinkOption linkOption = linkOptionArr[i];
                if (linkOption != LinkOption.NOFOLLOW_LINKS) {
                    linkOption.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                path.getFileSystem().mo11994j().mo12003a(path, new EnumC0386b[0]);
            } else {
                readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static Path createDirectories(Path path, FileAttribute<?>... fileAttributeArr) throws FileSystemException {
        try {
            m12077a(path, fileAttributeArr);
            return path;
        } catch (FileAlreadyExistsException e) {
            throw e;
        } catch (IOException unused) {
            try {
                path = path.toAbsolutePath();
                e = null;
            } catch (SecurityException e2) {
                e = e2;
            }
            Path parent = path.getParent();
            while (parent != null) {
                try {
                    parent.getFileSystem().mo11994j().mo12003a(parent, new EnumC0386b[0]);
                    break;
                } catch (NoSuchFileException unused2) {
                    parent = parent.getParent();
                }
            }
            if (parent == null) {
                if (e == null) {
                    throw new FileSystemException(path.toString(), null, "Unable to determine if root directory exists");
                }
                throw e;
            }
            Iterator it = parent.mo12040w(path).iterator();
            while (it.hasNext()) {
                parent = parent.mo12036o((Path) it.next());
                m12077a(parent, fileAttributeArr);
            }
            return path;
        }
    }

    public static Path createFile(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        path.getFileSystem().mo11994j().mo12019q(path, f32820a, fileAttributeArr).close();
        return path;
    }

    public static DirectoryStream<Path> newDirectoryStream(Path path) {
        return path.getFileSystem().mo11994j().mo12020r(path, C0398n.f32884a);
    }

    public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> cls, LinkOption... linkOptionArr) {
        return (A) path.getFileSystem().mo11994j().mo12023x(path, cls, linkOptionArr);
    }
}
