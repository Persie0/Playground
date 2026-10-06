package p000;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lkt implements lhr, lhq {

    /* JADX INFO: renamed from: a */
    private static final nbh f38512a = nbh.m17259h("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor");

    /* JADX INFO: renamed from: b */
    private final ohb f38513b;

    /* JADX INFO: renamed from: c */
    private boolean f38514c = false;

    /* JADX INFO: renamed from: d */
    private Activity f38515d;

    public lkt(ohb ohbVar, final oju ojuVar, final mrm mrmVar, Executor executor) {
        this.f38513b = ohbVar;
        executor.execute(new Runnable() { // from class: lks
            @Override // java.lang.Runnable
            public final void run() {
                this.f38509a.m15605c(ojuVar, mrmVar);
            }
        });
    }

    @Override // p000.lhr
    /* JADX INFO: renamed from: a */
    public synchronized void mo15318a(Activity activity) {
        this.f38515d = activity;
        if (this.f38514c) {
            ((lla) this.f38513b.get()).m15682c(activity);
        }
    }

    @Override // p000.lhq
    /* JADX INFO: renamed from: b */
    public synchronized void mo15352b(Activity activity) {
        if (!activity.equals(this.f38515d)) {
            ((nbe) ((nbe) f38512a.m17252c()).mo17276G(4525)).mo17301z("Activity mismatch (currentActivity=%s, activity=%s)", this.f38515d, activity);
        }
        if (this.f38514c) {
            ((lla) this.f38513b.get()).m15680a(activity);
        }
        this.f38515d = null;
    }

    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m15605c(oju ojuVar, mrm mrmVar) {
        if (((Boolean) ojuVar.get()).booleanValue()) {
            if (mrmVar.mo16813g() && !((Boolean) ((oju) mrmVar.mo16809c()).get()).booleanValue()) {
                return;
            }
        } else if (!mrmVar.mo16813g() || !((Boolean) ((oju) mrmVar.mo16809c()).get()).booleanValue()) {
            return;
        }
        synchronized (this) {
            this.f38514c = true;
            Activity activity = this.f38515d;
            if (activity != null) {
                mo15318a(activity);
            }
        }
    }
}
