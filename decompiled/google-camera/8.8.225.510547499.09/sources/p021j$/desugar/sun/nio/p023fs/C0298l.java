package p021j$.desugar.sun.nio.p023fs;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import p021j$.nio.file.Path;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.l */
/* JADX INFO: loaded from: classes3.dex */
final class C0298l implements Iterator {

    /* JADX INFO: renamed from: a */
    private final DirectoryStream.Filter f32788a;

    /* JADX INFO: renamed from: b */
    private final File[] f32789b;

    /* JADX INFO: renamed from: c */
    private int f32790c = 0;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0299m f32791d;

    C0298l(C0299m c0299m, Path path, DirectoryStream.Filter filter) {
        this.f32791d = c0299m;
        File[] fileArrListFiles = path.toFile().listFiles();
        this.f32789b = fileArrListFiles == null ? new File[0] : fileArrListFiles;
        this.f32788a = filter;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0301o next() {
        C0301o c0301o;
        do {
            int i = this.f32790c;
            File[] fileArr = this.f32789b;
            if (i >= fileArr.length) {
                return null;
            }
            this.f32790c = i + 1;
            File file = fileArr[i];
            C0299m c0299m = this.f32791d;
            c0301o = new C0301o(c0299m.f32794d, file.getPath(), c0299m.f32792b, c0299m.f32793c);
            try {
            } catch (IOException e) {
                throw new DirectoryIteratorException(e);
            }
        } while (!this.f32788a.accept(c0301o));
        return c0301o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (next() == null) {
            return false;
        }
        this.f32790c--;
        return true;
    }
}
