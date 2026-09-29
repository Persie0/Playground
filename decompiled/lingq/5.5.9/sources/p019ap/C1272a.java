package p019ap;

import dm.C5207g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import p124fp.C5616m;
import p124fp.C5618o;
import p124fp.C5620q;
import p124fp.C5628y;

/* JADX INFO: renamed from: ap.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1272a implements InterfaceC1273b {
    @Override // p019ap.InterfaceC1273b
    /* JADX INFO: renamed from: a */
    public final C5616m mo4772a(File file) throws FileNotFoundException {
        C5207g.m11111f(file, "file");
        Logger logger = C5618o.f34451a;
        return new C5616m(new FileInputStream(file), C5628y.f34474d);
    }

    @Override // p019ap.InterfaceC1273b
    /* JADX INFO: renamed from: b */
    public final C5620q mo4773b(File file) throws FileNotFoundException {
        C5207g.m11111f(file, "file");
        try {
            Logger logger = C5618o.f34451a;
            return new C5620q(new FileOutputStream(file, false), new C5628y());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = C5618o.f34451a;
            return new C5620q(new FileOutputStream(file, false), new C5628y());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p019ap.InterfaceC1273b
    /* JADX INFO: renamed from: c */
    public final void mo4774c(File file) throws IOException {
        C5207g.m11111f(file, "directory");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(C5207g.m11116k(file, "not a readable directory: "));
        }
        int length = fileArrListFiles.length;
        int i10 = 0;
        while (i10 < length) {
            File file2 = fileArrListFiles[i10];
            i10++;
            if (file2.isDirectory()) {
                mo4774c(file2);
            }
            if (!file2.delete()) {
                throw new IOException(C5207g.m11116k(file2, "failed to delete "));
            }
        }
    }

    @Override // p019ap.InterfaceC1273b
    /* JADX INFO: renamed from: d */
    public final boolean mo4775d(File file) {
        C5207g.m11111f(file, "file");
        return file.exists();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p019ap.InterfaceC1273b
    /* JADX INFO: renamed from: e */
    public final void mo4776e(File file, File file2) throws IOException {
        C5207g.m11111f(file, "from");
        C5207g.m11111f(file2, "to");
        mo4777f(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    @Override // p019ap.InterfaceC1273b
    /* JADX INFO: renamed from: f */
    public final void mo4777f(File file) throws IOException {
        C5207g.m11111f(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException(C5207g.m11116k(file, "failed to delete "));
        }
    }

    @Override // p019ap.InterfaceC1273b
    /* JADX INFO: renamed from: g */
    public final C5620q mo4778g(File file) throws FileNotFoundException {
        C5207g.m11111f(file, "file");
        try {
            Logger logger = C5618o.f34451a;
            return new C5620q(new FileOutputStream(file, true), new C5628y());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = C5618o.f34451a;
            return new C5620q(new FileOutputStream(file, true), new C5628y());
        }
    }

    @Override // p019ap.InterfaceC1273b
    /* JADX INFO: renamed from: h */
    public final long mo4779h(File file) {
        C5207g.m11111f(file, "file");
        return file.length();
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
