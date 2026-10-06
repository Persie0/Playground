package p000;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbq extends Handler {

    /* JADX INFO: renamed from: a */
    public static final kbq f35538a = new kbq();

    /* JADX INFO: renamed from: b */
    private final jvd f35539b = jvd.f34878b;

    private kbq() {
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        Throwable thrown = logRecord.getThrown();
        String message = logRecord.getMessage();
        if (thrown != null) {
            this.f35539b.execute(new jpm(message, thrown, 18));
        }
    }
}
