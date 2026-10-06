package p000;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nqh implements Runnable {

    /* JADX INFO: renamed from: a */
    nqj f44061a;

    public nqh(nqj nqjVar) {
        this.f44061a = nqjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nps npsVar;
        nqj nqjVar = this.f44061a;
        if (nqjVar == null || (npsVar = nqjVar.f44062a) == null) {
            return;
        }
        this.f44061a = null;
        if (npsVar.isDone()) {
            nqjVar.mo16665f(npsVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = nqjVar.f44063b;
            nqjVar.f44063b = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    th = th;
                    nqjVar.mo8566a(new nqi(str));
                    throw th;
                }
            }
            try {
                nqjVar.mo8566a(new nqi(str + ": " + npsVar.toString()));
                npsVar.cancel(true);
            } catch (Throwable th2) {
                th = th2;
                nqjVar.mo8566a(new nqi(str));
                throw th;
            }
        } catch (Throwable th3) {
            npsVar.cancel(true);
            throw th3;
        }
    }
}
