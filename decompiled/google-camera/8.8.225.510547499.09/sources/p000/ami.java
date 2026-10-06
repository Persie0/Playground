package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ami extends amm implements Runnable {

    /* JADX INFO: renamed from: a */
    boolean f694a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ amj f695b;

    public ami(amj amjVar) {
        this.f695b = amjVar;
    }

    @Override // p000.amm
    /* JADX INFO: renamed from: a */
    public final Object mo945a() {
        try {
            return this.f695b.mo948a();
        } catch (adp e) {
            if (m960f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // p000.amm
    /* JADX INFO: renamed from: b */
    public final void mo946b(Object obj) {
        amj amjVar = this.f695b;
        if (amjVar.f696a != this) {
            amjVar.m951d(this);
        } else {
            if (amjVar.f702e) {
                return;
            }
            SystemClock.uptimeMillis();
            amjVar.f696a = null;
            amjVar.mo955g(obj);
        }
    }

    @Override // p000.amm
    /* JADX INFO: renamed from: c */
    public final void mo947c() {
        this.f695b.m951d(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f694a = false;
        this.f695b.m949b();
    }
}
