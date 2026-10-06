package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gbj implements gbh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqf f24095a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ gbl f24096b;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f24097c = new AtomicBoolean(false);

    public gbj(gbl gblVar, nqf nqfVar) {
        this.f24096b = gblVar;
        this.f24095a = nqfVar;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f24097c.getAndSet(true)) {
            return;
        }
        gbl gblVar = this.f24096b;
        gblVar.f24106d.mo3415bf(Boolean.valueOf(gblVar.f24107e.decrementAndGet() > 0));
        this.f24096b.f24105c.m13643c();
        this.f24095a.mo14894e(true);
    }
}
