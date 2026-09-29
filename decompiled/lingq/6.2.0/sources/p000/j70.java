package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class j70 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e */
    public static final j70 f45129e = new j70();

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f45130a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f45131b = new AtomicBoolean();

    /* JADX INFO: renamed from: c */
    public final ArrayList f45132c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f45133d = false;

    /* JADX INFO: renamed from: b */
    public static void m14308b(Application application) {
        j70 j70Var = f45129e;
        synchronized (j70Var) {
            try {
                if (!j70Var.f45133d) {
                    application.registerActivityLifecycleCallbacks(j70Var);
                    application.registerComponentCallbacks(j70Var);
                    j70Var.f45133d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14309a(i70 i70Var) {
        synchronized (f45129e) {
            this.f45132c.add(i70Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14310c(boolean z) {
        synchronized (f45129e) {
            try {
                Iterator it = this.f45132c.iterator();
                while (it.hasNext()) {
                    ((i70) it.next()).mo12374a(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f45130a.compareAndSet(true, false);
        this.f45131b.set(true);
        if (zCompareAndSet) {
            m14310c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f45130a.compareAndSet(true, false);
        this.f45131b.set(true);
        if (zCompareAndSet) {
            m14310c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f45130a.compareAndSet(false, true)) {
            this.f45131b.set(true);
            m14310c(true);
        }
    }
}
