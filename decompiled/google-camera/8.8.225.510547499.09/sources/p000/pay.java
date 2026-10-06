package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pay implements pbg {

    /* JADX INFO: renamed from: a */
    private final InputStream f47304a;

    public pay(InputStream inputStream) {
        this.f47304a = inputStream;
    }

    @Override // p000.pbg, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f47304a.close();
    }

    @Override // p000.pbg
    /* JADX INFO: renamed from: t */
    public final long mo19277t(pau pauVar) throws IOException {
        String message;
        try {
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException("interrupted");
            }
            pbd pbdVarM19267j = pauVar.m19267j(1);
            int i = this.f47304a.read(pbdVarM19267j.f47314a, pbdVarM19267j.f47316c, (int) Math.min(8192L, 8192 - pbdVarM19267j.f47316c));
            if (i != -1) {
                pbdVarM19267j.f47316c += i;
                long j = i;
                pauVar.f47299b += j;
                return j;
            }
            if (pbdVarM19267j.f47315b != pbdVarM19267j.f47316c) {
                return -1L;
            }
            pauVar.f47298a = pbdVarM19267j.m19287a();
            pbe.m19292b(pbdVarM19267j);
            return -1L;
        } catch (AssertionError e) {
            int i2 = paz.f47305a;
            if (e.getCause() == null || (message = e.getMessage()) == null || !ook.m18804r(message, "getsockname failed")) {
                throw e;
            }
            throw new IOException(e);
        }
    }

    public final String toString() {
        return "source(" + this.f47304a + ")";
    }
}
