package p021j$.desugar.sun.nio.p023fs;

import java.nio.file.DirectoryStream;
import java.util.Iterator;
import p021j$.nio.file.Path;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.k */
/* JADX INFO: loaded from: classes3.dex */
final class C0297k implements DirectoryStream {

    /* JADX INFO: renamed from: a */
    C0298l f32787a;

    C0297k(C0299m c0299m, Path path, DirectoryStream.Filter filter) {
        this.f32787a = new C0298l(c0299m, path, filter);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return this.f32787a;
    }
}
