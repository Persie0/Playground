package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class kjj extends kch {

    /* JADX INFO: renamed from: a */
    private final kev f36260a;

    /* JADX INFO: renamed from: b */
    private long f36261b;

    public kjj(kev kevVar) {
        this.f36260a = kevVar;
    }

    @Override // p000.kch, p000.kct
    /* JADX INFO: renamed from: a */
    public final void mo13971a() {
        this.f36260a.mo5509b();
    }

    @Override // p000.kch, p000.kct
    /* JADX INFO: renamed from: c */
    public final void mo13973c(kcl kclVar) {
        this.f36260a.mo5508a(kclVar, this.f36261b != 0 ? SystemClock.elapsedRealtimeNanos() - this.f36261b : 0L);
    }

    @Override // p000.kch, p000.kct
    /* JADX INFO: renamed from: d */
    public final void mo13974d(kpj kpjVar) {
        this.f36261b = SystemClock.elapsedRealtimeNanos();
    }
}
