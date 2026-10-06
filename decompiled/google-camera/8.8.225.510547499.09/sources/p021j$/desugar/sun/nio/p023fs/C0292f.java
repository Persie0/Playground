package p021j$.desugar.sun.nio.p023fs;

import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.f */
/* JADX INFO: loaded from: classes3.dex */
final class C0292f extends FileLock {

    /* JADX INFO: renamed from: a */
    private final FileLock f32781a;

    C0292f(FileLock fileLock, C0291e c0291e) {
        super(c0291e, fileLock.position(), fileLock.size(), fileLock.isShared());
        this.f32781a = fileLock;
    }

    @Override // java.nio.channels.FileLock
    public final boolean isValid() {
        return this.f32781a.isValid();
    }

    @Override // java.nio.channels.FileLock
    public final void release() throws IOException {
        this.f32781a.release();
    }
}
