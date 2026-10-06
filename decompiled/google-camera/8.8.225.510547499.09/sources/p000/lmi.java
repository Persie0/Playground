package p000;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lmi implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final Application f38659a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lmk f38660b;

    public lmi(lmk lmkVar, Application application) {
        this.f38660b = lmkVar;
        this.f38659a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        lmc lmcVar = this.f38660b.f38684m.f38647b == null ? this.f38660b.f38684m : this.f38660b.f38685n;
        lmcVar.f38646a = activity.getClass().getSimpleName();
        lmcVar.f38647b = Long.valueOf(jElapsedRealtime);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        lmc lmcVar = this.f38660b.f38685n.f38647b == null ? this.f38660b.f38684m : this.f38660b.f38685n;
        if (lmcVar.f38649d == null) {
            lmcVar.f38649d = Long.valueOf(SystemClock.elapsedRealtime());
        }
        try {
            View viewFindViewById = activity.findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new lmf(this, viewFindViewById, null));
            viewTreeObserver.addOnPreDrawListener(new lmh(this, viewFindViewById));
        } catch (RuntimeException e) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        lmc lmcVar = this.f38660b.f38685n.f38647b == null ? this.f38660b.f38684m : this.f38660b.f38685n;
        if (lmcVar.f38648c == null) {
            lmcVar.f38648c = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
