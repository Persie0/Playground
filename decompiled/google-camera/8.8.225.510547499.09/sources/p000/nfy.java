package p000;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nfy implements nga {

    /* JADX INFO: renamed from: a */
    static final nfy f42206a = new nfy();

    @Override // p000.nga
    /* JADX INFO: renamed from: a */
    public final void mo17458a(Closeable closeable, Throwable th, Throwable th2) {
        Logger logger = nfx.f42205a;
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppressing exception thrown when closing ");
        sb.append(closeable);
        logger.logp(level, "com.google.common.io.Closer$LoggingSuppressor", "suppress", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th2);
    }
}
