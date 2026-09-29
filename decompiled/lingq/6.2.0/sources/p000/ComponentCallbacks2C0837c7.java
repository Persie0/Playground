package p000;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.kochava.core.task.internal.TaskQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: c7 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0837c7 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2, ur9 {

    /* JADX INFO: renamed from: a */
    public final ny8 f9650a;

    /* JADX INFO: renamed from: b */
    public final tr9 f9651b;

    /* JADX INFO: renamed from: d */
    public volatile boolean f9653d;

    /* JADX INFO: renamed from: c */
    public final List f9652c = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: e */
    public WeakReference f9654e = null;

    public ComponentCallbacks2C0837c7(Context context, ny8 ny8Var) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        this.f9653d = false;
        this.f9650a = ny8Var;
        this.f9651b = ny8Var.m17697l(TaskQueue.Worker, new sq5(this));
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
            context.registerComponentCallbacks(this);
        }
        try {
            String packageName = context.getPackageName();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && packageName != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo != null && runningAppProcessInfo.importance == 100) {
                        String[] strArr = runningAppProcessInfo.pkgList;
                        if (strArr != null) {
                            for (String str : strArr) {
                                if (!packageName.equals(str)) {
                                }
                            }
                        }
                    }
                }
                return;
            }
        } catch (Throwable unused) {
        }
        this.f9653d = true;
    }

    @Override // p000.ur9
    /* JADX INFO: renamed from: d */
    public final synchronized void mo4379d() {
        if (this.f9653d) {
            boolean z = false;
            this.f9653d = false;
            ArrayList arrayListM3224U = b34.m3224U(this.f9652c);
            if (!arrayListM3224U.isEmpty()) {
                this.f9650a.m17684L(new RunnableC0009a7(arrayListM3224U, z));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        if (this.f9654e == null) {
            this.f9654e = new WeakReference(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f9654e == null) {
                this.f9654e = new WeakReference(activity);
            }
            this.f9651b.m22276a();
            if (!this.f9653d) {
                boolean z = true;
                this.f9653d = true;
                ArrayList arrayListM3224U = b34.m3224U(this.f9652c);
                if (!arrayListM3224U.isEmpty()) {
                    this.f9650a.m17684L(new RunnableC0009a7(arrayListM3224U, z));
                }
            }
            ArrayList arrayListM3224U2 = b34.m3224U(this.f9652c);
            if (!arrayListM3224U2.isEmpty()) {
                this.f9650a.m17684L(new RunnableC0800b7(arrayListM3224U2, activity));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        this.f9654e = new WeakReference(activity);
        this.f9651b.m22276a();
        if (!this.f9653d) {
            boolean z = true;
            this.f9653d = true;
            ArrayList arrayListM3224U = b34.m3224U(this.f9652c);
            if (!arrayListM3224U.isEmpty()) {
                this.f9650a.m17684L(new RunnableC0009a7(arrayListM3224U, z));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        WeakReference weakReference;
        Activity activity2;
        try {
            if (this.f9653d && (weakReference = this.f9654e) != null && (activity2 = (Activity) weakReference.get()) != null && activity2.equals(activity)) {
                this.f9651b.m22276a();
                this.f9651b.m22280e(3000L);
            }
            this.f9654e = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        if (this.f9653d && i == 20) {
            this.f9651b.m22276a();
            if (this.f9653d) {
                boolean z = false;
                this.f9653d = false;
                ArrayList arrayListM3224U = b34.m3224U(this.f9652c);
                if (!arrayListM3224U.isEmpty()) {
                    this.f9650a.m17684L(new RunnableC0009a7(arrayListM3224U, z));
                }
            }
        }
    }
}
