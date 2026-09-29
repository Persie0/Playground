package p152hb;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: hb.b */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C5953b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e */
    public static final ComponentCallbacks2C5953b f35417e = new ComponentCallbacks2C5953b();

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f35418a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f35419b = new AtomicBoolean();

    /* JADX INFO: renamed from: c */
    public final ArrayList f35420c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f35421d = false;

    /* JADX INFO: renamed from: hb.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo441a(boolean z10);
    }

    /* JADX INFO: renamed from: a */
    public final void m12393a(boolean z10) {
        synchronized (f35417e) {
            Iterator it = this.f35420c.iterator();
            while (it.hasNext()) {
                ((a) it.next()).mo441a(z10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f35418a.compareAndSet(true, false);
        this.f35419b.set(true);
        if (zCompareAndSet) {
            m12393a(false);
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
        boolean zCompareAndSet = this.f35418a.compareAndSet(true, false);
        this.f35419b.set(true);
        if (zCompareAndSet) {
            m12393a(false);
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
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f35418a.compareAndSet(false, true)) {
            this.f35419b.set(true);
            m12393a(true);
        }
    }
}
