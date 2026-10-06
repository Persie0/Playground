package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fsv implements ftg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f23523a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AtomicBoolean f23524b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ftg f23525c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ fsw f23526d;

    public fsv(fsw fswVar, Object obj, AtomicBoolean atomicBoolean, ftg ftgVar) {
        this.f23526d = fswVar;
        this.f23523a = obj;
        this.f23524b = atomicBoolean;
        this.f23525c = ftgVar;
    }

    @Override // p000.ftg
    /* JADX INFO: renamed from: a */
    public final void mo8682a() {
        this.f23526d.f23528b.removeCallbacksAndMessages(this.f23523a);
        if (this.f23524b.getAndSet(true)) {
            return;
        }
        this.f23525c.mo8682a();
    }

    @Override // p000.ftg
    /* JADX INFO: renamed from: b */
    public final void mo8683b(Throwable th) {
        this.f23526d.f23528b.removeCallbacksAndMessages(this.f23523a);
        if (this.f23524b.getAndSet(true)) {
            ((nbe) ((nbe) ((nbe) fsw.f23527a.m17251b()).mo17283h(th)).mo17276G((char) 2497)).mo17290o("HDR+ also failed after timeout");
        } else {
            this.f23525c.mo8683b(th);
        }
    }

    @Override // p000.ftg
    /* JADX INFO: renamed from: c */
    public final void mo8684c(kpw kpwVar) {
        this.f23526d.f23528b.removeCallbacksAndMessages(this.f23523a);
        if (this.f23524b.getAndSet(true)) {
            kpwVar.close();
        } else {
            this.f23525c.mo8684c(kpwVar);
        }
    }
}
