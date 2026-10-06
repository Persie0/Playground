package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kmy extends kpt {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kmz f36573a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f36574b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmy(kmz kmzVar, kpw kpwVar) {
        super(kpwVar);
        this.f36573a = kmzVar;
        this.f36574b = new AtomicBoolean(false);
    }

    @Override // p000.kpt, p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f36574b.getAndSet(true)) {
            return;
        }
        super.close();
        kmz kmzVar = this.f36573a;
        synchronized (kmzVar.f36575a) {
            kmzVar.f36577c--;
            if (kmzVar.f36576b) {
                kmzVar.m14587j();
            }
        }
    }

    public final void finalize() throws Throwable {
        close();
        super.finalize();
    }
}
