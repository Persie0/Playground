package wf;

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
import java.util.Iterator;
import java.util.List;
import kg.C6670c;
import p201jg.C6476a;
import p201jg.InterfaceC6477b;
import p243lg.C7360b;
import p243lg.InterfaceC7361c;
import p349qo.C8656b;

/* JADX INFO: renamed from: wf.a */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C9913a implements InterfaceC9915c, Application.ActivityLifecycleCallbacks, ComponentCallbacks2, InterfaceC6477b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7361c f50549a;

    /* JADX INFO: renamed from: b */
    public final C6670c f50550b;

    /* JADX INFO: renamed from: d */
    public volatile boolean f50552d;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC9916d> f50551c = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: e */
    public WeakReference<Activity> f50553e = null;

    /* JADX INFO: renamed from: wf.a$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f50554a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f50555b;

        public a(ArrayList arrayList, boolean z10) {
            this.f50554a = arrayList;
            this.f50555b = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.f50554a.iterator();
            while (it.hasNext()) {
                ((InterfaceC9916d) it.next()).mo12962h(this.f50555b);
            }
        }
    }

    public ComponentCallbacks2C9913a(Context context, InterfaceC7361c interfaceC7361c) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        boolean z10 = false;
        this.f50552d = false;
        this.f50549a = interfaceC7361c;
        this.f50550b = ((C7360b) interfaceC7361c).m14765b(TaskQueue.Worker, new C6476a(this));
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
            context.registerComponentCallbacks(this);
        }
        try {
            String packageName = context.getPackageName();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && packageName != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                loop0: for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo != null && runningAppProcessInfo.importance == 100) {
                        String[] strArr = runningAppProcessInfo.pkgList;
                        if (strArr != null) {
                            int length = strArr.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    continue;
                                } else if (!packageName.equals(strArr[i10])) {
                                    i10++;
                                }
                            }
                        }
                        z10 = true;
                        break;
                    }
                }
            } else {
                z10 = true;
                break;
            }
        } catch (Throwable unused) {
        }
        if (z10) {
            this.f50552d = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18410a(boolean z10) {
        ArrayList arrayListM16896W = C8656b.m16896W(this.f50551c);
        if (arrayListM16896W.isEmpty()) {
            return;
        }
        ((C7360b) this.f50549a).m14769f(new a(arrayListM16896W, z10));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p201jg.InterfaceC6477b
    /* JADX INFO: renamed from: b */
    public final synchronized void mo11769b() {
        if (this.f50552d) {
            this.f50552d = false;
            m18410a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        try {
            if (this.f50553e == null) {
                this.f50553e = new WeakReference<>(activity);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        if (this.f50553e == null) {
            this.f50553e = new WeakReference<>(activity);
        }
        this.f50550b.m13291c();
        if (!this.f50552d) {
            this.f50552d = true;
            m18410a(true);
        }
        ArrayList arrayListM16896W = C8656b.m16896W(this.f50551c);
        if (!arrayListM16896W.isEmpty()) {
            ((C7360b) this.f50549a).m14769f(new RunnableC9914b(arrayListM16896W, activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            this.f50553e = new WeakReference<>(activity);
            this.f50550b.m13291c();
            if (!this.f50552d) {
                this.f50552d = true;
                m18410a(true);
            }
        } finally {
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        WeakReference<Activity> weakReference;
        Activity activity2;
        try {
            if (this.f50552d && (weakReference = this.f50553e) != null && (activity2 = weakReference.get()) != null && activity2.equals(activity)) {
                this.f50550b.m13291c();
                this.f50550b.m13294f(3000L);
            }
            this.f50553e = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i10) {
        try {
            if (this.f50552d && i10 == 20) {
                this.f50550b.m13291c();
                if (this.f50552d) {
                    this.f50552d = false;
                    m18410a(false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
