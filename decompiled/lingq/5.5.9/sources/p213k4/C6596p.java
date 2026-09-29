package p213k4;

import java.io.File;
import java.io.IOException;
import p288o4.InterfaceC7916b;
import p288o4.InterfaceC7917c;

/* JADX INFO: renamed from: k4.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6596p implements InterfaceC7917c, InterfaceC6582b {

    /* JADX INFO: renamed from: a */
    public C6581a f37490a;

    /* JADX INFO: renamed from: b */
    public boolean f37491b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m13200a(File file) throws IOException {
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public final void m13201b(boolean z10) {
        if (getDatabaseName() == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // p288o4.InterfaceC7917c
    public final String getDatabaseName() {
        throw null;
    }

    @Override // p213k4.InterfaceC6582b
    /* JADX INFO: renamed from: j */
    public final InterfaceC7917c mo4577j() {
        return null;
    }

    @Override // p288o4.InterfaceC7917c
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC7916b mo4578n0() {
        if (!this.f37491b) {
            m13201b(true);
            this.f37491b = true;
        }
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p288o4.InterfaceC7917c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        throw null;
    }
}
