package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fqo implements fql {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicInteger f23239a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ fql f23240b;

    public fqo(AtomicInteger atomicInteger, fql fqlVar) {
        this.f23239a = atomicInteger;
        this.f23240b = fqlVar;
    }

    @Override // p000.fql
    /* JADX INFO: renamed from: a */
    public final fqk mo8707a(kpw kpwVar, bkn bknVar) {
        throw null;
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23240b.close();
    }
}
