package p000;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lmf implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ lmi f38653a;

    /* JADX INFO: renamed from: b */
    private final AtomicReference f38654b;

    public /* synthetic */ lmf(lmi lmiVar, View view, lme lmeVar) {
        this.f38653a = lmiVar;
        this.f38654b = new AtomicReference(view);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15727a(lmi lmiVar) {
        lij.m15453w();
        if (lmiVar.f38660b.f38677f != 0) {
            return;
        }
        lmiVar.f38660b.f38677f = SystemClock.elapsedRealtime();
        lmiVar.f38660b.f38683l.f38668h = true;
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m15728b(lmi lmiVar) {
        lij.m15453w();
        if (lmiVar.f38660b.f38678g != 0) {
            return;
        }
        lmiVar.f38660b.f38678g = SystemClock.elapsedRealtime();
        lmiVar.f38660b.f38683l.f38667g = true;
        lmk.m15730a("Primes-ttfdd-end-and-length-ms", lmiVar.f38660b.f38678g);
        lmiVar.f38659a.unregisterActivityLifecycleCallbacks(lmiVar);
    }

    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m15729c(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View view = (View) this.f38654b.getAndSet(null);
        if (view == null) {
            return;
        }
        try {
            lij.m15451u().postAtFrontOfQueue(new kxw(this.f38653a, 20));
            lij.m15454x(new lmg(this.f38653a, 1));
            lij.m15454x(new Runnable() { // from class: lmd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38650a.m15729c(view);
                }
            });
        } catch (RuntimeException e) {
        }
    }
}
