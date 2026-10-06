package p021j$.desugar.sun.nio.p023fs;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import p021j$.nio.file.EnumC0386b;
import p021j$.nio.file.Path;
import p021j$.nio.file.attribute.BasicFileAttributes;
import p021j$.nio.file.attribute.C0340E;
import p021j$.nio.file.attribute.InterfaceC0366g;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.b */
/* JADX INFO: loaded from: classes3.dex */
final class C0288b implements InterfaceC0366g {

    /* JADX INFO: renamed from: b */
    static final HashSet f32765b;

    /* JADX INFO: renamed from: a */
    private final Path f32766a;

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        int i = AbstractC0303q.f32807b;
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < 9; i2++) {
            hashSet.add(strArr[i2]);
        }
        f32765b = hashSet;
    }

    public C0288b(Path path) {
        this.f32766a = path;
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0366g
    /* JADX INFO: renamed from: a */
    public final void mo11974a(C0340E c0340e, C0340E c0340e2, C0340E c0340e3) {
        this.f32766a.toFile().setLastModified(c0340e.m12125i(TimeUnit.MILLISECONDS));
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0363d
    public final /* bridge */ /* synthetic */ String name() {
        return "basic";
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0366g
    public final BasicFileAttributes readAttributes() {
        boolean z;
        Path path = this.f32766a;
        path.getFileSystem().mo11994j().mo12003a(path, new EnumC0386b[0]);
        File file = path.toFile();
        C0340E c0340eM12120e = C0340E.m12120e(file.lastModified(), TimeUnit.MILLISECONDS);
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        try {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            z = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        return new C0289c(c0340eM12120e, c0340eM12120e, c0340eM12120e, zIsFile, zIsDirectory, z, (zIsFile || zIsDirectory || z) ? false : true, file.length(), Integer.valueOf(file.hashCode()));
    }
}
