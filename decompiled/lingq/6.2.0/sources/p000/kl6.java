package p000;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: loaded from: classes.dex */
public final class kl6 extends rg4 {
    /* JADX INFO: renamed from: R */
    public static Long m15329R(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // p000.rg4, p000.u33
    /* JADX INFO: renamed from: b */
    public final void mo263b(d57 d57Var, d57 d57Var2) throws IOException {
        d57Var.getClass();
        d57Var2.getClass();
        try {
            Path path = Paths.get(d57Var.f35014a.m18089r(), new String[0]);
            path.getClass();
            Path path2 = Paths.get(d57Var2.f35014a.m18089r(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            v63.m23133k("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // p000.rg4
    public final String toString() {
        return "NioSystemFileSystem";
    }

    @Override // p000.rg4, p000.u33
    /* JADX INFO: renamed from: x */
    public final sb2 mo267x(d57 d57Var) {
        d57 d57VarM12976h;
        d57Var.getClass();
        Path path = Paths.get(d57Var.f35014a.m18089r(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = d57.f35013b;
                d57VarM12976h = gz8.m12976h(symbolicLink.toString(), false);
            } else {
                d57VarM12976h = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM15329R = fileTimeCreationTime != null ? m15329R(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM15329R2 = fileTimeLastModifiedTime != null ? m15329R(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new sb2(zIsRegularFile, zIsDirectory, d57VarM12976h, lValueOf, lM15329R, lM15329R2, fileTimeLastAccessTime != null ? m15329R(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
