package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jex implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: a */
    public static final jex f33851a = new jex();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f33852b = new AtomicBoolean();

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f33853c = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    public final ArrayList f33854d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f33855e = false;

    private jex() {
    }

    /* JADX INFO: renamed from: a */
    private final void m13005a(boolean z) {
        synchronized (f33851a) {
            Iterator it = this.f33854d.iterator();
            while (it.hasNext()) {
                Handler handler = ((jfm) ((AmbientMode.AmbientController) it.next()).f1697a).f33903n;
                handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f33852b.compareAndSet(true, false);
        this.f33853c.set(true);
        if (zCompareAndSet) {
            m13005a(false);
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
        boolean zCompareAndSet = this.f33852b.compareAndSet(true, false);
        this.f33853c.set(true);
        if (zCompareAndSet) {
            m13005a(false);
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
        if (i == 20 && this.f33852b.compareAndSet(false, true)) {
            this.f33853c.set(true);
            m13005a(true);
        }
    }
}
